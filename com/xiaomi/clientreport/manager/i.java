package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24286a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ bo f21a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a aVar, bo boVar) {
        this.f24286a = aVar;
        this.f21a = boVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21a.run();
    }
}
