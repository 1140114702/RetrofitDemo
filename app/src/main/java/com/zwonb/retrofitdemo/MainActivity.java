package com.zwonb.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zwonb.retrofitdemo.api.IUserApi;
import com.zwonb.retrofitdemo.bean.UserBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "binbin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://free-api.heweather.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IUserApi userApi = retrofit.create(IUserApi.class);
        Call<List<UserBean>> call = userApi.getUser();
        call.enqueue(new Callback<List<UserBean>>() {
            @Override
            public void onResponse(Call<List<UserBean>> call,
                                   Response<List<UserBean>> response) {

                Log.e(TAG, "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<List<UserBean>> call, Throwable t) {

            }
        });
    }
}
