package com.example.sumtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText v1, v2;
    private TextView txt;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        txt = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        int n1 = Integer.parseInt(v1.getText().toString());
                      int n2 = Integer.parseInt(v2.getText().toString());
                int sum = n1 + n2;
                 txt.setText("Sum is : " + sum);
            }
        });
    }

//    public void Sum(View view) {
//        int n1 = Integer.parseInt(v1.getText().toString());
//        int n2 = Integer.parseInt(v2.getText().toString());
//        int sum = n1 + n2;
//        txt.setText("Sum is : " + sum);
//    }
}