package com.example.dhkansat.myapplication;

import com.example.dhkansat.myapplication.AirportClass.Airport;
import com.example.dhkansat.myapplication.AirportClass.Example;
import com.example.dhkansat.myapplication.AirportClass.TxtForecast;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by DH Kansat on 8/3/2016.
 */
public interface WeatherApi {
    //@GET("api/02e5dd8c34e3e657/geolookup/conditions/forecast/q/Dhaka,Bangladesh.json"
    @GET("data/2.5/weather?q=Dhaka,bd&appid=78910bced6e378938bb4545eaed84406")
   // Call<Example>getWeather();//pakase 1
    Call<com.example.dhkansat.myapplication.DhakaWeather.Example>getWeather();
}
