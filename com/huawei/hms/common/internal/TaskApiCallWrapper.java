package com.huawei.hms.common.internal;

import tb.cxs;

/* loaded from: classes4.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f7404a;
    private final cxs<TResult> b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, cxs<TResult> cxsVar) {
        super(1);
        this.f7404a = taskApiCall;
        this.b = cxsVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f7404a;
    }

    public cxs<TResult> getTaskCompletionSource() {
        return this.b;
    }
}
