package com.example.watanabe.awesomeviper.ui.hoge;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {HogeActivityObjectModule.class})
public interface HogeActivityComponent extends AndroidInjector<HogeActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HogeActivity> {
        public abstract void objectModule(HogeActivityObjectModule objectModule);

        @Override
        public void seedInstance(HogeActivity instance) {
            objectModule(new HogeActivityObjectModule(instance));
        }
    }
}
