package com.example.administrator.retrofitex;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/5/26.
 */
public interface PostRoute {
   @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("api/FlyRoute/Add")
   Call<FlyRouteBean> postFlyRoute(@Body RequestBody route);
    //接口地址：http://172.20.69.209:9665/api/Test/Info?IsGay={IsGay}
    @POST("api/Test/Info")
    Call<ResponseBody> postStudent(@Body RequestBody stu,@Query("IsGay") boolean IsGay);
    @POST("api/Test/hello1")
    Call<ResponseBody> getHello(@Query("name") String name,@Query("IsGay") boolean IsGay);
    @FormUrlEncoded
    @POST("api/Test/hello1")
    Call<ResponseBody> postHello(@Field("name") String name, @Field("IsGay") boolean IsGay);
    //http://apis.baidu.com/apistore/aqiservice/citylist
    //header添加apikey字段
    @GET("apistore/aqiservice/citylist")
    Call<ResponseBody> getWeather(@Header("apikey") String apikey);
}
