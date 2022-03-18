package com.example.coursehomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count =0;
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
showCount = (TextView) findViewById(R.id.count);
if (savedInstanceState!=null)
{
    String i = savedInstanceState.getString("count_value");
    showCount.setText(i);
    count = Integer.parseInt(i);
}
    }

    public void CountUp(View view) {
        count++;
        if (showCount != null)
            showCount.setText(Integer.toString(count));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putString("count_value",showCount.getText().toString());
    }



}