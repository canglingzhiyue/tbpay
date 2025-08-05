package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class dqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile dqd c;
    private AtomicInteger b = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f26903a = VExecutors.newScheduledThreadPool(4, new a());

    static {
        kge.a(599057109);
    }

    public static /* synthetic */ AtomicInteger a(dqd dqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("87e753ab", new Object[]{dqdVar}) : dqdVar.b;
    }

    private dqd() {
    }

    public synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        try {
            this.f26903a.submit(runnable);
        } catch (Exception e) {
            Log.e("AsyncThreadPool", "提交到异步线程池失败" + e);
        }
    }

    public static dqd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqd) ipChange.ipc$dispatch("f03ce87", new Object[0]);
        }
        if (c == null) {
            synchronized (dqd.class) {
                if (c == null) {
                    c = new dqd();
                }
            }
        }
        return c;
    }

    /* loaded from: classes4.dex */
    public class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1116518224);
            kge.a(-364397375);
        }

        public a() {
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            int andIncrement = dqd.a(dqd.this).getAndIncrement();
            return "AsyncThreadPool:" + andIncrement;
        }
    }
}
