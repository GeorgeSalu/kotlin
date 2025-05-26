package br.com.secao7

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestOperatorOverload {

    lateinit var p1: Coordinates
    lateinit var p2: Coordinates

    @BeforeAll
    fun setup() {
        p1 = Coordinates(200, 100)
        p2 = Coordinates(1000, 2000)
    }

    @Test
    fun `Calling OperatorOverload with "(200, 100) plus (1000, 2000)" returns Coordinates(x=1200, y=2100)`(){
        val p3 = p1 + p2
        p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)"
    }

}