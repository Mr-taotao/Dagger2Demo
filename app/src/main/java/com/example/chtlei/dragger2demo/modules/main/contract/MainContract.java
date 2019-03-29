package com.example.chtlei.dragger2demo.modules.main.contract;

/**
 * Created by chtlei on 19-3-29.
 */

public interface MainContract {
    //对UI的操作接口
    interface View {
        void showMenu();
    }

    //对数据逻辑处理接口
    interface Presenter {
        String cooking();
    }
}
