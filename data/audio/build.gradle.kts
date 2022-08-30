plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android-extensions")

    kotlin("kapt")

    `android-config`
}

dependencies {

    api(project(":tools:audio-scanner"))

    implementation(Kotlin.Coroutines.core)
    implementation(Kotlin.Coroutines.android)

    implementation(DI.dagger)
    kapt(DI.kapt)
}