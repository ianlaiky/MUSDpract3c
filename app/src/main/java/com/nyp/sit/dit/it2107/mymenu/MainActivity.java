package com.nyp.sit.dit.it2107.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Menu myMenu = null;
    int subMenuBsse = 100;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) findViewById(R.id.tvItemSelected);
        registerForContextMenu(tv);
    }

    private void appendText(String text){
    tv.setText(tv.getText()+text);


    }

    public void  onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){

    //set context menu title

        menu.setHeaderTitle("Sample Context Menu");

        //add menu item to the menu being created. which is the meni being passed
        // to the method as a parameter

        menu.add(200,200,200,"Item 1");




    }
}
