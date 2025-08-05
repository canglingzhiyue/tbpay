package com.loc;

import com.loc.cq;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class cr extends ct {
    private static cr c = new cr(new cq.a().a("amap-global-threadPool").a());

    private cr(cq cqVar) {
        try {
            this.f7730a = new ThreadPoolExecutor(cqVar.a(), cqVar.b(), cqVar.d(), TimeUnit.SECONDS, cqVar.c(), cqVar);
            this.f7730a.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            av.b(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static cr a() {
        return c;
    }
}
