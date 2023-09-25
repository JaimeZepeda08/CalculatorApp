package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(float result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", "" + result);
        startActivity(intent);
    }

    public void add(View view) {
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);

        float num1;
        float num2;
        try {
            num1 = Float.parseFloat(num1Text.getText().toString());
            num2 = Float.parseFloat(num2Text.getText().toString());
        } catch (Exception e) {
            return;
        }

        float result = num1 + num2;
        goToActivity(result);
    }

    public void subtract(View view) {
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);

        float num1;
        float num2;
        try {
            num1 = Float.parseFloat(num1Text.getText().toString());
            num2 = Float.parseFloat(num2Text.getText().toString());
        } catch (Exception e) {
            return;
        }

        float result = num1 - num2;
        goToActivity(result);
    }

    public void multiply(View view) {
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);

        float num1;
        float num2;
        try {
            num1 = Float.parseFloat(num1Text.getText().toString());
            num2 = Float.parseFloat(num2Text.getText().toString());
        } catch (Exception e) {
            return;
        }

        float result = num1 * num2;
        goToActivity(result);
    }

    public void divide(View view) {
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);

        float num1;
        float num2;
        try {
            num1 = Float.parseFloat(num1Text.getText().toString());
            num2 = Float.parseFloat(num2Text.getText().toString());
        } catch (Exception e) {
            return;
        }

        if (num2 == 0) {
            return;
        }

        float result = num1 / num2;
        goToActivity(result);
    }
}