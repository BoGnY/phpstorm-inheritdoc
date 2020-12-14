<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# PHP @inheritDoc plugin for PhpStorm

## [Unreleased]

## [v0.2.0]
### Added
- Added plugin icon

### Changed
- Dependencies - upgrade `org.jetbrains.intellij` to `0.6.5`
- Updated the base platform version to 2020.1
- Simpler syntax for configuring `KotlinCompile`
- Dependencies - upgrade `org.jetbrains.kotlin.jvm` to `1.4.21`

## [v0.1.0-beta]
### Added
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
- Loaded source code from [PHP @inheritDoc plugin for PhpStorm](https://github.com/thanosp/phpstorm-inheritdoc) by [thanosp](https://github.com/thanosp)

### Changed
- Converted plugin build system to Gradle Kotlin build script
- Updated compatibility with PhpStorm / IntelliJ Idea Ultimate version 2020.1.X / 2020.2.X / 2020.3

### Fixed
- Fixed wrong visualization of new line (now PhpDoc inherited new line are displayed correctly in one line)
