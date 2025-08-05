package tb;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.themis.container.app.page.TMSPageContainer;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.qpm;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/taobao/themis/container/embed/TMSEmbedPageManager;", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mRootView", "Landroid/view/ViewGroup;", "(Lcom/taobao/themis/kernel/TMSInstance;Landroid/view/ViewGroup;)V", "hasTriggerRender", "", "mCurrentPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "destroy", "", "exitAllPage", "getAlivePageCount", "", "getPageByIndex", "index", "getPageIndex", "page", "getTopPage", "popPage", "autoExit", m.EXTRA_POP_TO, com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "replace", "resetTo", "triggerRender", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qou implements qqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ITMSPage f32998a;
    private final f b;
    private boolean c;
    private final ViewGroup d;

    static {
        kge.a(-327365755);
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
    public ITMSPage b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("273d8707", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    @Override // tb.qqb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
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
        return 0;
    }

    @Override // tb.qqb
    public int d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb36d989", new Object[]{this, page})).intValue();
        }
        q.d(page, "page");
        return -1;
    }

    public qou(f mInstance, ViewGroup viewGroup) {
        q.d(mInstance, "mInstance");
        this.b = mInstance;
        this.d = viewGroup;
    }

    public static final /* synthetic */ f a(qou qouVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9ac5159a", new Object[]{qouVar}) : qouVar.b;
    }

    @Override // tb.qqb
    public boolean a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        this.f32998a = page;
        if (this.b.j() == TMSSolutionType.UNIAPP) {
            Activity o = this.b.o();
            q.b(o, "mInstance.activity");
            TMSPageContainer tMSPageContainer = new TMSPageContainer(o, page);
            page.a(new a(tMSPageContainer));
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.addView(tMSPageContainer.getView(), 0);
            }
        } else if (n.cg()) {
            Activity o2 = this.b.o();
            q.b(o2, "mInstance.activity");
            com.taobao.themis.container.app.page.a aVar = new com.taobao.themis.container.app.page.a(o2, page);
            page.a(new b(aVar));
            ViewGroup viewGroup2 = this.d;
            if (viewGroup2 != null) {
                viewGroup2.addView(aVar.getView(), 0);
            }
        } else {
            ViewGroup viewGroup3 = this.d;
            if (viewGroup3 != null) {
                viewGroup3.addView(page.g(), 0);
            }
        }
        if (this.c) {
            page.h();
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/container/embed/TMSEmbedPageManager$pushPage$1", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getCurrentFragmentManager", "Landroid/support/v4/app/FragmentManager;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TMSPageContainer b;

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            return null;
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this});
            }
            return null;
        }

        public a(TMSPageContainer tMSPageContainer) {
            this.b = tMSPageContainer;
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : qou.a(qou.this).o();
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/container/embed/TMSEmbedPageManager$pushPage$2", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getCurrentFragmentManager", "Landroid/support/v4/app/FragmentManager;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.themis.container.app.page.a b;

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            return null;
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this});
            }
            return null;
        }

        public b(com.taobao.themis.container.app.page.a aVar) {
            this.b = aVar;
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : qou.a(qou.this).o();
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.b;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = true;
        ITMSPage iTMSPage = this.f32998a;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.h();
    }

    @Override // tb.qqb
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        swd swdVar = (swd) this.b.b(swd.class);
        if (swdVar == null) {
            return false;
        }
        swdVar.a();
        return true;
    }

    @Override // tb.qqb
    public ITMSPage c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("bc21a1d7", new Object[]{this}) : this.f32998a;
    }

    @Override // tb.qqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.f32998a;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.k();
    }
}
