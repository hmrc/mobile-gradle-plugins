# Mobile Gradle Plugins 🐘

A collection of useful Gradle plugins for mobile projects.

To use these plugins, first add the following to your buildscript repositories:

```
buildscript {
    repositories {
        ...
        maven {
            url "https://hmrc.bintray.com/mobile-releases"
        }
    }
}
```

## Spotless  [![Download](https://api.bintray.com/packages/hmrc/mobile-releases/spotless/images/download.svg) ](https://bintray.com/hmrc/mobile-releases/spotless/_latestVersion)

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
