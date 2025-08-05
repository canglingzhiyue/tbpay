package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
class p extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24333a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ jb f79a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(jb jbVar, Context context) {
        this.f79a = jbVar;
        this.f24333a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return AgooConstants.REPORT_ENCRYPT_FAIL;
    }

    @Override // java.lang.Runnable
    public void run() {
        jb jbVar = this.f79a;
        if (jbVar != null) {
            jbVar.a(bc.a());
            ao.a(this.f24333a.getApplicationContext()).a((ao) this.f79a, ic.Notification, true, (ip) null, true);
        }
    }
}
