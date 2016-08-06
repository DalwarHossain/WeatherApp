package com.example.dhkansat.myapplication.AirportClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by DH Kansat on 8/4/2016.
 */
public class SnowDay {

    @SerializedName("in")
    @Expose
    private Double in;
    @SerializedName("cm")
    @Expose
    private Double cm;

    /**
     *
     * @return
     * The in
     */
    public Double getIn() {
        return in;
    }

    /**
     *
     * @param in
     * The in
     */
    public void setIn(Double in) {
        this.in = in;
    }

    /**
     *
     * @return
     * The cm
     */
    public Double getCm() {
        return cm;
    }

    /**
     *
     * @param cm
     * The cm
     */
    public void setCm(Double cm) {
        this.cm = cm;
    }
}
