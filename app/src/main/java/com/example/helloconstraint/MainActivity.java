package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;
    private Button countButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
        countButton = (Button) findViewById(R.id.button_count);
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();

    }
    public void setZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        zeroButton.setBackgroundColor(Color.GRAY);
        countButton.setBackgroundColor(Color.BLUE);
    }
    public void countUp(View view) {
        mCount++;
        if(mCount>0){
            zeroButton.setBackgroundColor(Color.RED);
            countButton.setBackgroundColor(Color.GREEN);
        }
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}