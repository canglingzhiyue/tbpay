package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;

/* loaded from: classes6.dex */
public class jwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29824a = 0;
    private final jvz[] b;
    private final int[] c;

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final jwd f29825a;

        static {
            kge.a(-1800725583);
            f29825a = new jwd();
        }

        public static /* synthetic */ jwd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jwd) ipChange.ipc$dispatch("f069f47", new Object[0]) : f29825a;
        }
    }

    static {
        kge.a(-212379041);
    }

    public jwd() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        availableProcessors = availableProcessors > 4 ? 4 : availableProcessors;
        availableProcessors = Build.VERSION.SDK_INT <= 23 ? (availableProcessors + 1) / 2 : availableProcessors;
        this.b = new jvz[availableProcessors <= 0 ? 1 : availableProcessors];
        this.c = new int[this.b.length];
    }

    public synchronized jvz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvz) ipChange.ipc$dispatch("f069e30", new Object[]{this});
        }
        int i = this.c[0];
        int length = this.c.length;
        int i2 = i;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.c[i4] < i2) {
                i2 = this.c[i4];
                i3 = i4;
            }
        }
        int[] iArr = this.c;
        iArr[i3] = iArr[i3] + 1;
        this.f29824a++;
        return a(i3);
    }

    public synchronized jvz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvz) ipChange.ipc$dispatch("261b8e4d", new Object[]{this});
        }
        int[] iArr = this.c;
        iArr[0] = iArr[0] + 1;
        this.f29824a++;
        return a(0);
    }

    public synchronized void a(jvz jvzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02deb6a", new Object[]{this, jvzVar});
            return;
        }
        int threadId = jvzVar.getThreadId();
        if (threadId >= 0 && threadId < this.c.length) {
            int[] iArr = this.c;
            iArr[threadId] = iArr[threadId] - 1;
            this.f29824a--;
        }
    }

    private jvz a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvz) ipChange.ipc$dispatch("e663879d", new Object[]{this, new Integer(i)});
        }
        jvz[] jvzVarArr = this.b;
        if (jvzVarArr[i] != null) {
            return jvzVarArr[i];
        }
        if (g.a()) {
            g.a("MUSThreadPool start: " + i);
        }
        jvz jvzVar = new jvz("Weex_" + i);
        jvzVar.a(i);
        this.b[i] = jvzVar;
        return jvzVar;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.b.length; i++) {
            a(i);
        }
    }

    public static jwd c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwd) ipChange.ipc$dispatch("1e69ea05", new Object[0]) : a.a();
    }
}
