package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.e;
import com.taobao.monitor.performance.cpu.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mko extends mkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long[] b;
    private final long[] c;
    private final g d;
    private final g e;
    private final List<g> f;
    private final List<g> g;
    private final StackTraceElement[] h;
    private final Thread i;
    private Map<String, List<StackTraceElement[]>> j;

    public mko(int i, Map<String, ?> map, long[] jArr, long[] jArr2, g gVar, g gVar2, List<g> list, List<g> list2, StackTraceElement[] stackTraceElementArr, Thread thread) {
        super(i, map);
        this.b = jArr;
        this.c = jArr2;
        this.d = gVar;
        this.e = gVar2;
        this.f = list;
        this.g = list2;
        this.h = stackTraceElementArr;
        this.i = thread;
    }

    public mko(mko mkoVar, Map<String, List<StackTraceElement[]>> map) {
        this(mkoVar.a(), mkoVar.f31065a, mkoVar.b, mkoVar.c, mkoVar.d, mkoVar.e, mkoVar.f, mkoVar.g, mkoVar.h, mkoVar.i);
        this.j = map;
    }

    public boolean b() {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        long[] jArr2 = this.c;
        return jArr2 != null && jArr2.length == 2 && (jArr = this.b) != null && jArr.length == 2;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c[0] - this.b[0];
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        if (!b()) {
            return 0.0f;
        }
        long c = c();
        long j = ((this.e.g + this.e.f) - this.d.g) - this.d.f;
        if (c > 0) {
            return (((1000.0f / ((float) e.a())) * ((float) j)) * 1.0f) / ((float) c);
        }
        return 0.0f;
    }

    public List<g> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.f;
    }

    public List<g> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.g;
    }

    public StackTraceElement[] g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StackTraceElement[]) ipChange.ipc$dispatch("9acf4a29", new Object[]{this}) : this.h;
    }

    public Thread h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("7e0910b8", new Object[]{this}) : this.i;
    }

    public Map<String, List<StackTraceElement[]>> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.j;
    }
}
