plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

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

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)

    implementation(AndroidX.Compose.foundation)
    implementation(AndroidX.Compose.Material3.material3)
}