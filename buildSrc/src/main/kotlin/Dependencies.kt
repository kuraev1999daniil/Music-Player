object DefaultConfig {

    const val minSdk = 24
    const val targetSdk = 32
    const val compileSdk = 32

    const val jvmVersion = "1.8"
    const val androidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val applicationId = "ru.kuraev.music_player"
}

object BuildVersion {

    private const val major = 1
    private const val minor = 0
    private const val patch = 0

    const val versionName = "$major.$minor.$patch"
    const val versionCode = 1
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.4.1"
    const val coreKtx = "androidx.core:core-ktx:1.7.0"

    object Activity {
        const val activityCompose = "androidx.activity:activity-compose:1.4.0"
    }

    object Compose {
        private const val version = "1.2.0"

        const val kotlinCompilerExtensionVersion = "1.2.0"

        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val layout = "androidx.compose.foundation:foundation-layout:$version"
        const val material = "androidx.compose.material:material:$version"
        const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val test = "androidx.compose.ui:ui-test:$version"
        const val ui = "androidx.compose.ui:ui:$version"
        const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
        const val uiText = "androidx.compose.ui:ui-text-google-fonts:$version"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
        const val uiUtil = "androidx.compose.ui:ui-util:${version}"
        const val viewBinding = "androidx.compose.ui:ui-viewbinding:$version"
        const val animation = "androidx.compose.animation:animation:$version"

        object Material3 {
            private const val version = "1.0.0-alpha10"

            const val material3 = "androidx.compose.material3:material3:$version"
        }
    }

    object Navigation {
        private const val version = "2.5.1"

        const val compose = "androidx.navigation:navigation-compose:$version"
    }

    object Lifecycle {
        private const val viewModelVersion = "2.4.1"
        private const val lifecycleRuntimeVersion = "2.6.0-alpha01"

        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelVersion"

        const val runtimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:$lifecycleRuntimeVersion"
    }

    object Testing {
        private const val androidXTestVersion = "1.4.0"
        private const val espressoVersion = "3.4.0"

        const val testRules = "androidx.test:rules:$androidXTestVersion"
        const val testRunner = "androidx.test:runner:$androidXTestVersion"

        const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"
    }

    object Room {
        private const val version = "2.4.3"

        const val ktx = "androidx.room:room-ktx:$version"
        const val runtime = "androidx.room:room-runtime:$version"
        const val kaptCompiler = "androidx.room:room-compiler:$version"
    }
}

object Kotlin {

    private const val version = "1.7.0"

    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"

    object Coroutines {
        private const val version = "1.6.4"

        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }
}

object DI {

    private const val version = "2.43.2"

    const val dagger = "com.google.dagger:dagger:$version"
    const val kapt = "com.google.dagger:dagger-compiler:$version"
}