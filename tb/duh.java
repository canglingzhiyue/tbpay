package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.a;
import java.util.Map;
import mtopsdk.mtop.intf.MtopPrefetch;

/* loaded from: classes4.dex */
public class duh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String l;
    private String m;
    private int n;
    private String p;
    private int q;
    private MtopPrefetch.IPrefetchComparator r;

    /* renamed from: a  reason: collision with root package name */
    private String f26988a = "";
    private String b = "1.0";
    private boolean c = true;
    private boolean d = true;
    private Map<String, String> e = null;
    private boolean f = true;
    private String g = "";
    private String h = "";
    private int i = -1;
    private boolean j = false;
    private Map<String, String> k = null;
    private int o = 1;

    static {
        kge.a(288417457);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f26988a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public void a(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a708c98", new Object[]{this, iPrefetchComparator});
        } else {
            this.r = iPrefetchComparator;
        }
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this}) : a(null, false);
    }

    public AURANextRPCEndpoint a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("ecfe0412", new Object[]{this, bVar, new Boolean(z)}) : a(bVar, z, false);
    }

    public AURANextRPCEndpoint a(b bVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("19242e2c", new Object[]{this, bVar, new Boolean(z), new Boolean(z2)}) : new AURANextRPCEndpoint.a().d(this.g).a(this.f26988a).d(this.j).c(this.l).f(this.m).c(this.d).b(this.c).b(this.b).b(this.e).b(this.i).g(this.p).c(this.n).d(a.c()).a(this.f).a(this.k).e(this.h).a(this.o).e(!z).a(bVar).f(z2).e(this.q).a(this.r).a();
    }
}
