package com.zhuinden.simplestackdemonestedstack.presentation.paths.main.cloudsync.another.internal;

import com.google.auto.value.AutoValue;
import com.zhuinden.simplestackdemonestedstack.R;
import com.zhuinden.simplestackdemonestedstack.application.Key;
import com.zhuinden.simplestackdemonestedstack.presentation.paths.main.MainView;
import com.zhuinden.simplestackdemonestedstack.util.Child;

/**
 * Created by Zhuinden on 2017.02.25..
 */

@AutoValue
public abstract class InternalKey
        extends Key
        implements Child {
    @Override
    public int layout() {
        return R.layout.path_internal;
    }

    @Override
    public String stackIdentifier() {
        return MainView.StackType.CLOUDSYNC.name();
    }

    public static InternalKey create(Object parent) {
        return new AutoValue_InternalKey(parent);
    }
}