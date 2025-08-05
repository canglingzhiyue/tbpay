package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.en;
import com.xiaomi.push.es;
import com.xiaomi.push.ew;
import com.xiaomi.push.ia;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class bl implements ew {
    @Override // com.xiaomi.push.ew
    public void a(Context context, HashMap<String, String> hashMap) {
        jb jbVar = new jb();
        jbVar.b(es.a(context).m1917a());
        jbVar.d(es.a(context).b());
        jbVar.c(im.AwakeAppResponse.f538a);
        jbVar.a(bc.a());
        jbVar.f678a = hashMap;
        byte[] a2 = jm.a(ai.a(jbVar.c(), jbVar.b(), jbVar, ic.Notification));
        if (!(context instanceof XMPushService)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("MoleInfo : context is not correct in pushLayer " + jbVar.m2128a());
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("MoleInfo : send data directly in pushLayer " + jbVar.m2128a());
        ((XMPushService) context).a(context.getPackageName(), a2, true);
    }

    @Override // com.xiaomi.push.ew
    public void b(Context context, HashMap<String, String> hashMap) {
        ia a2 = ia.a(context);
        if (a2 != null) {
            a2.a("category_awake_app", "wake_up_app", 1L, en.a(hashMap));
        }
    }

    @Override // com.xiaomi.push.ew
    public void c(Context context, HashMap<String, String> hashMap) {
        com.xiaomi.channel.commonutils.logger.b.m1616a("MoleInfo：\u3000" + en.b(hashMap));
    }
}
