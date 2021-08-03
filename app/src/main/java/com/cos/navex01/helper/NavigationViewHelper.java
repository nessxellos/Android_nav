package com.cos.navex01.helper;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.cos.navex01.MainActivity;
import com.cos.navex01.R;
import com.cos.navex01.SubActivity;
import com.google.android.material.navigation.NavigationView;

public class NavigationViewHelper {
    // Activity의 형태가 다양하므로 부모타입인 Context를 받음
    public static void enableNavigation(Context context, NavigationView nav){
        nav.setNavigationItemSelectedListener((item)->{

            if(item.getItemId() == R.id.nav_camera){
                Intent intent = new Intent(
                        context,
                        MainActivity.class
                );
                // 메뉴 2를 클릭할경우 같은 홈페이지가 계속 쌓일 수 있으므로 ClearTop 속성을 준다.
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            } else if (item.getItemId() == R.id.nav_gallery){
                Intent intent = new Intent(
                        // 람다식을 사용할 경우 this를 하면 메인함수로 감.
                        // 다른곳에서 사용할경우 코드가 꼬일 수 있으므로, 여기서는 정확한 this의 위치를 잡아줌
                        context,
                        SubActivity.class

                );
                // 메뉴 2를 클릭할경우 같은 홈페이지가 계속 쌓일 수 있으므로 ClearTop 속성을 준다.
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            } else if (item.getItemId() == R.id.nav_tools){

            }

            return true; // return ture 를 하지 않으면 네이게이션 이벤트가 작동하지 않는다.
        });
    }
    // 반복작업을 위한 함수 작성 class.forName()활용
//    private routeSettings(context, ){
//
//    }
}
