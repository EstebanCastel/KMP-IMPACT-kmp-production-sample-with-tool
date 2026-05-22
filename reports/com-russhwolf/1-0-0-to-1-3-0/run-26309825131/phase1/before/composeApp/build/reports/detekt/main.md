# detekt

## Metrics

* 32 number of properties

* 22 number of functions

* 4 number of classes

* 2 number of packages

* 10 number of kt files

## Complexity Report

* 858 lines of code (loc)

* 805 source lines of code (sloc)

* 485 logical lines of code (lloc)

* 8 comment lines of code (cloc)

* 42 cyclomatic complexity (mcc)

* 33 cognitive complexity

* 30 number of total code smells

* 0% comment source ratio

* 86 mcc per 1,000 lloc

* 61 code smells per 1,000 lloc

## Findings (30)

### complexity, LongMethod (1)

One method should have one responsibility. Long methods tend to handle many things at once. Prefer smaller methods to make them easier to understand.

[Documentation](https://detekt.dev/docs/rules/complexity#longmethod)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:42:14
```
The function App is too long (70). The maximum length is 60.
```
```kotlin
39 
40 @OptIn(ExperimentalMaterial3Api::class)
41 @Composable
42 internal fun App() = AppTheme {
!!              ^ error
43     val store: FeedStore = KoinPlatformTools.defaultContext().get().get()
44     val snackbarHostState = SnackbarHostState()
45     val error = store.observeSideEffect()

```

### naming, FunctionNaming (13)

Function names should follow the naming convention set in the configuration.

[Documentation](https://detekt.dev/docs/rules/naming#functionnaming)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:42:14
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
39 
40 @OptIn(ExperimentalMaterial3Api::class)
41 @Composable
42 internal fun App() = AppTheme {
!!              ^ error
43     val store: FeedStore = KoinPlatformTools.defaultContext().get().get()
44     val snackbarHostState = SnackbarHostState()
45     val error = store.observeSideEffect()

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/AppTheme.kt:35:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
32 )
33 
34 @Composable
35 fun AppTheme(
!!     ^ error
36     content: @Composable () -> Unit
37 ) {
38     MaterialTheme(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Dialogs.kt:27:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
24 import rssreader.composeapp.generated.resources.Res
25 
26 @Composable
27 fun AddFeedDialog(
!!     ^ error
28     onAdd: (String) -> Unit,
29     onDismiss: () -> Unit
30 ) = Dialog(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Dialogs.kt:61:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
58 }
59 
60 @Composable
61 fun DeleteFeedDialog(
!!     ^ error
62     feed: Feed,
63     onDelete: () -> Unit,
64     onDismiss: () -> Unit

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedIcon.kt:26:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
23 import rssreader.composeapp.generated.resources.Res
24 
25 @Composable
26 fun FeedIcon(
!!     ^ error
27     feed: Feed?,
28     isSelected: Boolean = false,
29     onClick: (() -> Unit)? = null

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedIcon.kt:72:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
69         .uppercase()
70 
71 @Composable
72 fun EditIcon(
!!     ^ error
73     onClick: () -> Unit
74 ) {
75     Box(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedList.kt:37:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
34 import rssreader.composeapp.generated.resources.Res
35 
36 @Composable
37 fun FeedList(store: FeedStore) {
!!     ^ error
38     Box(
39         modifier = Modifier.fillMaxSize()
40     ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedList.kt:88:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
85 }
86 
87 @Composable
88 fun FeedItemList(
!!     ^ error
89     feeds: List<Feed>,
90     onClick: (Feed) -> Unit
91 ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedList.kt:101:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
98  }
99  
100 @Composable
101 fun FeedItem(
!!!     ^ error
102     feed: Feed,
103     onClick: () -> Unit
104 ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt:27:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
24 import kotlinx.coroutines.launch
25 
26 @Composable
27 fun MainFeed(
!!     ^ error
28     store: FeedStore,
29     onPostClick: (Post) -> Unit,
30     onEditClick: () -> Unit,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt:69:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
66 }
67 
68 @Composable
69 fun MainFeedBottomBar(
!!     ^ error
70     feeds: List<Feed>,
71     selectedFeed: Feed?,
72     onFeedClick: (Feed?) -> Unit,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PostList.kt:35:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
32 import kotlinx.datetime.toLocalDateTime
33 
34 @Composable
35 fun PostList(
!!     ^ error
36     modifier: Modifier,
37     posts: List<Post>,
38     listState: LazyListState,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PostList.kt:55:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
52 }
53 
54 @Composable
55 fun PostItem(
!!     ^ error
56     item: Post,
57     onClick: () -> Unit
58 ) {

```

### style, MagicNumber (8)

Report magic numbers. Magic number is a numeric literal that is not defined as a constant and hence it's unclear what the purpose of this number is. It's better to declare such numbers as constants and give them a proper name. By default, -1, 0, 1, and 2 are not considered to be magic numbers.

[Documentation](https://detekt.dev/docs/rules/style#magicnumber)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:115:25
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
112 }
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
!!!                         ^ error
116     diskCacheSize: Int = 512 * 1024 * 1024
117 ) = ImageLoader {
118     interceptor {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:115:30
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
112 }
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
!!!                              ^ error
116     diskCacheSize: Int = 512 * 1024 * 1024
117 ) = ImageLoader {
118     interceptor {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:115:37
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
112 }
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
!!!                                     ^ error
116     diskCacheSize: Int = 512 * 1024 * 1024
117 ) = ImageLoader {
118     interceptor {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:116:26
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
116     diskCacheSize: Int = 512 * 1024 * 1024
!!!                          ^ error
117 ) = ImageLoader {
118     interceptor {
119         memoryCacheConfig {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:116:32
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
116     diskCacheSize: Int = 512 * 1024 * 1024
!!!                                ^ error
117 ) = ImageLoader {
118     interceptor {
119         memoryCacheConfig {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:116:39
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
113 
114 private fun generateImageLoader(
115     memCacheSize: Int = 32 * 1024 * 1024,
116     diskCacheSize: Int = 512 * 1024 * 1024
!!!                                       ^ error
117 ) = ImageLoader {
118     interceptor {
119         memoryCacheConfig {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/AppTheme.kt:11:28
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
8  import androidx.compose.runtime.Composable
9  import androidx.compose.ui.graphics.Color
10 
11 private val Orange = Color(0xfff8873c)
!!                            ^ error
12 private val Purple = Color(0xff6b70fc)
13 private val LightColors = lightColorScheme(
14     primary = Orange,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/AppTheme.kt:12:28
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
9  import androidx.compose.ui.graphics.Color
10 
11 private val Orange = Color(0xfff8873c)
12 private val Purple = Color(0xff6b70fc)
!!                            ^ error
13 private val LightColors = lightColorScheme(
14     primary = Orange,
15     onPrimary = Color.White,

```

### style, NewLineAtEndOfFile (8)

Checks whether files end with a line separator.

[Documentation](https://detekt.dev/docs/rules/style#newlineatendoffile)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt:130:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt is not ending with a new line.
```
```kotlin
127     components {
128         setupDefaultComponents()
129     }
130 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/AppTheme.kt:44:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/AppTheme.kt is not ending with a new line.
```
```kotlin
41             Surface(content = content)
42         }
43     )
44 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Dialogs.kt:83:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Dialogs.kt is not ending with a new line.
```
```kotlin
80             Text(text = stringResource(Res.string.remove))
81         }
82     }
83 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedIcon.kt:88:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedIcon.kt is not ending with a new line.
```
```kotlin
85             contentDescription = null
86         )
87     }
88 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt:101:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt is not ending with a new line.
```
```kotlin
98              Spacer(modifier = Modifier.size(16.dp))
99          }
100     }
101 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.kt:8:55
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.kt is not ending with a new line.
```
```kotlin
5  
6  internal expect fun openUrl(url: String?)
7  internal expect fun ComponentRegistryBuilder.setupDefaultComponents()
8  internal expect fun getImageCacheDirectoryPath(): Path
!                                                        ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PostList.kt:109:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/PostList.kt is not ending with a new line.
```
```kotlin
106     toLocalDateTime(TimeZone.currentSystemDefault())
107 ) {
108     "$dayOfMonth ${month.name.lowercase()} $year"
109 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Screens.kt:37:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Screens.kt is not ending with a new line.
```
```kotlin
34         val store: FeedStore by inject()
35         FeedList(store = store)
36     }
37 }
!!  ^ error

```

generated with [detekt version 1.23.7](https://detekt.dev/) on 2026-05-22 20:30:29 UTC
