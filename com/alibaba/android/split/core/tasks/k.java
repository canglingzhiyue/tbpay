package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;
import tb.kge;

/* loaded from: classes.dex */
public final class k<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f2484a = new Object();
    private Queue<j<TResult>> b;
    private boolean c;

    static {
        kge.a(-805885129);
    }

    public final void a(j<TResult> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaacbfa8", new Object[]{this, jVar});
            return;
        }
        synchronized (this.f2484a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(jVar);
        }
    }

    public final void a(h hVar) {
        j<TResult> poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabd6ea", new Object[]{this, hVar});
            return;
        }
        synchronized (this.f2484a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.f2484a) {
                        poll = this.b.poll();
                        if (poll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    poll.a(hVar);
                }
            }
        }
    }
}
