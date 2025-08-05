package android.taobao.windvane.thread;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f1698a;
    private final ExecutorService b = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d("WVExecutor"));

    static {
        kge.a(-237638989);
    }

    private b() {
        try {
            ((ThreadPoolExecutor) this.b).allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cafa665c", new Object[0]);
        }
        if (f1698a == null) {
            synchronized (b.class) {
                if (f1698a == null) {
                    f1698a = new b();
                }
            }
        }
        return f1698a;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        this.b.execute(runnable);
        m.e("WVExecutor", "runOnBackground");
    }
}
