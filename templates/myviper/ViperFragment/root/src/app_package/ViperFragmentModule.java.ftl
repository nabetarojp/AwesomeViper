package ${packageName};

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;


@Module(subcomponents = {${className}FragmentComponent.class})
public abstract class ${className}FragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(${className}Fragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> bind${className}FragmentInjectorFactory(${className}FragmentComponent.Builder builder);
}
