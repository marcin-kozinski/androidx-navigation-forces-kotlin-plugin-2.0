/**
 * The buildSrc build.gradle.kts file is the top most level gradle file.
 * The dependencies defined here are used in all other gradle scripts.  They are NOT used in the
 * compiled app.  They essentially replace the root directories' gradle script's buildScript block.
 * It uses `implementation` instead of `classpath`
 */

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.plugin.android)
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.androidx.navigation.safeargs)
}
