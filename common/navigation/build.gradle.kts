plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // Kotlin serialization plugin for type safe routes and navigation arguments
    kotlin("plugin.serialization") version "2.0.21"
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.ashdroid.common.navigation"
    compileSdk = 35

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    api(libs.androidx.core.ktx)
    api(libs.androidx.appcompat)
    api(libs.material)
    api(libs.androidx.material3)
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.ui)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.ui.tooling.preview)

    // Jetpack Compose integration
    api(libs.androidx.navigation.compose)
    api(libs.androidx.navigation.ui)


    // JSON serialization library, works with the Kotlin serialization plugin
    api(libs.kotlinx.serialization.json)
    api(project(":common:data"))


    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Testing Navigation
    androidTestImplementation(libs.androidx.navigation.testing)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}