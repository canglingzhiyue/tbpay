package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.extension.page.ab;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.extension.page.t;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.tnz;

/* loaded from: classes9.dex */
public final class tny implements ab, s, tnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private t f34237a;
    private boolean b;
    private tnz.a c;
    private final ITMSPage d;

    static {
        kge.a(91670817);
        kge.a(1692331392);
        kge.a(1031586556);
        kge.a(-1040495982);
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public boolean a(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b947806", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        return false;
    }

    public tny(ITMSPage page) {
        q.d(page, "page");
        this.d = page;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            s.b.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        s.b.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            s.b.b(this);
        }
    }

    @Override // tb.tnz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        t tVar = this.f34237a;
        if (tVar == null) {
            return;
        }
        tVar.a(this.d, null);
    }

    @Override // tb.tnz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.tnz
    public void a(tnz.a onClose) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf97bb", new Object[]{this, onClose});
            return;
        }
        q.d(onClose, "onClose");
        this.c = onClose;
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public void a(s.c interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc10809b", new Object[]{this, interceptor});
            return;
        }
        q.d(interceptor, "interceptor");
        if (!(interceptor instanceof t)) {
            return;
        }
        this.f34237a = (t) interceptor;
        this.b = true;
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public void b(s.c interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edba26ba", new Object[]{this, interceptor});
            return;
        }
        q.d(interceptor, "interceptor");
        if (!q.a(interceptor, this.f34237a)) {
            return;
        }
        this.f34237a = null;
        this.b = false;
    }

    @Override // com.taobao.themis.kernel.extension.page.ab
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        tnz.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
