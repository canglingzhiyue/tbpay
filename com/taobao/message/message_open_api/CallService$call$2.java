package com.taobao.message.message_open_api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "errorMsg", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CallService$call$2 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IObserver $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallService$call$2(IObserver iObserver) {
        super(1);
        this.$observer = iObserver;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, errorMsg});
            return;
        }
        q.c(errorMsg, "errorMsg");
        this.$observer.onError(new RuntimeException(errorMsg));
        TLog.loge("CallService", errorMsg);
    }
}
