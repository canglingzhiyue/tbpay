package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes9.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private int f24271a;
    private String b;

    public v(int i) {
        this.f24271a = -1;
        if (i >= 0) {
            this.f24271a = i;
            return;
        }
        throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
    }

    private void e(d dVar) {
        dVar.a("command", this.f24271a);
        dVar.a("client_pkgname", this.b);
        c(dVar);
    }

    public final String a() {
        return this.b;
    }

    public final void a(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            com.vivo.push.util.u.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a2);
        Bundle b = a2.b();
        if (b == null) {
            return;
        }
        intent.putExtras(b);
    }

    public final void a(d dVar) {
        String a2 = x.a(this.f24271a);
        if (a2 == null) {
            a2 = "";
        }
        dVar.a("method", a2);
        e(dVar);
    }

    public final void a(String str) {
        this.b = str;
    }

    public final int b() {
        return this.f24271a;
    }

    public final void b(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            com.vivo.push.util.u.b("PushCommand", "bundleWapper is null");
            return;
        }
        a2.a("method", this.f24271a);
        e(a2);
        Bundle b = a2.b();
        if (b == null) {
            return;
        }
        intent.putExtras(b);
    }

    public final void b(d dVar) {
        String a2 = dVar.a();
        if (TextUtils.isEmpty(a2)) {
            a2 = dVar.a("client_pkgname");
        }
        this.b = a2;
        d(dVar);
    }

    protected abstract void c(d dVar);

    public boolean c() {
        return false;
    }

    protected abstract void d(d dVar);

    public String toString() {
        return getClass().getSimpleName();
    }
}
