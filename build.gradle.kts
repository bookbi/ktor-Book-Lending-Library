plugins {
    kotlin("jvm") version "1.6.21"
    id("io.ktor.plugin") version "1.6.8"
}

group = "com.example"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:1.6.8")
    implementation("io.ktor:ktor-server-netty:1.6.8")
    implementation("io.ktor:ktor-serialization:1.6.8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("org.jetbrains.exposed:exposed-core:0.31.1")
    implementation("org.jetbrains.exposed:exposed-dao:0.31.1")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.31.1")
    implementation("org.postgresql:postgresql:42.2.23")
    testImplementation("io.ktor:ktor-server-tests:1.6.8")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.21")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.21")
}