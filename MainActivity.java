package com.example.hayden.calculatorlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView)findViewById(R.id.screen);
        screen.setText(display);
    }

    private void updateScreen() {

        screen.setText(display);
    }

    public void onClickNumber(View v) {

        Button button = (Button) v;
        display += button.getText();
        updateScreen();
    }

    public void onClickOperator(View v) {

        Button button = (Button) v;
        display += button.getText();
        currentOperator = button.getText().toString();
        updateScreen();
    }

    private void clear() {

        display = "";
        currentOperator = "";
        updateScreen();
    }

    public void onClickClear(View v) {

        clear();
        updateScreen();
    }

    public void onClickDelete(View v) {

        if (display != "" && display.length() > 0) {
            display = display.substring(0, display.length() - 1);
        }

        updateScreen();
    }
}
