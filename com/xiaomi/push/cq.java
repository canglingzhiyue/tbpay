package com.xiaomi.push;

import java.net.InetSocketAddress;

/* loaded from: classes9.dex */
public final class cq {

    /* renamed from: a  reason: collision with root package name */
    private int f24405a;

    /* renamed from: a  reason: collision with other field name */
    private String f180a;

    public cq(String str, int i) {
        this.f180a = str;
        this.f24405a = i;
    }

    public static cq a(String str, int i) {
        String str2;
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            str2 = str;
        }
        return new cq(str2, i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static InetSocketAddress m1787a(String str, int i) {
        cq a2 = a(str, i);
        return new InetSocketAddress(a2.m1788a(), a2.a());
    }

    public int a() {
        return this.f24405a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1788a() {
        return this.f180a;
    }

    public String toString() {
        if (this.f24405a > 0) {
            return this.f180a + ":" + this.f24405a;
        }
        return this.f180a;
    }
}
