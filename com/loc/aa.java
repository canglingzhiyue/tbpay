package com.loc;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.s3;
import org.json.JSONObject;
import tb.pqe;

/* loaded from: classes4.dex */
public final class aa extends af {

    /* renamed from: a  reason: collision with root package name */
    public String f7642a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    protected byte[] j;

    public aa(Context context) {
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
            jSONObject.put("method", "create");
            jSONObject.put("package_name", l.c(this.k));
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_type", "Android");
            jSONObject.put("sdk_version", "4.3.3");
            this.f7642a = ab.a();
            jSONObject.put(pqe.STAGE_T1, this.f7642a);
            this.b = ab.b();
            jSONObject.put(pqe.STAGE_T2, this.b);
            this.c = ab.c();
            jSONObject.put(pqe.STAGE_T3, this.c);
            this.d = ab.d();
            jSONObject.put("s1", this.d);
            this.e = ab.e();
            jSONObject.put("s2", this.e);
            this.f = ab.f();
            jSONObject.put(s3.g, this.f);
            this.g = ab.g();
            jSONObject.put("s4", this.g);
            jSONObject.put("uuid", ab.a(this.k));
            jSONObject.put("android_id", o.g());
            jSONObject.put("hostname", ab.h());
            this.h = o.t(this.k);
            jSONObject.put("gaid", this.h);
            this.i = o.e(this.k);
            jSONObject.put("oaid", this.i);
            this.j = ab.a(x.d(jSONObject.toString().getBytes("utf-8")), x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes());
        } catch (Throwable unused) {
        }
        return this.j;
    }
}
