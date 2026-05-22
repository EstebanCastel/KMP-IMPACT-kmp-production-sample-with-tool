### Dependabot impact companion

- **Dependency:** `com.russhwolf`
- **Version change:** `1.0.0` → `1.3.0`
- **Risk:** **HIGH**
- **Recommendation:** Hold merge until impacted files are reviewed and targeted regression checks pass.
- **Static impact:** 22 files (5 direct / 17 transitive-or-expect-actual)
- **UI impact:** 6 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/shared/src/iosMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | ios | 60 | 3 |
| `/tmp/output/phase1/before/shared/src/androidMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | androidMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jvmMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jvmMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jsMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jsMain | 44 | 3 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/datasource/storage/FeedStorage.kt` | direct | commonMain | 38 | 1 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/app/FeedStore.kt` | transitive | commonMain | 128 | 20 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt` | transitive | commonMain | 126 | 5 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | transitive | commonMain | 40 | 4 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedList.kt` | transitive | commonMain | 119 | 3 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt` | transitive | commonMain | 97 | 2 |
