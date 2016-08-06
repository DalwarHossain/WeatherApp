package com.example.dhkansat.myapplication.AirportClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by DH Kansat on 8/4/2016.
 */
public class Features {
    @SerializedName("geolookup")
    @Expose
    private Integer geolookup;
    @SerializedName("conditions")
    @Expose
    private Integer conditions;
    @SerializedName("forecast")
    @Expose
    private Integer forecast;

    /**
     *
     * @return
     * The geolookup
     */
    public Integer getGeolookup() {
        return geolookup;
    }

    /**
     *
     * @param geolookup
     * The geolookup
     */
    public void setGeolookup(Integer geolookup) {
        this.geolookup = geolookup;
    }

    /**
     *
     * @return
     * The conditions
     */
    public Integer getConditions() {
        return conditions;
    }

    /**
     *
     * @param conditions
     * The conditions
     */
    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

    /**
     *
     * @return
     * The forecast
     */
    public Integer getForecast() {
        return forecast;
    }

    /**
     *
     * @param forecast
     * The forecast
     */
    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }
}
