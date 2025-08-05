package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.ig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C1054a f24301a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ig f39a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(MiTinyDataClient.a.C1054a c1054a, ig igVar) {
        this.f24301a = c1054a;
        this.f39a = igVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24301a.f34a.add(this.f39a);
        this.f24301a.a();
    }
}
