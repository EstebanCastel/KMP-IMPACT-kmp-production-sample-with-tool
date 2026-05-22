### Dependabot impact companion

- **Dependency:** `io.github.aakira`
- **Version change:** `2.6.0` → `2.7.1`
- **Risk:** **HIGH**
- **Recommendation:** Hold merge until impacted files are reviewed and targeted regression checks pass.
- **Static impact:** 23 files (6 direct / 17 transitive-or-expect-actual)
- **UI impact:** 6 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/app/FeedStore.kt` | direct | commonMain | 128 | 20 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/datasource/network/FeedParser.kt` | direct | commonMain | 106 | 4 |
| `/tmp/output/phase1/before/shared/src/iosMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | ios | 60 | 3 |
| `/tmp/output/phase1/before/shared/src/androidMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | androidMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jvmMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jvmMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jsMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jsMain | 44 | 3 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt` | transitive | commonMain | 126 | 5 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | transitive | commonMain | 40 | 4 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/FeedList.kt` | transitive | commonMain | 119 | 3 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/MainFeed.kt` | transitive | commonMain | 97 | 2 |
