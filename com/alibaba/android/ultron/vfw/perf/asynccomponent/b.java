package com.alibaba.android.ultron.vfw.perf.asynccomponent;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f2721a;
    private final String b;

    static {
        kge.a(623143269);
    }

    public b(String str) {
        this.b = str;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f2721a = jqh.a(1, 1, 30L, TimeUnit.SECONDS, "UltronSerialExecutor");
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.d(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor runnable is NULL");
        } else {
            ThreadPoolExecutor threadPoolExecutor = this.f2721a;
            if (threadPoolExecutor != null) {
                try {
                    threadPoolExecutor.execute(runnable);
                    return;
                } catch (Exception unused) {
                    UnifyLog.d(PreloadAsyncComponent.TAG, "Exception when dispatchToAsyncSerialExecutor");
                    return;
                }
            }
            UnifyLog.d(PreloadAsyncComponent.TAG, this.b + " dispatchToAsyncSerialExecutor SerialExecutor is NULL");
        }
    }
}
