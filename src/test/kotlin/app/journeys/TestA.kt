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
class TestA : FunSpec({

    beforeTest {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("ddMMMyyyy-HHmmss-SSS")
        val currentTime = current.format(formatter)
        println("ABC: Ankit: $currentTime")
    }

    test("A TEST1")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST2 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("A TEST3")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST4 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("A TEST5")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("A TEST6")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("A TEST7")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST8")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }


    test("A TEST9")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("A TEST10")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("A TEST11")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST12")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("A TEST13")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST14")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("A TEST15")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST16")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("A TEST17")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("A TEST18")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }


})
