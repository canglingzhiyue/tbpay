package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.weex.common.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.fne;
import tb.riy;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f24566a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, m> f669a = null;
    private static int b = -1;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a() {
        /*
            int r0 = com.xiaomi.push.j.f24566a
            if (r0 != 0) goto L49
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.code"
            java.lang.String r1 = m2115a(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 == 0) goto L23
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = m2115a(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r2 = 2
        L28:
            com.xiaomi.push.j.f24566a = r2     // Catch: java.lang.Throwable -> L2b
            goto L33
        L2b:
            r1 = move-exception
            java.lang.String r2 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.b.a(r2, r1)
            com.xiaomi.push.j.f24566a = r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isMIUI's value is: "
            r0.append(r1)
            int r1 = com.xiaomi.push.j.f24566a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.b(r0)
        L49:
            int r0 = com.xiaomi.push.j.f24566a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.a():int");
    }

    public static int a(Context context) {
        String m2115a = m2115a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(m2115a) || !TextUtils.isDigitsOnly(m2115a)) {
            return 0;
        }
        return Integer.parseInt(m2115a);
    }

    public static m a(String str) {
        m b2 = b(str);
        return b2 == null ? m.Global : b2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m2114a() {
        int a2 = r.a();
        return (!m2117a() || a2 <= 0) ? "" : a2 < 2 ? "alpha" : a2 < 3 ? "development" : Constants.Name.STABLE;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    public static String a(Bundle bundle) {
        String a2;
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    a2 = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    a2 = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    a2 = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    a2 = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    a2 = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    a2 = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    a2 = Arrays.toString((double[]) obj);
                } else if (obj instanceof String[]) {
                    a2 = Arrays.toString((String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    a2 = Arrays.toString((CharSequence[]) obj);
                } else if (obj instanceof Parcelable[]) {
                    a2 = Arrays.toString((Parcelable[]) obj);
                } else if (obj instanceof Bundle) {
                    a2 = a((Bundle) obj);
                } else {
                    sb.append(obj);
                    z = false;
                }
                sb.append(a2);
                z = false;
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m2115a(String str) {
        try {
            try {
                return (String) bh.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m2116a() {
        if (f669a != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        f669a = hashMap;
        hashMap.put("CN", m.China);
        f669a.put("FI", m.Europe);
        f669a.put("SE", m.Europe);
        f669a.put("NO", m.Europe);
        f669a.put("FO", m.Europe);
        f669a.put("EE", m.Europe);
        f669a.put("LV", m.Europe);
        f669a.put("LT", m.Europe);
        f669a.put("BY", m.Europe);
        f669a.put("MD", m.Europe);
        f669a.put("UA", m.Europe);
        f669a.put(AmnetMonitorLoggerListener.LogModel.PORT_LOCAL, m.Europe);
        f669a.put("CZ", m.Europe);
        f669a.put("SK", m.Europe);
        f669a.put("HU", m.Europe);
        f669a.put("DE", m.Europe);
        f669a.put("AT", m.Europe);
        f669a.put("CH", m.Europe);
        f669a.put("LI", m.Europe);
        f669a.put("GB", m.Europe);
        f669a.put("IE", m.Europe);
        f669a.put("NL", m.Europe);
        f669a.put("BE", m.Europe);
        f669a.put("LU", m.Europe);
        f669a.put("FR", m.Europe);
        f669a.put("RO", m.Europe);
        f669a.put(Constrant.ChangeType.BG, m.Europe);
        f669a.put("RS", m.Europe);
        f669a.put("MK", m.Europe);
        f669a.put("AL", m.Europe);
        f669a.put("GR", m.Europe);
        f669a.put("SI", m.Europe);
        f669a.put("HR", m.Europe);
        f669a.put("IT", m.Europe);
        f669a.put("SM", m.Europe);
        f669a.put("MT", m.Europe);
        f669a.put("ES", m.Europe);
        f669a.put("PT", m.Europe);
        f669a.put("AD", m.Europe);
        f669a.put("CY", m.Europe);
        f669a.put("DK", m.Europe);
        f669a.put(AmnetMonitorLoggerListener.LogModel.IP_SERVER, m.Europe);
        f669a.put("UK", m.Europe);
        f669a.put("EL", m.Europe);
        f669a.put("RU", m.Russia);
        f669a.put(fne.OP_IN, m.India);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2117a() {
        return a() == 1;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2118a(Context context) {
        return context != null && m2119a(context.getPackageName());
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2119a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static m b(String str) {
        m2116a();
        return f669a.get(str.toUpperCase());
    }

    public static String b() {
        String a2 = q.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m2120b(q.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("get region from system, region = " + a2);
        }
        if (TextUtils.isEmpty(a2)) {
            String country = Locale.getDefault().getCountry();
            com.xiaomi.channel.commonutils.logger.b.m1616a("locale.default.country = " + country);
            return country;
        }
        return a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    private static String m2120b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("-");
            return split.length > 0 ? split[0] : str;
        }
        return str;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m2121b() {
        return a() == 2;
    }

    public static String c() {
        return m2115a("ro.miui.ui.version.name");
    }

    /* renamed from: c  reason: collision with other method in class */
    public static boolean m2122c() {
        if (b < 0) {
            b = !m2124e() ? 1 : 0;
        }
        return b > 0;
    }

    public static String d() {
        return m2115a("ro.build.characteristics");
    }

    /* renamed from: d  reason: collision with other method in class */
    public static boolean m2123d() {
        return !m.China.name().equalsIgnoreCase(a(b()).name());
    }

    public static String e() {
        return m2115a("ro.product.manufacturer");
    }

    /* renamed from: e  reason: collision with other method in class */
    public static boolean m2124e() {
        String str = "";
        try {
            str = q.a("ro.miui.ui.version.code", str);
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(str);
    }
}
