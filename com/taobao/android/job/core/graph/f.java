package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class f<T, R> extends h<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public f(d<T, R> dVar) {
        super(dVar);
    }

    @Override // com.taobao.android.job.core.graph.h
    public void a(i<T, R> iVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f9d35c", new Object[]{this, iVar});
            return;
        }
        for (List<List<Node<T, R>>> list : b(this.f12990a)) {
            iVar.a(i);
            a(list, iVar);
            i++;
        }
    }
}
