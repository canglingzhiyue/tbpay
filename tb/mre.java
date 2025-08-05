package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class mre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f31215a = null;
    private AtomicBoolean b = null;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mre f31216a;

        static {
            kge.a(-1633365623);
            f31216a = new mre();
        }

        public static /* synthetic */ mre a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mre) ipChange.ipc$dispatch("f07e9be", new Object[0]) : f31216a;
        }
    }

    static {
        kge.a(-797879114);
    }

    public static mre a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mre) ipChange.ipc$dispatch("f07e9be", new Object[0]) : a.a();
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            mrh.a(str, z);
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            mrh.a(str, j);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f31215a == null) {
            this.f31215a = new AtomicBoolean(mrh.b(mrg.NEW_STRATEGY_ENABLE, true));
        }
        return this.f31215a.get();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = new AtomicBoolean(mrh.b(mrg.WIFI_PRE_DOWNLOAD, true));
        }
        return this.b.get();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : mrh.b(mrg.NEW_STRATEGY_FORBID_MTL_POP_ENABLE, true);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : mrh.a(mrg.USE_MD5);
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : mrh.b(mrg.GLOBAL_POP_INTERVAL_DAY, 3L);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : mrh.b(mrg.PRE_DOWNLOAD_WINDOW_DAY, 3L);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : mrh.b(mrg.USE_ARCH, true);
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : mrh.b(mrg.UPDATE_DATA_VALID_INTERVAL, 86400L);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : mrh.b(mrg.CHECK_FLOAT_PERMISSION, true);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : mrh.b(mrg.CHECK_GP_MARKET, true);
    }
}
