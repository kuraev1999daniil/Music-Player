@file:Suppress("UnstableApiUsage")

include(":data:entities")


include(":data:database")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Music-Player"

include(":app")
include(":core:navigation")
include(":ui:resources")
include(":feature:list-audio:impl", ":feature:list-audio:api")
include(":feature:list-video:impl", ":feature:list-video:api")
include(":feature:more:impl", ":feature:more:api")
include(":core:di")
include(":core:feature-api")
include(":data:audio")
include(":tools:audio-scanner")


