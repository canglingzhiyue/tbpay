package com.taobao.tao;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.taobao.tao.navigation.TBFragmentTabHost;

/* loaded from: classes.dex */
public interface k extends com.taobao.tao.navigation.c {
    <T extends View> T findViewById(int i);

    Context getContext();

    Fragment getCurrentFragment();

    TBFragmentTabHost getFragmentTabHost();

    String getName();

    String getSimpleName();

    boolean isLowMemory();

    void restoreTabHost();
}
