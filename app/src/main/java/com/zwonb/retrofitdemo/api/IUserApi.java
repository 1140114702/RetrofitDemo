package com.zwonb.retrofitdemo.api;

import com.zwonb.retrofitdemo.bean.UserBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zyb on 2017/5/18.
 */

public interface IUserApi {

    @FormUrlEncoded
    @POST("shopOnline/")
    Call<UserBean> getUser(@Field("act") String act, @Field("page") String page);

//    @FormUrlEncoded
//    @POST("shopOnline/")
//    Call<UserBean> getUser(@FieldMap Map<String, Object> map);

}
