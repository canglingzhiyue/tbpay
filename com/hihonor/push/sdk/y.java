package com.hihonor.push.sdk;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Incorrect class signature, class is equals to this class: <TResult:Ljava/lang/Object;>Lcom/hihonor/push/sdk/y<TTResult;>; */
/* loaded from: classes4.dex */
public final class y<TResult> {
    public boolean b;
    public TResult c;
    public Exception d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7295a = new Object();
    public List<am<TResult>> e = new ArrayList();

    public final y<TResult> a(am<TResult> amVar) {
        synchronized (this.f7295a) {
            if (!this.b) {
                this.e.add(amVar);
            } else {
                amVar.a(this);
            }
        }
        return this;
    }

    public final boolean a() {
        synchronized (this.f7295a) {
        }
        return false;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f7295a) {
            if (this.b) {
                a();
                if (this.d == null) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public final TResult c() {
        TResult tresult;
        synchronized (this.f7295a) {
            if (this.d != null) {
                throw new RuntimeException(this.d);
            }
            tresult = this.c;
        }
        return tresult;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.f7295a) {
            exc = this.d;
        }
        return exc;
    }

    public final void e() {
        synchronized (this.f7295a) {
            for (am<TResult> amVar : this.e) {
                try {
                    amVar.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.e = null;
        }
    }
}
