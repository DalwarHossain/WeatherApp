package com.example.dhkansat.myapplication.AirportClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DH Kansat on 8/4/2016.
 */
public class Airport {
    @SerializedName("station")
    @Expose
    private List<Station> station = new ArrayList<Station>();


    public List<Station> getStation() {
        return station;
    }


    public void setStation(List<Station> station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Airpoy"+station;
    }
}
