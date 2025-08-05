package com.taobao.android.live.plugin.proxy.evocation;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class EvocationProxy extends g<IEvocationProxy> implements IEvocationProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EvocationProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final EvocationProxy f14105a;

        static {
            kge.a(993316838);
            f14105a = new EvocationProxy();
        }

        public static /* synthetic */ EvocationProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EvocationProxy) ipChange.ipc$dispatch("ee9c2d8f", new Object[0]) : f14105a;
        }
    }

    static {
        kge.a(1093060554);
        kge.a(1338942331);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IEvocationProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.EvocationProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "点淘唤端功能";
    }

    public static EvocationProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EvocationProxy) ipChange.ipc$dispatch("7410ecb9", new Object[0]) : a.a();
    }

    private EvocationProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[EvocationProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void initTaoLiveEvocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba19079", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.initTaoLiveEvocation();
        }
        e.c("[EvocationProxy#initTaoLiveEvocation]");
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void appLinkRegisterWXModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c389732", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.appLinkRegisterWXModule();
        }
        e.c("[EvocationProxy#appLinkRegisterWXModule]");
    }

    @Override // com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy
    public void appLinkRegisterPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea0658", new Object[]{this});
            return;
        }
        IEvocationProxy real = getReal();
        if (real != null) {
            real.appLinkRegisterPlugin();
        }
        e.c("[EvocationProxy#appLinkRegisterPlugin]");
    }
}
