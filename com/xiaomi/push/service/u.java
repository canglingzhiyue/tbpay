package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ali.user.mobile.register.RegistConstants;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.s;
import com.xiaomi.push.service.bf;
import java.util.Locale;

/* loaded from: classes9.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f24726a;

    /* renamed from: a  reason: collision with other field name */
    public final String f1028a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f1028a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f24726a = i;
    }

    private static String a(Context context) {
        if ("com.xiaomi.xmsf".equals(context)) {
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String m2115a = com.xiaomi.push.j.m2115a("ro.miui.region");
            return TextUtils.isEmpty(m2115a) ? com.xiaomi.push.j.m2115a("ro.product.locale.region") : m2115a;
        }
        return com.xiaomi.push.j.b();
    }

    public static boolean a() {
        try {
            return com.xiaomi.push.r.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2359a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && a();
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public bf.b a(XMPushService xMPushService) {
        bf.b bVar = new bf.b(xMPushService);
        a(bVar, xMPushService, xMPushService.m2241b(), com.taobao.android.msoa.c.TAG);
        return bVar;
    }

    public bf.b a(bf.b bVar, Context context, k kVar, String str) {
        bVar.f957a = context.getPackageName();
        bVar.f960b = this.f1028a;
        bVar.h = this.c;
        bVar.c = this.b;
        bVar.g = "5";
        bVar.d = "XMPUSH-PASS";
        bVar.f959a = false;
        s.a aVar = new s.a();
        aVar.a("sdk_ver", 48).a("cpvn", BuildConfig.VERSION_NAME).a("cpvc", Integer.valueOf((int) BuildConfig.VERSION_CODE)).a(RegistConstants.REGISTER_COUNTRY_CODE, a.a(context).b()).a("region", a.a(context).a()).a("miui_vn", com.xiaomi.push.j.c()).a("miui_vc", Integer.valueOf(com.xiaomi.push.j.a(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.push.g.a(context, "com.xiaomi.xmsf"))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(aw.m2289a(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.push.g.a(context)));
        String a2 = a(context);
        if (!TextUtils.isEmpty(a2)) {
            aVar.a("latest_country_code", a2);
        }
        String d = com.xiaomi.push.j.d();
        if (!TextUtils.isEmpty(d)) {
            aVar.a("device_ch", d);
        }
        String e = com.xiaomi.push.j.e();
        if (!TextUtils.isEmpty(e)) {
            aVar.a("device_mfr", e);
        }
        bVar.e = aVar.toString();
        String str2 = b(context) ? "1000271" : this.d;
        s.a aVar2 = new s.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a("sync", 1);
        if (m2359a(context)) {
            aVar2.a("ab", str);
        }
        bVar.f = aVar2.toString();
        bVar.f956a = kVar;
        return bVar;
    }
}
