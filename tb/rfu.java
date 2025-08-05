package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.types.PatchType;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class rfu implements Comparable<rfu>, rfv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f33124a;
    private PatchType b;
    private boolean c;
    private String d;
    private rft e;

    static {
        kge.a(-2094055776);
        kge.a(415966670);
        kge.a(-1721431588);
    }

    public PatchType getPatchType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PatchType) ipChange.ipc$dispatch("9b40726b", new Object[]{this}) : this.b;
    }

    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue() : this.c;
    }

    public String from() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dad658f", new Object[]{this}) : this.d;
    }

    public rft getRunnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rft) ipChange.ipc$dispatch("aa8840ec", new Object[]{this}) : this.e;
    }

    public rfu(PatchType patchType, rft rftVar, String str, boolean z) {
        this.e = rftVar;
        this.b = patchType;
        this.d = str;
        this.c = z;
        this.f33124a = new a(patchType);
    }

    @Override // tb.rfv
    public void syncRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa786a77", new Object[]{this});
            return;
        }
        Thread newThread = this.f33124a.newThread(this.e);
        newThread.start();
        try {
            newThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.rfv
    public void asyncRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c81376", new Object[]{this});
        } else {
            this.f33124a.newThread(this.e).start();
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfu) && this.b == ((rfu) obj).b;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        PatchType patchType = this.b;
        if (patchType == null) {
            return 0;
        }
        return patchType.hashCode();
    }

    @Override // java.lang.Comparable
    public int compareTo(rfu rfuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b75bdc9", new Object[]{this, rfuVar})).intValue() : this.b.getPriority() - rfuVar.b.getPriority();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PriorityTask{patchType=" + this.b + '}';
    }

    /* loaded from: classes9.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f33125a = new AtomicInteger();
        private PatchType b;

        static {
            kge.a(-2022049572);
            kge.a(-1938806936);
        }

        public a(PatchType patchType) {
            this.b = patchType;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.b.getKey() + "-thread-" + this.f33125a.incrementAndGet());
        }
    }
}
