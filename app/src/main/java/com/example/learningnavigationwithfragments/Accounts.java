package com.example.learningnavigationwithfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.learningnavigationwithfragments.ui.accounts.AccountsFragment;

public class Accounts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AccountsFragment.newInstance())
                    .commitNow();
        }
    }
}
