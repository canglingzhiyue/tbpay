package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.e;
import tb.gsl;

/* loaded from: classes.dex */
public class c<T, R> implements a<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f12986a = "c";
    private final m<T, R> b;

    public c(b<T, R> bVar) {
        this.b = bVar.a();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.b.toString();
    }

    @Override // com.taobao.android.job.core.a
    public e<T, R> a(String str, com.taobao.android.job.core.task.g<T, R> gVar, com.taobao.android.job.core.task.f<T, R> fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a878fb8", new Object[]{this, str, gVar, fVar}) : a(str, gVar, fVar, null);
    }

    @Override // com.taobao.android.job.core.a
    public e<T, R> a(String str, com.taobao.android.job.core.task.g<T, R> gVar, com.taobao.android.job.core.task.f<T, R> fVar, TaskDeffer<T, R> taskDeffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("fe77b209", new Object[]{this, str, gVar, fVar, taskDeffer}) : new e.a(str, this.b, gVar).a(fVar).a(taskDeffer).a();
    }

    @Override // com.taobao.android.job.core.a
    public com.taobao.android.job.core.task.d a(l lVar, e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.d) ipChange.ipc$dispatch("39116eb1", new Object[]{this, lVar, eVar});
        }
        gsl.a(f12986a, "schedule stage '%s' with policy", eVar.a());
        return eVar.a(lVar);
    }
}
