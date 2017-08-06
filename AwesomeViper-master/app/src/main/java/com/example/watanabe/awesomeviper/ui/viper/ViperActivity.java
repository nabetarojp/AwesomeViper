package com.example.watanabe.awesomeviper.ui.viper;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.watanabe.awesomeviper.R;
import com.example.watanabe.awesomeviper.databinding.ActivityViperBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class ViperActivity extends AppCompatActivity implements ViperContract.View {

    @Inject
    ViperContract.Presenter presenter;
    ActivityViperBinding binding;

    public static Intent createIntent(Context context) {
        return new Intent(context, ViperActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_viper);

        binding.toolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(binding.toolbar);

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    public void showError(String message) {
        binding.progressBar.setVisibility(View.GONE);
        binding.errorText.setVisibility(View.VISIBLE);
        binding.errorText.setText(message);
    }
}
