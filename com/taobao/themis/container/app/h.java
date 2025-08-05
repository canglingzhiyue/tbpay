package com.taobao.themis.container.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.themis.container.app.page.TMSPageContainer;
import com.taobao.themis.container.app.page.c;
import com.taobao.themis.kernel.container.ui.titlebar.b;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.qqb;
import tb.rnc;
import tb.suc;
import tb.xla;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\fH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/container/app/TMSSinglePageManager;", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "mActivity", "Landroid/app/Activity;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Landroid/app/Activity;Lcom/taobao/themis/kernel/TMSInstance;)V", "getMActivity", "()Landroid/app/Activity;", "getMInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "mPageInstance", "Lcom/taobao/themis/kernel/page/ITMSPage;", "destroy", "", "exitAllPage", "getAlivePageCount", "", "getPageByIndex", "index", "getPageIndex", "page", "getTopPage", "popPage", "", "autoExit", m.EXTRA_POP_TO, com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "replace", "resetTo", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h implements qqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ITMSPage f22362a;
    private final Activity b;
    private final com.taobao.themis.kernel.f c;

    static {
        kge.a(798132590);
        kge.a(-1259977847);
    }

    @Override // tb.qqb
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.qqb
    public boolean b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f55498", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        return false;
    }

    @Override // tb.qqb
    public boolean c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30961719", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        return false;
    }

    @Override // tb.qqb
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.qqb
    public int d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb36d989", new Object[]{this, page})).intValue();
        }
        q.d(page, "page");
        return 0;
    }

    public h(Activity mActivity, com.taobao.themis.kernel.f mInstance) {
        q.d(mActivity, "mActivity");
        q.d(mInstance, "mInstance");
        this.b = mActivity;
        this.c = mInstance;
    }

    @Override // tb.qqb
    public boolean a(ITMSPage page) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        page.c().f().put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_HOME_PAGE, (String) true);
        Activity o = this.c.o();
        page.h();
        xla xlaVar = null;
        if (n.bl()) {
            cVar = new TMSPageContainer(this.b, page);
        } else {
            cVar = n.Y() ? new c(this.b) : null;
        }
        if (!n.bV()) {
            Object b = this.c.b(suc.class);
            if (b instanceof xla) {
                xlaVar = b;
            }
            xla xlaVar2 = xlaVar;
            if (xlaVar2 != null) {
                xlaVar2.a(page);
            }
        }
        page.a(new a(o, cVar));
        if (cVar != null) {
            View g = page.g();
            if (g != null) {
                cVar.a(g);
            }
            this.b.setContentView(cVar.getView());
        } else {
            this.b.setContentView(page.g());
        }
        this.f22362a = page;
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/container/app/TMSSinglePageManager$pushPage$1", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22363a;
        public final /* synthetic */ rnc b;

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            return null;
        }

        public a(Activity activity, rnc rncVar) {
            this.f22363a = activity;
            this.b = rncVar;
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : qpm.a.a(this);
        }

        @Override // tb.qpm
        public b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : this.f22363a;
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.b;
        }
    }

    @Override // tb.qqb
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return false;
        }
        this.b.finish();
        return true;
    }

    @Override // tb.qqb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.finish();
        }
    }

    @Override // tb.qqb
    public ITMSPage c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("bc21a1d7", new Object[]{this}) : this.f22362a;
    }

    @Override // tb.qqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.f22362a;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.k();
    }

    @Override // tb.qqb
    public ITMSPage b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("273d8707", new Object[]{this, new Integer(i)}) : this.f22362a;
    }
}
