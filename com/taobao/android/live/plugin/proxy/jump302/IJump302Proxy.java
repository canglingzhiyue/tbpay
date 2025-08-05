package com.taobao.android.live.plugin.proxy.jump302;

import android.content.Context;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes6.dex */
public interface IJump302Proxy extends IProxy {
    public static final String KEY = "IJump302Proxy";

    void jump302(Context context, g gVar, TBLiveDataModel tBLiveDataModel);
}
