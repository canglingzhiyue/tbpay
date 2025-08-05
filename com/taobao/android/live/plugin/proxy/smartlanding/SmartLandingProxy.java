package com.taobao.android.live.plugin.proxy.smartlanding;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class SmartLandingProxy extends g<ISmartLandingProxy> implements ISmartLandingProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartLandingProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final SmartLandingProxy f14128a;

        static {
            kge.a(-288081692);
            f14128a = new SmartLandingProxy();
        }

        public static /* synthetic */ SmartLandingProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SmartLandingProxy) ipChange.ipc$dispatch("d44ce8d", new Object[0]) : f14128a;
        }
    }

    static {
        kge.a(-1666162548);
        kge.a(990512523);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : ISmartLandingProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLandingProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveSmartLandingPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "SmartLanding";
    }

    public static SmartLandingProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SmartLandingProxy) ipChange.ipc$dispatch("1fb40637", new Object[0]) : a.a();
    }

    private SmartLandingProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[SmartLandingProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, ISmartLandingProxy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("c97ac022", new Object[]{this, context, str, str2, str3, cVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.b createSmartLanding = real != null ? real.createSmartLanding(context, str, str2, str3, cVar) : null;
        e.c("[SmartLandingProxy#createSmartLanding]  value: " + createSmartLanding);
        return createSmartLanding;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("b2546aa4", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, jSONObject, cVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.b createSmartLanding = real != null ? real.createSmartLanding(context, str, str2, str3, str4, str5, str6, str7, jSONObject, cVar) : null;
        e.c("[SmartLandingProxy#createSmartLanding]  value: " + createSmartLanding);
        return createSmartLanding;
    }
}
