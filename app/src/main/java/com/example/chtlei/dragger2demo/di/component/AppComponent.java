package com.example.chtlei.dragger2demo.di.component;

import com.example.chtlei.dragger2demo.app.MyApplication;
import com.example.chtlei.dragger2demo.di.module.ActivityModules;
import com.example.chtlei.dragger2demo.di.module.CookModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by chtlei on 19-3-29.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModules.class,
        CookModule.class})
public interface AppComponent extends AndroidInjector<MyApplication>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication>{}
}
