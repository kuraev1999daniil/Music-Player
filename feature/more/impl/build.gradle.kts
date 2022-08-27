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

    implementation(project(":ui:resources"))
    implementation(project(":feature:more:api"))

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(AndroidX.Compose.ui)
    implementation(AndroidX.Compose.material)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Compose.Material3.material3)
}