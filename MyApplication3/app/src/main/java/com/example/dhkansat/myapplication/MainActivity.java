package com.example.dhkansat.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhkansat.myapplication.AirportClass.Airport;
import com.example.dhkansat.myapplication.AirportClass.CurrentObservation;
import com.example.dhkansat.myapplication.AirportClass.Example;
import com.example.dhkansat.myapplication.AirportClass.Forecast;
import com.example.dhkansat.myapplication.AirportClass.Forecastday_;
import com.example.dhkansat.myapplication.AirportClass.High;
import com.example.dhkansat.myapplication.AirportClass.Image;
import com.example.dhkansat.myapplication.AirportClass.Location;
import com.example.dhkansat.myapplication.AirportClass.Simpleforecast;
import com.example.dhkansat.myapplication.AirportClass.Station;
import com.example.dhkansat.myapplication.AirportClass.TxtForecast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    WeatherApi weatherApi;
ListView  listView;
    TextView textView;
    ImageView imageView;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       listView = (ListView) findViewById(R.id.listView);
        textView= (TextView) findViewById(R.id.TextViewId);
           imageView= (ImageView) findViewById(R.id.imageId);
        networkingInitiliaze();
        getData();
    }

    private void getData() {

       /* Call<Example>responseCollectionCall = weatherApi.getWeather();
        responseCollectionCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example example =response.body();
                Location location=example.getLocation();
                List<String>locations=new ArrayList<String>();
                locations.add(location.getCountryName());

                Forecast forecast=example.getForecast();
                Simpleforecast simpleforecast =forecast.getSimpleforecast();
                List<Forecastday_> forecastday_s=simpleforecast.getForecastday();
                High high = forecastday_s.get(0).getHigh();
                List<High> highs=new ArrayList<High>();
                highs.add(forecastday_s.get(0).getHigh());
                highs.add(forecastday_s.get(1).getHigh());
               highs.add(forecastday_s.get(2).getHigh());
                highs.add(forecastday_s.get(3).getHigh());

                CurrentObservation currentObservation=example.getCurrentObservation();
                 List<String>currentObservations=new ArrayList<String>();
                currentObservations.add(currentObservation.getDewpointC().toString());
                currentObservations.add(currentObservation.getTempC().toString());
                currentObservations.add(currentObservation.getWindDegrees().toString());
                currentObservations.add(currentObservation.getDewpointF().toString());
                currentObservations.add(currentObservation.getWindGustKph().toString());
                currentObservations.add(currentObservation.getWindKph().toString());
                currentObservations.add(currentObservation.getWindMph().toString());
                currentObservations.add(currentObservation.getTempF().toString());
                currentObservations.add(currentObservation.getWindGustMph().toString());

                currentObservations.add(currentObservation.getDewpointString());
                currentObservations.add(currentObservation.getFeelslikeC());
                currentObservations.add(currentObservation.getFeelslikeF());
                currentObservations.add(currentObservation.getFeelslikeString());
                currentObservations.add(currentObservation.getHeatIndexC());
                currentObservations.add(currentObservation.getHeatIndexC());
                currentObservations.add(currentObservation.getHistoryUrl());
                currentObservations.add(currentObservation.getHeatIndexF());
                currentObservations.add(currentObservation.getIcon());
                currentObservations.add(currentObservation.getWindString());
                currentObservations.add(currentObservation.getWindDir());
                currentObservations.add(currentObservation.getWindchillString());


                // List<String>txtForecasts=new ArrayList<String>();
                //txtForecasts.add(txtForecast.getDate());
                //textView.setText(forecastday_s.get(1).getIcon());

               // textView.setText(high.getCelsius()+"\n"+high.getFahrenheit());

               // Image image=new Image();



               // textView.setText(image.getLink());
              //  List<Station>stations=responseCollection.getStation();
               // Toast.makeText(MainActivity.this,responseCollection.toString(), Toast.LENGTH_SHORT).show();
              // List<String> stations=responseCollection.getForecastday();

                ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,currentObservations);
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });*/

    }

    private void networkingInitiliaze() {
        Retrofit retrofit =new Retrofit.Builder().baseUrl(Constrain.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        weatherApi =retrofit.create(WeatherApi.class);
    }

}
