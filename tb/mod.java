package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;

/* loaded from: classes.dex */
public class mod implements IPage.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final mou f31160a;
    private e b;
    private boolean c = true;

    public static /* synthetic */ mou a(mod modVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mou) ipChange.ipc$dispatch("8320c7d", new Object[]{modVar}) : modVar.f31160a;
    }

    public mod(mou mouVar) {
        this.f31160a = mouVar;
        m a2 = a.a(a.CUSTOM_PAGE_LIFECYCLE_DISPATCHER);
        if (a2 instanceof e) {
            this.b = (e) a2;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        mnd.w.b(this.f31160a.k());
        if (f.a(this.b)) {
            return;
        }
        this.f31160a.a(str);
        this.f31160a.c(str2);
        long t = this.f31160a.t() > 0 ? this.f31160a.t() : h.a();
        this.f31160a.a(t);
        this.b.a(this.f31160a, map, t);
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.c) {
            this.f31160a.g().a("pageStructureTime", h.a());
        }
        if (this.c) {
            new mnv(this.f31160a).a();
        }
        if (!f.a(this.b)) {
            this.b.a(this.f31160a, h.a());
        }
        mnx.a().b(this.f31160a);
        this.c = false;
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!f.a(this.b)) {
            this.b.b(this.f31160a, h.a());
        }
        mnx.a().c(this.f31160a);
        if (!d.al) {
            return;
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            com.taobao.monitor.impl.common.e.a().d().post(new Runnable() { // from class: tb.mod.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    com.taobao.monitor.procedure.a a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IPage.a j = mod.a(mod.this).j();
                    if (j == null || (a2 = j.a(mod.a(mod.this))) == null || a2.b() <= 0.7f) {
                        return;
                    }
                    m a3 = a.a(a.PAGE_RENDER_DISPATCHER);
                    if (!(a3 instanceof q)) {
                        return;
                    }
                    ((q) a3).c(mod.a(mod.this), a2.a());
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (f.a(this.b)) {
        } else {
            this.b.c(this.f31160a, h.a());
        }
    }
}
