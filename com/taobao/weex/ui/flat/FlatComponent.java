package com.taobao.weex.ui.flat;

import com.taobao.weex.ui.flat.widget.Widget;

/* loaded from: classes9.dex */
public interface FlatComponent<T extends Widget> {
    T getOrCreateFlatWidget();

    boolean promoteToView(boolean z);
}
