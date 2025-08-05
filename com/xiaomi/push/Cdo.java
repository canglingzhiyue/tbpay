package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.do  reason: invalid class name */
/* loaded from: classes9.dex */
public class Cdo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24426a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f217a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cdo(Context context, long j, boolean z) {
        this.f217a = context;
        this.f24426a = j;
        this.f218a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.i(this.f217a, this.f24426a, this.f218a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("PowerStatsSP onSendMsg exception: " + e.getMessage());
        }
    }
}
