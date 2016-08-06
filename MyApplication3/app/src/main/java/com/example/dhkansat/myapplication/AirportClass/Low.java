package com.example.dhkansat.myapplication.AirportClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by DH Kansat on 8/4/2016.
 */
public class Low {

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;

    /**
     *
     * @return
     * The fahrenheit
     */
    public String getFahrenheit() {
        return fahrenheit;
    }

    /**
     *
     * @param fahrenheit
     * The fahrenheit
     */
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     *
     * @return
     * The celsius
     */
    public String getCelsius() {
        return celsius;
    }

    /**
     *
     * @param celsius
     * The celsius
     */
    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }
}
