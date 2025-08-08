package com.loc;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    private static ac f7643a = null;
    private static boolean b = false;
    private static boolean c = false;
    private Context d;

    private ac(Context context) {
        this.d = context;
    }

    public static ac a(Context context) {
        if (f7643a == null) {
            synchronized (ac.class) {
                if (f7643a == null) {
                    f7643a = new ac(context);
                }
            }
        }
        return f7643a;
    }

    public final String a() {
        cr a2;
        cs csVar;
        String str = "";
        try {
            if (z.d) {
                str = y.c(this.d);
                long d = y.d(this.d);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (StringUtils.isEmpty(str)) {
                    a2 = cr.a();
                    csVar = new cs() { // from class: com.loc.ac.1
                        @Override // com.loc.cs
                        public final void a() {
                            try {
                                if (ac.b) {
                                    boolean unused = ac.b = false;
                                    return;
                                }
                                boolean unused2 = ac.b = true;
                                aa aaVar = new aa(ac.this.d);
                                new bo();
                                bu a3 = bo.a(aaVar);
                                if (a3 != null) {
                                    JSONObject jSONObject = new JSONObject(x.a(ab.a(a3.f7708a, x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                                    if (jSONObject.optBoolean("suc")) {
                                        y.f(ac.this.d, aaVar.f7642a);
                                        y.g(ac.this.d, aaVar.b);
                                        y.h(ac.this.d, aaVar.c);
                                        y.i(ac.this.d, aaVar.d);
                                        y.j(ac.this.d, aaVar.e);
                                        y.k(ac.this.d, aaVar.f);
                                        y.l(ac.this.d, aaVar.g);
                                        y.b(ac.this.d, aaVar.i);
                                        y.m(ac.this.d, aaVar.h);
                                        y.a(ac.this.d, SystemClock.elapsedRealtime());
                                        String optString = jSONObject.optString("aaid", "");
                                        String optString2 = jSONObject.optString("resetToken", "");
                                        String optString3 = jSONObject.optString("uabc", "");
                                        if (!StringUtils.isEmpty(optString)) {
                                            y.c(ac.this.d, optString);
                                        }
                                        if (!StringUtils.isEmpty(optString2)) {
                                            y.e(ac.this.d, optString2);
                                        }
                                        if (!StringUtils.isEmpty(optString3)) {
                                            y.d(ac.this.d, optString3);
                                        }
                                    }
                                }
                                boolean unused3 = ac.b = false;
                            } catch (Throwable unused4) {
                                boolean unused5 = ac.b = false;
                            }
                        }
                    };
                } else if (elapsedRealtime - d > z.b) {
                    a2 = cr.a();
                    csVar = new cs() { // from class: com.loc.ac.2
                        @Override // com.loc.cs
                        public final void a() {
                            try {
                                if (ac.c) {
                                    boolean unused = ac.c = false;
                                    return;
                                }
                                boolean unused2 = ac.c = true;
                                ad adVar = new ad(ac.this.d);
                                new bo();
                                bu a3 = bo.a(adVar);
                                if (a3 != null) {
                                    JSONObject jSONObject = new JSONObject(x.a(ab.a(a3.f7708a, x.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                                    if (jSONObject.optBoolean("suc")) {
                                        y.f(ac.this.d, adVar.f7646a);
                                        y.g(ac.this.d, adVar.b);
                                        y.h(ac.this.d, adVar.c);
                                        y.i(ac.this.d, adVar.d);
                                        y.j(ac.this.d, adVar.e);
                                        y.k(ac.this.d, adVar.f);
                                        y.l(ac.this.d, adVar.g);
                                        y.b(ac.this.d, adVar.i);
                                        y.m(ac.this.d, adVar.h);
                                        y.a(ac.this.d, SystemClock.elapsedRealtime());
                                        String optString = jSONObject.optString("aaid", "");
                                        String optString2 = jSONObject.optString("resetToken", "");
                                        String optString3 = jSONObject.optString("uabc", "");
                                        if (!StringUtils.isEmpty(optString)) {
                                            y.c(ac.this.d, optString);
                                        }
                                        if (!StringUtils.isEmpty(optString2)) {
                                            y.e(ac.this.d, optString2);
                                        }
                                        if (!StringUtils.isEmpty(optString3)) {
                                            y.d(ac.this.d, optString3);
                                        }
                                    }
                                }
                                boolean unused3 = ac.c = false;
                            } catch (Throwable unused4) {
                                boolean unused5 = ac.c = false;
                            }
                        }
                    };
                }
                a2.b(csVar);
            }
        } catch (Throwable unused) {
        }
        return str;
    }
}
