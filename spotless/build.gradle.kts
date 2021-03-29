import java.text.SimpleDateFormat
import java.util.Date

plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:3.26.0")
}

group = "uk.gov.hmrc.gradle"
version = System.getenv("BITRISE_GIT_TAG") ?: ("SNAPSHOT-" + getDate())
description = "Keep your code spotless with Gradle"

val artifactId = "spotless"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "$group.$artifactId"
            artifactId = artifactId
            version = version
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/hmrc/mobile-gradle-plugins")
            credentials {
                username = System.getenv("GITHUB_USER_NAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

apply(from = "../publishing.gradle.kts")

fun getDate(): String {
    val date = Date()
    val format = "yyyyMMddHHmm"
    return SimpleDateFormat(format).format(date).toString()
}