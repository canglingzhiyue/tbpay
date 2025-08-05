package com.taobao.homepage.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import tb.kge;
import tb.onq;

/* loaded from: classes7.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f17298a;
    private static boolean b;

    static {
        kge.a(-438235507);
        f17298a = "HImageViewUtils";
        b = false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else if (com.taobao.android.home.component.utils.j.a("enableHomePageGlobalImageTag", true) && z) {
            onq.a(true);
        } else {
            onq.a(false);
        }
    }

    public static void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        String str3 = f17298a;
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("onUpdateHomePageRefreshType, requestType:");
        String str4 = "null";
        sb.append(str != null ? str : str4);
        sb.append(" , changeType:");
        if (str2 != null) {
            str4 = str2;
        }
        sb.append(str4);
        sb.append(" , isFirstPage:");
        sb.append(z);
        strArr[0] = sb.toString();
        com.taobao.android.home.component.utils.e.e(str3, strArr);
        if (TextUtils.equals(str, "loadCache")) {
            a();
            a(true);
            onq.a();
            onq.a("homepage-ads");
            onq.a(onq.IMAGE_FIRST_SCREEN_STRATEGY_CONFIG);
        } else if (TextUtils.equals(str2, "base") && z) {
            a();
            onq.a();
            onq.a("homepage-ads");
            onq.a(onq.IMAGE_STRATEGY_CONFIG);
        } else {
            onq.a((String) null);
            onq.a((ImageStrategyConfig) null);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b || onq.e()) {
        } else {
            onq.c();
        }
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[0]);
        }
        if (!onq.e()) {
            return null;
        }
        JSONObject f = onq.f();
        onq.d();
        return f;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }
}
