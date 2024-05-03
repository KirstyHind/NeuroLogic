package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentTwentyFourthBinding;
import com.example.neurologicnew.databinding.FragmentTwentySeventhBinding;

public class TwentySeventhFragment extends Fragment {

    private FragmentTwentySeventhBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentySeventhBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySeventhFragment.this)
                .navigate(R.id.twentyseventh_to_twentyeighth));
    };
}