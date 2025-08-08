package com.taobao.android.tcrash;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import java.util.Map;
import tb.jdv;
import tb.jfj;
import tb.jgi;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190e33bc", new Object[]{application, str, str2, str3, str4, str5, map});
            return;
        }
        jgi.a(application, str, str2, str3, str4, str5);
        try {
            if (!new jdv(application.getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0).getAll()).a("OpenRestOptThread", false)) {
                return;
            }
            com.alibaba.motu.tbrest.c.a(true);
        } catch (Throwable th) {
            jfj.b(th);
        }
    }

    public static void a(Application application, String str, String str2, String str3, String str4, Map<String, Object> map) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135f6906", new Object[]{application, str, str2, str3, str4, map});
            return;
        }
        if (StringUtils.isEmpty(str) || "12278902".equals(str) || "21646297".equals(str)) {
            str5 = "12278902@android";
            str6 = "21646297";
        } else {
            str6 = str;
            str5 = "";
        }
        a(application, str5, str6, str2, str3, str4, map);
    }
}
