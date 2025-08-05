package com.taobao.themis.taobao.container.fragment;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.container.app.page.e;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.j;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqb;
import tb.qqc;
import tb.suc;
import tb.suj;
import tb.xla;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\rH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSFragmentPageManager;", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "mFragment", "Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;", "mPageStackStatusCallback", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;)V", "mFragmentManager", "Lcom/taobao/themis/container/app/page/TMSHomeFragmentManager;", "mPageStack", "Ljava/util/Deque;", "Lcom/taobao/themis/kernel/page/ITMSPage;", "destroy", "", "exitAllPage", "getAlivePageCount", "", "getPageByIndex", "index", "getPageIndex", "page", "getTopPage", "innerPopPage", "", "withExitAnim", "popPage", "autoExit", m.EXTRA_POP_TO, com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "replace", "resetTo", "Companion", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b implements qqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<ITMSPage> f22830a;
    private final e b;
    private final f c;
    private final TMSTBHomeFragment d;
    private final qqb.b e;

    static {
        kge.a(-2054498598);
        kge.a(-1259977847);
        Companion = new a(null);
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

    public b(f instance, TMSTBHomeFragment mFragment, qqb.b mPageStackStatusCallback) {
        q.d(instance, "instance");
        q.d(mFragment, "mFragment");
        q.d(mPageStackStatusCallback, "mPageStackStatusCallback");
        this.c = instance;
        this.d = mFragment;
        this.e = mPageStackStatusCallback;
        this.f22830a = new ArrayDeque();
        Activity o = this.c.o();
        if (o == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        int i = R.id.tms_fragment_container;
        FragmentManager fragmentManager = this.d.getFragmentManager();
        q.b(fragmentManager, "mFragment.fragmentManager");
        this.b = new e((FragmentActivity) o, i, fragmentManager);
    }

    @Override // tb.qqb
    public boolean a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        d.a("TMSFragmentPageManager#pushPage", new Pair("pageUrl", page.e()), (Pair) null, 4, (Object) null);
        ITMSPage c = c();
        this.f22830a.push(page);
        if (qqc.a(page)) {
            if (!n.bV()) {
                Object b = page.b().b(suc.class);
                if (!(b instanceof xla)) {
                    b = null;
                }
                xla xlaVar = (xla) b;
                if (xlaVar != null) {
                    xlaVar.a(page);
                }
            }
            this.d.setPage(page);
        } else {
            if (c != null && qqc.a(c)) {
                c.j();
                c.q();
            }
            TMSBaseFragment g = this.b.g();
            g.setPage(page);
            this.b.a(page, g, true);
        }
        d.a("TMSFragmentPageManager#pushPage");
        return true;
    }

    @Override // tb.qqb
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.f22830a.size() > 1) {
            return b(true);
        }
        if (!z) {
            return false;
        }
        this.e.a();
        return true;
    }

    private final boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ITMSPage peek = this.f22830a.peek();
        if (peek == null) {
            return false;
        }
        j jVar = (j) peek.a(j.class);
        if (jVar != null) {
            jVar.b();
        }
        this.b.a(peek, z);
        this.f22830a.poll();
        return true;
    }

    @Override // tb.qqb
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            TMSLogger.d("TMSFragmentPageManager", "popTo, index must be greater than 0");
            return false;
        } else if (this.f22830a.size() - 1 == i) {
            TMSLogger.d("TMSFragmentPageManager", "popTo, index must be less than page stack size");
            return false;
        } else {
            b(true);
            while (this.f22830a.size() - 1 > i) {
                b(false);
            }
            return true;
        }
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
        return p.b(this.f22830a, page);
    }

    @Override // tb.qqb
    public ITMSPage c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("bc21a1d7", new Object[]{this});
        }
        ITMSPage peek = this.f22830a.peek();
        if (peek == null) {
            return null;
        }
        suj sujVar = (suj) peek.a(suj.class);
        return sujVar != null ? sujVar.b() : peek;
    }

    @Override // tb.qqb
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f22830a.size();
    }

    @Override // tb.qqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        for (ITMSPage iTMSPage : this.f22830a) {
            iTMSPage.k();
        }
        this.f22830a.clear();
        this.b.h();
    }

    @Override // tb.qqb
    public ITMSPage b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("273d8707", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.f22830a.size()) {
            Iterator<ITMSPage> descendingIterator = this.f22830a.descendingIterator();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSFragmentPageManager$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(382171554);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
