plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")

    `android-config`
}

dependencies {

    api(project(":data:cache"))
    api(project(":data:audio"))
    api(project(":data:database"))

    implementation(project(":tools:audio-scanner"))

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)

    implementation(DI.dagger)
    kapt(DI.kapt)

    implementation(AndroidX.Room.runtime)
    kapt(AndroidX.Room.kaptCompiler)

    implementation(AndroidX.Compose.runtime)
    implementation(AndroidX.Lifecycle.viewModelCompose)
}