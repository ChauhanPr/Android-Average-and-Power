package com.example.power;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);
        //EditText t3 = (EditText) findViewById(R.id.num3);
        TextView tv = (TextView) findViewById(R.id.textView1);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.btn);
        Button B2 = (Button) findViewById(R.id.btn1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(t1.getText().toString().trim());
                int n2 = Integer.parseInt(t2.getText().toString().trim());
                //int n3 = Integer.parseInt(t3.getText().toString().trim());
                double res=Math.pow(n1,n2);
                Result.setText("Power of "+n1+" to "+n2+ " :: " + res);
                //  Toast.makeText(MainActivity.this, "Square is " + res, Toast.LENGTH_SHORT).show();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(t1.getText().toString().trim());
                int n2 = Integer.parseInt(t2.getText().toString().trim());
                //int n3 = Integer.parseInt(t3.getText().toString().trim());
                double res=(n1+n2)/2;
                Result.setText("Average of "+n1+" and "+n2+ " :: " + res);
                //  Toast.makeText(MainActivity.this, "Square is " + res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}