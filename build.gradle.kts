import com.ewerk.gradle.plugins.tasks.QuerydslCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.2.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    java
    id("com.ewerk.gradle.plugins.querydsl") version "1.0.10"
}

group = "com.nespot2"
version = "0.0.1-SNAPSHOT"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

// query dsl
val querydslSrcDir = "src-gen/main/java"

querydsl {
    library = "com.querydsl:querydsl-apt"
    jpa = true
    querydslSourcesDir = querydslSrcDir
}


tasks.getByName<QuerydslCompile>("compileQuerydsl") {
    options.annotationProcessorPath = configurations.getByName("querydsl")
}

configurations.getByName("querydsl") {
    extendsFrom(configurations.getByName("compileClasspath"))
}

sourceSets {
    getByName("main").java.srcDirs(listOf("src/main/java", querydslSrcDir))
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.querydsl:querydsl-jpa")
    implementation("org.springframework.boot:spring-boot-devtools")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
    implementation("org.apache.commons:commons-lang3:3.7")
    implementation("org.apache.httpcomponents:httpclient:4.5.10")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}