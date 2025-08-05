package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ax;
import com.xiaomi.push.bm;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24320a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f62a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aw(Context context, boolean z) {
        this.f24320a = context;
        this.f62a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        String d;
        String d2;
        Map<String, String> map;
        String d3;
        String str;
        String c;
        String c2;
        com.xiaomi.channel.commonutils.logger.b.m1616a("do sync info");
        jb jbVar = new jb(bc.a(), false);
        b m1665a = b.m1665a(this.f24320a);
        jbVar.c(im.SyncInfo.f538a);
        jbVar.b(m1665a.m1666a());
        jbVar.d(this.f24320a.getPackageName());
        jbVar.f678a = new HashMap();
        Map<String, String> map2 = jbVar.f678a;
        Context context = this.f24320a;
        com.xiaomi.push.k.a(map2, "app_version", com.xiaomi.push.g.m1946a(context, context.getPackageName()));
        Map<String, String> map3 = jbVar.f678a;
        Context context2 = this.f24320a;
        com.xiaomi.push.k.a(map3, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.g.a(context2, context2.getPackageName())));
        com.xiaomi.push.k.a(jbVar.f678a, "push_sdk_vn", BuildConfig.VERSION_NAME);
        com.xiaomi.push.k.a(jbVar.f678a, "push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
        com.xiaomi.push.k.a(jbVar.f678a, "token", m1665a.b());
        if (!com.xiaomi.push.j.m2123d()) {
            String a2 = bm.a(com.xiaomi.push.i.c(this.f24320a));
            String e = com.xiaomi.push.i.e(this.f24320a);
            if (!TextUtils.isEmpty(e)) {
                a2 = a2 + "," + e;
            }
            if (!TextUtils.isEmpty(a2)) {
                com.xiaomi.push.k.a(jbVar.f678a, Constants.EXTRA_KEY_IMEI_MD5, a2);
            }
        }
        ax.a(this.f24320a).a(jbVar.f678a);
        com.xiaomi.push.k.a(jbVar.f678a, Constants.EXTRA_KEY_REG_ID, m1665a.m1673c());
        com.xiaomi.push.k.a(jbVar.f678a, Constants.EXTRA_KEY_REG_SECRET, m1665a.d());
        com.xiaomi.push.k.a(jbVar.f678a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f24320a).replace(",", "-"));
        if (this.f62a) {
            Map<String, String> map4 = jbVar.f678a;
            c = av.c(MiPushClient.getAllAlias(this.f24320a));
            com.xiaomi.push.k.a(map4, Constants.EXTRA_KEY_ALIASES_MD5, c);
            Map<String, String> map5 = jbVar.f678a;
            c2 = av.c(MiPushClient.getAllTopic(this.f24320a));
            com.xiaomi.push.k.a(map5, Constants.EXTRA_KEY_TOPICS_MD5, c2);
            map = jbVar.f678a;
            d3 = av.c(MiPushClient.getAllUserAccount(this.f24320a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            Map<String, String> map6 = jbVar.f678a;
            d = av.d(MiPushClient.getAllAlias(this.f24320a));
            com.xiaomi.push.k.a(map6, Constants.EXTRA_KEY_ALIASES, d);
            Map<String, String> map7 = jbVar.f678a;
            d2 = av.d(MiPushClient.getAllTopic(this.f24320a));
            com.xiaomi.push.k.a(map7, Constants.EXTRA_KEY_TOPICS, d2);
            map = jbVar.f678a;
            d3 = av.d(MiPushClient.getAllUserAccount(this.f24320a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        com.xiaomi.push.k.a(map, str, d3);
        ao.a(this.f24320a).a((ao) jbVar, ic.Notification, false, (ip) null);
    }
}
