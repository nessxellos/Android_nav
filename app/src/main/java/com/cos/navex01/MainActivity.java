package com.cos.navex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
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

    private void initLr(){
        nav.setNavigationItemSelectedListener((item)->{
            Log.d(TAG, "initLr: "+item.getItemId());

            switch (item.getItemId()){
                case R.id.nav_camera:
                    Log.d(TAG, "initLr: 메뉴1 클릭");
                    Intent intent = new Intent(
                            MainActivity.this,
                            MainActivity.class

                    );
                    // 메뉴 2를 클릭할경우 같은 홈페이지가 계속 쌓일 수 있으므로 ClearTop 속성을 준다.
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    break;
                case R.id.nav_gallery:
                    Log.d(TAG, "initLr: 메뉴2 클릭");
                    Intent intent2 = new Intent(
                            // 람다식을 사용할 경우 this를 하면 메인함수로 감.
                            // 다른곳에서 사용할경우 코드가 꼬일 수 있으므로, 여기서는 정확한 this의 위치를 잡아줌
                            MainActivity.this,
                            SubActivity.class

                    );
                    // 메뉴 2를 클릭할경우 같은 홈페이지가 계속 쌓일 수 있으므로 ClearTop 속성을 준다.
                    intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent2);
                    break;
                case R.id.nav_tools:
                    Log.d(TAG, "initLr: 메뉴3 클릭");
                    break;
                default:
                    break;
            }
            return true;
        });
    }

}