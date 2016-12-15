package com.k2infosoft.k2navigation;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by kaushal kishore on 15/12/16.
 */

public interface FantasyListener {

    boolean onHover(@Nullable View view);


    boolean onSelect(View view);

    void onCancel();
}
