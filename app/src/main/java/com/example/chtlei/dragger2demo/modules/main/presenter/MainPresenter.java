package com.example.chtlei.dragger2demo.modules.main.presenter;

import com.example.chtlei.dragger2demo.modules.main.bean.MainBean;
import com.example.chtlei.dragger2demo.modules.main.contract.MainContract;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by chtlei on 19-3-29.
 */

public class MainPresenter implements MainContract.Presenter{
    MainBean mainBean;

    @Inject
    public MainPresenter(MainBean mainBean) {
        this.mainBean = mainBean;
    }

    @Override
    public String cooking() {
        //key菜名， value是否烹饪
        Map<String,Boolean> menuList = mainBean.getMenus();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,Boolean> entry : menuList.entrySet()){
            if (entry.getValue()){
                sb.append(entry.getKey()).append(",");
            }
        }

        return sb.toString();
    }
}
