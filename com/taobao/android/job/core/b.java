package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class b<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final m<T, R> f12985a;

    public b(ExecutorService executorService) {
        this(executorService, null);
    }

    public b(ExecutorService executorService, p<T, R> pVar) {
        this.f12985a = new n(executorService, pVar);
    }

    public m<T, R> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("9442bcb7", new Object[]{this}) : this.f12985a;
    }
}
