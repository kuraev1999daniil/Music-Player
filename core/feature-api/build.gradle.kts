plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    `android-config`
}

dependencies {

    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Compose.Material3.material3)
}