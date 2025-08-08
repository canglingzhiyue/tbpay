package com.taobao.zcache.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.core.IZCacheCore;
import com.taobao.zcache.core.g;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class ZCacheAPI extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1057137705);
    }

    public static /* synthetic */ Object ipc$super(ZCacheAPI zCacheAPI, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.equals(str, "prefetch")) {
            return false;
        }
        final IZCacheCore b = g.b();
        if (b == null) {
            r rVar = new r();
            rVar.a("message", g.c().getMessage());
            wVCallBackContext.error(rVar);
            return true;
        }
        final ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> keys = new JSONObject(str2).keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
        } catch (JSONException unused) {
        }
        final String origin = getOrigin();
        com.taobao.zcache.core.e.b(new Runnable() { // from class: com.taobao.zcache.api.ZCacheAPI.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b.prefetch(arrayList, origin);
                wVCallBackContext.success(new r());
            }
        });
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = r4.mWebView.getUrl();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getOrigin() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.zcache.api.ZCacheAPI.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "c30a065d"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            android.taobao.windvane.webview.IWVWebView r0 = r4.mWebView
            r1 = 0
            if (r0 != 0) goto L1b
            return r1
        L1b:
            android.taobao.windvane.webview.IWVWebView r0 = r4.mWebView
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L24
            return r1
        L24:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L40
            r1.<init>(r0)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = r1.getHost()     // Catch: java.lang.Exception -> L40
            r2.append(r3)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L40
            r2.append(r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L40
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.zcache.api.ZCacheAPI.getOrigin():java.lang.String");
    }
}
