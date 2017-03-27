package com.example.himmanshoojha.fragmenttwo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentTwo extends Fragment {

TextView textView1,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmenttwo,container,false);

        Bundle bundle = getArguments();

        String fname =bundle.getString("FName");

        String lname =bundle.getString("LName");

        textView1 = (TextView)view.findViewById(R.id.txt1);

        textView1.setText(fname);

        textView2 = (TextView)view.findViewById(R.id.txt2);

        textView2.setText(lname);

        return view;
    }


}
