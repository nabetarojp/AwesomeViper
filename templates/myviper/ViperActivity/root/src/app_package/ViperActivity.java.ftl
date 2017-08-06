package ${packageName};

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ${applicationId}.R;
import ${applicationId}.databinding.Activity${className}Binding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class ${className}Activity extends AppCompatActivity implements ${className}Contract.View {

    public static Intent createIntent(Context context) {
        return new Intent(context, ${className}Activity.class);
    }

    @Inject
    ${className}Contract.Presenter presenter;

    Activity${className}Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity${className?replace("[A-Z]", "_$0", "r")?lower_case});

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
