package com.hihonor.push.sdk;

/* loaded from: classes4.dex */
public class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f7287a;
    public final /* synthetic */ u b;

    public s(u uVar, y yVar) {
        this.b = uVar;
        this.f7287a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            Object obj = this.b.f7289a;
            if (obj != null) {
                this.f7287a.c();
                ((ac) obj).f7261a.countDown();
            }
        }
    }
}
