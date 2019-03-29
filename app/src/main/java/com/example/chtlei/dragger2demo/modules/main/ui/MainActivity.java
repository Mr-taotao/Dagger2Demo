package com.example.chtlei.dragger2demo.modules.main.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chtlei.dragger2demo.R;
import com.example.chtlei.dragger2demo.modules.main.contract.MainContract;
import com.example.chtlei.dragger2demo.modules.main.presenter.MainPresenter;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends DaggerActivity implements MainContract.View{
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMenu();
    }

    @Override
    public void showMenu() {
        Toast.makeText(this,mainPresenter.cooking(),Toast.LENGTH_SHORT).show();
    }
}
