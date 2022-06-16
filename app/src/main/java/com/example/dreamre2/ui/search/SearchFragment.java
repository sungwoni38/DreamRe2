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
import com.example.dreamre2.ui.search.bunsik.SearchBunsikActivity;
import com.example.dreamre2.ui.search.china.SearchChinaActivity;
import com.example.dreamre2.ui.search.japan.SearchJapanActivity;
import com.example.dreamre2.ui.search.korea.SearchKoreaActivity;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private View view;
    private CardView cardView_kor, cardView_italy, cardView_japan, cardView_China, cardView_bunsik;

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


        cardView_China = (CardView) view.findViewById(R.id.cardView_chi);
        cardView_China.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_china = new Intent(getActivity(), SearchChinaActivity.class);
                intent_china.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_china);
            }
        });

        cardView_bunsik = (CardView) view.findViewById(R.id.cardView_bunsik);
        cardView_bunsik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_bunsik = new Intent(getActivity(), SearchBunsikActivity.class);
                intent_bunsik.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent_bunsik);
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
