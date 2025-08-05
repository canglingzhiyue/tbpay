package com.taobao.browser.nav;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.h;
import com.taobao.pha.core.p;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1271475773);
    }

    public static boolean a(Uri uri) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        try {
            host = uri.getHost();
        } catch (Exception unused) {
        }
        if (host == null) {
            return false;
        }
        boolean z = false;
        for (String str : a()) {
            if (a(host, str)) {
                z = true;
            }
        }
        if (z) {
            return "true".equals(uri.getQueryParameter("forceThemis"));
        }
        return false;
    }

    private static String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[0]);
        }
        h c = p.c();
        if (c == null) {
            return "*.taobao.com,*.tmall.com,*.alicdn.com,*.alibaba-inc.com".split(",");
        }
        String a2 = c.a("themis_domain_white_list");
        if (TextUtils.isEmpty(a2)) {
            return "*.taobao.com,*.tmall.com,*.alicdn.com,*.alibaba-inc.com".split(",");
        }
        return a2.split(",");
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str2 == null) {
            return false;
        }
        if ("*".equals(str2)) {
            return true;
        }
        if (str2.startsWith("*.")) {
            String substring = str2.substring(2);
            return str.endsWith(substring) && str.length() > substring.length() && str.charAt((str.length() - substring.length()) - 1) == '.';
        }
        return str.equals(str2);
    }
}
