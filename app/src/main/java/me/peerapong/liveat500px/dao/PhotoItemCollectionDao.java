package me.peerapong.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import me.peerapong.liveat500px.view.PhotoListItem;

/**
 * Created by peerapong on 1/15/17.
 */

public class PhotoItemCollectionDao {
    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<PhotoListItem> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<PhotoListItem> getData() {
        return data;
    }

    public void setData(List<PhotoListItem> data) {
        this.data = data;
    }
}
