package me.peerapong.liveat500px.datatype;

import android.os.Bundle;

/**
 * Created by peerapong on 1/16/17.
 */

public class MutableInteger {
    private int value;

    public MutableInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt("value", value);
        return bundle;
    }

    public void onRestoreInstaneState(Bundle savedInstanceState) {
        value = savedInstanceState.getInt("value");
    }
}
