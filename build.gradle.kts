plugins {
    application
}

repositories {
    mavenCentral()
}

val cucumberVersion: String by project

dependencies {
    testImplementation("io.cucumber:cucumber-java:${cucumberVersion}")
    testImplementation("io.cucumber:cucumber-junit:${cucumberVersion}")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:${cucumberVersion}")
//    testImplementation("io.cucumber:cucumber-spring:${cucumberVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("com.google.guava:guava:31.1-jre")
}

application {
    mainClass.set("com.example.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
