package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static z0 f7447a;

    private static synchronized z0 a() {
        z0 z0Var;
        synchronized (a.class) {
            if (f7447a == null) {
                f7447a = q.c().b();
            }
            z0Var = f7447a;
        }
        return z0Var;
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f7447a.a(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f7447a.a(context, str, str2);
        }
    }

    public static void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f7447a.b(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    public static boolean b() {
        return q.c().a();
    }

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        f7447a.a(-1);
    }
}
