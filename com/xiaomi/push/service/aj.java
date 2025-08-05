package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.by;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class aj extends by.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24636a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ u f916a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(String str, long j, XMPushService xMPushService, u uVar) {
        super(str, j);
        this.f24636a = xMPushService;
        this.f916a = uVar;
    }

    @Override // com.xiaomi.push.service.by.a
    void a(by byVar) {
        com.xiaomi.push.ax a2 = com.xiaomi.push.ax.a(this.f24636a);
        String a3 = byVar.a("MSAID", "msaid");
        String mo1730a = a2.mo1730a();
        if (TextUtils.isEmpty(mo1730a) || TextUtils.equals(a3, mo1730a)) {
            return;
        }
        byVar.a("MSAID", "msaid", mo1730a);
        jb jbVar = new jb();
        jbVar.b(this.f916a.d);
        jbVar.c(im.ClientInfoUpdate.f538a);
        jbVar.a(bc.a());
        jbVar.a(new HashMap());
        a2.a(jbVar.m2129a());
        byte[] a4 = jm.a(ai.a(this.f24636a.getPackageName(), this.f916a.d, jbVar, ic.Notification));
        XMPushService xMPushService = this.f24636a;
        xMPushService.a(xMPushService.getPackageName(), a4, true);
    }
}
