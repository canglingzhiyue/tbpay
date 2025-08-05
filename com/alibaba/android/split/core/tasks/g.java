package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public final class g<TResult> extends j<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2482a;
    private final Object b = new Object();
    private e<? super TResult> c;

    static {
        kge.a(1272567648);
    }

    public g(Executor executor, e<? super TResult> eVar) {
        this.f2482a = executor;
        this.c = eVar;
    }

    @Override // com.alibaba.android.split.core.tasks.j
    public final void a(h<TResult> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabd6ea", new Object[]{this, hVar});
        } else if (!hVar.b()) {
        } else {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.f2482a.execute(new f(this, hVar));
            }
        }
    }

    public static Object a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4af1bc07", new Object[]{gVar}) : gVar.b;
    }

    public static e b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("3b18f42f", new Object[]{gVar}) : gVar.c;
    }
}
