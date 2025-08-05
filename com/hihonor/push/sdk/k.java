package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class k {
    public static final k e = new k();

    /* renamed from: a */
    public WeakReference<Context> f7279a;
    public volatile boolean b = false;
    public volatile boolean c = false;
    public m d;

    public /* synthetic */ void b(b bVar, boolean z) {
        this.d.a(bVar, z);
    }

    public void b(o oVar) {
        if (!this.b) {
            this.b = true;
            this.f7279a = new WeakReference<>(oVar.f7283a);
            this.c = oVar.b;
            this.d = new m(oVar.f7283a);
            if (!this.c) {
                return;
            }
            a((b<String>) null, true);
        }
    }

    public /* synthetic */ void b(Runnable runnable, b bVar) {
        if (this.b) {
            runnable.run();
        } else if (bVar == null) {
        } else {
            HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_NOT_INITIALIZED;
            bVar.onFailure(honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
        }
    }

    /* renamed from: lambda$1laY_jV-z1Lcsj-6553Soh7coZo */
    public static /* synthetic */ void m769lambda$1laY_jVz1Lcsj6553Soh7coZo(k kVar, Runnable runnable, b bVar) {
        kVar.b(runnable, bVar);
    }

    public static /* synthetic */ void lambda$4sKgp2kWi9V4pHlDLN8pVXTx6cA(k kVar, o oVar) {
        kVar.b(oVar);
    }

    public static /* synthetic */ void lambda$wRRycM5hPkEtfA48aJxhQjalkp0(k kVar, b bVar, boolean z) {
        kVar.b(bVar, z);
    }

    public Context a() {
        return this.f7279a.get();
    }

    public void a(final b<String> bVar, final boolean z) {
        a(new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$k$wRRycM5hPkEtfA48aJxhQjalkp0
            @Override // java.lang.Runnable
            public final void run() {
                k.lambda$wRRycM5hPkEtfA48aJxhQjalkp0(k.this, bVar, z);
            }
        }, bVar);
    }

    public void a(final o oVar) {
        aa.a(new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$k$4sKgp2kWi9V4pHlDLN8pVXTx6cA
            @Override // java.lang.Runnable
            public final void run() {
                k.lambda$4sKgp2kWi9V4pHlDLN8pVXTx6cA(k.this, oVar);
            }
        });
    }

    public final void a(final Runnable runnable, final b<?> bVar) {
        aa.a(new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$k$1laY_jV-z1Lcsj-6553Soh7coZo
            @Override // java.lang.Runnable
            public final void run() {
                k.m769lambda$1laY_jVz1Lcsj6553Soh7coZo(k.this, runnable, bVar);
            }
        });
    }
}
