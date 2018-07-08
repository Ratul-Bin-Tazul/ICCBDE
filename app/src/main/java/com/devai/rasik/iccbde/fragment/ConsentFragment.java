package com.devai.rasik.iccbde.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.devai.rasik.iccbde.Controller;
import com.devai.rasik.iccbde.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConsentFragment extends Fragment {


    Context context;

    RadioGroup consentMale,consentFemale;

    public ConsentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_consent, container, false);

        consentMale = v.findViewById(R.id.consentMale);
        consentFemale = v.findViewById(R.id.consentFemale);

        consentMale.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.e("res",""+i);

                if(i==2)
                    Controller.firstYes = false;
                else
                    Controller.firstYes = true;
            }
        });

        consentFemale.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==2)
                    Controller.secondYes = false;
                else
                    Controller.secondYes = true;
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
