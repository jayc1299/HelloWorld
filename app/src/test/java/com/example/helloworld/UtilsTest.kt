package com.example.helloworld

import org.junit.Assert.assertEquals
import org.junit.Test

internal class UtilsTest {

    private val utils = Utils()

    @Test
    fun appendBoom() {
        assertEquals("Boom BOOM", utils.appendBoom("Boom"))
    }

}