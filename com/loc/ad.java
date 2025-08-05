package com.loc;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.s3;
import org.json.JSONObject;
import tb.pqe;

/* loaded from: classes4.dex */
public final class ad extends af {

    /* renamed from: a  reason: collision with root package name */
    public String f7646a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    protected byte[] j;

    public ad(Context context) {
        super(context);
    }

    @Override // com.loc.bt
    public final byte[] d() {
        byte[] bArr = this.j;
        if (bArr != null) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "remap");
            jSONObject.put("package_name", l.c(this.k));
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_type", "Android");
            jSONObject.put("sdk_version", "4.3.3");
            this.f7646a = ab.a();
            jSONObject.put(pqe.STAGE_T1, this.f7646a);
            jSONObject.put("old_t1", y.g(this.k));
            this.b = ab.b();
            jSONObject.put(pqe.STAGE_T2, this.b);
            jSONObject.put("old_t2", y.h(this.k));
            this.c = ab.c();
            jSONObject.put(pqe.STAGE_T3, this.c);
            jSONObject.put("old_t3", y.i(this.k));
            this.d = ab.d();
            jSONObject.put("s1", this.d);
            jSONObject.put("old_s1", y.j(this.k));
            this.e = ab.e();
            jSONObject.put("s2", this.e);
            jSONObject.put("old_s2", y.k(this.k));
            this.f = ab.f();
            jSONObject.put(s3.g, this.f);
            jSONObject.put("old_s3", y.l(this.k));
            this.g = ab.g();
            jSONObject.put("s4", this.g);
            jSONObject.put("old_s4", y.m(this.k));
            jSONObject.put("uuid", ab.a(this.k));
            jSONObject.put("android_id", o.g());
            jSONObject.put("hostname", ab.h());
            this.h = o.t(this.k);
            jSONObject.put("gaid", this.h);
            jSONObject.put("old_gaid", y.n(this.k));
            this.i = o.e(this.k);
            jSONObject.put("oaid", this.i);
            jSONObject.put("old_oaid", y.b(this.k));
            jSONObject.put("aaid", y.c(this.k));
            jSONObject.put("resetToken", y.f(this.k));
            jSONObject.put("uabc", y.e(this.k));
            this.j = ab.a(x.d(jSONObject.toString().getBytes("utf-8")), x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes());
        } catch (Throwable unused) {
        }
        return this.j;
    }
}
