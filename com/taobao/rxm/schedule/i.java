package com.taobao.rxm.schedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.nmr;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<g> f19012a;
    private final int b;

    public i() {
        this(50);
    }

    public i(int i) {
        this.b = i;
        this.f19012a = new ConcurrentLinkedQueue();
    }

    public g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b23c384f", new Object[]{this});
        }
        if (!nmr.a()) {
            return null;
        }
        return this.f19012a.poll();
    }

    public boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5e8d3", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar != null) {
            gVar.a();
        }
        return nmr.a() && this.f19012a.size() < this.b && this.f19012a.offer(gVar);
    }
}
