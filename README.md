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

### Release process

The CI tool has been set up to trigger a build and publish to GitHub packages when a tag is created on a build.

Recommended flow:
- Raise PR
- Approved PR
- Merge
- Wait for Bitrise to build and test
- Tag for release
- Apps update to new version

You need to:
* Have a valid Bitrise access token saved in your path under the variable name `BITRISE_TOKEN`. See [Bitrise docs](https://devcenter.bitrise.io/api/authentication).
* Two environment variables, `GRADLE_PLUGINS_APP_SLUG` & `GRADLE_PLUGINS_RELEASE_WORKFLOW_ID` will also need to be included in your bash/ZSH profile. Speak with [Chris](https://github.com/chrisob55) to obtain these values.