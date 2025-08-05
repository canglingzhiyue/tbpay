package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24429a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f223a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f224a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dr(Context context, long j, boolean z) {
        this.f223a = context;
        this.f24429a = j;
        this.f224a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.l(this.f223a, this.f24429a, this.f224a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("PowerStatsSP onPong exception: " + e.getMessage());
        }
    }
}
