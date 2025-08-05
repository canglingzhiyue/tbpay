package tb;

import com.alibaba.analytics.core.config.f;
import com.alibaba.analytics.core.sync.b;
import com.alibaba.analytics.core.sync.e;
import com.alibaba.analytics.core.sync.h;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aor implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static aor f25482a;
    private boolean e = false;
    private boolean f = false;
    private aom b = new aom();
    private aop c = new aop();
    private aoq d = new aoq();

    static {
        kge.a(-1983741573);
        kge.a(1578308352);
    }

    public static synchronized aor a() {
        synchronized (aor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aor) ipChange.ipc$dispatch("f026b9a", new Object[0]);
            }
            if (f25482a == null) {
                f25482a = new aor();
            }
            return f25482a;
        }
    }

    private aor() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f.a().a("close_detect_ipv6", this.b);
        f.a().a("sample_ipv6", this.c);
    }

    @Override // com.alibaba.analytics.core.sync.e
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617dc0c5", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            a(bVar.a(), bVar.f2097a, bVar.c);
        }
    }

    private void a(boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27090c8d", new Object[]{this, new Boolean(z), new Integer(i), new Long(j)});
            return;
        }
        aoo.a(z, i, j);
        if (z || !this.f) {
            return;
        }
        this.e = true;
        a(false);
        aoo.a(i, j);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.e || this.b.a() || f() == null) {
            return false;
        }
        int a2 = aon.a();
        if (a2 == 2) {
            return true;
        }
        if (a2 != 3) {
            return false;
        }
        return this.c.a();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private h f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("363cdc4", new Object[]{this}) : this.d.a();
    }

    @Override // com.alibaba.analytics.core.sync.e
    public h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3a62d683", new Object[]{this});
        }
        if (!c()) {
            return null;
        }
        return f();
    }
}
