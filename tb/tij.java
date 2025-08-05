package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoSpanLayer;
import com.taobao.analysis.v3.o;
import com.taobao.analysis.v3.v;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class tij extends o implements tgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long r;
    private long s;

    /* renamed from: a  reason: collision with root package name */
    private static final mzh f34120a = new mzh("falcoId");
    private static final mzh o = new mzh("uid");
    private static final mzh b = new mzh("pageName");
    private static final mzh c = new mzh("pageURL");
    private static final mzg k = new mzg("touchDownT");
    private static final mzg l = new mzg("touchUpT");
    private static final mzh m = new mzh("touchDownPoint");
    private static final mzh n = new mzh("touchUpPoint");
    private static final mzh p = new mzh("rageClicksGroupId");
    private static final mzh q = new mzh("loadFalcoId");

    public static /* synthetic */ Object ipc$super(tij tijVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.analysis.v3.o
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public tij(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list) {
        super(vVar, str, str2, j, map, list, FalcoSpanLayer.TOUCH_ACTION);
        f34120a.a(this, tmt.a());
        o.a(this, tmt.b());
    }

    @Override // tb.tgx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : (String) i(f34120a.a());
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            b.a(this, str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            c.a(this, str);
        }
    }

    public void a(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l2});
            return;
        }
        this.r = k(l2);
        k.a(this, Long.valueOf(c(Long.valueOf(this.r))));
    }

    public void b(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l2});
            return;
        }
        this.s = k(l2);
        l.a(this, Long.valueOf(c(Long.valueOf(this.s))));
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        mzh mzhVar = m;
        mzhVar.a(this, f + "," + f2);
    }

    public void b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        mzh mzhVar = n;
        mzhVar.a(this, f + "," + f2);
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            p.a(this, str);
        }
    }

    @Override // tb.tgx
    public long dY_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("471eb205", new Object[]{this})).longValue() : this.r;
    }

    private long c(Long l2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7808bf9d", new Object[]{this, l2})).longValue() : k(l2) - k();
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else {
            q.a(this, str);
        }
    }
}
