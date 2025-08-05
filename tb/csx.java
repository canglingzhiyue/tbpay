package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class csx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private long f26500a;
    private int b;
    private long c;
    private int d;

    static {
        kge.a(-1692780169);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1572471809);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= 0 || (i = this.b) > 200) {
        } else {
            this.f26500a += 1000 / j;
            this.b = i + 1;
        }
    }

    public final void b(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (j <= 0 || (i = this.d) > 200) {
        } else {
            this.c += j;
            this.d = i + 1;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f26500a = 0L;
        this.b = 0;
        this.c = 0L;
        this.d = 0;
    }

    public final long b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        long j = this.f26500a;
        if (j != 0 && (i = this.b) != 0) {
            return j / i;
        }
        return 0L;
    }

    public final long c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        long j = this.c;
        if (j != 0 && (i = this.d) != 0) {
            return j / i;
        }
        return 0L;
    }
}
