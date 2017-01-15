package me.peerapong.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import me.peerapong.liveat500px.manager.PhotoListManager;
import me.peerapong.liveat500px.view.PhotoListItem;

/**
 * Created by peerapong on 1/15/17.
 */

public class PhotoListAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null) return 0;
        if (PhotoListManager.getInstance().getDao().getData() == null) return 0;
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoListItem item;
        if (convertView != null) {
            item = (PhotoListItem) convertView;
        } else {
            item = new PhotoListItem(parent.getContext());
        }
        return item;
    }
}
