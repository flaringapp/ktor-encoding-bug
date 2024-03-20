plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
}

group = "com.flaringapp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:2.3.9")
    implementation("io.ktor:ktor-client-cio:2.3.9")
    implementation("io.ktor:ktor-client-encoding:2.3.9")
    implementation("io.ktor:ktor-client-content-negotiation:2.3.9")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.9")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
}

kotlin {
    jvmToolchain(17)
}