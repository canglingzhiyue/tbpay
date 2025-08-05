package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.schedule.j;
import com.taobao.rxm.schedule.k;
import com.taobao.tcommon.core.b;

/* loaded from: classes.dex */
public class nil implements nid<k> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CORE_SIZE = 3;
    public static final int DEFAULT_KEEP_ALIVE = 8;
    public static final int DEFAULT_MAX_RUNNING = 6;
    public static final int DEFAULT_PATIENCE_CAPACITY = 1500;
    public static final int DEFAULT_QUEUE_CAPACITY = 5;
    public static final int INVALID_NETWORK_RUNNING_EXPIRED = -1;
    public static final int MAX_DECODE_RUNNING = 3;
    public static final int MAX_NETWORK_RUNNING_AT_FAST = 5;
    public static final int MAX_NETWORK_RUNNING_AT_SLOW = 2;
    public static final int MIN_PATIENCE_CAPACITY = 500;
    public static final int VALID_NETWORK_RUNNING_EXPIRED = 25000;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31484a;
    private j b;
    private k l;
    private int c = 3;
    private int d = 5;
    private int e = 2;
    private int f = -1;
    private int g = 3;
    private int h = 6;
    private int i = 8;
    private int j = 5;
    private int k = 1500;
    private boolean m = false;
    private boolean n = true;

    static {
        kge.a(-1677675136);
        kge.a(-1709620101);
    }

    public nil a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("e665269a", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow maxRunning() now");
        if (this.b == null) {
            if (i >= this.g) {
                z = true;
            }
            b.b(z, "max running cannot be lower than core size");
        } else {
            if (i > 0) {
                z = true;
            }
            b.b(z, "max running must be greater than zero");
        }
        this.h = i;
        return this;
    }

    public nil b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("d4e82d1b", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow keepAlive() now");
        if (i > 0) {
            z = true;
        }
        b.b(z, "keep alive time must be greater than zero");
        this.i = i;
        return this;
    }

    public nil c(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("c36b339c", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow maxDecodeRunning() now");
        if (i <= this.h) {
            z = true;
        }
        b.b(z, "max decode running cannot be greater than max running");
        this.c = i;
        return this;
    }

    public nil d(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("b1ee3a1d", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow maxNetworkRunningAtFast() now");
        if (i <= this.h) {
            z = true;
        }
        b.b(z, "max network running at fast cannot be greater than max running");
        this.d = i;
        return this;
    }

    public nil e(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("a071409e", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow maxNetworkRunningAtSlow() now");
        if (i <= this.h) {
            z = true;
        }
        b.b(z, "max network running at slow cannot be greater than max running");
        this.e = i;
        return this;
    }

    public nil f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("8ef4471f", new Object[]{this, new Integer(i)});
        }
        b.b(!this.f31484a, "SchedulerSupplier has been built, not allow networkRunningExpired() now");
        this.f = i;
        return this;
    }

    public nil a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("1f45a9a9", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }

    public nil b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nil) ipChange.ipc$dispatch("dc8b02a", new Object[]{this, new Boolean(z)});
        }
        this.n = z;
        return this;
    }

    public synchronized k a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("b23c38cb", new Object[]{this});
        }
        if (!this.f31484a && this.l == null) {
            this.l = new nin(this.b, this.g, this.h, this.i, this.j, this.k, this.c, this.d, this.e, this.f, this.m, this.n);
            this.f31484a = true;
            return this.l;
        }
        return this.l;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f31484a;
    }
}
