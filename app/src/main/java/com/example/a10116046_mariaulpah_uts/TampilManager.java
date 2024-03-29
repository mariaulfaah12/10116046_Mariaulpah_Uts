package com.example.a10116046_mariaulpah_uts;

import android.content.Context;
import android.content.SharedPreferences;

public class TampilManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;
        int PRIVATE_MODE = 0;

        private static final String PREF_NAME = "intro_slider_welcome";
        private static final String IS_FIRST_TIME_LAUNCH="IsFirstTimeLaunch";
        public TampilManager(Context context){
            this.context= context;
            pref= context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = pref.edit();
        }

        public void setIsFirstTimeLaunch(boolean isFirstTime){
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
            editor.commit();
        }

        public boolean isFirstTimeLaunch(){

            return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }
}
