### Dependabot impact companion

- **Dependency:** `androidx.work`
- **Version change:** `2.9.0` → `2.11.2`
- **Risk:** **MEDIUM**
- **Recommendation:** Review the directly impacted files and run focused smoke tests before merging.
- **Static impact:** 11 files (1 direct / 10 transitive-or-expect-actual)
- **UI impact:** 1 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/sync/RefreshWorker.kt` | direct | androidMain | 33 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/App.kt` | transitive | androidMain | 47 | 2 |
| `/tmp/output/phase1/before/composeApp/src/jvmMain/kotlin/main.kt` | transitive | jvmMain | 30 | 2 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/compose/Previews.kt` | transitive | androidMain | 55 | 1 |
| `/tmp/output/phase1/before/composeApp/src/jsMain/kotlin/main.kt` | transitive | jsMain | 24 | 1 |
| `/tmp/output/phase1/before/composeApp/src/iosMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.ios.kt` | expect_actual | ios | 23 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.android.kt` | transitive | androidMain | 19 | 1 |
| `/tmp/output/phase1/before/composeApp/src/iosMain/kotlin/main.kt` | transitive | ios | 18 | 1 |
| `/tmp/output/phase1/before/composeApp/src/jvmMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.jvm.kt` | expect_actual | jvmMain | 13 | 1 |
| `/tmp/output/phase1/before/composeApp/src/jsMain/kotlin/com/github/jetbrains/rssreader/compose/PlatformUI.js.kt` | expect_actual | jsMain | 11 | 1 |
