package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView fstTV = (TextView) findViewById(R.id.menu_item_1);
        String mi1 =fstTV.getText().toString();
        Log.v("MainActiviity",mi1);
        // Find second menu item TextView and print the text to the logs

        TextView secTV =(TextView) findViewById(R.id.menu_item_2);
        String mi2 = secTV.getText().toString();
        Log.v("MainActivity",mi2);


















        // Find third menu item TextView and print the text to the logs

        TextView mi3 = (TextView) findViewById(R.id.menu_item_3);
        String tm2 =mi3.getText().toString();
        Log.v("MainActivity",tm2);








    }
}