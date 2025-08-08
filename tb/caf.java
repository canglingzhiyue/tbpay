package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.utils.Monitor;
import com.alibaba.poplayer.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@Monitor.TargetClass
/* loaded from: classes.dex */
public class caf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean b;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f26221a;
    private volatile String c;
    private volatile String d;
    @Monitor.TargetField(name = "page")
    private volatile String e;
    @Monitor.TargetField(name = b.MONITOR_NATIVE_URL)
    private volatile String f;
    @Monitor.TargetField(name = b.MONITOR_PAGE_FRAGMENT)
    private volatile String g;
    private final Map<String, String> h = new ConcurrentHashMap();
    private volatile boolean i = false;
    private volatile long j = 0;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final caf f26222a;

        static {
            kge.a(-113356221);
            f26222a = new caf();
        }

        public static /* synthetic */ caf a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (caf) ipChange.ipc$dispatch("f031e56", new Object[0]) : f26222a;
        }
    }

    public static caf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (caf) ipChange.ipc$dispatch("f031e56", new Object[0]) : a.a();
    }

    static {
        kge.a(-91780752);
        b = new AtomicBoolean(true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8223ba", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        this.c = str;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.i = z;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            this.h.put(str, str2);
        }
        this.j = SystemClock.elapsedRealtime();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f26221a = b.compareAndSet(true, false);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.g;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : StringUtils.isEmpty(str) ? "" : this.h.get(str);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h.remove(str);
        }
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.j;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f26221a;
    }
}
