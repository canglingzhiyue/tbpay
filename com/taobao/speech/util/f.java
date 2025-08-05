package com.taobao.speech.util;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.l;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ae5a2f", new Object[]{wVCallBackContext, str});
            return;
        }
        try {
            String url = wVCallBackContext.getWebview().getUrl();
            String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
            uTCustomHitBuilder.setEventPage(l.getInstance().getCurrentPageName());
            HashMap hashMap = new HashMap();
            hashMap.put("url", url);
            hashMap.put("pureUrl", uri);
            uTCustomHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }
}
