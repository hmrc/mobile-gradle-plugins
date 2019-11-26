plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:3.26.0")
}

group = "uk.gov.hmrc.gradle"
version = "0.1.0"
description = "Keep your code spotless with Gradle"

apply(from = "../publishing.gradle.kts")
apply(from = "../bintray.gradle")