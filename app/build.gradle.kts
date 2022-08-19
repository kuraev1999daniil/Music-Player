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

    implementation(project(":feature-main"))
    implementation(project(":util-resources"))

    implementation(DI.dagger)
    kapt(DI.kapt)
}