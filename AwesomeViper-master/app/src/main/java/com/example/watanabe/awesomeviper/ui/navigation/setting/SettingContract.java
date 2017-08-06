package com.example.watanabe.awesomeviper.ui.navigation.setting;


public interface SettingContract {

    interface View {
        void showError(String message); // base
    }

    interface Presenter {
        void onResume(); // base
        void onPause(); // base
    }

    interface Interactor {
        void startInteraction(InteractorOutput output); //base
        void stopInteraction(InteractorOutput output); //base
    }

    interface InteractorOutput {
        void onError(Throwable t); //base
    }

    interface Router {

    }
}
