package com.example.a10116046_mariaulpah_uts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class activity_button extends AppCompatActivity{

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private TextView dots;
    private int[] layout;
    private TampilManager prefmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        prefmanager = new TampilManager(this);
        if(!prefmanager.setIsFirstTimeLaunch()); {
            launchHomeScreen();
            finish();
        }

        if(Build.VERSION.SDK_INT >= 21){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        viewPager = (viewPager) findViewById(R.id.imageView);

        layout = new int[]{
                R.layout.slide_screen1;
                R.layout.slide_screen2;
                R.layout.slide_screen3;


        }
    };

    private void launchHomeScreen(){
        prefmanager.setIsFirstTimeLaunch(false);
        startActivity(new Intent());
        finish();
    }

}
