package com.devai.rasik.iccbde.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.devai.rasik.iccbde.Controller;
import com.devai.rasik.iccbde.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Section1Fragment extends Fragment {


    Context context;
    private Spinner spinner_hv005;

    EditText hhid,hv001,hv002,hv003Other,hv007,hv008,hv009,hv010,hv011,hv012,hv013,hv014;
    RadioGroup hv003,hv015;

    public Section1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_section1, container, false);

        spinner_hv005 = v.findViewById(R.id.spinner_hv005);
        hhid = v.findViewById(R.id.et_hhid);
        hv001 = v.findViewById(R.id.et_hv001);
        hv002 = v.findViewById(R.id.et_hv002);
        hv003Other = v.findViewById(R.id.et_hv003_others);
        hv007 = v.findViewById(R.id.et_hv007);
        hv008 = v.findViewById(R.id.et_hv008);
        hv009 = v.findViewById(R.id.et_hv009);
        hv010 = v.findViewById(R.id.et_hv010);
        hv011 = v.findViewById(R.id.et_hv011);
        hv012 = v.findViewById(R.id.et_hv012);
        hv013 = v.findViewById(R.id.et_hv013);
        hv014 = v.findViewById(R.id.et_hv014);

        hv003 = v.findViewById(R.id.rg_hv003);
        hv015 = v.findViewById(R.id.rg_hv015);

        final String[] items_hv005 = new String[]{""+getString(R.string.HV005_1), ""+getString(R.string.HV005_2), ""+getString(R.string.HV005_3), ""+getString(R.string.HV005_4), ""+getString(R.string.HV005_5) , ""+getString(R.string.HV005_6)
                , ""+getString(R.string.HV005_7) , ""+getString(R.string.HV005_8) , ""+getString(R.string.HV005_9) , ""+getString(R.string.HV005_10) , ""+getString(R.string.HV005_11) , ""+getString(R.string.HV005_12) , ""+getString(R.string.HV005_13) , ""+getString(R.string.HV005_14) , ""+getString(R.string.HV005_15)
                , ""+getString(R.string.HV005_16) , ""+getString(R.string.HV005_17) , ""+getString(R.string.HV005_18) , ""+getString(R.string.HV005_19) , ""+getString(R.string.HV005_20) , ""+getString(R.string.HV005_21) , ""+getString(R.string.HV005_22) , ""+getString(R.string.HV005_23) , ""+getString(R.string.HV005_24)
                , ""+getString(R.string.HV005_25) , ""+getString(R.string.HV005_26) , ""+getString(R.string.HV005_27) , ""+getString(R.string.HV005_28) , ""+getString(R.string.HV005_29) , ""+getString(R.string.HV005_30)};
        ArrayAdapter<String> adapter_hv005 = new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, items_hv005);
        spinner_hv005.setAdapter(adapter_hv005);

        hv003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Data.hv003=i+"";
            }
        });
        hv015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Data.hv015=i+"";
            }
        });

        spinner_hv005.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Data.hv005=i+"";
                Data.hv006=items_hv005[i];
            }
        });
        hhid.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.HHID=s.toString();
            }
        });

        hv001.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv001=s.toString();
            }
        });

        hv002.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv002=s.toString();
            }
        });

        hv003Other.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv003Other=s.toString();
            }
        });

        hv007.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv007=s.toString();
            }
        });

        hv008.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv008=s.toString();
            }
        });

        hv009.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv009=s.toString();
            }
        });

        hv010.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv010=s.toString();
            }
        });

        hv011.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv011=s.toString();
            }
        });

        hv012.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv011=s.toString();
            }
        });

        hv013.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv013=s.toString();
            }
        });

        hv014.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Data.hv014=s.toString();
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
