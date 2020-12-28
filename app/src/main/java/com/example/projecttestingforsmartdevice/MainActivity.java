package com.example.projecttestingforsmartdevice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projecttestingforsmartdevice.basilActivityBusinessLogic.BasilActivity1;
import com.example.projecttestingforsmartdevice.hamzaActivityBusinessLogic.HamzaActivity1;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.HarounActivity1;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.MahmoudActivity1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonToActivityHaroun;
    Button buttonToActivityHamza;
    Button buttonToActivityBasil;
    Button buttonToActivityMahmoud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonToActivityHaroun =findViewById(R.id.buttonToActivityHaroun);
        buttonToActivityHamza =findViewById(R.id.buttonToActivityHamza);
        buttonToActivityBasil =findViewById(R.id.buttonToActivityBasil);
        buttonToActivityMahmoud =findViewById(R.id.buttonToActivityMahmoud);


//        ****************************************************************
        buttonToActivityHaroun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        HarounActivity1.class));
            }
        });
        //        ****************************************************************
        buttonToActivityHamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        HamzaActivity1.class));
            }
        });
        //        ****************************************************************
        buttonToActivityBasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        BasilActivity1.class));

                class AuthenticationPagerAdapter extends FragmentPagerAdapter {
                    private ArrayList<Fragment> fragmentList = new ArrayList<>();

                    public AuthenticationPagerAdapter(FragmentManager fm) {
                        super(fm);
                    }

                    @Override
                    public Fragment getItem(int i) {
                        return fragmentList.get(i);
                    }

                    @Override
                    public int getCount() {
                        return fragmentList.size();
                    }

                    void addFragmet(Fragment fragment) {
                        fragmentList.add(fragment);
                    }
                }
            }
        });
        //        ****************************************************************
        buttonToActivityMahmoud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MahmoudActivity1.class));
            }
        });

    }
}
