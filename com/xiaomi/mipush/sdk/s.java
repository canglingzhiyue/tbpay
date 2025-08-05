package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static volatile s f24336a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f80a;

    private s(Context context) {
        this.f80a = context.getApplicationContext();
    }

    private static s a(Context context) {
        if (f24336a == null) {
            synchronized (s.class) {
                if (f24336a == null) {
                    f24336a = new s(context);
                }
            }
        }
        return f24336a;
    }

    public static void a(Context context, iy iyVar) {
        a(context).a(iyVar, 0, true);
    }

    public static void a(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 1, z);
    }

    private void a(iy iyVar, int i, boolean z) {
        if (com.xiaomi.push.j.m2118a(this.f80a) || !com.xiaomi.push.j.m2117a() || iyVar == null || iyVar.f658a != ic.SendMessage || iyVar.m2102a() == null || !z) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("click to start activity result:" + String.valueOf(i));
        jb jbVar = new jb(iyVar.m2102a().m2068a(), false);
        jbVar.c(im.SDK_START_ACTIVITY.f538a);
        jbVar.b(iyVar.m2103a());
        jbVar.d(iyVar.f665b);
        jbVar.f678a = new HashMap();
        jbVar.f678a.put("result", String.valueOf(i));
        ao.a(this.f80a).a(jbVar, ic.Notification, false, false, null, true, iyVar.f665b, iyVar.f661a, true, false);
    }

    public static void b(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 2, z);
    }

    public static void c(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 3, z);
    }

    public static void d(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 4, z);
    }

    public static void e(Context context, iy iyVar, boolean z) {
        s a2;
        int i;
        b m1665a = b.m1665a(context);
        if (TextUtils.isEmpty(m1665a.m1673c()) || TextUtils.isEmpty(m1665a.d())) {
            a2 = a(context);
            i = 6;
        } else if (m1665a.m1677f()) {
            a2 = a(context);
            i = 7;
        } else {
            a2 = a(context);
            i = 5;
        }
        a2.a(iyVar, i, z);
    }
}
