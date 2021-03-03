package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int quantity2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
//buttons
        public void threePoints(View view){
            quantity=quantity+3;
            display(quantity);
        }
    public void twoPoints(View view){
        quantity=quantity+2;
        display(quantity);
    }
    public void onePoints(View view){
        quantity=quantity+1;
        display(quantity);
    }


    //Team B

    public void threePoints2(View view){
        quantity2=quantity2+3;
        display2(quantity2);
    }
    public void twoPoints2(View view){
        quantity2=quantity2+2;
        display2(quantity2);
    }
    public void onePoints2(View view){
        quantity2=quantity2+1;
        display2(quantity2);
    }

    // Clean

    public void clean(View view){
        quantity=0;
        quantity2=0;
        display(quantity);
        display2(quantity2);
    }

    //show
        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.counter);
            quantityTextView.setText("" + number);
        }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.counter2);
        quantityTextView.setText("" + number);
    }
    }

