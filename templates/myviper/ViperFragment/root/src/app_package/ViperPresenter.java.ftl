package ${packageName};

import android.support.v4.app.Fragment;

import javax.inject.Inject;


public class ${className}Presenter implements ${className}Contract.Presenter, ${className}Contract.InteractorOutput {

    private ${className}ViewModel viewModel = new ${className}ViewModel();

    private Fragment fragment;
    private ${className}Contract.View view;
    private ${className}Contract.Interactor interactor;
    private ${className}Contract.Router router;

    @Inject
    public ${className}Presenter(Fragment fragment,
                            ${className}Contract.View view,
                            ${className}Contract.Interactor interactor,
                            ${className}Contract.Router router) {
        this.fragment = fragment;
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
