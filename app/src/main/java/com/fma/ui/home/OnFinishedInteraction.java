package com.fma.ui.home;

/**
 * Created by Shal on 01-08-2015.
 */
public interface OnFinishedInteraction {

    public void dataSetLoadedSucess();

    public void dataSetLoadFailure();

    public void showProgressBar();

    public void removeProgressBar();
}
