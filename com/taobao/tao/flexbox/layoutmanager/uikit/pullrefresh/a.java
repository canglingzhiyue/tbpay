package com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh;

import android.view.View;

/* loaded from: classes8.dex */
public interface a {
    boolean hasArrivedBottomEdge();

    boolean hasArrivedTopEdge();

    void keepBottom();

    void keepTop();

    void removeFooterView(View view);

    void removeHeaderView(View view);

    void setFooterView(View view);

    void setHeadView(View view);

    void trigger();
}
