package com.taobao.weex.ui.component.list;

import android.view.View;
import com.taobao.weex.dom.WXEvent;

/* loaded from: classes9.dex */
public interface IWXCell {
    void fireEvent(String str);

    WXEvent getEvents();

    View getRealView();

    String getRef();

    int getScrollPositon();

    int getStickyOffset();

    void recoverySticky();

    void removeSticky();
}
