package com.example.chtlei.dragger2demo.modules.main.bean;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by chtlei on 19-3-29.
 */

public class MainBean {
    public Map<String,Boolean> menus;

    @Inject
    public MainBean( Map<String,Boolean> menus){
        this.menus = menus;
    }

    public Map<String,Boolean> getMenus(){
        return menus;
    }
}
