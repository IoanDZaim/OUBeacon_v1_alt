package com.IoanzaimGmailCom.IoanzaimGmailComSProxi9Bt;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "ioanzaim-gmail-com-s-proxi-9bt", "f97e967a51378a8dd64540ecd6990235");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
