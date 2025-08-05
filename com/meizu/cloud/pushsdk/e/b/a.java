package com.meizu.cloud.pushsdk.e.b;

import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f7897a = false;
    private static String b = "AndroidNetworking";

    public static void a() {
        f7897a = true;
    }

    public static void a(String str) {
        if (f7897a) {
            DebugLogger.d(b, str);
        }
    }

    public static void b(String str) {
        if (f7897a) {
            DebugLogger.i(b, str);
        }
    }
}
