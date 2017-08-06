package com.example.watanabe.awesomeviper.ui.navigation.setting;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {SettingFragmentObjectModule.class})
public interface SettingFragmentComponent extends AndroidInjector<SettingFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingFragment> {

        public abstract void objectModule(SettingFragmentObjectModule objectModule);

        @Override
        public void seedInstance(SettingFragment instance) {
            objectModule(new SettingFragmentObjectModule(instance));
        }
    }

}
