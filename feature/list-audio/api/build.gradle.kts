plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    `android-config`
}

dependencies {

    api(project(":core:feature-api"))
}