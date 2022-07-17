package com.univali.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    public MainFragment() {
    }

    double num1, num2, res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        TextView txt_resultado = (TextView) v.findViewById(R.id.txt_resultado);
        EditText et_valor1 = (EditText)v.findViewById(R.id.et_valor1);
        EditText et_valor2 = (EditText)v.findViewById(R.id.et_valor2);
        Button button_dividir = (Button)v.findViewById(R.id.button_dividir);
        Button button_multiplicar = (Button)v.findViewById(R.id.button_multiplicar);
        Button button_diminuir = (Button)v.findViewById(R.id.button_diminuir);
        Button button_somar = (Button)v.findViewById(R.id.button_somar);

        button_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 / num2;
                txt_resultado.setText(String.valueOf(res));
            }
        });

        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 * num2;
                txt_resultado.setText(String.valueOf(res));
            }
        });

        button_diminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 - num2;
                txt_resultado.setText(String.valueOf(res));
            }
        });

        button_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 + num2;
                txt_resultado.setText(String.valueOf(res));
            }
        });
        return v;
    }
}