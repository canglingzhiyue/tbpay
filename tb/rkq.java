package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.DAIConfiguration;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.config.b;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.internal.util.h;
import com.ut.device.UTDevice;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class rkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rkq l;

    /* renamed from: a  reason: collision with root package name */
    private Context f33210a;
    private DAIConfiguration b;
    private String c;
    private boolean d;
    private int[] e;
    private volatile long i;
    private DAIComputeService j;
    private b k;
    private UserTrackDO m;
    private Set<Integer> f = new CopyOnWriteArraySet();
    private final Set<String> g = new CopyOnWriteArraySet();
    private final Set<String> h = new CopyOnWriteArraySet();
    private boolean n = false;
    private volatile boolean o = false;
    private volatile boolean p = false;

    static {
        kge.a(599904399);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.p;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.o;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.n;
    }

    private rkq() {
    }

    public static synchronized rkq d() {
        synchronized (rkq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rkq) ipChange.ipc$dispatch("261f06e3", new Object[0]);
            }
            if (l == null) {
                l = new rkq();
                try {
                    Class.forName("com.taobao.android.mnndebug.workbench.MNNWB");
                } catch (Throwable unused) {
                }
            }
            return l;
        }
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this});
        }
        Context context = this.f33210a;
        return context == null ? h.a() : context;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : h.a(e());
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        String str = null;
        if (rkr.a() != null) {
            str = rkr.a().getUtdid();
        }
        if (TextUtils.isEmpty(str) && e() != null) {
            try {
                str = UTDevice.getUtdid(e());
            } catch (Exception unused) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
        }
        return str;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f33210a = context;
        }
    }

    public void a(DAIConfiguration dAIConfiguration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c040b5", new Object[]{this, dAIConfiguration});
        } else {
            this.b = dAIConfiguration;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        if (!z) {
            return;
        }
        a.f("SdkContext", "DAI已降级。");
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !this.d;
    }

    public int[] i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b5c7e674", new Object[]{this});
        }
        if (!h()) {
            return null;
        }
        return this.e;
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
        } else {
            this.e = iArr;
        }
    }

    public Set<Integer> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("db14e220", new Object[]{this});
        }
        if (!h()) {
            return null;
        }
        return this.f;
    }

    public Set<String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a8bf43e1", new Object[]{this}) : this.h;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str != null && this.g.contains(str);
    }

    public void a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        if (list != null) {
            this.g.clear();
            this.g.addAll(list);
        }
        if (list2 == null) {
            return;
        }
        this.h.clear();
        this.h.addAll(list2);
    }

    public void b(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffbcb7", new Object[]{this, iArr});
        } else if (iArr != null) {
            for (int i : iArr) {
                this.f.add(Integer.valueOf(i));
            }
        }
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.i;
    }

    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa89db5", new Object[]{this, userTrackDO});
        } else {
            this.m = userTrackDO;
        }
    }

    public DAIComputeService m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIComputeService) ipChange.ipc$dispatch("d7479ceb", new Object[]{this});
        }
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = new com.tmall.android.dai.internal.compute.a();
                }
            }
        }
        return this.j;
    }

    public b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4a97c557", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    this.k = new b();
                }
            }
        }
        return this.k;
    }

    public UserTrackDO o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserTrackDO) ipChange.ipc$dispatch("a2a131ad", new Object[]{this}) : this.m;
    }
}
