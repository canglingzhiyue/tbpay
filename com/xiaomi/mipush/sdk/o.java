package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.ah;
import com.xiaomi.push.es;
import com.xiaomi.push.eu;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class o {
    public static void a(Context context, Intent intent, Uri uri) {
        es a2;
        eu euVar;
        if (context == null) {
            return;
        }
        ao.a(context).m1655a();
        if (es.a(context.getApplicationContext()).m1916a() == null) {
            es.a(context.getApplicationContext()).a(b.m1665a(context.getApplicationContext()).m1666a(), context.getPackageName(), az.a(context.getApplicationContext()).a(ih.AwakeInfoUploadWaySwitch.a(), 0), new c());
            az.a(context).a(new q(102, "awake online config", context));
        }
        if ((context instanceof Activity) && intent != null) {
            a2 = es.a(context.getApplicationContext());
            euVar = eu.ACTIVITY;
        } else if (!(context instanceof Service) || intent == null) {
            if (uri == null || StringUtils.isEmpty(uri.toString())) {
                return;
            }
            es.a(context.getApplicationContext()).a(eu.PROVIDER, context, (Intent) null, uri.toString());
            return;
        } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            a2 = es.a(context.getApplicationContext());
            euVar = eu.SERVICE_COMPONENT;
        } else {
            a2 = es.a(context.getApplicationContext());
            euVar = eu.SERVICE_ACTION;
        }
        a2.a(euVar, context, intent, (String) null);
    }

    private static void a(Context context, jb jbVar) {
        boolean a2 = az.a(context).a(ih.AwakeAppPingSwitch.a(), false);
        int a3 = az.a(context).a(ih.AwakeAppPingFrequency.a(), 0);
        if (a3 >= 0 && a3 < 30) {
            com.xiaomi.channel.commonutils.logger.b.c("aw_ping: frquency need > 30s.");
            a3 = 30;
        }
        if (a3 < 0) {
            a2 = false;
        }
        if (!com.xiaomi.push.j.m2117a()) {
            a(context, jbVar, a2, a3);
        } else if (!a2) {
        } else {
            com.xiaomi.push.ah.a(context.getApplicationContext()).a((ah.a) new p(jbVar, context), a3);
        }
    }

    public static final <T extends jn<T, ?>> void a(Context context, T t, boolean z, int i) {
        byte[] a2 = jm.a(t);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a2);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ao.a(context).m1657a(intent);
    }

    public static void a(Context context, String str) {
        com.xiaomi.channel.commonutils.logger.b.m1616a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf(9999));
        hashMap.put("description", "ping message");
        jb jbVar = new jb();
        jbVar.b(b.m1665a(context).m1666a());
        jbVar.d(context.getPackageName());
        jbVar.c(im.AwakeAppResponse.f538a);
        jbVar.a(bc.a());
        jbVar.f678a = hashMap;
        a(context, jbVar);
    }

    public static void a(Context context, String str, int i, String str2) {
        jb jbVar = new jb();
        jbVar.b(str);
        jbVar.a(new HashMap());
        jbVar.m2129a().put("extra_aw_app_online_cmd", String.valueOf(i));
        jbVar.m2129a().put("extra_help_aw_info", str2);
        jbVar.a(bc.a());
        byte[] a2 = jm.a(jbVar);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a2);
        ao.a(context).m1657a(intent);
    }
}
