package me.peerapong.liveat500px;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by peerapong on 1/15/17.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
