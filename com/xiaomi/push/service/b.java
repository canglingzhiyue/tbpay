package com.xiaomi.push.service;

import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import java.lang.ref.WeakReference;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
public class b extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private jb f24657a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<XMPushService> f944a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f945a;

    public b(jb jbVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f945a = false;
        this.f24657a = jbVar;
        this.f944a = weakReference;
        this.f945a = z;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return AgooConstants.REPORT_ENCRYPT_FAIL;
    }

    @Override // java.lang.Runnable
    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f944a;
        if (weakReference == null || this.f24657a == null || (xMPushService = weakReference.get()) == null) {
            return;
        }
        this.f24657a.a(bc.a());
        this.f24657a.a(false);
        com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.f24657a.m2128a());
        try {
            String c = this.f24657a.c();
            xMPushService.a(c, jm.a(ai.a(c, this.f24657a.b(), this.f24657a, ic.Notification)), this.f945a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e.toString());
        }
    }
}
