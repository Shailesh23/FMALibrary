package com.fma.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Shal on 29-07-2015.
 */
public class SnackBarUtil {
    public static void createSnackbar(String message, View parentView) {
        Snackbar.make(parentView, message, Snackbar.LENGTH_LONG).show();
    }
}
