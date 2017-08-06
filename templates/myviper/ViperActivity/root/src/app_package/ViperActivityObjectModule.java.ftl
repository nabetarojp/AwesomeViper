package ${packageName};

import android.app.Activity;

import dagger.Module;
import dagger.Provides;


@Module
public class ${className}ActivityObjectModule {

    private ${className}Contract.View view;

    public ${className}ActivityObjectModule(${className}Contract.View view) {
        this.view = view;
    }

    @Provides
    public ${className}Contract.Presenter providePresenter(${className}Interactor interactor, ${className}Router router) {
        return new ${className}Presenter((Activity) view, view, interactor, router);
    }
}
