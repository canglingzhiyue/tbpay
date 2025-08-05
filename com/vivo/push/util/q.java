package com.vivo.push.util;

import android.content.Context;
import com.vivo.push.f.u;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.List;

/* loaded from: classes9.dex */
final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f24267a;
    final /* synthetic */ p b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar, List list) {
        this.b = pVar;
        this.f24267a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InsideNotificationItem insideNotificationItem;
        long j;
        Context context;
        InsideNotificationItem insideNotificationItem2;
        long j2;
        int i;
        NotifyArriveCallbackByUser notifyArriveCallbackByUser;
        u.a aVar;
        insideNotificationItem = this.b.b;
        if (insideNotificationItem != null) {
            ad b = ad.b();
            j = this.b.c;
            b.a("com.vivo.push.notify_key", j);
            context = this.b.f24266a;
            List list = this.f24267a;
            insideNotificationItem2 = this.b.b;
            j2 = this.b.c;
            i = this.b.e;
            notifyArriveCallbackByUser = this.b.f;
            aVar = this.b.g;
            NotifyAdapterUtil.pushNotification(context, list, insideNotificationItem2, j2, i, notifyArriveCallbackByUser, aVar);
        }
    }
}
