plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        minSdk = DefaultConfig.minSdk
        targetSdk = DefaultConfig.targetSdk
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AndroidX.Compose.kotlinCompilerExtensionVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = DefaultConfig.jvmVersion
    }
}

dependencies {

    implementation(project(":ui:resources"))
    implementation(project(":feature:list-video:api"))

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(AndroidX.Compose.ui)
    implementation(AndroidX.Compose.material)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Compose.Material3.material3)
}