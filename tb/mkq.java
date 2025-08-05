package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.g;
import java.util.Map;

/* loaded from: classes.dex */
public class mkq extends mkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final mkx b;
    private final long c;
    private final long d;
    private final long e;
    private final g f;
    private final g g;
    private final int h;
    private final Map<String, g> i;

    public mkq(int i, Map<String, ?> map, mkx mkxVar, int i2, long j, long j2, long j3, g gVar, g gVar2, Map<String, g> map2) {
        super(i, map);
        this.b = mkxVar;
        this.h = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = gVar;
        this.g = gVar2;
        this.i = map2;
    }

    public mkx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mkx) ipChange.ipc$dispatch("16b97723", new Object[]{this}) : this.b;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.h;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    public g f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("36faf07f", new Object[]{this}) : this.f;
    }

    public g g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("3e60259e", new Object[]{this}) : this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.f == null || this.g == null) ? false : true;
    }

    public Map<String, g> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.i;
    }
}
