package me.peerapong.liveat500px.manager;

import android.content.Context;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

import java.util.ArrayList;

import me.peerapong.liveat500px.dao.PhotoItemCollectionDao;
import me.peerapong.liveat500px.dao.PhotoItemDao;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class PhotoListManager {

    private Context mContext;
    private PhotoItemCollectionDao dao;

    public PhotoListManager() {
        mContext = Contextor.getInstance().getContext();
    }

    public PhotoItemCollectionDao getDao() {
        return dao;
    }

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    public void insertDaoAtTopPosition(PhotoItemCollectionDao newDao) {
        if (this.dao == null)
            this.dao = new PhotoItemCollectionDao();
        if (this.dao.getData() == null)
            this.dao.setData(new ArrayList<PhotoItemDao>());
        this.dao.getData().addAll(0, newDao.getData());
    }

    public int getMaximumId() {
        if (dao == null) return 0;
        if (dao.getData() == null) return 0;
        if (dao.getData().size() == 0) return 0;

        int maxId = dao.getData().get(0).getId();
        for (int i = 0; i < dao.getData().size(); i++) {
            maxId = Math.max(maxId, dao.getData().get(i).getId());
        }
        return maxId;
    }

    public int getCount() {
        if (dao == null) return 0;
        if (dao.getData() == null) return 0;
        return dao.getData().size();
    }
}
