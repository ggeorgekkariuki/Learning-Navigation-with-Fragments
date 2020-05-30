package com.example.learningnavigationwithfragments.ui.accounts;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.learningnavigationwithfragments.Accounts;
import com.example.learningnavigationwithfragments.R;

public class AccountsFragment extends Fragment {

    private AccountsViewModel mViewModel;

    public static AccountsFragment newInstance() {
        return new AccountsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_accounts, container, false);
//        Find the button within the layout fragment_accounts
        Button button = view.findViewById(R.id.button_next);
//        Set an click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Pass an intent to a new Activity
                startActivity(new Intent(getContext(), Accounts.class));
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AccountsViewModel.class);
        // TODO: Use the ViewModel
    }

}
