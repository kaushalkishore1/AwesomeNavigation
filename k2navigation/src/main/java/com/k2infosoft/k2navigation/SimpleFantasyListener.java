package com.k2infosoft.k2navigation;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by kaushal kishore on 15/12/16.
 */

public class SimpleFantasyListener implements FantasyListener {
    @Override
    public boolean onHover(@Nullable View view) {
        return false;
    }

    @Override
    public boolean onSelect(View view) {
        return false;
    }

    @Override
    public void onCancel() {

    }
}
