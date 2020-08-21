package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.valueReal = findViewById(R.id.edit_valueReal);
        this.mViewHolder.valueDollar = findViewById(R.id.view_valueDollar);
        this.mViewHolder.valueEuro = findViewById(R.id.view_valueEuro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

    }

    private static class ViewHolder {
        EditText valueReal;
        TextView valueDollar;
        TextView valueEuro;
        Button buttonCalculate;
    }
}