package com.taobao.android.live.plugin.proxy.evocation;

import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface IEvocationProxy extends IProxy {
    public static final String KEY = "IEvocationProxy";

    void appLinkRegisterPlugin();

    void appLinkRegisterWXModule();

    void initTaoLiveEvocation();
}
