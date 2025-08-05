package com.meizu.cloud.pushsdk.f.f;

import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.f.g.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7970a = "c";
    private final HashMap<String, String> b;
    private final HashMap<String, Object> c;
    private final HashMap<String, String> d;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f7971a = null;

        public b a(Context context) {
            this.f7971a = context;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(b bVar) {
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        f();
        g();
        d();
        e();
        if (bVar.f7971a != null) {
            b(bVar.f7971a);
        }
        com.meizu.cloud.pushsdk.f.g.c.c(f7970a, "Subject created successfully.", new Object[0]);
    }

    private void a(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        this.d.put(str, str2);
    }

    private void d() {
        a("dm", Build.MODEL);
    }

    private void e() {
        a("df", Build.MANUFACTURER);
    }

    private void f() {
        a("ot", "android-" + Build.VERSION.RELEASE);
    }

    private void g() {
        a("ov", Build.DISPLAY);
    }

    public Map<String, String> a() {
        return this.b;
    }

    public void a(Context context) {
        String a2 = e.a(context);
        if (a2 != null) {
            a("ca", a2);
        }
    }

    public Map<String, Object> b() {
        return this.c;
    }

    public void b(Context context) {
        a(context);
    }

    public Map<String, String> c() {
        return this.d;
    }
}
