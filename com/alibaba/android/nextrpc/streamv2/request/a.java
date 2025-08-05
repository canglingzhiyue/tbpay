package com.alibaba.android.nextrpc.streamv2.request;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/FinishResult;", "", "isSuccess", "", "errorType", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "(ZLcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;Lcom/alibaba/android/nextrpc/streamv2/request/Request;)V", "getErrorType", "()Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;", "setErrorType", "(Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;)V", "()Z", "setSuccess", "(Z)V", "getRequest", "()Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "setRequest", "(Lcom/alibaba/android/nextrpc/streamv2/request/Request;)V", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2400a;
    private FinishErrorType b;
    private b c;

    public a(boolean z, FinishErrorType errorType, b request) {
        q.d(errorType, "errorType");
        q.d(request, "request");
        this.f2400a = z;
        this.b = errorType;
        this.c = request;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2400a;
    }

    public final FinishErrorType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FinishErrorType) ipChange.ipc$dispatch("1ccb7982", new Object[]{this}) : this.b;
    }
}
