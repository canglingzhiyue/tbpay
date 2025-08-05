package com.taobao.android.live.plugin.proxy.pklink;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;

/* loaded from: classes6.dex */
public interface IPkLinkProxy extends IBTypeProxy {
    public static final String KEY = "IPKLinkProxy";

    BaseFrame getPkLinkFrame(Context context, a aVar);

    Class<? extends BaseFrame> getPkLinkFrameClass();
}
