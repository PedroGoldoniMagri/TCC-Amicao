package com.example.amicacina;

//Realiza as importações de bibliotecas necessárias para a execução de métodos da classe.
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_aboutus extends Fragment {

    public fragment_aboutus() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aboutus, container, false);

        return view;
    }
}