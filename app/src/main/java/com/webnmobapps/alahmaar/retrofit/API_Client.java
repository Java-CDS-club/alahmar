package com.webnmobapps.alahmaar.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API_Client {

        public static final String  BASE_URL= "http://ec2-35-90-177-237.us-west-2.compute.amazonaws.com:8002/api/";
        public static final String  BASE_URL1= "http://192.168.1.46:8000/api/";
        public static final String  BASE_IMAGE_URL= "http://ec2-35-90-177-237.us-west-2.compute.amazonaws.com:8002";
        public static final String  FORM_URL= "http://ec2-35-90-177-237.us-west-2.compute.amazonaws.com:8002/";

        private static Retrofit retrofit = null;
        private static Api api;
        static Gson gson = new GsonBuilder()
                .setLenient()
                .create();


        public static Api getClient() {
            if (api == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build();
                Api api = retrofit.create(Api.class);
                return api;
            } else
                return api;
        }

    }


