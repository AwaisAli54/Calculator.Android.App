package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.number1);
        number2EditText = findViewById(R.id.number2);
        resultTextView = findViewById(R.id.resultTextView);

        Button addButton = findViewById(R.id.buttonAdd);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(number1EditText.getText().toString());
                float number2 = Float.parseFloat(number2EditText.getText().toString());
                float result = number1 + number2;
                resultTextView.setText(Float.toString(result));
            }
        });

        Button subtractButton = findViewById(R.id.buttonSubtract);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(number1EditText.getText().toString());
                float number2 = Float.parseFloat(number2EditText.getText().toString());
                float result = number1 - number2;
                resultTextView.setText(Float.toString(result));
            }
        });

        Button multiplyButton = findViewById(R.id.buttonMultiply);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(number1EditText.getText().toString());
                float number2 = Float.parseFloat(number2EditText.getText().toString());
                float result = number1 * number2;
                resultTextView.setText(Float.toString(result));
            }
        });

        Button divideButton = findViewById(R.id.buttonDivide);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(number1EditText.getText().toString());
                float number2 = Float.parseFloat(number2EditText.getText().toString());
                if (number2 == 0) {
                    resultTextView.setText("Error: Divide by zero");
                } else {
                    float result = number1 / number2;
                    resultTextView.setText(Float.toString(result));
                }
            }
        });

    }
}
