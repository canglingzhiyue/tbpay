package com.alibaba.motu.tbrest.rest;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import tb.byn;
import tb.byr;
import tb.byt;
import tb.byw;
import tb.bzd;
import tb.bzg;
import tb.bzh;
import tb.kge;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f3160a;

    static {
        kge.a(-1953853607);
        f3160a = new a();
    }

    public static void a() {
        f3160a.a();
    }

    private static boolean a(int i, String str, Context context, String str2, String str3) {
        try {
            bzd.b("RestAPI start send log!");
            if (!bzh.b(str3)) {
                bzd.b("UTRestAPI build data failure!");
                return false;
            }
            bzd.b("RestAPI build data succ!");
            HashMap hashMap = new HashMap(1);
            hashMap.put(String.valueOf(i), str3);
            byte[] bArr = null;
            try {
                bArr = a(str, context, hashMap);
            } catch (Exception e) {
                bzd.c(e.toString());
            }
            if (bArr == null) {
                return false;
            }
            bzd.b("packRequest success!");
            return byw.a(str2, bArr).a();
        } catch (Throwable th) {
            bzd.b("system error!", th);
            return false;
        }
    }

    public static boolean a(Context context, String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return a(com.alibaba.motu.tbrest.d.a().c, context, str, j, str2, i, obj, obj2, obj3, map);
    }

    private static boolean a(String str) {
        return bzg.a() < byn.a().a(str);
    }

    public static boolean a(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return a(str, context, str2, j, str3, i, obj, obj2, obj3, map, false);
    }

    private static boolean a(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map, boolean z) {
        try {
            bzd.b("RestAPI start send log by url!");
            String a2 = b.a(str, j, str3, i, obj, obj2, obj3, map);
            if (bzh.b(a2)) {
                bzd.b("RestAPI build data succ by url!");
                if (i != 61006 && i != 1 && i != 61003 && !byr.a().c()) {
                    if (a(i + str3)) {
                        return f3160a.a(i, str, context, str2, a2);
                    }
                }
                try {
                    return a(i, str, context, str2, a2);
                } catch (Exception unused) {
                    return false;
                }
            }
            bzd.b("UTRestAPI build data failure by url!");
        } catch (Throwable th) {
            bzd.b("system error by url!", th);
        }
        return false;
    }

    private static byte[] a(String str, Context context, Map<String, String> map) {
        try {
            return byt.a(str, context, map);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean b(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return a(str, context, str2, j, str3, i, obj, obj2, obj3, map, true);
    }
}
