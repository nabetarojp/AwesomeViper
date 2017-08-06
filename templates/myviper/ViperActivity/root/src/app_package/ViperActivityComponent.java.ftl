package ${packageName};

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {${className}ActivityObjectModule.class})
public interface ${className}ActivityComponent extends AndroidInjector<${className}Activity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<${className}Activity> {
        public abstract void objectModule(${className}ActivityObjectModule objectModule);

        @Override
        public void seedInstance(${className}Activity instance) {
            objectModule(new ${className}ActivityObjectModule(instance));
        }
    }
}
