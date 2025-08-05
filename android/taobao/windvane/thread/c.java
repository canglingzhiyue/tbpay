package android.taobao.windvane.thread;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f1699a;
    private static ExecutorService b;
    private static c c;
    private a d = null;

    /* loaded from: classes2.dex */
    public static class a {
        static {
            kge.a(1724974825);
        }
    }

    static {
        kge.a(-1430242822);
        b = null;
        c = null;
        f1699a = 4096;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cafa667b", new Object[0]);
        }
        if (c == null) {
            c = new c();
        }
        return c;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (b == null) {
            b = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d("WVFixedThreadPool"));
            try {
                ((ThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (runnable == null) {
            m.d("WVThreadPool", "executeSingle is null.");
        } else {
            b.execute(runnable);
        }
    }
}
