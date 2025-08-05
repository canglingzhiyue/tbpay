package com.taobao.themis.container.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.j;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qpv;
import tb.qqb;
import tb.qqc;
import tb.rnc;
import tb.suc;
import tb.suj;
import tb.xla;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/themis/container/app/TMSMultiPageManager;", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mPageStackStatusCallback", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "(Landroid/support/v4/app/FragmentActivity;Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;)V", "mFragmentManager", "Lcom/taobao/themis/container/app/page/TMSFragmentManager;", "getMFragmentManager", "()Lcom/taobao/themis/container/app/page/TMSFragmentManager;", "mFragmentManager$delegate", "Lkotlin/Lazy;", "mPageStack", "Ljava/util/Deque;", "Lcom/taobao/themis/kernel/page/ITMSPage;", "destroy", "", "exitAllPage", "getAlivePageCount", "", "getPageByIndex", "index", "getPageIndex", "page", "getTopPage", "innerPopPage", "", "withExitAnim", "popPage", "autoExit", m.EXTRA_POP_TO, com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "removeAllFragmentView", "replace", "resetTo", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f implements qqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.d f22360a;
    private final Deque<ITMSPage> b;
    private final FragmentActivity c;
    private final com.taobao.themis.kernel.f d;
    private final qqb.b e;

    static {
        kge.a(-811477139);
        kge.a(-1259977847);
        Companion = new a(null);
    }

    private final com.taobao.themis.container.app.page.b e() {
        IpChange ipChange = $ipChange;
        return (com.taobao.themis.container.app.page.b) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("91d00325", new Object[]{this}) : this.f22360a.getValue());
    }

    public f(FragmentActivity mActivity, com.taobao.themis.kernel.f mInstance, qqb.b mPageStackStatusCallback) {
        q.d(mActivity, "mActivity");
        q.d(mInstance, "mInstance");
        q.d(mPageStackStatusCallback, "mPageStackStatusCallback");
        this.c = mActivity;
        this.d = mInstance;
        this.e = mPageStackStatusCallback;
        this.f22360a = kotlin.e.a(new TMSMultiPageManager$mFragmentManager$2(this));
        this.b = new ArrayDeque();
    }

    public static final /* synthetic */ FragmentActivity a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("b587f098", new Object[]{fVar}) : fVar.c;
    }

    @Override // tb.qqb
    public boolean a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        View view = null;
        try {
            com.taobao.themis.kernel.utils.d.a("TMSMultiPageManager#pushPage", (Pair) null, (Pair) null, 6, (Object) null);
            if (this.b.isEmpty()) {
                page.c().f().put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_HOME_PAGE, (String) true);
                z = true;
            }
            ITMSPage c = c();
            com.taobao.themis.kernel.extension.page.e eVar = (com.taobao.themis.kernel.extension.page.e) page.a(com.taobao.themis.kernel.extension.page.e.class);
            if (eVar != null) {
                eVar.a(c != null ? c.e() : null);
            }
            this.b.push(page);
            if (z) {
                View findViewById = this.c.findViewById(R.id.tms_fragment_container);
                q.b(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
                RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                com.taobao.themis.kernel.utils.d.a("TMSMultiPageManager#createPageContainer", (Pair) null, (Pair) null, 6, (Object) null);
                IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
                rnc createPageContainer = iContainerViewFactory != null ? iContainerViewFactory.createPageContainer(this.c, page) : null;
                com.taobao.themis.kernel.utils.d.a("TMSMultiPageManager#createPageContainer");
                if (!n.bV()) {
                    Object b2 = this.d.b(suc.class);
                    if (!(b2 instanceof xla)) {
                        b2 = null;
                    }
                    xla xlaVar = (xla) b2;
                    if (xlaVar != null) {
                        xlaVar.a(page);
                    }
                }
                page.a(new b(createPageContainer));
                page.h();
                if (createPageContainer != null) {
                    view = createPageContainer.getView();
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
                relativeLayout.addView(view);
            } else {
                if (c != null && qqc.a(c)) {
                    c.j();
                    c.q();
                }
                TMSBaseFragment g = e().g();
                g.setPage(page);
                e().a(page, g, true);
            }
            return true;
        } finally {
            com.taobao.themis.kernel.utils.d.a("TMSMultiPageManager#pushPage");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/container/app/TMSMultiPageManager$pushPage$1", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getCurrentFragmentManager", "Landroid/support/v4/app/FragmentManager;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rnc b;

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            return null;
        }

        public b(rnc rncVar) {
            this.b = rncVar;
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : f.a(f.this);
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.b;
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : f.a(f.this).getSupportFragmentManager();
        }
    }

    @Override // tb.qqb
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.b.size() > 1) {
            return b(true);
        }
        if (z) {
            this.e.a();
        }
        return false;
    }

    private final boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ITMSPage peek = this.b.peek();
        if (peek == null) {
            return false;
        }
        j jVar = (j) peek.a(j.class);
        if (jVar != null) {
            jVar.b();
        }
        if (qqc.a(peek)) {
            peek.k();
        } else {
            try {
                e().a(peek, z);
            } catch (Exception e) {
                TMSLogger.d("TMSPageManager", "innerPopPage failed, exception: " + e.getMessage());
                z2 = false;
            }
        }
        if (!z2) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "pageUrl", peek.e());
            jSONObject2.put((JSONObject) "pageStackIndex", (String) Integer.valueOf(this.b.size()));
            jSONObject2.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_HOME_PAGE, (String) Boolean.valueOf(qqc.a(peek)));
            jSONObject2.put((JSONObject) "extraParams", (String) peek.c().f());
            qpv.a(this.d, "popPage", "failed to popup", jSONObject);
            TMSLogger.d("TMSPageManager", "innerPopPage failed, args: " + jSONObject.toJSONString());
        }
        this.b.poll();
        if (d() == 0) {
            this.e.a();
        }
        return z2;
    }

    @Override // tb.qqb
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            TMSLogger.d("TMSPageManager", "popTo, index must be greater than 0");
            return false;
        } else if (this.b.size() - 1 == i) {
            TMSLogger.d("TMSPageManager", "popTo, index must be less than page stack size");
            return false;
        } else {
            b(true);
            while (this.b.size() - 1 > i) {
                b(false);
            }
            return true;
        }
    }

    @Override // tb.qqb
    public boolean b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f55498", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        ITMSPage peek = this.b.peek();
        if (peek == null) {
            return false;
        }
        if (qqc.a(peek)) {
            suj sujVar = (suj) peek.a(suj.class);
            ITMSPage b2 = sujVar != null ? sujVar.b() : null;
            if (b2 != null) {
                b2.j();
                b2.q();
            } else {
                peek.j();
                peek.q();
            }
        }
        com.taobao.themis.kernel.extension.page.e eVar = (com.taobao.themis.kernel.extension.page.e) page.a(com.taobao.themis.kernel.extension.page.e.class);
        if (eVar != null) {
            eVar.a(peek.e());
        }
        this.b.push(page);
        TMSBaseFragment g = e().g();
        g.setPage(page);
        e().a(page, g, true);
        j jVar = (j) peek.a(j.class);
        if (jVar != null) {
            jVar.b();
        }
        if (qqc.a(peek)) {
            com.taobao.themis.kernel.utils.a.a(new TMSMultiPageManager$replace$1(this, peek), 300L);
        } else {
            e().a(peek, false);
        }
        this.b.remove(peek);
        return true;
    }

    @Override // tb.qqb
    public boolean c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30961719", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        ITMSPage peek = this.b.peek();
        if (peek == null) {
            return false;
        }
        if (qqc.a(peek)) {
            suj sujVar = (suj) peek.a(suj.class);
            ITMSPage b2 = sujVar != null ? sujVar.b() : null;
            if (b2 != null) {
                b2.j();
                b2.q();
            } else {
                peek.j();
                peek.q();
            }
        }
        List<ITMSPage> g = p.g(this.b);
        if (g.isEmpty()) {
            return false;
        }
        if (qqc.a(peek)) {
            peek.j();
            peek.q();
        }
        com.taobao.themis.kernel.extension.page.e eVar = (com.taobao.themis.kernel.extension.page.e) page.a(com.taobao.themis.kernel.extension.page.e.class);
        if (eVar != null) {
            eVar.a(peek.e());
        }
        this.b.push(page);
        TMSBaseFragment g2 = e().g();
        g2.setPage(page);
        e().a(page, g2, true);
        for (ITMSPage iTMSPage : g) {
            com.taobao.themis.kernel.utils.a.a(new TMSMultiPageManager$resetTo$1(this, iTMSPage), 300L);
            this.b.remove(iTMSPage);
        }
        return true;
    }

    @Override // tb.qqb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    @Override // tb.qqb
    public int d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb36d989", new Object[]{this, page})).intValue();
        }
        q.d(page, "page");
        return p.b(this.b, page);
    }

    @Override // tb.qqb
    public ITMSPage c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("bc21a1d7", new Object[]{this});
        }
        ITMSPage peek = this.b.peek();
        if (peek == null) {
            return null;
        }
        suj sujVar = (suj) peek.a(suj.class);
        return sujVar != null ? sujVar.b() : peek;
    }

    @Override // tb.qqb
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b.size();
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View findViewById = this.c.findViewById(R.id.tms_fragment_container);
        q.b(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
        ((RelativeLayout) findViewById).removeAllViews();
    }

    @Override // tb.qqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        if (n.aV()) {
            f();
        }
        for (ITMSPage iTMSPage : this.b) {
            iTMSPage.k();
        }
        this.b.clear();
        com.taobao.themis.container.app.page.b e = e();
        if (e == null) {
            return;
        }
        e.h();
    }

    @Override // tb.qqb
    public ITMSPage b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("273d8707", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b.size()) {
            Iterator<ITMSPage> descendingIterator = this.b.descendingIterator();
            while (descendingIterator.hasNext()) {
                ITMSPage next = descendingIterator.next();
                if (i2 == i) {
                    return next;
                }
                i2++;
            }
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/TMSMultiPageManager$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1869684341);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
