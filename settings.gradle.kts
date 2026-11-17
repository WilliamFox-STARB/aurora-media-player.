pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories { google(); mavenCentral() }
}
rootProject.name = "AuroraMediaPlayer"
include(":app", ":core:common", ":core:design", ":feature:home", ":feature:library", ":playback:audio")
