package com.example.dreamre2.ui.more;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dreamre2.NotiActivity;
import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {

    private FragmentMoreBinding binding;
    private View view;
    Button btn_noti,btn_qna, btn_call,btn_setting;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_more, container, false);

        btn_noti = view.findViewById(R.id.btn_noti);
        btn_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(getActivity(), NotiActivity.class);
                intent01.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent01);
            }
        });

        btn_qna = view.findViewById(R.id.btn_qna);
        btn_qna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent02 = new Intent(getActivity(), MoreQnaActivity.class);
                intent02.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent02);
            }
        });

        btn_call = view.findViewById(R.id.btn_call);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent03 = new Intent(getActivity(), MoreCallActivity.class);
                intent03.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent03);
            }
        });
        btn_setting = view.findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent04 = new Intent(getActivity(), MoreSettingActivity.class);
                intent04.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent04);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
