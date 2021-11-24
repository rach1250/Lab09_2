package com.idnp.laboratorio09;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    TextView texto;
    Button blue, black, red;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View main = inflater.inflate(R.layout.fragment_first, container, false);

        blue = main.findViewById(R.id.azul);
        red = main.findViewById(R.id.rojo);
        black = main.findViewById(R.id.negro);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSecondActivity("blue");
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSecondActivity("red");
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSecondActivity("black");
            }
        });

        return main;
    }

    @SuppressLint("ResourceAsColor")
    public void changeSecondActivity(String color){
        texto = (TextView) getActivity().findViewById(R.id.textView);

        texto.setText(color);

        if(color == "blue") texto.setBackgroundColor(R.color.blue);

        if(color == "black") texto.setBackgroundColor(R.color.black);

        if(color == "red") texto.setBackgroundColor(R.color.red);
    }
}