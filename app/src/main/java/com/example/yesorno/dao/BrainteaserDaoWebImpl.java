package com.example.yesorno.dao;

import android.app.Application;

import com.example.yesorno.model.Brainteaser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BrainteaserDaoWebImpl extends Application {

        private static YesOrNoApi yesOrNoApi;
        private Retrofit retrofit;

        @Override
        public void onCreate() {
            super.onCreate();

            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.101:8080") //Базовая часть адреса
                    .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                    .build();
            yesOrNoApi = retrofit.create(YesOrNoApi.class); //Создаем объект, при помощи которого будем выполнять запросы
        }

        public static YesOrNoApi getApi() {
            return yesOrNoApi;
        }


}
