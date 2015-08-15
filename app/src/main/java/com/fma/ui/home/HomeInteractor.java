package com.fma.ui.home;

import android.content.Context;

/**
 * Created by Shal on 01-08-2015.
 */
public interface HomeInteractor {

    public void makeRequestToServer(OnFinishedInteraction resultHandler,int requestType,Context context);
}
