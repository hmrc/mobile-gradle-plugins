# Mobile Gradle Plugins 🐘

A collection of useful Gradle plugins for mobile projects.

To use these plugins, first add the following to your buildscript repositories, along with a Github username and access token (no permissions required):

```
buildscript {
    repositories {
        ...
        maven {
            url "https://maven.pkg.github.com/hmrc/mobile-gradle-plugins"
            credentials {
                username = System.getenv("GITHUB_USER_NAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
```

## Spotless  [![Github](https://img.shields.io/github/release/hmrc/mobile-gradle-plugins.svg)](https://gitHub.com/hmrc/mobile-gradle-plugins/releases/)

This plugin applies the [Spotless Gradle plugin](https://github.com/diffplug/spotless/tree/master/plugin-gradle) and configures Kotlin and XML formatting.

### Applying the plugin

```
buildscript {
    ...
    dependencies {
        classpath 'uk.gov.hmrc.gradle:spotless:x.y.z'
    }
}

apply plugin: 'uk.gov.hmrc.spotless'
```
