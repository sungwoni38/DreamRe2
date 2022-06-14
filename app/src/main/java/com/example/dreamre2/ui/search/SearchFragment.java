package com.example.dreamre2.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentSearchBinding;
import com.example.dreamre2.ui.search.Italy.SearchItalyActivity;
import com.example.dreamre2.ui.search.japan.SearchJapanActivity;
import com.example.dreamre2.ui.search.korea.SearchKoreaActivity;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private View view;
    private CardView cardView_kor, cardView_italy, cardView_japan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);

        cardView_kor = (CardView) view.findViewById(R.id.cardView_kor);
        cardView_kor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_korea = new Intent(getActivity(), SearchKoreaActivity.class);
                intent_korea.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_korea);
            }
        });

        cardView_italy = (CardView) view.findViewById(R.id.cardView_italy);
        cardView_italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_italy = new Intent(getActivity(), SearchItalyActivity.class);
                intent_italy.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_italy);
            }
        });

        cardView_japan = (CardView) view.findViewById(R.id.cardView_jap);
        cardView_japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_japan = new Intent(getActivity(), SearchJapanActivity.class);
                intent_japan.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_japan);
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
