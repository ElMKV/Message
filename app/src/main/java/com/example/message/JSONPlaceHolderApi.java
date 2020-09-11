package com.example.message;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {

    @GET("/todos/{id}")
    public Call<Post> getPostWithID(@Path("id") int id);


}
