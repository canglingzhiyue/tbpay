package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.u;
import kotlin.jvm.internal.q;
import tb.qqa;

/* loaded from: classes9.dex */
public final class muu implements qqa.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31273a = true;

    static {
        kge.a(327904342);
        kge.a(1997770974);
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
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if ((page.b().b(tle.class) != null && this.f31273a) || page.b().i() == TMSContainerType.EMBEDDED) {
            return;
        }
        if (page.b().j() == TMSSolutionType.UNIAPP && !page.b().q().isFragmentContainer()) {
            IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter != null) {
                iUserTrackerAdapter.pageAppearWithRouter(page.b().o(), page.b().b().d());
            }
        } else {
            IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter2 != null) {
                iUserTrackerAdapter2.pageAppear(page.b().o());
            }
        }
        u.e(page.b());
    }

    @Override // tb.qqa.b
    public void b(ITMSPage page) {
        IUserTrackerAdapter iUserTrackerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if ((page.b().b(tle.class) == null || !this.f31273a) && page.b().i() != TMSContainerType.EMBEDDED && (iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)) != null) {
            iUserTrackerAdapter.pageDisappear(page.b().o());
        }
        this.f31273a = false;
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
        a(page);
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
