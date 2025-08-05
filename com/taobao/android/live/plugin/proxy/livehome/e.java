package com.taobao.android.live.plugin.proxy.livehome;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14116a;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static String f;
    private static String g;
    private static String h;
    private static String i;
    private static boolean j;
    public static d k;

    static {
        kge.a(1667461788);
        g = "";
        h = "";
        i = "";
        j = false;
        f14116a = false;
        b = 0L;
        c = 0L;
        d = 0L;
        e = 0L;
        f = "";
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            h = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            i = str;
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            g = str;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : g;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        return UUID.randomUUID() + "_" + System.currentTimeMillis();
    }
}
