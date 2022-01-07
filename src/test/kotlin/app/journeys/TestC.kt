package app.journeys

import app.utils.AB
import app.utils.CD
import app.utils.EF
import io.kotest.core.spec.DoNotParallelize
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.time.ExperimentalTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@ExperimentalTime
@DoNotParallelize
class TestC : FunSpec({

    beforeTest {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("ddMMMyyyy-HHmmss-SSS")
        val currentTime = current.format(formatter)
        println("ABC: Ankit: $currentTime")
    }

    test("C TEST1")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST2 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("C TEST3")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST4 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("C TEST5")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("C TEST6")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("C TEST7")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST8")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }


    test("C TEST9")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("C TEST10")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("C TEST11")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST12")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("C TEST13")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST14")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("C TEST15")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST16")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("C TEST17")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("C TEST18")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }


})
