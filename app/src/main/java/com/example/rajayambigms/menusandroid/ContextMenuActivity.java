package com.example.rajayambigms.menusandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        registerForContextMenu(findViewById(R.id.button));
    }

    /*
        CONTEXT MENU CREATION AND IMPLEMENTATION OF CONTEXT MENU ITEMS.
     */
   /* @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context Menu");


        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),0,"Download");
        menu.add(0,v.getId(),0,"Save");
        menu.add(0,v.getId(),0,"Update");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_LONG).show();
                return super.onContextItemSelected(item);

    }*/

/*
    POP UP MENU CREATION AND IMPLEMENTATION OF MENU ITEM CLICK
 */
    public void pop(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.context_menu);
        popup.show();


    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.android_cmenu_item:
                Toast.makeText(this, "You are selected ANDROID OS", Toast.LENGTH_LONG).show();
                return true;
            case R.id.ios_cmenu_item:
                Toast.makeText(this, "You are selected IOS OS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.berry_cmenu_item:
                Toast.makeText(this, "You are selected BLACKBERRY OS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.windows_cmenu_item:
                Toast.makeText(this, "You are selected Window OS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.symbian_context_menu:
                Toast.makeText(this, "You are selected Symbian OS", Toast.LENGTH_SHORT).show();
                return true;
        }
            return false;
    }
}
