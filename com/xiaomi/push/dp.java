package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24427a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f219a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f220a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dp(Context context, long j, boolean z) {
        this.f219a = context;
        this.f24427a = j;
        this.f220a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.j(this.f219a, this.f24427a, this.f220a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
        }
    }
}
