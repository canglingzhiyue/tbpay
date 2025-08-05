package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public abstract class fmy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPIRE_TYPE_INFINITE = 3;
    public static final int EXPIRE_TYPE_INSTANT = 1;
    public static final int EXPIRE_TYPE_TIME = 2;
    public static final int EXPIRE_TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f28069a;
    public final long b;
    public final String c;
    public final String d;
    public int e;
    public String i;
    public final fmv j;
    public final List<fmu> k;
    public boolean f = false;
    public long h = 0;
    public int g = 3;

    static {
        kge.a(206147997);
    }

    public abstract boolean a(fmx fmxVar);

    public abstract void b(fmx fmxVar) throws Exception;

    public fmy(String str, long j, String str2, String str3, fmv fmvVar, List<fmu> list, int i) {
        this.f28069a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.j = fmvVar;
        this.k = list;
        this.e = i;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f28069a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.g == 2 && System.currentTimeMillis() > this.h;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("%s_%s_%d", this.c, this.f28069a, Long.valueOf(this.b));
    }
}
