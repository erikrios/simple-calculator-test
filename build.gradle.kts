plugins {
    kotlin("jvm") version "1.4.30"
}

group = "com.erikriosetiawan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
    testImplementation ("org.mockito:mockito-core:2.19.0")
}