package com.taobao.mytaobao.basement.weex;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.muc;
import tb.mxe;
import tb.mxj;
import tb.mxz;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18358a;

    static {
        kge.a(-2143009824);
        f18358a = false;
    }

    public static String a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43c96d2a", new Object[]{new Boolean(z), str});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("isLowDevice", String.valueOf(com.taobao.mytaobao.base.c.g()));
        buildUpon.appendQueryParameter("source", "mytaobao_basement");
        String d = mxz.d();
        if (!TextUtils.isEmpty(d)) {
            buildUpon.appendQueryParameter("wx_js_min_version", d);
        }
        String uri = buildUpon.build().toString();
        if (com.taobao.mytaobao.basement.a.e()) {
            uri = muc.a(uri, "isDowngradePrestrain", "true");
        }
        if (com.taobao.mytaobao.base.c.f()) {
            uri = muc.a(uri, "enableBasementRefreshTwice", "true");
        }
        if (f18358a || mxe.INSTANCE.c() != 1 || !mxj.a("optBasementFirstInstall", true)) {
            return uri;
        }
        if (!z) {
            f18358a = true;
        }
        return muc.a(uri, "firstInstallation", "true");
    }
}
