package ${packageName};

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ${applicationId}.R;
import ${applicationId}.databinding.Fragment${className}Binding;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;


public class ${className}Fragment extends Fragment implements ${className}Contract.View{

    @Inject
    ${className}Contract.Presenter presenter;
    Fragment${className}Binding binding;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment${className?replace("[A-Z]", "_$0", "r")?lower_case}, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = Fragment${className}Binding.bind(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    public void showError(String message) {

    }
}
