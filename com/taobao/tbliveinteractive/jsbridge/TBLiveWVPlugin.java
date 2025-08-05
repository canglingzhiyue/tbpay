package com.taobao.tbliveinteractive.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.TBLiveWebView;
import java.util.HashMap;
import tb.kge;
import tb.pmd;
import tb.poj;
import tb.qnb;
import tb.sem;

/* loaded from: classes8.dex */
public class TBLiveWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(13252463);
    }

    public static /* synthetic */ Object ipc$super(TBLiveWVPlugin tBLiveWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        HashMap<String, String> hashMap = (HashMap) qnb.a(str2);
        if (pmd.a().n() != null) {
            String str3 = hashMap.containsKey("__namespace") ? hashMap.get("__namespace") : "";
            poj n = pmd.a().n();
            n.a("taolive", "TBLiveWVPlugin_action_name", "action:" + str + ";name:" + str3, 1.0d);
        }
        e liveApiEngine = getLiveApiEngine();
        if (liveApiEngine != null && !liveApiEngine.d()) {
            return liveApiEngine.a(this.mWebView, str, hashMap, str2, eVar);
        }
        if (e.c() != null) {
            boolean a2 = e.c().a(this.mWebView, str, hashMap, str2, eVar);
            pmd.a().n().a("taolive", "TBLiveWVPlugin_action_name", "action:LiveApiEngineSingle", 1.0d);
            return a2;
        }
        eVar.b();
        return false;
    }

    private e getLiveApiEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9f14ed30", new Object[]{this});
        }
        if (!(this.mWebView instanceof TBLiveWebView)) {
            return null;
        }
        Object webViewToken = ((TBLiveWebView) this.mWebView).getWebViewToken();
        if (!(webViewToken instanceof sem)) {
            return null;
        }
        return ((sem) webViewToken).a();
    }
}
