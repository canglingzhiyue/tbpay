package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static lkk f30481a;
    private lcs b;
    private ljt c;

    static {
        kge.a(-278387474);
    }

    public static void a(lcv lcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28a0c99", new Object[]{lcvVar});
        } else {
            ldd.a(lcvVar);
        }
    }

    public static lkk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkk) ipChange.ipc$dispatch("f075bd2", new Object[0]);
        }
        if (f30481a == null) {
            f30481a = new ldr();
        }
        return f30481a;
    }

    private lcu(a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a(a.a(aVar), a.b(aVar));
        ldf.d("InfoFlowEngine", "InfoFlowEngine init use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private void a(ljr ljrVar, ljv ljvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52285c", new Object[]{this, ljrVar, ljvVar});
            return;
        }
        this.b = new lcs(ljrVar, ljvVar);
        this.c = new lcw(this.b);
    }

    public ljt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljt) ipChange.ipc$dispatch("16b8fe87", new Object[]{this}) : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b.b();
        ldf.d("InfoFlowEngine", "InfoFlowEngine destroy use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ljr f30482a;
        private ljv b;

        static {
            kge.a(-1958072891);
        }

        public static /* synthetic */ ljr a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ljr) ipChange.ipc$dispatch("20dd3dd5", new Object[]{aVar}) : aVar.f30482a;
        }

        public static /* synthetic */ ljv b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ljv) ipChange.ipc$dispatch("a762f8f0", new Object[]{aVar}) : aVar.b;
        }

        public a(ljr ljrVar) {
            this.f30482a = ljrVar;
        }

        public lcu a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lcu) ipChange.ipc$dispatch("f073f00", new Object[]{this}) : new lcu(this);
        }

        public a a(ljv ljvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c388beeb", new Object[]{this, ljvVar});
            }
            this.b = ljvVar;
            return this;
        }
    }
}
