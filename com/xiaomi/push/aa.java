package com.xiaomi.push;

/* loaded from: classes9.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private static int f24343a;

    /* renamed from: a  reason: collision with other field name */
    public static final String f87a;

    /* renamed from: a  reason: collision with other field name */
    public static boolean f88a;

    static {
        int i;
        f87a = ad.f24344a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f88a = false;
        f24343a = 1;
        if (f87a.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (!f87a.equalsIgnoreCase("ONEBOX")) {
            f24343a = 1;
            return;
        } else {
            i = 3;
        }
        f24343a = i;
    }

    public static int a() {
        return f24343a;
    }

    public static void a(int i) {
        f24343a = i;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1695a() {
        return f24343a == 2;
    }

    public static boolean b() {
        return f24343a == 3;
    }
}
