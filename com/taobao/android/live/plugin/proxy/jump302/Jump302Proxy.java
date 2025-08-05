package com.taobao.android.live.plugin.proxy.jump302;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public class Jump302Proxy extends g<IJump302Proxy> implements IJump302Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Jump302Proxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Jump302Proxy f14114a;

        static {
            kge.a(1922201364);
            f14114a = new Jump302Proxy();
        }

        public static /* synthetic */ Jump302Proxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Jump302Proxy) ipChange.ipc$dispatch("bafeee3d", new Object[0]) : f14114a;
        }
    }

    static {
        kge.a(-312035236);
        kge.a(1031144859);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IJump302Proxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.Jump302ProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "install302Plugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "302Jump";
    }

    public static Jump302Proxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Jump302Proxy) ipChange.ipc$dispatch("3c35d267", new Object[0]) : a.a();
    }

    private Jump302Proxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[Jump302Proxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy
    public void jump302(Context context, com.taobao.taolive.sdk.core.g gVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f1ff00", new Object[]{this, context, gVar, tBLiveDataModel});
            return;
        }
        IJump302Proxy real = getReal();
        if (real != null) {
            real.jump302(context, gVar, tBLiveDataModel);
        }
        e.c("[Jump302Proxy#jump302]");
    }
}
