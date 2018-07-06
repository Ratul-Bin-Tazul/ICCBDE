package com.devai.rasik.iccbde.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devai.rasik.iccbde.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Section1Fragment extends Fragment {


    public Section1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_section1, container, false);

        return v;
    }

}
