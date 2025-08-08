package com.alibaba.triver.bundle.nav;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1567300475);
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : !StringUtils.isEmpty(b(uri));
    }

    public static String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{uri});
        }
        if (!uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter(i.APP_ID);
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue() : !StringUtils.isEmpty(d(uri));
    }

    public static String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3068ee64", new Object[]{uri});
        }
        if (!uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter("_wml_code");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return StringUtils.equals("true", Uri.parse(str).getQueryParameter(i.IS_WIDGET));
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return StringUtils.equals("true", Uri.parse(str).getQueryParameter("isATS"));
        }
        return false;
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbb9705f", new Object[]{uri})).booleanValue() : uri != null && uri.isHierarchical() && StringUtils.equals(uri.getQueryParameter(i.KEY_AFC_LINK), "1");
    }
}
