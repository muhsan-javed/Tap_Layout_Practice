package com.muhsantech.taplayoutpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpage);

        ViewPageMessengerAdapter adapter = new ViewPageMessengerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter); // Set

        tabLayout.setupWithViewPager(viewPager);


    }
}