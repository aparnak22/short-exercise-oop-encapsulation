package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.Objects;

public class WeatherReporter {

    private String location;
    private double temperature;
    final int TEMP_TOO_HIGH = 30;
    final int TEMP_TOO_LOW = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    private  double getTemperatureInFahrenheit(){
        return (9.0 / 5.0) * temperature + 32;
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, checkLocation(), checkTemperature(), getTemperatureInFahrenheit());

    }

    public String checkLocation() {
        if (Objects.equals(location, "London")) {

            return "🌦";

        } else if (Objects.equals(location, "California")) {

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > TEMP_TOO_HIGH) {

            return "It's too hot 🥵!";

        } else if (temperature < TEMP_TOO_LOW) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
