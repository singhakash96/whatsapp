package com.example.whatsapp;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;
    ViewPageAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        Toolbar toolbar=findViewById(R.id.toolbar);
        viewPager=findViewById(R.id.viewpager);

        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("WhatsApp");
        viewPagerAdapter=new ViewPageAdapter(getSupportFragmentManager());

        tablayout.setupWithViewPager(viewPager);
        tablayout.setTabIndicatorFullWidth(false);
        viewPager.setAdapter(viewPagerAdapter);

    }
    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater menuinflater=getMenuInflater();
        menuinflater.inflate(R.menu.menu,menu);
        return true;
    }

}