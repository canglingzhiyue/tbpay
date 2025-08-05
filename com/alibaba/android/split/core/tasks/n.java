package com.alibaba.android.split.core.tasks;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.android.split.core.internal.TriggerStartFailureTask;
import com.alibaba.android.split.core.internal.TriggerStartSuccessTask;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbg;
import tb.kge;

/* loaded from: classes2.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f2488a;

    static {
        kge.a(-700802413);
        f2488a = null;
        HandlerThread a2 = jbg.a("trigger-startinstall");
        a2.start();
        f2488a = new Handler(a2.getLooper());
    }

    public static <TResult> h<TResult> a(TResult tresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("1dcc1854", new Object[]{tresult});
        }
        m mVar = new m();
        f2488a.post(new TriggerStartSuccessTask(mVar, tresult));
        return mVar.a();
    }

    public static h a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("4906763a", new Object[]{exc});
        }
        m mVar = new m();
        f2488a.post(new TriggerStartFailureTask(mVar, exc));
        return mVar.a();
    }
}
