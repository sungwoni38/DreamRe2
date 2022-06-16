package com.example.dreamre2.ui.search.Italy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dreamre2.R;
import com.example.dreamre2.ui.like.LikeFragment;

public class SearchItalyActivity extends AppCompatActivity {
    private CardView cardview_italy_1;
    ImageView img_search_like1_border, img_search_like1;
    int imgIndex = 0;
    TextView txt_name_italy_1, txt_call_italy_1, txt_add_italy_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_italy);
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

        cardview_italy_1 = findViewById(R.id.cardview_italy_1);
        cardview_italy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(imgIndex == 1) {
                    img_search_like1_border.setVisibility(View.INVISIBLE);
                    img_search_like1.setVisibility(View.VISIBLE);
                    imgIndex = 0;

                }
                else  {
                    img_search_like1_border.setVisibility(View.VISIBLE);
                    img_search_like1.setVisibility(View.INVISIBLE);
                    imgIndex = 1;
                }
            }
        });
        cardview_italy_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cardview_italy_1.setVisibility(View.GONE);
                return false;
            }

        });
    }

    private void setArguments(Bundle bundle) {

    }
}