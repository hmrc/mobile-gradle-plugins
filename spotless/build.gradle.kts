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
version = "0.0.4"

gradlePlugin {
    plugins {
        create("spotless") {
            id = "uk.gov.hmrc.spotless"
            implementationClass = "uk.gov.hmrc.spotless.HmrcSpotlessPlugin"
        }
    }
}