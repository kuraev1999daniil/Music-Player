plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")

    `android-config`
}

dependencies {

    implementation(AndroidX.appcompat)

    implementation(DI.dagger)
    kapt(DI.kapt)
}