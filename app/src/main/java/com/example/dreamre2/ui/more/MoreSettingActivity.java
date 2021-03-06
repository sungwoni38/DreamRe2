package com.example.dreamre2.ui.more;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.dreamre2.R;

public class MoreSettingActivity extends AppCompatActivity {

    Switch switch1, switch2, switch3;
    int nChecked =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_setting);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageView img_before = findViewById(R.id.img_before);
        img_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(); //인텐트 객체 생성
                setResult(RESULT_OK, intent01);
                finish();
            }
        });

        switch1 = findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    nChecked = 1;
                } else {
                    nChecked =0;
                }
            }
        });
    }
}