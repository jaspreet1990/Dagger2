package com.android.dagger2;

import android.app.Application;
import android.util.Log;

import com.android.dagger2.di.ApplicationComponent;
import com.android.dagger2.di.ApplicationModule;
import com.android.dagger2.di.DaggerApplicationComponent;

/**
 * Created by DPM on 26-01-2018.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        Log.i("", "onCreate...app component initialized..." + applicationComponent);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
