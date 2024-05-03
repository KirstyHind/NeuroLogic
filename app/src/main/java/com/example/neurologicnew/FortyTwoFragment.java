package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentFortyOneBinding;
import com.example.neurologicnew.databinding.FragmentFortyTwoBinding;

public class FortyTwoFragment extends Fragment {

    private FragmentFortyTwoBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFortyTwoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(view1 -> NavHostFragment.findNavController(FortyTwoFragment.this)
                .navigate(R.id.fortytwo_to_fortythree));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(FortyTwoFragment.this)
                .navigate(R.id.fortytwo_to_fourteenth));
    };
}