package com.idnp.laboratorio09;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    RelativeLayout relativeLayout;

    public SecondFragment() {
        // Required empty public constructor
    }


    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*relativeLayout = getView().findViewById(R.id.rlVar1);

        Bundle bundle = getArguments();
        String color = bundle.getString("color");

        if(color == "blue") {
            relativeLayout.setBackgroundColor(R.color.blue);
        }

        if(color == "black") {
            relativeLayout.setBackgroundColor(R.color.black);
        }

        if(color == "red") {
            relativeLayout.setBackgroundColor(R.color.red);
        }*/

        return inflater.inflate(R.layout.fragment_second, container, false);

    }
}