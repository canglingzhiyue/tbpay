package com.taobao.themis.kernel.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class CommonExtKt$handler$2 extends Lambda implements ruk<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CommonExtKt$handler$2 INSTANCE = new CommonExtKt$handler$2();

    public CommonExtKt$handler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Handler mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this});
        }
        HandlerThread handlerThread = new HandlerThread("tms_async_thread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
