package com.example.himmanshoojha.fragmenttwo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentOne extends Fragment implements View.OnClickListener {

    EditText editText1,editText2;

    Button btn;

    FragmentManager fm;

    FragmentTransaction ft;

    FragmentOne f1;

    FragmentTwo f2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentone, container, false);

        btn =(Button)view.findViewById(R.id.bttn);

        btn.setOnClickListener(this);

        editText1 = (EditText)view.findViewById(R.id.edt);
        editText2 = (EditText)view.findViewById(R.id.edit);

        return view;

    }

    @Override
    public void onClick(View v) {

        //Toast.makeText(getContext(), "button clicked", Toast.LENGTH_SHORT).show();

        String fname = editText1.getText().toString();

        String lname = editText2.getText().toString();


        Bundle bundle = new Bundle();

        bundle.putString("FName",fname);

        bundle.putString("LName", lname);

        fm = getFragmentManager();

        ft= fm.beginTransaction();

        f2 = new FragmentTwo();

        f2.setArguments(bundle);

        ft.replace(R.id.mycontainer,f2,"F2");

        ft.addToBackStack("F2");


        ft.commit();



    }


}



