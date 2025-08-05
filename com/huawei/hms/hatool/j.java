package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;
import tb.cye;

/* loaded from: classes4.dex */
public class j {
    private static j b;

    /* renamed from: a  reason: collision with root package name */
    private Context f7464a;

    /* loaded from: classes4.dex */
    private static class a extends e0 {

        /* renamed from: a  reason: collision with root package name */
        String f7465a;
        String b;

        public a(String str, String str2) {
            this.f7465a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f7465a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return cye.a(str);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f7465a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f7465a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            int i = 0;
            int i2 = (z.k(this.f7465a, this.b) ? 4 : 0) | 0;
            if (z.e(this.f7465a, this.b)) {
                i = 2;
            }
            return i2 | i | (z.h(this.f7465a, this.b) ? 1 : 0);
        }
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            if (b == null) {
                b = new j();
            }
            jVar = b;
        }
        return jVar;
    }

    public String a(String str, String str2) {
        return i0.a(this.f7464a, str, str2);
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String e = q0.e();
        if (TextUtils.isEmpty(e)) {
            e = d.a(this.f7464a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(e)) {
                e = UUID.randomUUID().toString().replace("-", "");
                d.b(this.f7464a, "global_v2", "uuid", e);
            }
            q0.h(e);
        }
        return e;
    }

    public void a(Context context) {
        if (this.f7464a == null) {
            this.f7464a = context;
        }
    }

    public String b(String str, String str2) {
        return i0.b(this.f7464a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f7464a);
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (z.f(str, str2)) {
            String p = s.c().b().p();
            String q = s.c().b().q();
            if (!TextUtils.isEmpty(p) && !TextUtils.isEmpty(q)) {
                return new Pair<>(p, q);
            }
            Pair<String, String> e = x0.e(this.f7464a);
            s.c().b().k((String) e.first);
            s.c().b().l((String) e.second);
            return e;
        }
        return new Pair<>("", "");
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }
}
