pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AshdroidNavigation"
include(":app")
include(":common")
include(":common:navigation")
include(":common:data")

include(":feature")
include(":feature:dashboard")
include(":feature:song-details")
include(":feature:album-details")
include(":feature:artist-details")
