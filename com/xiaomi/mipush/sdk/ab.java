package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C1054a f24302a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(MiTinyDataClient.a.C1054a c1054a) {
        this.f24302a = c1054a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        if (this.f24302a.f34a.size() != 0) {
            this.f24302a.b();
            return;
        }
        scheduledFuture = this.f24302a.f35a;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture2 = this.f24302a.f35a;
        scheduledFuture2.cancel(false);
        this.f24302a.f35a = null;
    }
}
