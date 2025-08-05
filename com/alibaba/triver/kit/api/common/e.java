package com.alibaba.triver.kit.api.common;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1729306137);
    }

    public static String c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6767f723", new Object[]{uri});
        }
        if (!uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter(i.APP_ID);
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : uri != null && uri.isHierarchical() && TextUtils.equals(uri.getQueryParameter(i.KEY_AFC_LINK), "1");
    }

    public static Uri b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("c9854db5", new Object[]{uri}) : (uri == null || !uri.isHierarchical()) ? uri : uri.buildUpon().appendQueryParameter(i.KEY_AFC_LINK, "1").build();
    }
}
