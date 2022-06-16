package com.example.dreamre2.ui.like;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentLikeBinding;

import java.util.ArrayList;
import java.util.List;

public class LikeFragment extends Fragment {

    private FragmentLikeBinding binding;
    private View view;
    TextView txt_like_1, txt_like_2;
    CardView cardview_like_1, cardview_like_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_like, container, false);

        cardview_like_1 = view.findViewById(R.id.cardview_like_1);
        txt_like_1 = view.findViewById(R.id.txt_like_1);
        txt_like_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardview_like_1.setVisibility(View.VISIBLE);
            }
        });
        cardview_like_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardview_like_1.setVisibility(View.GONE);
            }
        });
        cardview_like_2 = view.findViewById(R.id.cardview_like_2);
        txt_like_2 = view.findViewById(R.id.txt_like_2);
        txt_like_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardview_like_2.setVisibility(View.VISIBLE);
            }
        });
        cardview_like_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardview_like_2.setVisibility(View.GONE);
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
