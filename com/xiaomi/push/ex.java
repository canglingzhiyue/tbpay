package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ex implements ev {
    private void a(Context context, String str) {
        try {
            if (!StringUtils.isEmpty(str) && context != null) {
                String[] split = str.split("/");
                if (split.length <= 0 || StringUtils.isEmpty(split[split.length - 1])) {
                    eo.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String str2 = split[split.length - 1];
                if (StringUtils.isEmpty(str2)) {
                    eo.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String decode = Uri.decode(str2);
                if (StringUtils.isEmpty(decode)) {
                    eo.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String b = en.b(decode);
                if (!StringUtils.isEmpty(b)) {
                    eo.a(context, b, 1007, "play with provider successfully");
                    return;
                }
            }
            eo.a(context, "provider", 1008, "B get a incorrect message");
        } catch (Exception e) {
            eo.a(context, "provider", 1008, "B meet a exception" + e.getMessage());
        }
    }

    private void b(Context context, er erVar) {
        String b = erVar.b();
        String d = erVar.d();
        int a2 = erVar.a();
        if (context == null || StringUtils.isEmpty(b) || StringUtils.isEmpty(d)) {
            if (StringUtils.isEmpty(d)) {
                eo.a(context, "provider", 1008, "argument error");
            } else {
                eo.a(context, d, 1008, "argument error");
            }
        } else if (!com.xiaomi.push.service.m.b(context, b)) {
            eo.a(context, d, 1003, "B is not ready");
        } else {
            eo.a(context, d, 1002, "B is ready");
            eo.a(context, d, 1004, "A is ready");
            String a3 = en.a(d);
            try {
                if (StringUtils.isEmpty(a3)) {
                    eo.a(context, d, 1008, "info is empty");
                } else if (a2 == 1 && !es.m1915a(context)) {
                    eo.a(context, d, 1008, "A not in foreground");
                } else {
                    String type = context.getContentResolver().getType(en.a(b, a3));
                    if (StringUtils.isEmpty(type) || !"success".equals(type)) {
                        eo.a(context, d, 1008, "A is fail to help B's provider");
                        return;
                    }
                    eo.a(context, d, 1005, "A is successful");
                    eo.a(context, d, 1006, "The job is finished");
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                eo.a(context, d, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, Intent intent, String str) {
        a(context, str);
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, er erVar) {
        if (erVar != null) {
            b(context, erVar);
        } else {
            eo.a(context, "provider", 1008, "A receive incorrect message");
        }
    }
}
