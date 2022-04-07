package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {
    private static WeatherReporter wr1;
    private static WeatherReporter wr_Lon;
    private static WeatherReporter wr_CapeT;

    @BeforeAll
    static void setUp() {
      wr1  = new WeatherReporter("California",22);
      wr_Lon  = new WeatherReporter("London",9);
      wr_CapeT = new WeatherReporter("Cape Town",35);

    }

    @Test
    void testWeatherReportIsPrinted() {
        assertEquals("I am in California and it is 🌅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 71.6.",
                wr1.print());
        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 48.2.",
                wr_Lon.print());
        assertEquals("I am in Cape Town and it is 🌤. It's too hot 🥵!. The temperature in Fahrenheit is 95.",
                wr_CapeT.print());
    }

    @Test
    void testCheckLocation() {
        assertEquals("🌅",wr1.checkLocation());
        assertEquals("🌦",wr_Lon.checkLocation());
        assertEquals("🌤",wr_CapeT.checkLocation());

    }

    @Test
    void testCheckTemperature() {
        assertEquals("Ahhh...it's just right 😊!",wr1.checkTemperature());
        assertEquals("It's too cold 🥶!",wr_Lon.checkTemperature());
        assertEquals("It's too hot 🥵!",wr_CapeT.checkTemperature());
    }
}