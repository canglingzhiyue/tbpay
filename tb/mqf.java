package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.d;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.qqa;

/* loaded from: classes9.dex */
public final class mqf implements qqa.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(500107145);
        kge.a(1997770974);
    }

    @Override // tb.qqa.b
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
        } else {
            q.d(page, "page");
        }
    }

    @Override // tb.qqa.b
    public void c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30961715", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.c(this, page);
    }

    @Override // tb.qqa.b
    public void e(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.a(this, page);
    }

    @Override // tb.qqa.b
    public void f(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785e98", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.b(this, page);
    }

    @Override // tb.qqa.b
    public void b(ITMSPage page) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (page.b().q().isFragmentContainer() || (dVar = (d) page.a(d.class)) == null) {
            return;
        }
        dVar.a();
    }

    @Override // tb.qqa.b
    public void d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.d(this, page);
        b(page);
    }
}
