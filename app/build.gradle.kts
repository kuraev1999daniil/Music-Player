plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        applicationId = DefaultConfig.applicationId
        minSdk = DefaultConfig.minSdk
        targetSdk = DefaultConfig.targetSdk
        versionCode = BuildVersion.versionCode
        versionName = BuildVersion.versionName
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

kapt {
    useBuildCache = true
    correctErrorTypes = true
}

dependencies {

    implementation(project(":base-dagger"))
    implementation(project(":ui-resources"))

    implementation(project(":feature-main-audio"))
    implementation(project(":feature-main-video"))
    implementation(project(":feature-main-more"))

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)

    implementation(AndroidX.Compose.ui)
    implementation(AndroidX.Compose.material)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Activity.activityCompose)
    implementation(AndroidX.Compose.Material3.material3)
}