package com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh;

import android.view.View;

/* loaded from: classes4.dex */
public interface a {
    boolean hasArrivedBottomEdge();

    boolean hasArrivedTopEdge();

    void keepBottom();

    void keepTop();

    void setFooterView(View view);

    void setHeadView(View view);

    void trigger();
}
