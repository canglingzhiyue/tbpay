package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes9.dex */
public class gr implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static String f24510a = "wcc-ml-test10.bj";
    public static String b;

    /* renamed from: a  reason: collision with other field name */
    private int f449a;

    /* renamed from: a  reason: collision with other field name */
    private gu f450a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f451a = gq.f434a;

    /* renamed from: b  reason: collision with other field name */
    private boolean f452b = true;
    private String c;
    private String d;
    private String e;

    public gr(Map<String, Integer> map, int i, String str, gu guVar) {
        a(map, i, str, guVar);
    }

    public static final String a() {
        String str = b;
        return str != null ? str : aa.m1695a() ? "sandbox.xmpush.xiaomi.com" : aa.b() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    public static final void a(String str) {
        if (aa.b()) {
            return;
        }
        b = str;
    }

    private void a(Map<String, Integer> map, int i, String str, gu guVar) {
        this.f449a = i;
        this.c = str;
        this.f450a = guVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public int mo1992a() {
        return this.f449a;
    }

    public void a(boolean z) {
        this.f451a = z;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1993a() {
        return this.f451a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m1994a() {
        return null;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String c() {
        if (this.d == null) {
            this.d = a();
        }
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }
}
