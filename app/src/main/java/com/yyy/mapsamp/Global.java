package com.yyy.mapsamp;

import android.app.Application;

import com.baidu.location.LocationClient;
import com.baidu.mapapi.SDKInitializer;

/**
 * Created by pc on 2018/1/30.
 *
 */

public class Global extends Application {
    private static String TAG = "Global";

    @Override
    public void onCreate() {
        SDKInitializer.initialize(getApplicationContext());
        super.onCreate();
    }
}
