package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        // Initialize the Handler
        handler = new Handler();
        // Schedule a task to move to the second fragment after 2 seconds
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.first_to_second);
            }
        }, 2000);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        // Remove any pending callbacks and messages from the Handler
        handler.removeCallbacksAndMessages(null);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.first_to_eleventh));
    };

}