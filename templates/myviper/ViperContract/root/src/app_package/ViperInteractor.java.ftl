package ${packageName};

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;


public class ${className}Interactor implements ${className}Contract.Interactor {

    private ${className}Contract.InteractorOutput out;
    private Disposable disposables = Disposables.empty();

    @Inject
    public ${className}Interactor() {
        // add dependencies
    }

    @Override
    public void startInteraction(${className}Contract.InteractorOutput out) {
        this.out = out;
    }

    @Override
    public void stopInteraction(${className}Contract.InteractorOutput out) {
        this.disposables.dispose();
        this.out = null;
    }
}
