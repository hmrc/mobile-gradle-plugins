buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2")
    }
}

apply(plugin = "maven-publish")

val pluginName: String by project
val pluginImplementationClass: String by project

configure<GradlePluginDevelopmentExtension> {
    plugins {
        create(pluginName) {
            id = "uk.gov.hmrc.$pluginName"
            implementationClass = pluginImplementationClass
        }
    }
}
