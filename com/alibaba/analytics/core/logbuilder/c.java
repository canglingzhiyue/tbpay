package com.alibaba.analytics.core.logbuilder;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apz;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f2083a;
    private static boolean b;

    static {
        kge.a(1808461970);
        f2083a = null;
        b = true;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null || !b) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.taobao.dp.DeviceSecuritySDK");
            if (cls == null) {
                b = false;
                return null;
            }
            Object a2 = apz.a((Class) cls, "getInstance", new Object[]{context}, Context.class);
            if (a2 == null) {
                return null;
            }
            Object a3 = apz.a(a2, "getSecurityToken");
            if (a3 != null) {
                f2083a = (String) a3;
            }
            return (String) a3;
        } catch (Exception unused) {
            return null;
        }
    }
}
