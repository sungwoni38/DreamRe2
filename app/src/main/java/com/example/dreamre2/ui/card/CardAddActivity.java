package com.example.dreamre2.ui.card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dreamre2.R;

public class CardAddActivity extends AppCompatActivity {
    EditText editMessage,edit_name, edit_birth, edit_birth2;
    EditText edit_cardNum,edit_Tel,edit_check;
    TextView text_ok;
    Button btn_check,btn_go,btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_add);

        btn_check = findViewById(R.id.btn_check);
        editMessage = findViewById(R.id.edit_cardNum);
        editMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()==16){
                    btn_check.setClickable(true);
                    btn_check.setBackgroundColor(Color.parseColor("#0E2F56"));
                } else {
                    btn_check.setClickable(false);
                    btn_check.setBackgroundColor(Color.parseColor("#C4C4C4"));
                    Toast.makeText(CardAddActivity.this, "카드번호 16자리를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        edit_name = findViewById(R.id.edit_name);
        edit_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()>0){
                    btn_check.setClickable(true);
                    btn_check.setBackgroundColor(Color.parseColor("#0E2F56"));
                } else {
                    btn_check.setClickable(false);
                    btn_check.setBackgroundColor(Color.parseColor("#C4C4C4"));
                    Toast.makeText(CardAddActivity.this, "이름을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_ok = findViewById(R.id.btn_ok);
        text_ok = findViewById(R.id.text_ok);
        edit_check = findViewById(R.id.edit_check);
        edit_check.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()==6){
                    btn_check.setClickable(true);
                    btn_check.setBackgroundColor(Color.parseColor("#0E2F56"));
                    btn_ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            text_ok.setVisibility(View.VISIBLE);
                        }
                    });

                } else {
                    btn_check.setClickable(false);
                    btn_check.setBackgroundColor(Color.parseColor("#C4C4C4"));
                    Toast.makeText(CardAddActivity.this, "인증번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent();

                setResult(RESULT_OK, intent01);
                finish();
            }
        });
    }
}