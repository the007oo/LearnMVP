package com.phattarapong.learnmvp;

import android.app.Application;

import com.phattarapong.learnmvp.manager.Contextor;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().setContext(getApplicationContext());


    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
