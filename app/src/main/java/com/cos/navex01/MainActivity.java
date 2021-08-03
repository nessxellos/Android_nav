package com.cos.navex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.cos.navex01.helper.NavigationViewHelper;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private Context mContext = MainActivity.this;
    private NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initLr();
    }

    private void init(){
        nav = findViewById(R.id.nav);
    }

    // 코드를 dry하게 작성
    private void initLr(){
        NavigationViewHelper.enableNavigation(mContext, nav);
    }

}