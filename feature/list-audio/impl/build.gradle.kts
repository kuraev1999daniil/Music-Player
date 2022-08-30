plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")

    `android-config`
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AndroidX.Compose.kotlinCompilerExtensionVersion
    }
}

dependencies {

    implementation(project(":core:di"))
    implementation(project(":ui:resources"))
    implementation(project(":feature:list-audio:api"))

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(Kotlin.Coroutines.core)
    implementation(Kotlin.Coroutines.android)

    implementation(AndroidX.Compose.ui)
    implementation(AndroidX.Compose.material)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Compose.Material3.material3)
}