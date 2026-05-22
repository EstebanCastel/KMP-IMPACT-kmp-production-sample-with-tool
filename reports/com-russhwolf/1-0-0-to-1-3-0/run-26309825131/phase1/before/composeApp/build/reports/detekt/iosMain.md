# detekt

## Metrics

* 3 number of properties

* 4 number of functions

* 0 number of classes

* 2 number of packages

* 2 number of kt files

## Complexity Report

* 48 lines of code (loc)

* 41 source lines of code (sloc)

* 18 logical lines of code (lloc)

* 0 comment lines of code (cloc)

* 6 cyclomatic complexity (mcc)

* 1 cognitive complexity

* 2 number of total code smells

* 0% comment source ratio

* 333 mcc per 1,000 lloc

* 111 code smells per 1,000 lloc

## Findings (2)

### naming, FunctionNaming (1)

Function names should follow the naming convention set in the configuration.

[Documentation](https://detekt.dev/docs/rules/naming#functionnaming)

* /tmp/output/phase1/before/composeApp/src/iosMain/kotlin/main.kt:10:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
7  import org.koin.dsl.module
8  import platform.UIKit.UIViewController
9  
10 fun MainViewController(): UIViewController {
!!     ^ error
11     val appModule = module {
12         single { RssReader.create(true) }
13         single { FeedStore(get()) }

```

### style, NewLineAtEndOfFile (1)

Checks whether files end with a line separator.

[Documentation](https://detekt.dev/docs/rules/style#newlineatendoffile)

* /tmp/output/phase1/before/composeApp/src/iosMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.ios.kt:27:2
```
The file /tmp/output/phase1/before/composeApp/src/iosMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.ios.kt is not ending with a new line.
```
```kotlin
24         true
25     ).first() as String
26     return (cacheDir + "/media").toPath()
27 }
!!  ^ error

```

generated with [detekt version 1.23.7](https://detekt.dev/) on 2026-05-22 20:30:29 UTC
