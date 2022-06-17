package com.example.dreamre2.ui.search.bread;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dreamre2.R;

public class SearchBreadActivity extends AppCompatActivity {
    private CardView cardview_bread_3;
    ImageView img_search_like1_border, img_search_like1;
    int imgIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bread);
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

        img_search_like1 = findViewById(R.id.img_search_like1);
        img_search_like1_border = findViewById(R.id.img_search_like1_border);

        cardview_bread_3 = findViewById(R.id.cardview_bread_3);
        cardview_bread_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(imgIndex == 1) {
                    img_search_like1_border.setVisibility(View.INVISIBLE);
                    img_search_like1.setVisibility(View.VISIBLE);
                    imgIndex = 0;
                    Toast.makeText(SearchBreadActivity.this, "즐겨찾기 목록에 추가했습니다.", Toast.LENGTH_SHORT).show();
                }
                else  {
                    img_search_like1_border.setVisibility(View.VISIBLE);
                    img_search_like1.setVisibility(View.INVISIBLE);
                    imgIndex = 1;
                    Toast.makeText(SearchBreadActivity.this, "즐겨찾기 목록에서 삭제하였습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}