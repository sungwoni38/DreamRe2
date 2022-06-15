package com.example.dreamre2.ui.more;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dreamre2.R;

import java.util.ArrayList;

public class MoreCallActivity extends AppCompatActivity {
    private ListView list_more_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_call);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        list_more_all = findViewById(R.id.list_more_call);
        list_more_all.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        ArrayList<MoreCall> data = new ArrayList<>();
        data.add(new MoreCall("서울특별시","02-2620-3390"));
        data.add(new MoreCall("경기도", "031-8082-4192"));
        data.add(new MoreCall("인천광역시", "032-440-2857"));
        data.add(new MoreCall("강원도", "033-249-2267"));
        data.add(new MoreCall("대전광역시", "042-251-4526"));
        data.add(new MoreCall("세종특별자치시", "044-300-4916"));
        data.add(new MoreCall("충청남도", "041-635-4547"));
        data.add(new MoreCall("충청북도", "043-220-2555"));
        data.add(new MoreCall("부산광역시", "051-888-1641"));
        data.add(new MoreCall("울산광역시", "052-241-7676"));
        data.add(new MoreCall("경상남도", "055-580-2384"));
        data.add(new MoreCall("경상북도", "054-270-3047"));
        data.add(new MoreCall("대구광역시", "053-803-5896"));
        data.add(new MoreCall("광주광역시", "062-607-3543"));
        data.add(new MoreCall("전라남도", "061-286-5943"));
        data.add(new MoreCall("전라북도", "063-280-4769"));
        data.add(new MoreCall("제주특별자치도", "064-710-2374"));


        MoreCallAdapter adapter = new MoreCallAdapter(data);

        ListView listView = findViewById(R.id.list_more_call);
        listView.setAdapter(adapter);
    }
}