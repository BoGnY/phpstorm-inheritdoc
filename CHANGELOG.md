<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# PHP @inheritDoc plugin for PhpStorm

## [Unreleased]
### Added
- GitHub Actions: UI Tests workflow
- Suppress `UnusedProperty` inspection for the `kotlin.stdlib.default.dependency` in `gradle.properties`
- Use Gradle `wrapper` task to handle Gradle updates
- JVM compatibility version extracted from `gradle.properties` file

### Changed
- Remove reference to the `jcenter()` from Gradle configuration file
- Update `pluginVerifierIdeVersions` to `2020.1.4, 2020.2.4, 2020.3.4, 2021.1.3`
- Change `pluginUntilBuild` to `212.*`
- Dependencies - upgrade `org.jetbrains.kotlin.jvm` to `1.5.0`
- Dependencies - upgrade `detekt-formatting` to `1.17.1`
- Dependencies - upgrade `io.gitlab.arturbosch.detekt` to `1.17.1`
- Dependencies (GitHub Actions) - upgrade `actions/upload-release-asset` to `v1.0.2`
- Dependencies (GitHub Actions) - upgrade `actions/upload-artifact` to `v2.2.4`
- Dependencies (GitHub Actions) - upgrade `actions/checkout` to `v2.3.4`
- Dependencies (GitHub Actions) - upgrade `actions/create-release` to `v1.1.4`
- Dependencies (GitHub Actions) - upgrade `actions/cache` to `v2.1.6`
- Upgrade Gradle Wrapper to `7.1.1`
- Trigger GitHub Actions `Build` workflows only on pushes to `main` branch or pull request to avoid duplicated checks
- Gradle – Changelog plugin configuration update
- Updated `build.gradle.kts` to be compatible with Gradle IntelliJ Plugin `v1.x`

### Fixed
- Fixed missing dependencies for `ktlint`

## [0.4.0]
### Added
- `properties` shorthand function for accessing `gradle.properties` in a cleaner way

### Changed
- Use html tag instead markdown on plugin description
- Dependencies - upgrade `org.jlleitschuh.gradle.ktlint` to `10.0.0`
- Dependencies - upgrade `org.jetbrains.changelog` to `1.1.2`
- Dependencies - upgrade `org.jetbrains.intellij` to `0.7.2`
- Dependencies - upgrade `io.gitlab.arturbosch.detekt` to `1.16.0`
- Dependencies - upgrade `org.jetbrains.kotlin.jvm` to `1.4.32`
- GitHub Actions: Use the correct property in the "Upload artifact" step
- Update links to SDK Docs
- Configure the `changelog` Gradle plugin
- Fixed plugin version property name
- Dependabot check for GitHub Actions used in [workflow files](.github/workflows)
- Dependencies (GitHub Actions) - upgrade `actions/cache` to `v2.1.5`
- Dependencies (GitHub Actions) - upgrade `actions/upload-artifact` to `v2.2.3`
- Dependencies (GitHub Actions) - upgrade `actions/setup-java` to `v2`
- Update `pluginVerifierIdeVersions` to `2020.1.4, 2020.2.4, 2020.3.3, 2021.1`
- Upgrade Gradle Wrapper to `7.0`

### Fixed
- Fix `README.md` file resolution in the `build.gradle.kts`

## [0.3.0]
### Added
- Dependabot integration
- Show `idea.log` logs of the run IDE in the Run console

### Changed
- Dependencies - upgrade `detekt-formatting` to `1.15.0`
- Dependencies - upgrade `io.gitlab.arturbosch.detekt` to `1.15.0`
- `pluginVerifierIdeVersions` - upgrade to `2020.1.4, 2020.2.3, 2020.3.1`
- Changed plugin icon (based on [PhpDoc](https://phpdoc.org) icon)

## [0.2.0]
### Added
- Added plugin icon

### Changed
- Dependencies - upgrade `org.jetbrains.intellij` to `0.6.5`
- Updated the base platform version to 2020.1
- Simpler syntax for configuring `KotlinCompile`
- Dependencies - upgrade `org.jetbrains.kotlin.jvm` to `1.4.21`

## [0.1.0-beta]
### Added
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
- Loaded source code from [PHP @inheritDoc plugin for PhpStorm](https://github.com/thanosp/phpstorm-inheritdoc) by [thanosp](https://github.com/thanosp)

### Changed
- Converted plugin build system to Gradle Kotlin build script
- Updated compatibility with PhpStorm / IntelliJ Idea Ultimate version 2020.1.X / 2020.2.X / 2020.3

### Fixed
- Fixed wrong visualization of new line (now PhpDoc inherited new line are displayed correctly in one line)
