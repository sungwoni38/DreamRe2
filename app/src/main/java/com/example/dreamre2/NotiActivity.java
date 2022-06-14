package com.example.dreamre2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class NotiActivity extends AppCompatActivity {
    private ListView list_noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);
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

        ArrayList<Notification> data = new ArrayList<>();
        data.add(new Notification("동의서 개정","개인정보처리 방침 개정으로 인해 내용이 수정되었음을 알립니다.", "2022-06-02"));
        data.add(new Notification("인천 지원금 인상","00월 00일로부터 인천 하루 6천원이었던 지원금이 7천원으로 이상됩니다. 맛있는 식사하시길 바랍니다. 감사합니다.", "2022-06-02"));
        data.add(new Notification("인천 지원금 인상","00월 00일로부터 인천 하루 6천원이었던 지원금이 7천원으로 이상됩니다. 맛있는 식사하시길 바랍니다. 감사합니다.", "2022-06-02"));
        data.add(new Notification("인천 지원금 인상","00월 00일로부터 인천 하루 6천원이었던 지원금이 7천원으로 이상됩니다. 맛있는 식사하시길 바랍니다. 감사합니다.", "2022-06-02"));

        NotiAdapter adapter = new NotiAdapter(data);

        ListView listView = findViewById(R.id.list_noti);
        listView.setAdapter(adapter);
    }
}