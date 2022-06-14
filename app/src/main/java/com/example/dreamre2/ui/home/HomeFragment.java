package com.example.dreamre2.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dreamre2.NotiActivity;
import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private View view;
    private FragmentHomeBinding binding;
    private ImageView img_noti;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        img_noti = view.findViewById(R.id.img_noti);
        img_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(getActivity(), NotiActivity.class);
                intent01.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent01);
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