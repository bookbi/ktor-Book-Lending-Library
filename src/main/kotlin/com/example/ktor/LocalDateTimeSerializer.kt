val kotlinVersion = "2.1.10"
val ktorVersion = "3.2.0"

plugins {
    kotlin("jvm") version kotlinVersion
    id("io.ktor.plugin") version ktorVersion
    id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion
}

group = "com.example"
version = "0.0.1"

application {
    mainClass.set("com.example.ktor.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktorVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}
