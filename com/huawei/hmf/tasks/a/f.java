package com.huawei.hmf.tasks.a;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import tb.cxp;
import tb.cxq;
import tb.cxr;
import tb.cxs;

/* loaded from: classes4.dex */
public final class f {

    /* loaded from: classes4.dex */
    public static class a<TResult> implements cxp, cxq<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f7310a = new CountDownLatch(1);

        @Override // tb.cxp
        public final void a(Exception exc) {
            this.f7310a.countDown();
        }

        @Override // tb.cxq
        public final void a(TResult tresult) {
            this.f7310a.countDown();
        }
    }

    public static <TResult> TResult a(cxr<TResult> cxrVar) throws ExecutionException {
        if (cxrVar.b()) {
            return cxrVar.d();
        }
        throw new ExecutionException(cxrVar.e());
    }

    public static void a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public final <TResult> cxr<TResult> a(Executor executor, final Callable<TResult> callable) {
        final cxs cxsVar = new cxs();
        try {
            executor.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        cxsVar.a((cxs) callable.call());
                    } catch (Exception e) {
                        cxsVar.a(e);
                    }
                }
            });
        } catch (Exception e) {
            cxsVar.a(e);
        }
        return cxsVar.a();
    }
}
