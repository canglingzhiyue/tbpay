package com.taobao.avplayer.embed;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2068858360);
    }

    public static void a(IWVWebView iWVWebView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28bb0ea", new Object[]{iWVWebView, str, str2, str3});
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "{}";
        }
        iWVWebView.fireEvent("embedviewevent", String.format("{\"param\":{\"eventType\":\"%s\",\"bridgeId\":\"%s\",\"params\":%s}}", str2, str, str3));
    }
}
