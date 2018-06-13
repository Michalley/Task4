package com.example.tesk4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void click(View view) {
        clickCount = clickCount + 1;
        if (((clickCount % 7 == 0) || (clickCount % 10 == 7) || (clickCount / 10 == 7))) {
            btn.setText("BOOM!");
        } else {
            btn.setText("This is a click number: " + clickCount);
        }
    }
}














//This is a click number:
//BOOM!