package ${packageName};

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {${className}FragmentObjectModule.class})
public interface ${className}FragmentComponent extends AndroidInjector<${className}Fragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<${className}Fragment> {

        public abstract void objectModule(${className}FragmentObjectModule objectModule);

        @Override
        public void seedInstance(${className}Fragment instance) {
            objectModule(new ${className}FragmentObjectModule(instance));
        }
    }

}
