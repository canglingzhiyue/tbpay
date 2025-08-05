package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
public class dk {

    /* renamed from: a  reason: collision with root package name */
    private static cz f24422a;

    /* renamed from: a  reason: collision with other field name */
    private static da f211a;

    public static void a(Context context) {
        a("onSendMsg");
        if (!m1816b(context)) {
            return;
        }
        dn.a(context, System.currentTimeMillis(), m1815a(context));
    }

    public static void a(Context context, gq gqVar) {
        if (m1816b(context)) {
            if (f24422a == null) {
                f24422a = new cz(context);
            }
            if (f211a == null) {
                f211a = new da(context);
            }
            cz czVar = f24422a;
            gqVar.a(czVar, czVar);
            da daVar = f211a;
            gqVar.b(daVar, daVar);
            a("startStats");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        cy.a("Push-PowerStats", str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1815a(Context context) {
        return i.m2030b(context);
    }

    public static void b(Context context) {
        a("onReceiveMsg");
        if (!m1816b(context)) {
            return;
        }
        dn.b(context, System.currentTimeMillis(), m1815a(context));
    }

    public static void b(Context context, gq gqVar) {
        cz czVar = f24422a;
        if (czVar != null) {
            gqVar.a(czVar);
            f24422a = null;
        }
        da daVar = f211a;
        if (daVar != null) {
            gqVar.b(daVar);
            f211a = null;
        }
        a("stopStats");
    }

    /* renamed from: b  reason: collision with other method in class */
    private static boolean m1816b(Context context) {
        return cy.a(context);
    }

    public static void c(Context context) {
        a("onPing");
        if (!m1816b(context)) {
            return;
        }
        dn.c(context, System.currentTimeMillis(), m1815a(context));
    }

    public static void d(Context context) {
        a("onPong");
        if (!m1816b(context)) {
            return;
        }
        dn.d(context, System.currentTimeMillis(), m1815a(context));
    }
}
