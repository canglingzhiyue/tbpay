package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public final class c<TResult> extends j<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2480a;
    private final Object b = new Object();
    private d c;

    static {
        kge.a(138097342);
    }

    public c(Executor executor, d dVar) {
        this.f2480a = executor;
        this.c = dVar;
    }

    @Override // com.alibaba.android.split.core.tasks.j
    public final void a(h<TResult> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabd6ea", new Object[]{this, hVar});
        } else if (hVar.b() || !hVar.a()) {
        } else {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.f2480a.execute(new b(this, hVar));
            }
        }
    }

    public static Object a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("188de603", new Object[]{cVar}) : cVar.b;
    }

    public static d b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a613390c", new Object[]{cVar}) : cVar.c;
    }
}
