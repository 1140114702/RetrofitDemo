package com.zwonb.retrofitdemo.api;

import com.zwonb.retrofitdemo.bean.UserBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zyb on 2017/5/18.
 */

public interface IUserApi {

    @GET("v5/")
    Call<List<UserBean>> getUser();
}
