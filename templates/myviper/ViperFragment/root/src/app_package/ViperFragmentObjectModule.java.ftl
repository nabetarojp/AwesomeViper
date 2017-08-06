package ${packageName};

import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class ${className}FragmentObjectModule {

    private ${className}Contract.View view;

    public ${className}FragmentObjectModule(${className}Contract.View view) {
        this.view = view;
    }

    @Provides
    public ${className}Presenter providePresenter(${className}Interactor interactor,
                                 ${className}Router router) {
        return new ${className}Presenter((Fragment) view, view, interactor, router);
    }
}
