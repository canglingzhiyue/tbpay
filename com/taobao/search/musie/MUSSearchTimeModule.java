package com.taobao.search.musie;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.kge;

/* loaded from: classes7.dex */
public final class MUSSearchTimeModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1340947920);
    }

    public MUSSearchTimeModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public final void getTime(com.taobao.android.weex_framework.bridge.b callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb19f61", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.c(callback, "callback");
        TimeStampManager instance = TimeStampManager.instance();
        kotlin.jvm.internal.q.a((Object) instance, "TimeStampManager.instance()");
        callback.a(String.valueOf(instance.getCurrentTimeStamp() / 1000));
    }
}
