plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")

    `android-config`
}

android {
    defaultConfig {
        applicationId = DefaultConfig.applicationId
        versionCode = BuildVersion.versionCode
        versionName = BuildVersion.versionName
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AndroidX.Compose.kotlinCompilerExtensionVersion
    }
}

kapt {
    useBuildCache = true
    correctErrorTypes = true
}

dependencies {

    implementation(project(":core:di"))
    implementation(project(":ui:resources"))

    implementation(project(":feature:more:impl"))
    implementation(project(":feature:list-audio:impl"))
    implementation(project(":feature:list-video:impl"))

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)

    implementation(AndroidX.Compose.material)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Activity.activityCompose)
    implementation(AndroidX.Compose.Material3.material3)
}