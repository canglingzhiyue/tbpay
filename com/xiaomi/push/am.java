package com.xiaomi.push;

import com.xiaomi.push.ak;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.b f24353a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ak f100a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(ak akVar, ak.b bVar) {
        this.f100a = akVar;
        this.f24353a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100a.a(this.f24353a);
    }
}
