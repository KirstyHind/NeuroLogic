package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentNinthBinding;

public class NinthFragment extends Fragment {

    private FragmentNinthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentNinthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(view1 -> NavHostFragment.findNavController(NinthFragment.this)
                .navigate(R.id.ninth_to_tenth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(NinthFragment.this)
                .navigate(R.id.ninth_to_eleventh));
    };
}