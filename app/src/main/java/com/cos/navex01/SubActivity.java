package com.cos.navex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.cos.navex01.helper.NavigationViewHelper;
import com.google.android.material.navigation.NavigationView;

public class SubActivity extends AppCompatActivity {

    private static final String TAG = "SubActivity2";
    private Context mContext = SubActivity.this;
    private NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        init();
        initLr();
    }

    private void init(){
        nav = findViewById(R.id.nav);
    }

    private void initLr() {
        NavigationViewHelper.enableNavigation(mContext, nav);

    }
}