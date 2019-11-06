import com.ewerk.gradle.plugins.tasks.QuerydslCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.2.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    java
    id("com.ewerk.gradle.plugins.querydsl") version "1.0.10"
    id("org.asciidoctor.convert") version "1.5.3"
}

group = "com.nespot2"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

// query dsl
val querydslSrcDir = "src/main/generated"

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


// spring rest doc
val snippetsDir by extra { file("build/generated-snippets") }

tasks.test {
    outputs.dir(snippetsDir)
}

tasks.asciidoctor {
    inputs.dir(snippetsDir)
    dependsOn(tasks.test) // added tasks. prefix
}

tasks.getByName<BootJar>("bootJar") {
    dependsOn(tasks.asciidoctor)
    from ("${buildDir}/asciidoc/html5") {
        into("static/docs")
    }
}

dependencies {
    asciidoctor("org.springframework.restdocs:spring-restdocs-asciidoctor:2.0.3.RELEASE")
    testCompile("org.springframework.restdocs:spring-restdocs-mockmvc:2.0.3.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.querydsl:querydsl-jpa")
    implementation("org.springframework.boot:spring-boot-devtools")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
    implementation("org.apache.commons:commons-lang3:3.7")
    implementation("com.h2database:h2")
    implementation("org.apache.httpcomponents:httpclient:4.5.10")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}