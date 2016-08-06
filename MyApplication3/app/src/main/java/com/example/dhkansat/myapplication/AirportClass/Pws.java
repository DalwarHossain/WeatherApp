package com.example.dhkansat.myapplication.AirportClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DH Kansat on 8/4/2016.
 */
public class Pws {

    @SerializedName("station")
    @Expose
    private List<Station_> station = new ArrayList<Station_>();

    /**
     *
     * @return
     * The station
     */
    public List<Station_> getStation() {
        return station;
    }

    /**
     *
     * @param station
     * The station
     */
    public void setStation(List<Station_> station) {
        this.station = station;
    }

}
