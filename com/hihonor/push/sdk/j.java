package com.hihonor.push.sdk;

/* loaded from: classes4.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f7278a;
    public final /* synthetic */ l b;

    public j(l lVar, y yVar) {
        this.b = lVar;
        this.f7278a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            an<TResult> anVar = this.b.f7280a;
            if (anVar != 0) {
                anVar.a(this.f7278a);
            }
        }
    }
}
