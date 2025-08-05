package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public final class p<TResult> extends j<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2490a;
    private final Object b = new Object();
    private q<TResult> c;

    static {
        kge.a(-463953703);
    }

    public p(Executor executor, q<TResult> qVar) {
        this.f2490a = executor;
        this.c = qVar;
    }

    @Override // com.alibaba.android.split.core.tasks.j
    public final void a(h<TResult> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabd6ea", new Object[]{this, hVar});
        } else if (!hVar.a()) {
        } else {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.f2490a.execute(new o(this, hVar));
            }
        }
    }

    public static Object a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bc525d90", new Object[]{pVar}) : pVar.b;
    }

    public static q b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("4a65da6c", new Object[]{pVar}) : pVar.c;
    }
}
