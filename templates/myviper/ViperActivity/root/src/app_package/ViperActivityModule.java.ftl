package ${packageName};


import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {${className}ActivityComponent.class})
public abstract class ${className}ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(${className}Activity.class)
    public abstract AndroidInjector.Factory<? extends Activity> bind${className}ActivityInjectorFactory(${className}ActivityComponent.Builder builder);
}
