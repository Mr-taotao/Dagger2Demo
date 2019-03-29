package com.example.chtlei.dragger2demo.app;

import com.example.chtlei.dragger2demo.di.component.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by chtlei on 19-3-29.
 */

public class MyApplication extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
