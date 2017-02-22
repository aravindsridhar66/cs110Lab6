package edu.ucsd.cs110.temperature;

/**
 * Created by aravi on 2/15/2017.
 */
  public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = (float)((this.getValue() - 32) / 1.8);
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {

        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}