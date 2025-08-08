package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ey implements ev {
    private void a(Service service, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (StringUtils.isEmpty(stringExtra)) {
            eo.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
            return;
        }
        String b = en.b(stringExtra);
        if (!StringUtils.isEmpty(b)) {
            eo.a(service.getApplicationContext(), b, 1007, "play with service successfully");
        } else {
            eo.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
        }
    }

    private void b(Context context, er erVar) {
        String m1914a = erVar.m1914a();
        String b = erVar.b();
        String d = erVar.d();
        int a2 = erVar.a();
        if (context == null || StringUtils.isEmpty(m1914a) || StringUtils.isEmpty(b) || StringUtils.isEmpty(d)) {
            if (StringUtils.isEmpty(d)) {
                eo.a(context, "service", 1008, "argument error");
            } else {
                eo.a(context, d, 1008, "argument error");
            }
        } else if (!com.xiaomi.push.service.m.a(context, m1914a, b)) {
            eo.a(context, d, 1003, "B is not ready");
        } else {
            eo.a(context, d, 1002, "B is ready");
            eo.a(context, d, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setAction(b);
                intent.setPackage(m1914a);
                intent.putExtra("awake_info", en.a(d));
                if (a2 == 1 && !es.m1915a(context)) {
                    eo.a(context, d, 1008, "A not in foreground");
                } else if (context.startService(intent) == null) {
                    eo.a(context, d, 1008, "A is fail to help B's service");
                } else {
                    eo.a(context, d, 1005, "A is successful");
                    eo.a(context, d, 1006, "The job is finished");
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                eo.a(context, d, 1008, "A meet a exception when help B's service");
            }
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            eo.a(context, "service", 1008, "A receive incorrect message");
        } else {
            a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, er erVar) {
        if (erVar != null) {
            b(context, erVar);
        } else {
            eo.a(context, "service", 1008, "A receive incorrect message");
        }
    }
}
