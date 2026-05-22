plugins {
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlinx.kover")
    id("io.gitlab.arturbosch.detekt")
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    jvm()

    js {
        browser()
    }

    sourceSets {
        commonMain.dependencies {
            //Network
            implementation(libs.ktor.core)
            implementation(libs.ktor.logging)
            //Coroutines
            implementation(libs.kotlinx.coroutines.core)
            //Logger
            implementation(libs.napier)
            //JSON
            implementation(libs.kotlinx.serialization.json)
            //XML
            implementation(libs.xml.serialization)
            //Key-Value storage
            implementation(libs.multiplatform.settings)
            // DI
            api(libs.koin.core)
            //Datetime
            implementation(libs.kotlinx.datetime)
        }

        androidMain.dependencies {
            //Network
            implementation(libs.ktor.client.okhttp)
        }

        iosMain.dependencies {
            //Network
            implementation(libs.ktor.client.ios)
        }

        jvmMain.dependencies {
            //Network
            implementation(libs.ktor.client.okhttp)
        }

        jsMain.dependencies {
            //Network
            implementation(libs.ktor.client.js)
            //okio fix
            implementation(devNpm("node-polyfill-webpack-plugin", "^2.0.1"))
        }
    }
}

android {
    namespace = "com.github.jetbrains.rssreader"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    compileOptions {
        // Flag to enable support for the new language APIs
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    dependencies {
        coreLibraryDesugaring(libs.desugar.jdk.libs)
    }
}

detekt {
    ignoreFailures = true
    buildUponDefaultConfig = true
    reports { xml { required.set(true) } }
}

dependencies {
    add("kspCommonMainMetadata", files("/home/runner/work/KMP-IMPACT-kmp-production-sample-with-tool/KMP-IMPACT-kmp-production-sample-with-tool/tools/kmp-impact-analyzer/tools/ksp/impact-analysis-processor.jar"))
}
