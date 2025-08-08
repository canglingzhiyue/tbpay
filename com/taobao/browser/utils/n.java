package com.taobao.browser.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class n implements android.taobao.windvane.webview.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2129890803);
        kge.a(1892164776);
    }

    @Override // android.taobao.windvane.webview.k
    public String dealUrlScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849ca447", new Object[]{this, str});
        }
        try {
            if (!StringUtils.isEmpty(str) && !str.startsWith("javascript:")) {
                return str.replaceAll("^((?i)https:)?//", com.taobao.search.common.util.k.HTTP_PREFIX);
            }
            return str;
        } catch (Exception unused) {
            android.taobao.windvane.util.m.e("WVSchemeProcessor", "Can not dealUrlScheme : " + str);
            return str;
        }
    }
}
