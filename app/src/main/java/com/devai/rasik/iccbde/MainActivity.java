package com.devai.rasik.iccbde;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;

import com.devai.rasik.iccbde.fragment.ConsentFragment;
import com.devai.rasik.iccbde.fragment.InterviewEndSection;
import com.devai.rasik.iccbde.fragment.Section10Fragment;
import com.devai.rasik.iccbde.fragment.Section11Fragment;
import com.devai.rasik.iccbde.fragment.Section12_13Fragment;
import com.devai.rasik.iccbde.fragment.Section14Fragment;
import com.devai.rasik.iccbde.fragment.Section15_16Fragment;
import com.devai.rasik.iccbde.fragment.Section17Fragment;
import com.devai.rasik.iccbde.fragment.Section18Fragment;
import com.devai.rasik.iccbde.fragment.Section19Fragment;
import com.devai.rasik.iccbde.fragment.Section1Fragment;
import com.devai.rasik.iccbde.fragment.Section20Fragment;
import com.devai.rasik.iccbde.fragment.Section22;
import com.devai.rasik.iccbde.fragment.Section23;
import com.devai.rasik.iccbde.fragment.Section24;
import com.devai.rasik.iccbde.fragment.Section2Fragment;
import com.devai.rasik.iccbde.fragment.Section3_4Fragment;
import com.devai.rasik.iccbde.fragment.Section5Fragment;
import com.devai.rasik.iccbde.fragment.Section6Fragment;
import com.devai.rasik.iccbde.fragment.Section7Fragment;
import com.devai.rasik.iccbde.fragment.Section8Fragment;
import com.devai.rasik.iccbde.fragment.Section9Fragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout mainFrame;

    public int currentFragment=0;

    Spinner spinner_hv003, spinner_hv005, spinner_hv103_mid1, spinner_hv110_mid1, spinner_hv111_mid1, spinner_hv114_mid1, spinner_hv115_mid1, spinner_hv117_mid1,
            spinner_hv118_mid1;

    Fragment[] fragments = {new ConsentFragment(),new Section1Fragment(),new Section2Fragment(),new Section3_4Fragment(),new Section5Fragment(),new Section6Fragment(),
            new Section7Fragment(),new Section8Fragment(), new Section9Fragment(),new Section10Fragment(),new Section11Fragment(),new Section12_13Fragment(),new Section14Fragment(),
            new Section15_16Fragment(),new Section17Fragment(),new Section18Fragment(),new Section19Fragment(),new Section20Fragment(),new Section22(),new Section23(),new Section24(),new InterviewEndSection()};

    Button prev,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*spinnerCode1 = findViewById(R.id.spinnerCode1);
        String[] items = new String[]{""+getString(R.string.head), ""+getString(R.string.husband), ""+getString(R.string.sOrD)};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinnerCode1.setAdapter(adapter); */

        mainFrame = findViewById(R.id.mainFrame);

        prev = findViewById(R.id.prevBtn);
        next = findViewById(R.id.nextBtn);


        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainFrame, fragments[0]).commit();


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentFragment!=0){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.mainFrame, fragments[currentFragment-1]).commit();
                    currentFragment--;
                }

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentFragment!=24){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.mainFrame, fragments[currentFragment+1]).commit();
                    currentFragment++;

                    if (!Controller.secondYes || !Controller.firstYes) {
                        startActivity(new Intent(MainActivity.this,InterviewEndActivity.class));
                        finish();
                    }
                }

            }
        });


//
//        spinner_hv103_mid1 = findViewById(R.id.spinner_hv103_mid1);
//        String[] items_spinner_hv103_mid1 = new String[]{""+getString(R.string.HV103_code1_1), ""+getString(R.string.HV103_code1_2), ""+getString(R.string.HV103_code1_3) , ""+getString(R.string.HV103_code1_4)
//                , ""+getString(R.string.HV103_code1_4) , ""+getString(R.string.HV103_code1_5) , ""+getString(R.string.HV103_code1_6) , ""+getString(R.string.HV103_code1_7)
//                , ""+getString(R.string.HV103_code1_8)  , ""+getString(R.string.HV103_code1_9) , ""+getString(R.string.HV103_code1_10) , ""+getString(R.string.HV103_code1_11)
//                , ""+getString(R.string.HV103_code1_12) , ""+getString(R.string.HV103_code1_13) , ""+getString(R.string.HV103_code1_14) , ""+getString(R.string.HV103_code1_15)};
//        ArrayAdapter<String> adapter_spinner_hv103_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv103_mid1);
//        spinner_hv103_mid1.setAdapter(adapter_spinner_hv103_mid1);
//
//
//
//        spinner_hv111_mid1 = findViewById(R.id.spinner_hv111_mid1);
//        String[] items_spinner_hv111_mid1 = new String[]{""+getString(R.string.HV111_code3_1), ""+getString(R.string.HV111_code3_2), ""+getString(R.string.HV111_code3_3) , ""+getString(R.string.HV111_code3_4) , ""+getString(R.string.HV111_code3_5)};
//        ArrayAdapter<String> adapter_spinner_hv111_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv111_mid1);
//        spinner_hv111_mid1.setAdapter(adapter_spinner_hv111_mid1);
//
//        spinner_hv114_mid1 = findViewById(R.id.spinner_hv114_mid1);
//        String[] items_spinner_hv114_mid1 = new String[]{""+getString(R.string.HV114_code4_1), ""+getString(R.string.HV114_code4_2), ""+getString(R.string.HV114_code4_3) , ""+getString(R.string.HV114_code4_4) };
//        ArrayAdapter<String> adapter_spinner_hv114_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv114_mid1);
//        spinner_hv114_mid1.setAdapter(adapter_spinner_hv114_mid1);
//
//
//
//        spinner_hv118_mid1 = findViewById(R.id.spinner_hv118_mid1);
//        String[] items_spinner_hv118_mid1 = new String[]{""+getString(R.string.HV118_code6_1), ""+getString(R.string.HV118_code6_2), ""+getString(R.string.HV118_code6_3) , ""+getString(R.string.HV118_code6_4)
//                , ""+getString(R.string.HV118_code6_5) , ""+getString(R.string.HV118_code6_6) , ""+getString(R.string.HV118_code6_7) , ""+getString(R.string.HV118_code6_8)
//                , ""+getString(R.string.HV118_code6_9) };
//        ArrayAdapter<String> adapter_spinner_hv118_mid1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_spinner_hv118_mid1);
//        spinner_hv118_mid1.setAdapter(adapter_spinner_hv118_mid1);

    }
}
