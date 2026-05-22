### Dependabot impact companion

- **Dependency:** `io.insert-koin`
- **Version change:** `3.4.3` → `4.2.1`
- **Risk:** **MEDIUM**
- **Recommendation:** Review the directly impacted files and run focused smoke tests before merging.
- **Static impact:** 13 files (7 direct / 6 transitive-or-expect-actual)
- **UI impact:** 1 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt` | direct | commonMain | 126 | 5 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/App.kt` | direct | androidMain | 47 | 2 |
| `/tmp/output/phase1/before/composeApp/src/jvmMain/kotlin/main.kt` | direct | jvmMain | 30 | 2 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/Screens.kt` | direct | commonMain | 34 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/sync/RefreshWorker.kt` | direct | androidMain | 33 | 1 |
| `/tmp/output/phase1/before/composeApp/src/jsMain/kotlin/main.kt` | direct | jsMain | 24 | 1 |
| `/tmp/output/phase1/before/composeApp/src/iosMain/kotlin/main.kt` | direct | ios | 18 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/compose/Previews.kt` | transitive | androidMain | 55 | 1 |
| `/tmp/output/phase1/before/composeApp/src/iosMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.ios.kt` | expect_actual | ios | 23 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.android.kt` | transitive | androidMain | 19 | 1 |
