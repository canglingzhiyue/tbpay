package com.meizu.cloud.pushsdk.d;

/* loaded from: classes4.dex */
public class i {
    public static String a(String str) {
        com.meizu.cloud.pushsdk.d.l.d a2 = com.meizu.cloud.pushsdk.d.l.a.a("android.os.SystemProperties").a("get", String.class).a(str);
        if (a2.f7888a) {
            return (String) a2.b;
        }
        return null;
    }
}
