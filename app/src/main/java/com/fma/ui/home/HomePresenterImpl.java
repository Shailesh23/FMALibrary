package com.fma.ui.home;

import android.content.Context;

import com.fma.interfaces.DownloadCallback;

/**
 * Created by Shal on 01-08-2015.
 */
public class HomePresenterImpl implements HomePresenter, OnFinishedInteraction, DownloadCallback {
    HomeView homeView;
    HomeInteractor homeInteractor;
    Context context;

    public HomePresenterImpl(HomeView homeView, Context context) {
        this.homeView = homeView;
        homeInteractor = new HomeInteractorImpl();
        this.context = (Context) homeView;
    }

    @Override
    public void getRequestedTypeFromFMAServer(int type) {
        homeInteractor.makeRequestToServer(this, type, context);
    }

    @Override
    public void dataSetLoadedSucess() {
        homeView.moveToDetails();
    }

    @Override
    public void dataSetLoadFailure() {

    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void removeProgressBar() {

    }

    @Override
    public void processDownloadContent() {

    }
}
