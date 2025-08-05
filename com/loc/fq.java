package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.sys.BizContext;
import com.loc.m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class fq {
    private static volatile boolean h = false;
    private static boolean i = true;
    private static int j = 1000;
    private static int k = 200;
    private static boolean l = false;
    private static int m = 20;
    private static int n = 0;
    private static volatile int o = 0;
    private static boolean p = true;
    private static boolean q = false;
    private static int r = -1;
    private static long s;
    private static ArrayList<String> t = new ArrayList<>();
    private static ArrayList<String> u = new ArrayList<>();
    private static volatile boolean v = false;
    private static boolean w = true;
    private static long x = 300000;
    private static boolean y = false;
    private static double z = 0.618d;
    private static boolean A = true;
    private static int B = 80;

    /* renamed from: a  reason: collision with root package name */
    static long f7800a = 3600000;
    private static boolean C = false;
    private static boolean D = true;
    private static boolean E = false;
    public static volatile long b = 0;
    static boolean c = false;
    private static boolean F = true;
    private static long G = -1;
    private static boolean H = true;
    private static int I = 1;
    private static boolean J = false;
    private static int K = 5;
    private static boolean L = false;
    private static String M = "CMjAzLjEwNy4xLjEvMTU0MDgxL2Q";
    private static long N = 0;
    public static boolean d = false;
    public static boolean e = false;
    public static int f = 20480;
    public static int g = 10800000;

    public static void a(final Context context) {
        if (h) {
            return;
        }
        h = true;
        m.a(context, fr.c(), fr.d(), new m.a() { // from class: com.loc.fq.1
            @Override // com.loc.m.a
            public final void a(m.b bVar) {
                fq.a(context, bVar);
            }
        });
    }

    private static void a(Context context, JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("13S");
            if (optJSONObject == null) {
                return;
            }
            f7800a = optJSONObject.optInt("at", 123) * 60 * 1000;
            fx.a(editor, "13S_at", f7800a);
            d(optJSONObject, editor);
            try {
                D = m.a(optJSONObject.optString("nla"), true);
                fx.a(editor, "13S_nla", D);
            } catch (Throwable unused) {
            }
            try {
                F = m.a(optJSONObject.optString("asw"), true);
                fx.a(editor, "asw", F);
            } catch (Throwable unused2) {
            }
            try {
                JSONArray optJSONArray = optJSONObject.optJSONArray("mlpl");
                if (optJSONArray == null || optJSONArray.length() <= 0 || context == null) {
                    E = false;
                    fx.a(editor, "13S_mlpl");
                    return;
                }
                fx.a(editor, "13S_mlpl", x.b(optJSONArray.toString()));
                E = a(context, optJSONArray);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "loadConfigAbleStatus");
        }
    }

    private static void a(m.b bVar, SharedPreferences.Editor editor) {
        try {
            m.b.a aVar = bVar.g;
            if (aVar == null) {
                return;
            }
            i = aVar.f7828a;
            fx.a(editor, "exception", i);
            JSONObject jSONObject = aVar.c;
            if (jSONObject != null) {
                j = jSONObject.optInt("fn", j);
                int optInt = jSONObject.optInt("mpn", k);
                k = optInt;
                if (optInt > 500) {
                    k = 500;
                }
                if (k < 30) {
                    k = 30;
                }
                l = m.a(jSONObject.optString("igu"), false);
                m = jSONObject.optInt("ms", m);
                o = jSONObject.optInt("rot", 0);
                n = jSONObject.optInt("pms", 0);
            }
            by.a(j, l, m, n);
            ca.a(l, n);
            fx.a(editor, "fn", j);
            fx.a(editor, "mpn", k);
            fx.a(editor, "igu", l);
            fx.a(editor, "ms", m);
            fx.a(editor, "rot", o);
            fx.a(editor, "pms", n);
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "loadConfigDataUploadException");
        }
    }

    private static void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("11G");
            if (optJSONObject == null) {
                return;
            }
            boolean a2 = m.a(optJSONObject.optString("able"), true);
            w = a2;
            if (a2) {
                x = optJSONObject.optInt(com.taobao.android.msoa.c.TAG, 300) * 1000;
            }
            y = m.a(optJSONObject.optString("fa"), false);
            z = Math.min(1.0d, Math.max(0.2d, optJSONObject.optDouble("ms", 0.618d)));
            fx.a(editor, "ca", w);
            fx.a(editor, com.taobao.tao.content.business.b.CT, x);
            fx.a(editor, "11G_fa", y);
            fx.a(editor, "11G_ms", String.valueOf(z));
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "loadConfigDataCacheAble");
        }
    }

    public static boolean a() {
        return i;
    }

    public static boolean a(long j2) {
        if (!w) {
            return false;
        }
        long a2 = fy.a() - j2;
        long j3 = x;
        return j3 < 0 || a2 < j3;
    }

    static boolean a(Context context, m.b bVar) {
        SharedPreferences.Editor editor = null;
        try {
            editor = fx.a(context, "pref");
            a(bVar, editor);
            c(context);
            JSONObject jSONObject = bVar.f;
            if (jSONObject == null) {
                if (editor != null) {
                    try {
                        fx.a(editor);
                    } catch (Throwable unused) {
                    }
                }
                return true;
            }
            a(context, jSONObject, editor);
            a(jSONObject, editor);
            c(jSONObject, editor);
            e(jSONObject, editor);
            g(jSONObject, editor);
            f(jSONObject, editor);
            h(jSONObject, editor);
            b(jSONObject, editor);
            if (editor != null) {
                try {
                    fx.a(editor);
                } catch (Throwable unused2) {
                }
            }
            return true;
        } catch (Throwable unused3) {
            if (editor == null) {
                return false;
            }
            try {
                fx.a(editor);
                return false;
            } catch (Throwable unused4) {
                return false;
            }
        }
    }

    private static boolean a(Context context, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0 && context != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        if (fy.b(context, jSONArray.getString(i2))) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static int b() {
        return k;
    }

    public static void b(Context context) {
        if (v) {
            return;
        }
        v = true;
        try {
            i = fx.a(context, "pref", "exception", i);
            c(context);
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "loadLastAbleState p1");
        }
        try {
            j = fx.a(context, "pref", "fn", j);
            k = fx.a(context, "pref", "mpn", k);
            l = fx.a(context, "pref", "igu", l);
            m = fx.a(context, "pref", "ms", m);
            o = fx.a(context, "pref", "rot", 0);
            n = fx.a(context, "pref", "pms", 0);
            by.a(j, l, m, n);
            ca.a(l, n);
        } catch (Throwable th2) {
            fr.a(th2, "AuthUtil", "loadLastAbleState p2");
        }
        try {
            w = fx.a(context, "pref", "ca", w);
            x = fx.a(context, "pref", com.taobao.tao.content.business.b.CT, x);
            y = fx.a(context, "pref", "11G_fa", y);
            z = Double.valueOf(fx.a(context, "pref", "11G_ms", String.valueOf(z))).doubleValue();
            z = Math.max(0.2d, z);
        } catch (Throwable th3) {
            fr.a(th3, "AuthUtil", "loadLastAbleState p3");
        }
        try {
            c = fx.a(context, "pref", "fr", c);
        } catch (Throwable th4) {
            fr.a(th4, "AuthUtil", "loadLastAbleState p4");
        }
        try {
            F = fx.a(context, "pref", "asw", F);
        } catch (Throwable th5) {
            fr.a(th5, "AuthUtil", "loadLastAbleState p5");
        }
        try {
            G = fx.a(context, "pref", "awsi", G);
        } catch (Throwable th6) {
            fr.a(th6, "AuthUtil", "loadLastAbleState p6");
        }
        try {
            H = fx.a(context, "pref", "15ua", H);
            I = fx.a(context, "pref", "15un", I);
            N = fx.a(context, "pref", "15ust", N);
        } catch (Throwable th7) {
            fr.a(th7, "AuthUtil", "loadLastAbleState p7");
        }
        try {
            J = fx.a(context, "pref", "ok9", J);
            K = fx.a(context, "pref", "ok10", K);
            M = fx.a(context, "pref", "ok11", M);
        } catch (Throwable th8) {
            fr.a(th8, "AuthUtil", "loadLastAbleState p8");
        }
        try {
            d = fx.a(context, "pref", "17ya", false);
            e = fx.a(context, "pref", "17ym", false);
            g = fx.a(context, "pref", "17yi", 2) * 60 * 60 * 1000;
            f = fx.a(context, "pref", "17yx", 100) << 10;
        } catch (Throwable th9) {
            fr.a(th9, "AuthUtil", "loadLastAbleState p9");
        }
        try {
            b = fy.b();
            f7800a = fx.a(context, "pref", "13S_at", f7800a);
            D = fx.a(context, "pref", "13S_nla", D);
            A = fx.a(context, "pref", "13J_able", A);
            B = fx.a(context, "pref", "13J_c", B);
        } catch (Throwable th10) {
            fr.a(th10, "AuthUtil", "loadLastAbleState p10");
        }
        m.b(context);
        try {
            String a2 = fx.a(context, "pref", "13S_mlpl", (String) null);
            if (!TextUtils.isEmpty(a2)) {
                E = a(context, new JSONArray(x.c(a2)));
            }
        } catch (Throwable th11) {
            fr.a(th11, "AuthUtil", "loadLastAbleState p11");
        }
        try {
            boolean a3 = fx.a(context, "pref", "197a", false);
            String a4 = fx.a(context, "pref", "197dv", "");
            String a5 = fx.a(context, "pref", "197tv", "");
            if (!a3 || !fr.f7802a.equals(a4)) {
                return;
            }
            for (String str : fr.b) {
                if (str.equals(a5)) {
                    fr.f7802a = a5;
                }
            }
        } catch (Throwable th12) {
            fr.a(th12, "AuthUtil", "loadLastAbleState p12");
        }
    }

    private static void b(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("197");
            if (jSONObject2 == null) {
                return;
            }
            boolean a2 = m.a(jSONObject2.optString("able"), false);
            fx.a(editor, "197a", a2);
            if (a2) {
                fx.a(editor, "197dv", jSONObject2.optString(BizContext.KEY_SDK_VERSION, ""));
                fx.a(editor, "197tv", jSONObject2.optString("tv", ""));
                return;
            }
            fx.a(editor, "197dv", "");
            fx.a(editor, "197tv", "");
        } catch (Throwable unused) {
        }
    }

    public static int c() {
        if (o < 0) {
            o = 0;
        }
        return o;
    }

    public static void c(Context context) {
        try {
            w c2 = fr.c();
            c2.a(i);
            av.a(context, c2);
        } catch (Throwable unused) {
        }
    }

    private static void c(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("13J");
            if (optJSONObject == null) {
                return;
            }
            boolean a2 = m.a(optJSONObject.optString("able"), true);
            A = a2;
            if (a2) {
                B = optJSONObject.optInt(com.taobao.android.msoa.c.TAG, B);
            }
            fx.a(editor, "13J_able", A);
            fx.a(editor, "13J_c", B);
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "loadConfigDataGpsGeoAble");
        }
    }

    public static long d() {
        return x;
    }

    private static void d(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            c = m.a(jSONObject.optString("re"), false);
            fx.a(editor, "fr", c);
        } catch (Throwable th) {
            fr.a(th, "AuthUtil", "checkReLocationAble");
        }
    }

    private static void e(JSONObject jSONObject, SharedPreferences.Editor editor) {
        JSONArray optJSONArray;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("15O");
            if (optJSONObject == null) {
                return;
            }
            if (!m.a(optJSONObject.optString("able"), false) || ((optJSONArray = optJSONObject.optJSONArray("fl")) != null && optJSONArray.length() > 0 && !optJSONArray.toString().contains(Build.MANUFACTURER))) {
                G = -1L;
            } else {
                G = optJSONObject.optInt("iv", 30) * 1000;
            }
            fx.a(editor, "awsi", G);
        } catch (Throwable unused) {
        }
    }

    public static boolean e() {
        return w;
    }

    private static void f(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("17Y");
            if (jSONObject2 == null) {
                return;
            }
            d = m.a(jSONObject2.optString("able"), false);
            fx.a(editor, "17ya", d);
            e = m.a(jSONObject2.optString("mup"), false);
            fx.a(editor, "17ym", e);
            int optInt = jSONObject2.optInt("max", 20);
            if (optInt > 0) {
                fx.a(editor, "17yx", optInt);
                f = optInt << 10;
            }
            int optInt2 = jSONObject2.optInt("inv", 3);
            if (optInt2 <= 0) {
                return;
            }
            fx.a(editor, "17yi", optInt2);
            g = optInt2 * 60 * 60 * 1000;
        } catch (Throwable unused) {
        }
    }

    public static boolean f() {
        return y;
    }

    public static double g() {
        return z;
    }

    private static void g(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("15U");
            if (optJSONObject == null) {
                return;
            }
            boolean a2 = m.a(optJSONObject.optString("able"), true);
            int optInt = optJSONObject.optInt("yn", I);
            N = optJSONObject.optLong("sysTime", N);
            fx.a(editor, "15ua", a2);
            fx.a(editor, "15un", optInt);
            fx.a(editor, "15ust", N);
        } catch (Throwable unused) {
        }
    }

    private static void h(JSONObject jSONObject, SharedPreferences.Editor editor) {
        int parseInt;
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("17J");
            if (optJSONObject == null) {
                return;
            }
            boolean a2 = m.a(optJSONObject.optString("able"), false);
            J = a2;
            fx.a(editor, "ok9", a2);
            if (!a2) {
                return;
            }
            String optString = optJSONObject.optString("auth");
            M = optJSONObject.optString("ht");
            fx.a(editor, "ok11", M);
            m.a(optString, false);
            L = m.a(optJSONObject.optString("nr"), false);
            String optString2 = optJSONObject.optString("tm");
            if (TextUtils.isEmpty(optString2) || (parseInt = Integer.parseInt(optString2)) <= 0 || parseInt >= 20) {
                return;
            }
            K = parseInt;
            fx.a(editor, "ok10", K);
        } catch (Throwable unused) {
        }
    }

    public static boolean h() {
        return A;
    }

    public static int i() {
        return B;
    }

    public static boolean j() {
        return D;
    }

    public static boolean k() {
        return E;
    }

    public static boolean l() {
        return c;
    }

    public static boolean m() {
        return F;
    }

    public static long n() {
        return G;
    }

    public static boolean o() {
        return L;
    }

    public static boolean p() {
        return J;
    }

    public static String q() {
        return x.c(M);
    }

    public static boolean r() {
        return H && I > 0;
    }

    public static int s() {
        return I;
    }

    public static long t() {
        return N;
    }
}
