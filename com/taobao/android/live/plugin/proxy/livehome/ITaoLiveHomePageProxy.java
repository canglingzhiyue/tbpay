package com.taobao.android.live.plugin.proxy.livehome;

import android.content.Context;
import android.content.Intent;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface ITaoLiveHomePageProxy extends IProxy {
    public static final String KEY = "ITaoLiveHomePageProxy";

    d createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent);

    String getBailoutTemplate();

    String getBailoutVideoListData();

    String getDXAppVersion();

    String getDXBizType();

    void previewEngineDidInitialized(bd bdVar);

    boolean processInner(Intent intent, com.taobao.android.nav.d dVar);
}
