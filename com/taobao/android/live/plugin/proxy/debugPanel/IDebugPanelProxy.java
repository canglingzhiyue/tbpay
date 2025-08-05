package com.taobao.android.live.plugin.proxy.debugPanel;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;

/* loaded from: classes6.dex */
public interface IDebugPanelProxy extends IBTypeProxy {
    public static final String KEY = "IDebugPanelProxy";

    Object createDebugPanel(Context context, ViewGroup viewGroup, b bVar, boolean z);

    a createDisplayView(Context context, ViewGroup viewGroup, boolean z);

    void destroyDebugPanel(Context context);

    void destroyDisplayView(Context context, a aVar);
}
