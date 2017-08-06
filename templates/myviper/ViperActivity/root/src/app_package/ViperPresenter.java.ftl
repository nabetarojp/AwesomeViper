package ${packageName};


import android.app.Activity;

import javax.inject.Inject;

public class ${className}Presenter implements ${className}Contract.Presenter, ${className}Contract.InteractorOutput {

    private ${className}ViewModel viewModel = new ${className}ViewModel();

    private Activity activity;
    private ${className}Contract.View view;
    private ${className}Contract.Interactor interactor;
    private ${className}Contract.Router router;

    @Inject
    public ${className}Presenter(Activity activity,
                         ${className}Contract.View view,
                         ${className}Contract.Interactor interactor,
                         ${className}Contract.Router router) {
        this.activity = activity;
        this.view = view;
        this.interactor = interactor;
        this.router = router;
    }


    @Override
    public void onResume() {
        interactor.startInteraction(this);
    }

    @Override
    public void onPause() {
        interactor.stopInteraction(this);
    }

    @Override
    public void onError(Throwable t) {
        view.showError(t.getMessage() != null ? t.getMessage() : "error");
    }
}
