package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.f;
import kotlin.jvm.internal.q;
import tb.qqa;

/* loaded from: classes9.dex */
public final class tli implements qqa.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1156360471);
        kge.a(1997770974);
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
    public void d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.d(this, page);
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
        if (!b_(page)) {
            return;
        }
        a_(page);
    }

    @Override // tb.qqa.b
    public void b(ITMSPage page) {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (!b_(page) || (c = page.b().b().c()) == null || q.a(c, page)) {
            return;
        }
        a_(c);
    }

    private final void a_(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fb650", new Object[]{this, iTMSPage});
            return;
        }
        int i = tlj.$EnumSwitchMapping$0[qqc.k(iTMSPage).ordinal()];
        if (i == 1) {
            Activity o = iTMSPage.b().o();
            q.b(o, "page.getInstance().activity");
            o.setRequestedOrientation(1);
        } else if (i != 2) {
        } else {
            Activity o2 = iTMSPage.b().o();
            q.b(o2, "page.getInstance().activity");
            o2.setRequestedOrientation(0);
        }
    }

    private final boolean b_(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d743f3", new Object[]{this, iTMSPage})).booleanValue();
        }
        if (iTMSPage.a(sui.class) != null || iTMSPage.b().i() == TMSContainerType.EMBEDDED) {
            return false;
        }
        return !n.as() || !f.b(iTMSPage.b().o()) || !(q.a((Object) iTMSPage.o(), (Object) "FANVAS") ^ true);
    }
}
