package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;
import tb.kge;

/* loaded from: classes6.dex */
public final class e implements Comparable<e>, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f16308a;
    private final Priority b;
    private final int c;

    static {
        kge.a(1025243225);
        kge.a(-1390502639);
        kge.a(415966670);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, eVar})).intValue() : a(eVar);
    }

    public e(Runnable runnable, Priority priority, int i) {
        this.f16308a = runnable;
        this.b = priority;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f16308a.run();
        }
    }

    public int a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f124a46", new Object[]{this, eVar})).intValue();
        }
        Priority priority = this.b;
        Priority priority2 = eVar.b;
        return priority == priority2 ? this.c - eVar.c : priority2.ordinal() - this.b.ordinal();
    }
}
