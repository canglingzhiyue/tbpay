package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.ii;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iu;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;

/* loaded from: classes9.dex */
public class ae extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24305a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f40a = false;

    public ae(Context context) {
        this.f24305a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        az a2 = az.a(this.f24305a);
        iu iuVar = new iu();
        if (this.f40a) {
            iuVar.a(0);
            iuVar.b(0);
        } else {
            iuVar.a(ba.a(a2, ii.MISC_CONFIG));
            iuVar.b(ba.a(a2, ii.PLUGIN_CONFIG));
        }
        jb jbVar = new jb("-1", false);
        jbVar.c(im.DailyCheckClientConfig.f538a);
        jbVar.a(jm.a(iuVar));
        com.xiaomi.channel.commonutils.logger.b.b("OcVersionCheckJob", "-->check version: checkMessage=", iuVar);
        ao.a(this.f24305a).a((ao) jbVar, ic.Notification, (ip) null);
    }
}
