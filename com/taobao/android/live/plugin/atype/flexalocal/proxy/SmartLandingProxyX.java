package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.b;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class SmartLandingProxyX implements ISmartLandingProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2028422299);
        kge.a(990512523);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, ISmartLandingProxy.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy.b) ipChange.ipc$dispatch("c97ac022", new Object[]{this, context, str, str2, str3, cVar}) : new b(context, str, null, str2, str2, null, null, str3, null, cVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy.b) ipChange.ipc$dispatch("b2546aa4", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, jSONObject, cVar}) : new b(context, str, str2, str3, str4, str5, str6, str7, jSONObject, cVar);
    }
}
