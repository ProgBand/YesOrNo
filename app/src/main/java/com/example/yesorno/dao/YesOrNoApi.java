package com.example.yesorno.dao;

import com.example.yesorno.model.Brainteaser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YesOrNoApi {
    @GET("/get")
    Call<List<Brainteaser>> getByCategory(@Query("categoryId") int id);
//// TODO: 23.05.2017 добавить в запрос id категории
    @GET("/get/br")
    Call<Brainteaser> getById (@Query("brainteaserId") int id);
}

