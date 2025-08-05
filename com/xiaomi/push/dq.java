package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24428a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f221a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f222a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dq(Context context, long j, boolean z) {
        this.f221a = context;
        this.f24428a = j;
        this.f222a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.k(this.f221a, this.f24428a, this.f222a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("PowerStatsSP onPing exception: " + e.getMessage());
        }
    }
}
