package com.devai.rasik.iccbde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_hv003, spinner_hv005, spinner_hv103_mid1, spinner_hv110_mid1, spinner_hv111_mid1, spinner_hv114_mid1, spinner_hv115_mid1, spinner_hv117_mid1,
            spinner_hv118_mid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*spinnerCode1 = findViewById(R.id.spinnerCode1);
        String[] items = new String[]{""+getString(R.string.head), ""+getString(R.string.husband), ""+getString(R.string.sOrD)};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinnerCode1.setAdapter(adapter); */


        spinner_hv005 = findViewById(R.id.spinner_hv005);
        String[] items_hv005 = new String[]{""+getString(R.string.HV005_1), ""+getString(R.string.HV005_2), ""+getString(R.string.HV005_3), ""+getString(R.string.HV005_4), ""+getString(R.string.HV005_5) , ""+getString(R.string.HV005_6)
                , ""+getString(R.string.HV005_7) , ""+getString(R.string.HV005_8) , ""+getString(R.string.HV005_9) , ""+getString(R.string.HV005_10) , ""+getString(R.string.HV005_11) , ""+getString(R.string.HV005_12) , ""+getString(R.string.HV005_13) , ""+getString(R.string.HV005_14) , ""+getString(R.string.HV005_15)
                , ""+getString(R.string.HV005_16) , ""+getString(R.string.HV005_17) , ""+getString(R.string.HV005_18) , ""+getString(R.string.HV005_19) , ""+getString(R.string.HV005_20) , ""+getString(R.string.HV005_21) , ""+getString(R.string.HV005_22) , ""+getString(R.string.HV005_23) , ""+getString(R.string.HV005_24)
                , ""+getString(R.string.HV005_25) , ""+getString(R.string.HV005_26) , ""+getString(R.string.HV005_27) , ""+getString(R.string.HV005_28) , ""+getString(R.string.HV005_29) , ""+getString(R.string.HV005_30)};
        ArrayAdapter<String> adapter_hv005 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_hv005);
        spinner_hv005.setAdapter(adapter_hv005);

        spinner_hv103_mid1 = findViewById(R.id.spinner_hv103_mid1);
        String[] items_spinner_hv103_mid1 = new String[]{""+getString(R.string.HV103_code1_1), ""+getString(R.string.HV103_code1_2), ""+getString(R.string.HV103_code1_3) , ""+getString(R.string.HV103_code1_4)
                , ""+getString(R.string.HV103_code1_4) , ""+getString(R.string.HV103_code1_5) , ""+getString(R.string.HV103_code1_6) , ""+getString(R.string.HV103_code1_7)
                , ""+getString(R.string.HV103_code1_8)  , ""+getString(R.string.HV103_code1_9) , ""+getString(R.string.HV103_code1_10) , ""+getString(R.string.HV103_code1_11)
                , ""+getString(R.string.HV103_code1_12) , ""+getString(R.string.HV103_code1_13) , ""+getString(R.string.HV103_code1_14) , ""+getString(R.string.HV103_code1_15)};
        ArrayAdapter<String> adapter_spinner_hv103_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv103_mid1);
        spinner_hv103_mid1.setAdapter(adapter_spinner_hv103_mid1);



        spinner_hv111_mid1 = findViewById(R.id.spinner_hv111_mid1);
        String[] items_spinner_hv111_mid1 = new String[]{""+getString(R.string.HV111_code3_1), ""+getString(R.string.HV111_code3_2), ""+getString(R.string.HV111_code3_3) , ""+getString(R.string.HV111_code3_4) , ""+getString(R.string.HV111_code3_5)};
        ArrayAdapter<String> adapter_spinner_hv111_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv111_mid1);
        spinner_hv111_mid1.setAdapter(adapter_spinner_hv111_mid1);

        spinner_hv114_mid1 = findViewById(R.id.spinner_hv114_mid1);
        String[] items_spinner_hv114_mid1 = new String[]{""+getString(R.string.HV114_code4_1), ""+getString(R.string.HV114_code4_2), ""+getString(R.string.HV114_code4_3) , ""+getString(R.string.HV114_code4_4) };
        ArrayAdapter<String> adapter_spinner_hv114_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv114_mid1);
        spinner_hv114_mid1.setAdapter(adapter_spinner_hv114_mid1);



        spinner_hv118_mid1 = findViewById(R.id.spinner_hv118_mid1);
        String[] items_spinner_hv118_mid1 = new String[]{""+getString(R.string.HV118_code6_1), ""+getString(R.string.HV118_code6_2), ""+getString(R.string.HV118_code6_3) , ""+getString(R.string.HV118_code6_4)
                , ""+getString(R.string.HV118_code6_5) , ""+getString(R.string.HV118_code6_6) , ""+getString(R.string.HV118_code6_7) , ""+getString(R.string.HV118_code6_8)
                , ""+getString(R.string.HV118_code6_9) };
        ArrayAdapter<String> adapter_spinner_hv118_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv118_mid1);
        spinner_hv118_mid1.setAdapter(adapter_spinner_hv118_mid1);

    }
}
