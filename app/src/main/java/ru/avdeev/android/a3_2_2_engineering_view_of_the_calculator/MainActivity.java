package ru.avdeev.android.a3_2_2_engineering_view_of_the_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.result);
        final View simpleCalc = findViewById(R.id.simple_calculator);
        final View engineeringCalc = findViewById(R.id.engineering_calculator);
        findViewById(R.id.switchBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (simpleCalc.getVisibility()==View.VISIBLE) {
                    engineeringCalc.setVisibility(View.VISIBLE);
                    simpleCalc.setVisibility(View.INVISIBLE);
                } else {
                    engineeringCalc.setVisibility(View.INVISIBLE);
                    simpleCalc.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void anyButtonClicked(View view) {
        if (textViewResult.getText().toString().equals(getText(R.string.button_zero).toString())) {textViewResult.setText("");}
        switch (view.getId()) {
            case R.id.btnZero: {
                printMyText(R.string.button_zero);
                break;
            }
            case R.id.btnOne: {
                printMyText(R.string.button_one);
                break;
            }
            case R.id.btnTwo: {
                printMyText(R.string.button_two);
                break;
            }
            case R.id.btnThree: {
                printMyText(R.string.button_three);
                break;
            }
            case R.id.btnFore: {
                printMyText(R.string.button_for);
                break;
            }
            case R.id.btnFive: {
                printMyText(R.string.button_five);
                break;
            }
            case R.id.btnSix: {
                printMyText(R.string.button_six);
                break;
            }
            case R.id.btnSeven: {
                printMyText(R.string.button_seven);
                break;
            }
            case R.id.btnEight: {
                printMyText(R.string.button_eight);
                break;
            }
            case R.id.btnNine: {
                printMyText(R.string.button_nine);
                break;
            }
            case R.id.btnPoint: {
                printMyText(R.string.button_point);
                break;
            }
            case R.id.btnClear: {
                textViewResult.setText(getString(R.string.button_zero));
                break;
            }
            case R.id.btnPlusMinus: {
                //char c = "-";
                //if (textViewResult.getText().toString().charAt(0) == "-")
                printMyText(R.string.button_plus_minus);
                break;
            }
            case R.id.btnPercent: {
                printMyText(R.string.button_percent);
                break;
            }
            case R.id.btnDivision: {
                printMyText(R.string.button_division);
                break;
            }
            case R.id.btnMultiplication: {
                printMyText(R.string.button_multiplication);
                break;
            }
            case R.id.btnMinus: {
                printMyText(R.string.button_minus);
                break;
            }
            case R.id.btnPlus: {
                printMyText(R.string.button_plus);
                break;
            }
            case R.id.btnSubmit: {
                printMyText(R.string.button_submit);
                break;
            }
        }
    }

    public void printMyText(int id){
        textViewResult.setText(textViewResult.getText().toString() + getString(id));
    }
}