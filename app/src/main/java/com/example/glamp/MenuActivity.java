package com.example.glamp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class MenuActivity extends AppCompatActivity {

    private LinearLayout home, perfil;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    home.setVisibility(View.VISIBLE);
                    perfil.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_dashboard:
                    perfil.setVisibility(View.VISIBLE);
                    home.setVisibility(View.GONE);
                    return true;

                    default:
                        home.setVisibility(View.VISIBLE);
                        perfil.setVisibility(View.GONE);

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        home = (LinearLayout)findViewById(R.id.home);
        perfil = (LinearLayout)findViewById(R.id.perfil);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
