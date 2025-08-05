package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class df implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24418a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ long f204a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f205a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f206a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f207a;
    final /* synthetic */ int b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ long f208b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ String f209b;
    final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public df(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        this.f205a = context;
        this.f206a = str;
        this.f207a = z;
        this.f204a = j;
        this.f24418a = i;
        this.f208b = j2;
        this.b = i2;
        this.f209b = str2;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            de.c(this.f205a, this.f206a, this.f207a, this.f204a, this.f24418a, this.f208b, this.b, this.f209b, this.c);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
        }
    }
}
