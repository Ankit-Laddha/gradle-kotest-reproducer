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
class TestB : FunSpec({

    beforeTest {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("ddMMMyyyy-HHmmss-SSS")
        val currentTime = current.format(formatter)
        println("ABC: Ankit: $currentTime")
    }

    test("B TEST1")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST2 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("B TEST3")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST4 ")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("B TEST5")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("B TEST6")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("B TEST7")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST8")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }


    test("B TEST9")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("B TEST10")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("B TEST11")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST12")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("B TEST13")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST14")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                //true shouldBe false
                println("End Test")
            }

    test("B TEST15")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST16")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }

    test("B TEST17")
            .config(tags = setOf(AB, CD, EF)) {
                println("Start Test")
                // true shouldBe false
                println("End Test")
            }

    test("B TEST18")
            .config(tags = setOf(AB, CD)) {
                println("Start Test")
                true shouldBe false
                println("End Test")
            }


})
