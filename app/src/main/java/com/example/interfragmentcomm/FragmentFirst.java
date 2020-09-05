package com.example.interfragmentcomm;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentFirst extends Fragment implements View.OnClickListener{

    Button button;
    int counter=0;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();        //to get reference of main activity
        button = (Button) getActivity().findViewById(R.id.send);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        counter++;
        comm.respond("The button was clicked "+counter+" times");   //to change the data on second fragment
    }
}