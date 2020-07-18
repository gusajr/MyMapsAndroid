package com.unam.mymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.coyoacan:
                Intent i = new Intent(this, MapsActivity.class);
                i.putExtra("option", "coyo");
                startActivity(i);
                break;
            case R.id.grutas:
                Intent i1 = new Intent(this, MapsActivity.class);
                i1.putExtra("option", "grutas");
                startActivity(i1);
                break;
            case R.id.revo:
                Intent i2 = new Intent(this, MapsActivity.class);
                i2.putExtra("option", "revo");
                startActivity(i2);
                break;
            case R.id.tepoz:
                Intent i3 = new Intent(this, MapsActivity.class);
                i3.putExtra("option", "tepoz");
                startActivity(i3);
                break;
        }
    }
}