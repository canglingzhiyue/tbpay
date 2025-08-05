package com.taobao.search.sf.remote;

import android.view.View;
import tb.imn;
import tb.ius;

/* loaded from: classes8.dex */
public interface RemoteWidgetFactory {
    ius<?, ? extends View, ?> createRemoteWidget(String str, d dVar);

    void registerRemoteWidget(imn imnVar);
}
