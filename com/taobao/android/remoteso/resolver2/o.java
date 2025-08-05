package com.taobao.android.remoteso.resolver2;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.ikq;

/* loaded from: classes.dex */
public class o<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f14842a = new CountDownLatch(1);
    private volatile T b = null;

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        this.b = t;
        RSoLog.c("ResultHolder, updateResult enter");
        this.f14842a.countDown();
    }

    public T b(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e7d36638", new Object[]{this, new Integer(i)});
        }
        if (this.b != null) {
            return this.b;
        }
        RSoLog.c("ResultHolder, waitForResult2 enter, waitSeconds=" + i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14842a.await(i, TimeUnit.SECONDS)) {
            return this.b;
        }
        RSoLog.c("ResultHolder, waitForResult2 timeout, waitSeconds=" + i);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= i * 1000 * 1.5d) {
            return null;
        }
        T a2 = a(i);
        ikq.a("waitForResult2", "elapsed duration = " + elapsedRealtime2 + ", retry result = " + a2);
        return a2;
    }

    public T a(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        if (this.b != null) {
            return this.b;
        }
        if (!this.f14842a.await(i, TimeUnit.SECONDS)) {
            return null;
        }
        return this.b;
    }
}
