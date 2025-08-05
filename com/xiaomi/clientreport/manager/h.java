package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24285a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ bn f20a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a aVar, bn bnVar) {
        this.f24285a = aVar;
        this.f20a = bnVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20a.run();
    }
}
