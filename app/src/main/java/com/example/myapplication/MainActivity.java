package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView res;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = (TextView) findViewById(R.id.textView);
        input = (EditText) findViewById(R.id.editText);
    }

    int min=1;
    int max=500;
    int mid;
    int num=0;

    public void search(View v) {
        mid = (min+max)/2;
        res.setText("Your number is " + mid);
        num++;
    }
    public void bingo(View v)
    {
        res.setText("Bingo! Your munber is " + mid + "\nWe find "+num+"times!");
    }
    public void smaller(View v)
    {
        max = mid-1;
        mid = (min+max)/2;
        res.setText("Your number is " + mid);
        num++;
    }
    public void bigger(View v)
    {
        min = mid+1;
        mid = (min+max)/2;
        res.setText("Your number is " + mid);
        num++;
    }
}