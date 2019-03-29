package com.example.chtlei.dragger2demo.di.module;

import com.example.chtlei.dragger2demo.modules.main.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by chtlei on 19-3-29.
 */

@Module
public abstract class ActivityModules {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
