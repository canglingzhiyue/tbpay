package com.hihonor.push.sdk;

/* loaded from: classes4.dex */
public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f7282a;
    public final /* synthetic */ p b;

    public n(p pVar, y yVar) {
        this.b = pVar;
        this.f7282a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            ao aoVar = this.b.f7284a;
            if (aoVar != null) {
                this.f7282a.d();
                ((ac) aoVar).f7261a.countDown();
            }
        }
    }
}
