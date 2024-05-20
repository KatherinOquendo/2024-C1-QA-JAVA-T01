plugins {
    id("java")
}

group = "co.com.biblioteca"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.mysql:mysql-connector-j:8.3.0")
    //implementation ("org.projectlombok:lombok:1.18.22")

}

tasks.test {
    useJUnitPlatform()
}