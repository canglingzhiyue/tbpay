package com.taobao.android.live.plugin.proxy.multiLink;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;

/* loaded from: classes6.dex */
public interface IMultiLinkProxy extends IBTypeProxy {
    public static final String KEY = "IMultiLinkProxy";

    BaseFrame getMultiLinkFrame(Context context, a aVar);

    Class<? extends BaseFrame> getMultiLinkFrameClass();
}
