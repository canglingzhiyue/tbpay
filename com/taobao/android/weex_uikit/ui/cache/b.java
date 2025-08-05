package com.taobao.android.weex_uikit.ui.cache;

import android.view.View;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;

/* loaded from: classes6.dex */
public interface b {
    void attach();

    View getView();

    void invalidate();

    void layout(int i, int i2, int i3, int i4);

    void setTarget(MUSNodeHost mUSNodeHost);

    void updateBorderRadius();
}
