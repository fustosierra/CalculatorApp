plugins {
    id("java")
    id("io.qameta.allure") version("2.10.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.10.0"))
    //testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j-impl
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.23.1")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-math3
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("io.qameta.allure:allure-testng:2.13.2")
    implementation("org.springframework:spring-core:5.2.5.RELEASE")
    implementation("org.springframework:spring-context:5.2.5.RELEASE")
    implementation("org.springframework:spring-test:5.2.5.RELEASE")
    implementation("org.testng:testng:7.1.0")

}

tasks.test {
    useJUnitPlatform()
}