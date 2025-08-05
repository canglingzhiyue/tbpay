package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24419a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f210a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dg(Context context, long j) {
        this.f210a = context;
        this.f24419a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            de.c(this.f210a, this.f24419a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("DisconnectStatsSP onReconnection exception: " + e.getMessage());
        }
    }
}
