import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "club.csmrobotics"
version = "1.0-SNAPSHOT"

val bootJar: BootJar by tasks

bootJar.enabled = true
bootJar.mainClassName = "club.csmrobotics.csmrcserver.CsmrcServerApplication"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.data:spring-data-solr")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-aop")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.security:spring-security-test")
    implementation("com.auth0:java-jwt:3.8.1")
    implementation(project(":wss"))
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
