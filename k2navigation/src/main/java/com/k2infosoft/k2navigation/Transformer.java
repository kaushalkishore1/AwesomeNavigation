package com.k2infosoft.k2navigation;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kaushal kishore on 15/12/16.
 */

public interface Transformer {
    /**
     *  transform  SideBar child view
     *
     * @param sideBar     SideBar
     * @param itemView    child view
     * @param touchY
     * @param slideOffset   drawerLayout  slideOffset
     * @param isLeft       SideBar
     */
    void apply(ViewGroup sideBar, View itemView, float touchY, float slideOffset, boolean isLeft);
}
