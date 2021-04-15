# PHP @inheritDoc plugin for PhpStorm

![Build](https://github.com/BoGnY/phpstorm-inheritdoc/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/15560.svg)](https://plugins.jetbrains.com/plugin/15560)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/15560.svg)](https://plugins.jetbrains.com/plugin/15560)

<!-- Plugin description -->
PHP @inheritDoc plugin for PhpStorm / IntelliJ Idea Ultimate.

Based on <a href="https://github.com/thanosp/phpstorm-inheritdoc">PHP @inheritDoc plugin for PhpStorm</a> by <a href="https://github.com/thanosp">thanosp</a>.

Original work by thanosp:
- Folds `{@inheritDoc}` tags and shows the inherited text instead
- Can suggest adding `{@inheritDoc}` if a docblock is missing, but a parent doc is found
- Can suggest replacing the docblock with `{@inheritDoc}` if a docblock found not using `{@inheritDoc}`
- Provides `{@inheritDoc}` code inspection

Improvements:
- Converted plugin build system to Gradle Kotlin build script
- Updated compatibility with PhpStorm / IntelliJ Idea Ultimate version 2020.1.X / 2020.2.X / 2020.3.X / 2021.1
- Fixed wrong visualization of new line (now PhpDoc inherited new line are displayed correctly in one line)
- Added plugin icon
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "phpstorm-inheritdoc"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/BoGnY/phpstorm-inheritdoc/releases/latest) and install it manually using
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
