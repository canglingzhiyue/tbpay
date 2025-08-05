package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ic;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jb f24694a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ci(jb jbVar) {
        this.f24694a = jbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        byte[] a2 = jm.a(ai.a(this.f24694a.c(), this.f24694a.b(), this.f24694a, ic.Notification));
        context = ch.f24693a;
        if (!(context instanceof XMPushService)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("UNDatas UploadNotificationDatas failed because not xmsf");
            return;
        }
        context2 = ch.f24693a;
        ((XMPushService) context2).a(this.f24694a.c(), a2, true);
    }
}
