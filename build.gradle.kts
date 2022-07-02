import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    jacoco
}

group = "io.github.afontan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

jacoco {
    toolVersion = "0.8.5"
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        csv.isEnabled = true
        html.isEnabled = true
    }
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
    useJUnitPlatform {
        includeEngines("junit-jupiter", "spek2")
    }

    testLogging {
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        events("passed", "failed", "skipped")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}