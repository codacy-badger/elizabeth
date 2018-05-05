package com.silverhetch.elizabeth.weather.government

import org.junit.Assert
import org.junit.Test

class WeathersFactoryTest {
    @Test
    fun cityNumber() {
        val weathers = WeathersFactory().instance()
        Assert.assertEquals(22, weathers.all().size)
    }
}