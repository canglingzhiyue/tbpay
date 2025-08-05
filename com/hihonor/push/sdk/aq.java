package com.hihonor.push.sdk;

/* loaded from: classes4.dex */
public class aq<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final y<TResult> f7269a = new y<>();

    public void a(Exception exc) {
        y<TResult> yVar = this.f7269a;
        synchronized (yVar.f7295a) {
            if (!yVar.b) {
                yVar.b = true;
                yVar.d = exc;
                yVar.f7295a.notifyAll();
                yVar.e();
            }
        }
    }

    public void a(TResult tresult) {
        y<TResult> yVar = this.f7269a;
        synchronized (yVar.f7295a) {
            if (!yVar.b) {
                yVar.b = true;
                yVar.c = tresult;
                yVar.f7295a.notifyAll();
                yVar.e();
            }
        }
    }
}
