plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    id("kotlin-android-extensions")

    `android-config`
}

android {
    defaultConfig {
        testInstrumentationRunner = DefaultConfig.androidJUnitRunner
    }
}

dependencies {

    androidTestImplementation(Kotlin.Coroutines.test)
    androidTestImplementation(AndroidX.Testing.testRules)
    androidTestImplementation(AndroidX.Testing.testRunner)
    androidTestImplementation(AndroidX.Testing.espressoCore)
}