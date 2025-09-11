package com.example.bmi_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private RadioButton male;
    private RadioButton female;
    private TextView age;
    private TextView feet;
    private TextView inches;
    private TextView weight;
    private Button calculate;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setOnClickButtonListener();
    }

    private void findViews() {
        male = findViewById(R.id.radio_btn_male);
        female = findViewById(R.id.radio_btn_female);
        age = findViewById(R.id.text_age);
        feet = findViewById(R.id.txt_feet);
        inches = findViewById(R.id.txt_inches);
        weight = findViewById(R.id.txt_weight);
        calculate = findViewById(R.id.btn_calculate);
        message = findViewById(R.id.txt_show_message);
    }

    private void setOnClickButtonListener() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmi = calculateBMI();
                int ageText = Integer.parseInt(age.getText().toString());
                if (ageText >= 18) {
                    displayResult(bmi);
                }else {
                    displayGuidance(bmi);
                }

            }
        });
    }
    private double calculateBMI() {
        int feetText = Integer.parseInt(feet.getText().toString());
        int inchesText = Integer.parseInt(inches.getText().toString());
        int weightText = Integer.parseInt(weight.getText().toString());

        int totalinches = (feetText*12) + inchesText;
        double meters = totalinches*0.0254;
        return weightText / (meters*meters);
    }

    private void displayResult(double bmi){
        DecimalFormat myWayFormat = new DecimalFormat("0,00");
        String result = myWayFormat.format(bmi);

        String fullMessage;
        if (bmi < 18.5){
            fullMessage = result + " you are underweight";
        }else if (bmi > 25){
            fullMessage = result + " you are overweight";
        }else{
            fullMessage = result + " you are perfect weight";
        }
        message.setText(fullMessage);
    }

    private void displayGuidance(double bmi) {
        DecimalFormat myWayFormat = new DecimalFormat("0,00");
        String result = myWayFormat.format(bmi);

        String fullMessage;
        if (male.isChecked()){
            fullMessage = "Check with your doctor for optimal boy BMI";
        }else if(female.isChecked()){
            fullMessage = "Check with your doctor for optimal girl BMI";
        }else {
            fullMessage = "Check with your doctor for optimal BMI";
        }
        message.setText(fullMessage);
    }
}