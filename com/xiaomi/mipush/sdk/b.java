package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.taobao.weex.common.WXConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f24321a;

    /* renamed from: a  reason: collision with other field name */
    private Context f63a;

    /* renamed from: a  reason: collision with other field name */
    private a f64a;

    /* renamed from: a  reason: collision with other field name */
    String f65a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, a> f66a;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with other field name */
        private Context f67a;

        /* renamed from: a  reason: collision with other field name */
        public String f68a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;

        /* renamed from: a  reason: collision with other field name */
        public boolean f69a = true;

        /* renamed from: b  reason: collision with other field name */
        public boolean f70b = false;

        /* renamed from: a  reason: collision with root package name */
        public int f24322a = 1;

        public a(Context context) {
            this.f67a = context;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f68a = jSONObject.getString("appId");
                aVar.b = jSONObject.getString("appToken");
                aVar.c = jSONObject.getString("regId");
                aVar.d = jSONObject.getString("regSec");
                aVar.f = jSONObject.getString(WXConfig.devId);
                aVar.e = jSONObject.getString("vName");
                aVar.f69a = jSONObject.getBoolean("valid");
                aVar.f70b = jSONObject.getBoolean("paused");
                aVar.f24322a = jSONObject.getInt("envType");
                aVar.g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        private String a() {
            Context context = this.f67a;
            return com.xiaomi.push.g.m1946a(context, context.getPackageName());
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f68a);
                jSONObject.put("appToken", aVar.b);
                jSONObject.put("regId", aVar.c);
                jSONObject.put("regSec", aVar.d);
                jSONObject.put(WXConfig.devId, aVar.f);
                jSONObject.put("vName", aVar.e);
                jSONObject.put("valid", aVar.f69a);
                jSONObject.put("paused", aVar.f70b);
                jSONObject.put("envType", aVar.f24322a);
                jSONObject.put("regResource", aVar.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m1678a() {
            b.a(this.f67a).edit().clear().commit();
            this.f68a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
            this.f69a = false;
            this.f70b = false;
            this.h = null;
            this.f24322a = 1;
        }

        public void a(int i) {
            this.f24322a = i;
        }

        public void a(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.f = com.xiaomi.push.i.h(this.f67a);
            this.e = a();
            this.f69a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f68a = str;
            this.b = str2;
            this.g = str3;
            SharedPreferences.Editor edit = b.a(this.f67a).edit();
            edit.putString("appId", this.f68a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void a(boolean z) {
            this.f70b = z;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m1679a() {
            return m1680a(this.f68a, this.b);
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m1680a(String str, String str2) {
            boolean equals = StringUtils.equals(this.f68a, str);
            boolean equals2 = StringUtils.equals(this.b, str2);
            boolean z = !StringUtils.isEmpty(this.c);
            boolean z2 = !StringUtils.isEmpty(this.d);
            boolean z3 = StringUtils.isEmpty(com.xiaomi.push.i.b(this.f67a)) || StringUtils.equals(this.f, com.xiaomi.push.i.h(this.f67a)) || StringUtils.equals(this.f, com.xiaomi.push.i.g(this.f67a));
            boolean z4 = equals && equals2 && z && z2 && z3;
            if (!z4) {
                com.xiaomi.channel.commonutils.logger.b.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
            }
            return z4;
        }

        public void b() {
            this.f69a = false;
            b.a(this.f67a).edit().putBoolean("valid", this.f69a).commit();
        }

        public void b(String str, String str2, String str3) {
            this.c = str;
            this.d = str2;
            this.f = com.xiaomi.push.i.h(this.f67a);
            this.e = a();
            this.f69a = true;
            this.h = str3;
            SharedPreferences.Editor edit = b.a(this.f67a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString(WXConfig.devId, this.f);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        public void c(String str, String str2, String str3) {
            this.f68a = str;
            this.b = str2;
            this.g = str3;
        }
    }

    private b(Context context) {
        this.f63a = context;
        c();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static b m1665a(Context context) {
        if (f24321a == null) {
            synchronized (b.class) {
                if (f24321a == null) {
                    f24321a = new b(context);
                }
            }
        }
        return f24321a;
    }

    private void c() {
        this.f64a = new a(this.f63a);
        this.f66a = new HashMap();
        SharedPreferences a2 = a(this.f63a);
        this.f64a.f68a = a2.getString("appId", null);
        this.f64a.b = a2.getString("appToken", null);
        this.f64a.c = a2.getString("regId", null);
        this.f64a.d = a2.getString("regSec", null);
        this.f64a.f = a2.getString(WXConfig.devId, null);
        if (!StringUtils.isEmpty(this.f64a.f) && com.xiaomi.push.i.a(this.f64a.f)) {
            this.f64a.f = com.xiaomi.push.i.h(this.f63a);
            a2.edit().putString(WXConfig.devId, this.f64a.f).commit();
        }
        this.f64a.e = a2.getString("vName", null);
        this.f64a.f69a = a2.getBoolean("valid", true);
        this.f64a.f70b = a2.getBoolean("paused", false);
        this.f64a.f24322a = a2.getInt("envType", 1);
        this.f64a.g = a2.getString("regResource", null);
        this.f64a.h = a2.getString("appRegion", null);
    }

    public int a() {
        return this.f64a.f24322a;
    }

    public a a(String str) {
        if (this.f66a.containsKey(str)) {
            return this.f66a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a2 = a(this.f63a);
        if (!a2.contains(str2)) {
            return null;
        }
        a a3 = a.a(this.f63a, a2.getString(str2, ""));
        this.f66a.put(str2, a3);
        return a3;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1666a() {
        return this.f64a.f68a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1667a() {
        this.f64a.m1678a();
    }

    public void a(int i) {
        this.f64a.a(i);
        a(this.f63a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1668a(String str) {
        SharedPreferences.Editor edit = a(this.f63a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f64a.e = str;
    }

    public void a(String str, a aVar) {
        this.f66a.put(str, aVar);
        String a2 = a.a(aVar);
        a(this.f63a).edit().putString("hybrid_app_info_" + str, a2).commit();
    }

    public void a(String str, String str2, String str3) {
        this.f64a.a(str, str2, str3);
    }

    public void a(boolean z) {
        this.f64a.a(z);
        a(this.f63a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1669a() {
        Context context = this.f63a;
        return !StringUtils.equals(com.xiaomi.push.g.m1946a(context, context.getPackageName()), this.f64a.e);
    }

    public boolean a(String str, String str2) {
        return this.f64a.m1680a(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1670a(String str, String str2, String str3) {
        a a2 = a(str3);
        return a2 != null && StringUtils.equals(str, a2.f68a) && StringUtils.equals(str2, a2.b);
    }

    public String b() {
        return this.f64a.b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1671b() {
        this.f64a.b();
    }

    public void b(String str) {
        this.f66a.remove(str);
        a(this.f63a).edit().remove("hybrid_app_info_" + str).commit();
    }

    public void b(String str, String str2, String str3) {
        this.f64a.b(str, str2, str3);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1672b() {
        if (!this.f64a.m1679a()) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Don't send message before initialization succeeded!");
            return false;
        }
        return true;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m1673c() {
        return this.f64a.c;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m1674c() {
        return this.f64a.m1679a();
    }

    public String d() {
        return this.f64a.d;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m1675d() {
        return !StringUtils.isEmpty(this.f64a.f68a) && !StringUtils.isEmpty(this.f64a.b) && !StringUtils.isEmpty(this.f64a.c) && !StringUtils.isEmpty(this.f64a.d);
    }

    public String e() {
        return this.f64a.g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m1676e() {
        return this.f64a.f70b;
    }

    public String f() {
        return this.f64a.h;
    }

    /* renamed from: f  reason: collision with other method in class */
    public boolean m1677f() {
        return !this.f64a.f69a;
    }
}
