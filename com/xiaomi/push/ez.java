package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ez implements ev {
    private void a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (StringUtils.isEmpty(stringExtra)) {
                eo.a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (StringUtils.isEmpty(stringExtra2)) {
                eo.a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
            } else {
                String b = en.b(stringExtra2);
                if (!StringUtils.isEmpty(b)) {
                    eo.a(service.getApplicationContext(), b, 1007, "old version message ");
                } else {
                    eo.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
                }
            }
        }
    }

    private void a(Context context, String str, String str2, String str3) {
        if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            if (StringUtils.isEmpty(str3)) {
                eo.a(context, "service", 1008, "argument error");
            } else {
                eo.a(context, str3, 1008, "argument error");
            }
        } else if (!com.xiaomi.push.service.m.a(context, str)) {
            eo.a(context, str3, 1003, "B is not ready");
        } else {
            eo.a(context, str3, 1002, "B is ready");
            eo.a(context, str3, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", context.getPackageName());
                intent.putExtra("awake_info", en.a(str3));
                if (context.startService(intent) == null) {
                    eo.a(context, str3, 1008, "A is fail to help B's service");
                    return;
                }
                eo.a(context, str3, 1005, "A is successful");
                eo.a(context, str3, 1006, "The job is finished");
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                eo.a(context, str3, 1008, "A meet a exception when help B's service");
            }
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            return;
        }
        a((Service) context, intent);
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, er erVar) {
        if (erVar != null) {
            a(context, erVar.m1914a(), erVar.c(), erVar.d());
        }
    }
}
