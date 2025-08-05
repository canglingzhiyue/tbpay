package com.vivo.push.restructure;

import android.content.Context;
import com.vivo.push.k;
import com.vivo.push.restructure.a.a.d;
import com.vivo.push.restructure.b.b;
import com.vivo.push.restructure.b.f;
import com.vivo.push.util.z;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24218a;
    private com.vivo.push.restructure.c.a b;
    private d c;
    private com.vivo.push.restructure.b.a d;
    private b e;
    private com.vivo.push.c.a f;
    private k g;

    /* renamed from: com.vivo.push.restructure.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private static class C1053a {

        /* renamed from: a  reason: collision with root package name */
        static a f24219a = new a((byte) 0);
    }

    private a() {
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C1053a.f24219a;
    }

    public final synchronized void a(Context context) {
        if (context == null) {
            return;
        }
        if (context != null) {
            this.f24218a = context;
        }
        this.d = new com.vivo.push.restructure.b.d(new z(context));
        this.b = new com.vivo.push.restructure.c.b(this.d);
        this.c = new d();
        this.e = new f();
        this.f = new com.vivo.push.c.a(context);
        this.g = new com.vivo.push.z(this.f, e());
    }

    public final synchronized Context b() {
        return this.f24218a;
    }

    public final com.vivo.push.restructure.c.a c() {
        return this.b;
    }

    public final d d() {
        return this.c;
    }

    public final synchronized com.vivo.push.restructure.b.a e() {
        return this.d;
    }

    public final b f() {
        return this.e;
    }

    public final com.vivo.push.c.a g() {
        return this.f;
    }

    public final k h() {
        return this.g;
    }
}
