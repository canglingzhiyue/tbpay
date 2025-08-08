package com.xiaomi.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.util.Map;

/* loaded from: classes9.dex */
public class ax implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ax f24362a;

    /* renamed from: a  reason: collision with other field name */
    private int f121a = aw.f24361a;

    /* renamed from: a  reason: collision with other field name */
    private ar f122a;

    private ax(Context context) {
        this.f122a = aw.a(context);
        com.xiaomi.channel.commonutils.logger.b.m1616a("create id manager is: " + this.f121a);
    }

    public static ax a(Context context) {
        if (f24362a == null) {
            synchronized (ax.class) {
                if (f24362a == null) {
                    f24362a = new ax(context.getApplicationContext());
                }
            }
        }
        return f24362a;
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo1730a() {
        return a(this.f122a.mo1730a());
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public void mo1730a() {
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String b = b();
        if (!StringUtils.isEmpty(b)) {
            map.put("udid", b);
        }
        String mo1730a = mo1730a();
        if (!StringUtils.isEmpty(mo1730a)) {
            map.put("oaid", mo1730a);
        }
        String c = c();
        if (!StringUtils.isEmpty(c)) {
            map.put("vaid", c);
        }
        String d = d();
        if (!StringUtils.isEmpty(d)) {
            map.put("aaid", d);
        }
        map.put("oaid_type", String.valueOf(this.f121a));
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public boolean mo1730a() {
        return this.f122a.a();
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }
}
