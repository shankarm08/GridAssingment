package com.wedddingapp.shankar.assingmentgr;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};


        GridView gridView = (GridView) findViewById(R.id.grid_view);


       // gridView.setAdapter(new ImageAdapter(this,prgmNameList));

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

    }

}


