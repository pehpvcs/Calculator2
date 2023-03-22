package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.number1_edit_text);
        number2EditText = findViewById(R.id.number2_edit_text);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(number1EditText.getText().toString())
                        + Double.parseDouble(number2EditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(number1EditText.getText().toString())
                        - Double.parseDouble(number2EditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(number1EditText.getText().toString())
                        * Double.parseDouble(number2EditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(number1EditText.getText().toString())
                        / Double.parseDouble(number2EditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}
