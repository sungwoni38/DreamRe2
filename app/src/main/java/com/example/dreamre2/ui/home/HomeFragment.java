package com.example.dreamre2.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private View view;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}