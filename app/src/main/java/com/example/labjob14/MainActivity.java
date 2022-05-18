package com.example.labjob14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button resultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultBtn = findViewById(R.id.resultBtn);
        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewBtn = (TextView) findViewById(R.id.textViewBtn);
                Button resultBtn = (Button)v;
                String buttonText = resultBtn.getText().toString();
                textViewBtn.setText(buttonText);
                Toast.makeText(MainActivity.this, "Вот и результат", Toast.LENGTH_SHORT).show();
                resultBtn.setEnabled(false);
            }
        });
    }
}