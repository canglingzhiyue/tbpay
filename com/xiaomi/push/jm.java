package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.ju;
import com.xiaomi.push.ke;

/* loaded from: classes9.dex */
public class jm {
    public static int a(Context context, iy iyVar) {
        ip m2102a = iyVar.m2102a();
        return a(context, iyVar.f665b, (m2102a == null || m2102a.m2069a() == null) ? null : m2102a.m2069a().get(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID));
    }

    private static int a(Context context, String str, String str2) {
        com.xiaomi.push.service.aw a2;
        NotificationChannel m2291a;
        if (Build.VERSION.SDK_INT < 26 || context == null || StringUtils.isEmpty(str) || (a2 = com.xiaomi.push.service.aw.a(context, str)) == null || (m2291a = a2.m2291a(a2.m2294a(str2))) == null) {
            return 0;
        }
        int i = (m2291a.getImportance() != 0 ? 1 : 2) + 0;
        int a3 = com.xiaomi.push.service.f.a(str, m2291a.getId(), 8);
        if (a3 == 1) {
            i += 4;
        } else if (a3 == 0) {
            i += 8;
        }
        int i2 = i;
        int a4 = com.xiaomi.push.service.f.a(str, m2291a.getId(), 16);
        return a4 == 1 ? i2 + 16 : a4 == 0 ? i2 + 32 : i2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static short m2179a(Context context, iy iyVar) {
        ip m2102a = iyVar.m2102a();
        return m2180a(context, iyVar.f665b, (m2102a == null || m2102a.m2069a() == null) ? null : m2102a.m2069a().get(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID));
    }

    public static short a(Context context, String str) {
        return m2180a(context, str, (String) null);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static short m2180a(Context context, String str, String str2) {
        int i = 0;
        int a2 = g.a(context, str, false).a() + 0 + (ag.b(context) ? 4 : 0) + (ag.a(context) ? 8 : 0);
        if (com.xiaomi.push.service.aw.m2289a(context)) {
            i = 16;
        }
        return (short) (a2 + i + b(context, str, str2));
    }

    public static <T extends jn<T, ?>> void a(T t, byte[] bArr) {
        if (bArr != null) {
            new jr(new ke.a(true, true, bArr.length)).a(t, bArr);
            return;
        }
        throw new js("the message byte is empty.");
    }

    public static <T extends jn<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new jt(new ju.a()).a(t);
        } catch (js e) {
            com.xiaomi.channel.commonutils.logger.b.a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }

    private static int b(Context context, String str, String str2) {
        com.xiaomi.push.service.aw a2;
        NotificationChannel m2291a;
        if (Build.VERSION.SDK_INT < 26 || context == null || StringUtils.isEmpty(str) || (a2 = com.xiaomi.push.service.aw.a(context, str)) == null || (m2291a = a2.m2291a(a2.m2294a(str2))) == null) {
            return 0;
        }
        return m2291a.getImportance() != 0 ? 32 : 64;
    }
}
