package com.example.chtlei.dragger2demo.di.module;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chtlei on 19-3-29.
 */

@Module
public class CookModule {
    @Singleton
    @Provides
    public Map<String, Boolean> providerMenus(){
        Map<String, Boolean> menus = new LinkedHashMap<>();
        menus.put("酸菜鱼", true);
        menus.put("土豆丝", true);
        menus.put("铁板牛肉", true);
        return menus;
    }
}
