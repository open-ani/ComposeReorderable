plugins {
    `maven-publish`
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.kotlin.multiplatform") version "2.0.20-Beta2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.20-Beta2" apply false
    kotlin("plugin.compose") version "2.0.20-Beta2" apply false
    id("org.jetbrains.compose") version "1.6.11" apply false
}

ext {
    extra["compileSdkVersion"] = 34
    extra["minSdkVersion"] = 21
    extra["targetSdkVersion"] = 34
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
