package com.zwonb.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zwonb.retrofitdemo.api.IUserApi;
import com.zwonb.retrofitdemo.bean.UserBean;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "binbin";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.main_text);
        initData();
    }

    private void initData() {
        Map<String, Object> map = new HashMap<>();
        map.put("act","shopSnapUp");
        map.put("page","1");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.cd6565.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IUserApi userApi = retrofit.create(IUserApi.class);
        Call<UserBean> call = userApi.getUser("shopSnapUp",""+1);
        call.enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call,
                                   Response<UserBean> response) {

                UserBean bean = response.body();
                assert bean != null;
                Log.e(TAG, "onResponse: "+ bean.getYdBody().getShopList().get(0).getProductTitle());
                textView.setText(bean.getYdBody().getShopList().get(0).getProductTitle());
            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {

                Log.e(TAG, "onFailure: ");
            }
        });
    }
}
