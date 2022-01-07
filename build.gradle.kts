import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val kotestVersion = "4.6.2"
val seleniumVersion = "4.1.1"
val allureVersion = "2.17.2"

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    id("io.kotest") version "0.3.9"
    id("io.qameta.allure") version "2.8.1"
}

allure {
    version = allureVersion
    autoconfigure = false
    resultsDir = file("${project.buildDir}/allure-results")

    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("ddMMMyyyy-HHmmss-SSS")
    val folder = current.format(formatter)
    reportDir = file("$baseDir/allure-report/$folder/")
}

group = "com.ankitladdha.kotest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("io.kotest:kotest-assertions-core-jvm:$kotestVersion")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion")
    testImplementation("io.rest-assured:kotlin-extensions:4.4.0") {
        exclude(group = "org.codehaus.groovy", module = "groovy")
        exclude(group = "org.codehaus.groovy", module = "groovy-xml")
    }
    testImplementation("org.seleniumhq.selenium:selenium-java:$seleniumVersion")
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.0.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.0-alpha5")

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.+")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.+")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.+")
    implementation("io.kotest.extensions:kotest-extensions-allure:1.0.3")
    implementation("io.qameta.allure:allure-rest-assured:$allureVersion")
    implementation("com.codepine.api:testrail-api-java-client:2.0.2")
}

tasks.withType<Test> {
    useJUnitPlatform()

    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        showStackTraces = true
        showExceptions = true
        showCauses = true

        //events("passed", "skipped", "failed", "standard_out")

        outputs.upToDateWhen { false }


        addTestListener(object : TestListener {
            override fun beforeSuite(suite: TestDescriptor) {}
            override fun beforeTest(testDescriptor: TestDescriptor) {}
            override fun afterTest(testDescriptor: TestDescriptor, result: TestResult) {}
            override fun afterSuite(suite: TestDescriptor, result: TestResult) {
                if (suite.parent != null && result.testCount > 0) { // will match the outermost suite
                    val type =
                        if (suite.displayName.startsWith("Gradle Test Executor")) "Suite Result: " else "TestClass: "

                    //println("ABC: type $type")
                    val status =
                        "${result.resultType} (${result.testCount} tests, ${result.successfulTestCount} passed, ${result.failedTestCount} failed, ${result.skippedTestCount} skipped)"

                    // Prepare message format for result
                    val startString = "|  "
                    val endString = "  |"
                    val msgFormatter = startString.length + type.length + status.length + endString.length
                    val messages = """
                ${(1..msgFormatter).joinToString("") { "-" }}
                $type:${suite.displayName}$startString$status$endString
                ${(1..msgFormatter).joinToString("") { "-" }}
            """.trimIndent()
                    println(messages)
                }
            }
        })
    }
}

val test by tasks.getting(Test::class) {
    systemProperties = System.getProperties().mapKeys { it.key.toString() }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
