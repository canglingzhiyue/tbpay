package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;

/* loaded from: classes9.dex */
public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        jb jbVar = new jb();
        jbVar.c(im.VRUpload.f538a);
        jbVar.b(b.m1665a(context).m1666a());
        jbVar.d(context.getPackageName());
        jbVar.a("data", str);
        jbVar.a(bc.a());
        ao.a(context).a((ao) jbVar, ic.Notification, (ip) null);
    }
}
