package com.example.dhkansat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhkansat.myapplication.DhakaWeather.Clouds;
import com.example.dhkansat.myapplication.DhakaWeather.Example;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    WeatherApi weatherApi;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= (TextView) findViewById(R.id.texView2Id);
        imageView= (ImageView) findViewById(R.id.imageViewId);
        networkingInitiliaze();
        getData();
        Picasso.with(this)
                .load("http://stacktips.com/wp-content/uploads/2014/11/Picasso-Image-Downloader.png")
                .into(imageView);
    }

    private void getData() {
        Call<Example>weatherCall = weatherApi.getWeather();
        weatherCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example example=response.body();
                Clouds clouds=example.getClouds();
                textView.setText(example.getName()+"\n"+example.getBase()+"\n"+example.getCod().toString()+
                        "\n"+example.getId().toString()+"\n"+example.getDt().toString()+"\nClouds:"+
                        " "+clouds.getAll().toString()
                );
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }


    private void networkingInitiliaze() {
        Retrofit retrofit =new Retrofit.Builder().baseUrl(Constrain.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        weatherApi =retrofit.create(WeatherApi.class);
    }
}
