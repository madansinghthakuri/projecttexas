package com.example.ironman.splash;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.channels.AlreadyBoundException;

/**
 * Created by ironman on 2/18/18.
 */

public class Welcome extends AppCompatActivity {
    Toolbar toolBar;
    DrawerLayout drawerLayout;
   ActionBarDrawerToggle actionBarDrawerToggle;
    Button btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        drawerLayout =(DrawerLayout) findViewById(R.id.drawerlayout);

        actionBarDrawerToggle  = new ActionBarDrawerToggle(this, drawerLayout,toolBar,R.string.drawer_open,
                R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);




        toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        btnabout = (Button) findViewById(R.id.aboutbtn);
       btnabout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(Welcome.this, Aboutus.class));
               Toast.makeText(Welcome.this, "About us", Toast.LENGTH_SHORT).show();


           }
       });
    }
    


    }



