package com.taobao.android.live.plugin.proxy.livehome;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoLiveHomePageProxy extends g<ITaoLiveHomePageProxy> implements ITaoLiveHomePageProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLiveHomePageProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final TaoLiveHomePageProxy f14115a;

        static {
            kge.a(-246260761);
            f14115a = new TaoLiveHomePageProxy();
        }

        public static /* synthetic */ TaoLiveHomePageProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TaoLiveHomePageProxy) ipChange.ipc$dispatch("5bd3d154", new Object[0]) : f14115a;
        }
    }

    static {
        kge.a(581192425);
        kge.a(693224932);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : ITaoLiveHomePageProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installTaoLiveHomePagePlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "频道页";
    }

    public TaoLiveHomePageProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public d createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f3b8ebd0", new Object[]{this, context, new Boolean(z), obj, intent});
        }
        ITaoLiveHomePageProxy real = getReal();
        d createTaoLiveHomePage = real != null ? real.createTaoLiveHomePage(context, z, obj, intent) : null;
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#createTaoLiveHomePage]  value: " + createTaoLiveHomePage);
        return createTaoLiveHomePage;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        String dXBizType = real != null ? real.getDXBizType() : null;
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#getDXBizType]  value: " + dXBizType);
        return dXBizType;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb6a1c18", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        String dXAppVersion = real != null ? real.getDXAppVersion() : null;
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#getDXAppVersion]  value: " + dXAppVersion);
        return dXAppVersion;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0d24c29", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        String bailoutTemplate = real != null ? real.getBailoutTemplate() : null;
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#getBailoutTemplate]  value: " + bailoutTemplate);
        return bailoutTemplate;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutVideoListData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a978b4ac", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        String bailoutVideoListData = real != null ? real.getBailoutVideoListData() : null;
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#getBailoutVideoListData]  value: " + bailoutVideoListData);
        return bailoutVideoListData;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
            return;
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            real.previewEngineDidInitialized(bdVar);
        }
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#previewEngineDidInitialized]");
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public boolean processInner(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4fe2679", new Object[]{this, intent, dVar})).booleanValue();
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            z = real.processInner(intent, dVar);
        }
        com.taobao.android.live.plugin.proxy.e.c("[TaoLiveHomePageProxy#processInner]  value: " + z);
        return z;
    }

    public static TaoLiveHomePageProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveHomePageProxy) ipChange.ipc$dispatch("5429fc6a", new Object[0]) : a.a();
    }
}
