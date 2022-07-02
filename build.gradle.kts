import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    jacoco
}

group = "io.github.afontan"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

jacoco { toolVersion = "0.8.7" }

tasks.named<JacocoReport>("jacocoTestReport") {
    executionData.from(fileTree(project.buildDir.absolutePath).include("jacoco/*.exec"))
    classDirectories.setFrom(files(project.sourceSets.main.get().output))
    sourceDirectories.setFrom(files(project.sourceSets.main.get().allSource.srcDirs))

    reports {
        xml.required.set(true)
        csv.required.set(true)
        html.required.set(true)
    }
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
    useJUnitPlatform {
        includeEngines("junit-jupiter")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}