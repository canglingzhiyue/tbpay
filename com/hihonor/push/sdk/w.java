package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ aq f7291a;
    public final /* synthetic */ Callable b;

    public w(aq aqVar, Callable callable) {
        this.f7291a = aqVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7291a.a((aq) this.b.call());
        } catch (Exception e) {
            this.f7291a.a(e);
        }
    }
}
