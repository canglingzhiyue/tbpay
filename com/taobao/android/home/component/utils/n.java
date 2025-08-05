package com.taobao.android.home.component.utils;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes5.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f12731a;
    private static boolean b;
    private static String c;
    private static boolean d;

    static {
        kge.a(-1901164566);
        f12731a = null;
        c = null;
        b = false;
        d = false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (f12731a == null && !b) {
            b = true;
            SharedPreferences a2 = com.taobao.global.setting.util.e.a(Globals.getApplication()).a();
            if (a2 == null) {
                return f12731a;
            }
            f12731a = a2.getString(h.KEY_ND_LOW_FEATURE_LIST, null);
        }
        return f12731a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (c == null && !d) {
            d = true;
            SharedPreferences a2 = com.taobao.global.setting.util.e.a(Globals.getApplication()).a();
            if (a2 == null) {
                return c;
            }
            c = a2.getString("clientAbNdAnimFeatureList", null);
        }
        return c;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f12731a = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            c = str;
        }
    }
}
