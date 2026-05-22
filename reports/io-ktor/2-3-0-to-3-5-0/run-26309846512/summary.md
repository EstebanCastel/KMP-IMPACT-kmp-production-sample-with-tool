### Dependabot impact companion

- **Dependency:** `io.ktor`
- **Version change:** `2.3.0` → `3.5.0`
- **Risk:** **HIGH**
- **Recommendation:** Hold merge until impacted files are reviewed and targeted regression checks pass.
- **Static impact:** 26 files (7 direct / 19 transitive-or-expect-actual)
- **UI impact:** 7 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/datasource/network/FeedParser.kt` | direct | commonMain | 106 | 4 |
| `/tmp/output/phase1/before/shared/src/iosMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | ios | 60 | 3 |
| `/tmp/output/phase1/before/shared/src/androidMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | androidMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jvmMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jvmMain | 56 | 3 |
| `/tmp/output/phase1/before/shared/src/jsMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | direct | jsMain | 44 | 3 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/datasource/network/FeedLoader.kt` | direct | commonMain | 14 | 1 |
| `/tmp/output/phase1/before/tools/kmp-impact-analyzer/tests/fixtures/sample_kotlin/CommonModule.kt` | direct | common | 8 | 1 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/app/FeedStore.kt` | transitive | commonMain | 128 | 20 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/com/github/jetbrains/rssreader/compose/App.kt` | transitive | commonMain | 126 | 5 |
| `/tmp/output/phase1/before/shared/src/commonMain/kotlin/com/github/jetbrains/rssreader/core/RssReader.kt` | transitive | commonMain | 40 | 4 |
