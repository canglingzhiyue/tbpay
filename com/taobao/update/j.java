package com.taobao.update;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f23439a = new ScheduledThreadPoolExecutor(1);

    /* loaded from: classes9.dex */
    public interface c {
        void run();
    }

    static {
        kge.a(923937883);
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5da658d5", new Object[]{jVar}) : jVar.f23439a;
    }

    private j() {
    }

    public static j createInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("efe559f2", new Object[0]) : new j();
    }

    public c createTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("910e1241", new Object[]{this, runnable}) : new b(runnable);
    }

    public c createTask(Runnable runnable, TimeUnit timeUnit, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9479aacd", new Object[]{this, runnable, timeUnit, new Long(j)}) : new a(runnable, timeUnit, j);
    }

    public void shutDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
        } else {
            this.f23439a.shutdown();
        }
    }

    /* loaded from: classes9.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable b;

        static {
            kge.a(3444990);
            kge.a(383077454);
        }

        public b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.taobao.update.j.c
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.run();
            }
        }
    }

    /* loaded from: classes9.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable b;
        private TimeUnit c;
        private long d;

        static {
            kge.a(-966103889);
            kge.a(383077454);
        }

        public a(Runnable runnable, TimeUnit timeUnit, long j) {
            this.b = runnable;
            this.c = timeUnit;
            this.d = j;
        }

        @Override // com.taobao.update.j.c
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j.a(j.this).schedule(this.b, this.d, this.c);
            }
        }
    }
}
