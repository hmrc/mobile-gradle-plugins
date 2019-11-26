# Mobile Gradle Plugins

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

## Spotless

### Apply the plugin

```
buildscript {
    ...
    dependencies {
        classpath 'uk.gov.hmrc.gradle:spotless:x.y.z'
    }
}

apply plugin: 'uk.gov.hmrc.spotless'
```
