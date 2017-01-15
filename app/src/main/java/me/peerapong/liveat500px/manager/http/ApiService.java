package me.peerapong.liveat500px.manager.http;

import me.peerapong.liveat500px.dao.PhotoItemCollectionDao;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by peerapong on 1/15/17.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
