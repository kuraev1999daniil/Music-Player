plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")

    `android-config`
}

dependencies {

    implementation(project(":data:entities"))

    implementation(AndroidX.Room.runtime)
    kapt(AndroidX.Room.kaptCompiler)
}