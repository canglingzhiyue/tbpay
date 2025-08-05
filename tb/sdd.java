package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualExecutors;
import com.taobao.android.virtual_thread.VirtualThread;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public class sdd implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f33488a;
    private final jqp b;

    static {
        kge.a(-1260224660);
        kge.a(1352893937);
    }

    public sdd(jrj jrjVar, jqp jqpVar) {
        this.f33488a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f33488a.a("useRoomVirtualThread", this.b.a())) {
            jrk.b("RoomTask", "failed");
        } else {
            aaw.a().a(new a());
            jrk.b("RoomTask", "succ");
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends aay {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f33489a = new Object();
        private final ExecutorService b = VirtualExecutors.newFixedVirtualThreadPool(2, $$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM.INSTANCE);
        private volatile Handler c;

        static {
            kge.a(-1843622655);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Thread d(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("cd59fafe", new Object[]{runnable}) : new VirtualThread(runnable, "room");
        }

        @Override // tb.aay
        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else {
                this.b.execute(runnable);
            }
        }

        @Override // tb.aay
        public void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
                return;
            }
            if (this.c == null) {
                synchronized (this.f33489a) {
                    if (this.c == null) {
                        this.c = new Handler(Looper.getMainLooper());
                    }
                }
            }
            this.c.post(runnable);
        }

        @Override // tb.aay
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
        }
    }
}
