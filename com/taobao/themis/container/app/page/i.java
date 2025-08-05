package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.extension.page.tab.TabSwitchSource;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqa;
import tb.rnc;
import tb.ruw;
import tb.suj;
import tb.thk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Q2\u00020\u0001:\u0001QB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0016JF\u0010&\u001a\u00020\u001f2<\u0010'\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u0019j\u0002` H\u0016J\b\u0010(\u001a\u00020\fH\u0016J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002J*\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0006H\u0002J\n\u00100\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u00101\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u00102\u001a\u00020\u0006H\u0016J\n\u00103\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u00105\u001a\u0004\u0018\u00010\u00032\u0006\u00106\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u000eH\u0016J\u0018\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020%H\u0002J\b\u0010?\u001a\u00020\u001fH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010A\u001a\u00020\u001fH\u0016J\b\u0010B\u001a\u00020\u001fH\u0016J\u0010\u0010C\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u0010D\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0018\u0010E\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00062\u0006\u0010F\u001a\u00020%H\u0016J\u0018\u0010G\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u001dH\u0016J\u0010\u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u001dH\u0016J\b\u0010K\u001a\u00020\u001fH\u0016J\u001a\u0010L\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0018\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u008a\u0001\u0010\u0017\u001a~\u0012:\u00128\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u0019j\u0002` 0\u0018j>\u0012:\u00128\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u0019j\u0002` `!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/taobao/themis/container/app/page/TabPageExtension;", "Lcom/taobao/themis/kernel/extension/page/tab/ITabPageExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "currentIndex", "", "mFirstPageView", "Landroid/view/View;", "mInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mInterceptClickEvent", "", "mInterceptClickListener", "Lcom/taobao/themis/kernel/extension/page/tab/TabItemClickListener;", "mNeedReplaceIndex", "mTabBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar;", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "tabItemList", "", "Lcom/taobao/themis/container/app/page/TMSPageTabItem;", "tabSwitchListeners", "Ljava/util/ArrayList;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "targetIndex", "", "fromUrl", "", "Lcom/taobao/themis/kernel/extension/page/tab/TabSwitchListener;", "Lkotlin/collections/ArrayList;", "addTabItem", "originalIndex", "tabBarItemModel", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "addTabSwitchListener", DataReceiveMonitor.CB_LISTENER, com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "copyDocumentLoadInfo", "tabItemPage", "tabPage", "createTabItemPage", "pageId", "isFirstPage", "tabItemIndex", "getCurrentSubPage", "getTabBar", "getTabBarHeight", "getTabBarView", "getTabItemIndex", "getTabItemPage", "index", "hideTabBar", "init", "tabBar", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBar;", "interceptTabBarClick", "needDestroyPage", "originPage", "targetItem", "onBindContext", "onRegister", "onUnRegister", "removeAllTabSwitchListener", "removeTabBarBadge", "removeTabItem", "replace", "model", "setTabBarBadge", "text", "setTabBarMode", "mode", "showTabBar", "switchTo", "source", "Lcom/taobao/themis/kernel/extension/page/tab/TabSwitchSource;", "swizzleTab", "originIndex", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class i implements suj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private int f22372a;
    private List<f> b;
    private final ITMSPage c;
    private int d;
    private com.taobao.themis.kernel.container.ui.titlebar.c e;
    private ArrayList<ruw<Integer, String, t>> f;
    private final AtomicBoolean g;
    private View h;
    private boolean i;
    private com.taobao.themis.kernel.extension.page.tab.b j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/container/app/page/TabPageExtension$init$1", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar$TabClickListener;", "onTabClick", "", "index", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.themis.kernel.container.ui.titlebar.c.a
        public void a(int i) {
            ITMSPage b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (!i.a(i.this)) {
                i.this.a(i, TabSwitchSource.USER_CLICK);
            } else {
                String str = null;
                f fVar = (i.c(i.this) < 0 || i.c(i.this) >= i.d(i.this).size()) ? null : (f) i.d(i.this).get(i.c(i.this));
                com.taobao.themis.kernel.extension.page.tab.b b2 = i.b(i.this);
                if (b2 == null) {
                    return;
                }
                if (fVar != null && (b = fVar.b()) != null) {
                    str = b.e();
                }
                b2.a(i, str);
            }
        }
    }

    static {
        kge.a(1378253865);
        kge.a(-969351850);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
        } else {
            q.d(page, "page");
        }
    }

    public i(ITMSPage page) {
        q.d(page, "page");
        this.c = page;
        this.f22372a = -1;
        this.b = new ArrayList();
        this.d = -1;
        this.f = new ArrayList<>();
        this.g = new AtomicBoolean(false);
        this.c.a(new qqa.b() { // from class: com.taobao.themis.container.app.page.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qqa.b
            public void e(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65d79c17", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.a(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.p();
            }

            @Override // tb.qqa.b
            public void a(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb549213", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.e(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.i();
            }

            @Override // tb.qqa.b
            public void b(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("95f55494", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.f(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.j();
            }

            @Override // tb.qqa.b
            public void f(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("785e98", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.b(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.q();
            }

            @Override // tb.qqa.b
            public void c(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("30961715", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.c(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.u();
            }

            @Override // tb.qqa.b
            public void d(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cb36d996", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                qqa.b.a.d(this, page2);
                ITMSPage b2 = i.this.b();
                if (b2 == null) {
                    return;
                }
                b2.v();
            }
        });
    }

    public static final /* synthetic */ boolean a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac03eb40", new Object[]{iVar})).booleanValue() : iVar.i;
    }

    public static final /* synthetic */ com.taobao.themis.kernel.extension.page.tab.b b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.extension.page.tab.b) ipChange.ipc$dispatch("9518c0ba", new Object[]{iVar}) : iVar.j;
    }

    public static final /* synthetic */ int c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1457031", new Object[]{iVar})).intValue() : iVar.f22372a;
    }

    public static final /* synthetic */ List d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8509e9a8", new Object[]{iVar}) : iVar.b;
    }

    public final ITMSPage d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7f0e0b36", new Object[]{this}) : this.c;
    }

    @Override // tb.suj
    public boolean a(TabBar tabBar) {
        IContainerViewFactory iContainerViewFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b86b8f1f", new Object[]{this, tabBar})).booleanValue();
        }
        q.d(tabBar, "tabBar");
        if (tabBar.getItems() != null && this.g.compareAndSet(false, true) && (iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class)) != null) {
            Activity o = this.c.b().o();
            q.b(o, "page.getInstance().activity");
            com.taobao.themis.kernel.container.ui.titlebar.c createTabBar = iContainerViewFactory.createTabBar(o, this.c);
            if (createTabBar != null) {
                this.e = createTabBar;
                com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
                if (cVar == null) {
                    q.b("mTabBar");
                }
                cVar.a(new c());
                List<TabBarItem> items = tabBar.getItems();
                q.a(items);
                for (TabBarItem tabBarItem : items) {
                    List<f> list = this.b;
                    f fVar = new f();
                    fVar.a(tabBarItem.getPageId());
                    TabBarItem tabBarItem2 = new TabBarItem();
                    tabBarItem2.setPageId(tabBarItem.getPageId());
                    tabBarItem2.setIconNormal(tabBarItem.getIconNormal());
                    tabBarItem2.setIconSelected(tabBarItem.getIconSelected());
                    tabBarItem2.setQueryPass(tabBarItem.getQueryPass());
                    t tVar = t.INSTANCE;
                    fVar.a(tabBarItem2);
                    t tVar2 = t.INSTANCE;
                    list.add(fVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // tb.suj
    public boolean a(int i, TabBarItem model) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e88f9", new Object[]{this, new Integer(i), model})).booleanValue();
        }
        q.d(model, "model");
        if (i < 0 || i >= this.b.size()) {
            return false;
        }
        TabBarItem c2 = this.b.get(i).c();
        TabBarItem tabBarItem = new TabBarItem();
        String pageId = model.getPageId();
        if (pageId == null) {
            pageId = c2 != null ? c2.getPageId() : null;
        }
        tabBarItem.setPageId(pageId);
        String iconNormal = model.getIconNormal();
        if (iconNormal == null) {
            iconNormal = c2 != null ? c2.getIconNormal() : null;
        }
        tabBarItem.setIconNormal(iconNormal);
        String iconSelected = model.getIconSelected();
        if (iconSelected == null) {
            iconSelected = c2 != null ? c2.getIconSelected() : null;
        }
        tabBarItem.setIconSelected(iconSelected);
        QueryPass queryPass = model.getQueryPass();
        tabBarItem.setQueryPass(queryPass == null ? c2 != null ? c2.getQueryPass() : null : queryPass);
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        if (!cVar.a(i, tabBarItem)) {
            return false;
        }
        this.b.get(i).a(tabBarItem);
        String pageId2 = model.getPageId();
        if (pageId2 == null || pageId2.length() == 0) {
            z = true;
        }
        if (!z) {
            this.b.get(i).a(model.getPageId());
        }
        if (i == this.f22372a) {
            ITMSPage b2 = this.b.get(i).b();
            q.a(b2);
            TabBarItem c3 = this.b.get(i).c();
            q.a(c3);
            if (a(b2, c3)) {
                this.d = i;
            }
            return true;
        }
        if (this.b.get(i).b() != null) {
            ITMSPage b3 = this.b.get(i).b();
            q.a(b3);
            TabBarItem c4 = this.b.get(i).c();
            q.a(c4);
            if (a(b3, c4)) {
                ITMSPage b4 = this.b.get(i).b();
                if (b4 != null) {
                    b4.k();
                }
                this.b.get(i).a((ITMSPage) null);
            }
        }
        return true;
    }

    @Override // tb.suj
    public boolean a(int i, TabSwitchSource tabSwitchSource) {
        rnc pageContainer;
        View view;
        ITMSPage b2;
        com.taobao.themis.kernel.extension.page.tab.d dVar;
        rnc pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cba5fb4", new Object[]{this, new Integer(i), tabSwitchSource})).booleanValue();
        }
        thk a2 = com.taobao.themis.kernel.utils.a.a(this.c.b());
        if (a2 != null) {
            a2.a("startSwitchTime", System.currentTimeMillis());
        }
        qpm f = this.c.f();
        if (f != null && (pageContainer2 = f.getPageContainer()) != null) {
            pageContainer2.dZ_();
        }
        if (i >= 0 && i < this.b.size()) {
            if (i == this.f22372a) {
                if (tabSwitchSource == TabSwitchSource.USER_CLICK && (b2 = this.b.get(i).b()) != null && (dVar = (com.taobao.themis.kernel.extension.page.tab.d) b2.a(com.taobao.themis.kernel.extension.page.tab.d.class)) != null) {
                    dVar.j();
                }
                return false;
            }
            int i2 = this.d;
            rnc rncVar = null;
            if (i != i2 && i2 >= 0 && i2 < this.b.size()) {
                ITMSPage b3 = this.b.get(this.d).b();
                if (b3 != null) {
                    b3.k();
                }
                this.b.get(this.d).a((ITMSPage) null);
                this.d = -1;
            }
            int i3 = this.f22372a;
            ITMSPage b4 = (i3 < 0 || i3 >= this.b.size()) ? null : this.b.get(this.f22372a).b();
            boolean z = b4 == null;
            String e = b4 != null ? b4.e() : null;
            f fVar = this.b.get(i);
            ITMSPage b5 = fVar.b();
            if (b5 == null) {
                String a3 = fVar.a();
                if (a3 == null) {
                    return false;
                }
                b5 = a(this.c, a3, z, i);
                if (b5 == null) {
                    this.c.b().a(com.taobao.themis.kernel.e.g);
                    return false;
                }
                com.taobao.themis.kernel.extension.page.e eVar = (com.taobao.themis.kernel.extension.page.e) b5.a(com.taobao.themis.kernel.extension.page.e.class);
                if (eVar != null) {
                    eVar.a(e);
                }
                IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
                if (iContainerViewFactory != null) {
                    Activity o = this.c.b().o();
                    q.b(o, "page.getInstance().activity");
                    rnc createPageContainer = iContainerViewFactory.createPageContainer(o, b5);
                    if (createPageContainer != null) {
                        if (b4 != null) {
                            b4.v();
                            b5.u();
                        }
                        b5.a(new b(createPageContainer));
                        b5.h();
                        this.b.get(i).a(b5);
                    }
                }
                return false;
            } else if (b4 != null) {
                b4.v();
                b5.u();
            }
            this.f22372a = i;
            qpm f2 = b5.f();
            if (f2 != null && (pageContainer = f2.getPageContainer()) != null && (view = pageContainer.getView()) != null) {
                qpm f3 = this.c.f();
                if (f3 != null) {
                    rncVar = f3.getPageContainer();
                }
                if (rncVar == null) {
                    this.h = view;
                } else {
                    rncVar.a(view);
                }
                com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
                if (cVar == null) {
                    q.b("mTabBar");
                }
                cVar.a(i);
                Iterator<T> it = this.f.iterator();
                while (it.hasNext()) {
                    ((ruw) it.next()).mo2423invoke(Integer.valueOf(i), e);
                }
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/container/app/page/TabPageExtension$switchTo$1", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rnc b;

        public b(rnc rncVar) {
            this.b = rncVar;
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : qpm.a.a(this);
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : i.this.d().b().o();
        }

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            qpm f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            if (i.this.d().b().q().isFragmentContainer() && (f = i.this.d().f()) != null) {
                return f.getCurrentFragment();
            }
            return null;
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.b;
        }
    }

    @Override // tb.suj
    public boolean a(String mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, mode})).booleanValue();
        }
        q.d(mode, "mode");
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar.a(mode);
    }

    @Override // tb.suj
    public void a(ruw<? super Integer, ? super String, t> listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.f.add(listener);
    }

    @Override // tb.suj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    @Override // tb.suj
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        cVar.b();
    }

    @Override // tb.suj
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        cVar.c();
    }

    @Override // tb.suj
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar.d();
    }

    @Override // tb.suj
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6895230", new Object[]{this});
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar.a();
    }

    @Override // com.taobao.themis.kernel.extension.page.ae
    public ITMSPage b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("f9353878", new Object[]{this});
        }
        int i = this.f22372a;
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(this.f22372a).b();
        }
        return null;
    }

    @Override // tb.suj
    public boolean a(int i, String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), text})).booleanValue();
        }
        q.d(text, "text");
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar.a(i, text);
    }

    @Override // tb.suj
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar.b(i);
    }

    @Override // tb.suj
    public ITMSPage a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8c9cc486", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i).b();
        }
        return null;
    }

    @Override // tb.suj
    public void a(com.taobao.themis.kernel.extension.page.tab.b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6ba7a5", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.i = true;
        this.j = listener;
    }

    @Override // tb.suj
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < 0 || i >= this.b.size() || i2 < 0 || i2 >= this.b.size()) {
            return false;
        }
        if (i == i2) {
            return true;
        }
        this.b.set(i, this.b.get(i2));
        this.b.set(i2, this.b.get(i));
        int i3 = this.f22372a;
        if (i3 == i) {
            this.f22372a = i2;
        } else if (i3 == i2) {
            this.f22372a = i;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        cVar.a(i, i2);
        return true;
    }

    @Override // tb.suj
    public int a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb549206", new Object[]{this, page})).intValue();
        }
        q.d(page, "page");
        for (f fVar : this.b) {
            if (q.a(fVar.b(), page)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // tb.suj
    public boolean b(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b4297a", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        if (!n.be() || i < -1 || i > this.b.size()) {
            return false;
        }
        if (i == -1) {
            i = this.b.size();
        }
        String pageId = tabBarItemModel.getPageId();
        if ((pageId != null ? o.b(this.c.b(), pageId) : null) == null) {
            return false;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        if (!cVar.b(i, tabBarItemModel)) {
            return false;
        }
        int i2 = this.f22372a;
        if (i <= i2) {
            this.f22372a = i2 + 1;
        }
        List<f> list = this.b;
        f fVar = new f();
        fVar.a(tabBarItemModel.getPageId());
        fVar.a(tabBarItemModel);
        t tVar = t.INSTANCE;
        list.add(i, fVar);
        return true;
    }

    @Override // tb.suj
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!n.be() || i < 0 || i >= this.b.size() || i == this.f22372a) {
            return false;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        if (!cVar.c(i)) {
            return false;
        }
        int i2 = this.f22372a;
        if (i < i2) {
            this.f22372a = i2 - 1;
        }
        ITMSPage b2 = this.b.remove(i).b();
        if (b2 != null) {
            b2.k();
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        qpm f;
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View view = this.h;
        if (view == null || (f = this.c.f()) == null || (pageContainer = f.getPageContainer()) == null) {
            return;
        }
        pageContainer.a(view);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (f fVar : this.b) {
            ITMSPage b2 = fVar.b();
            if (b2 != null) {
                b2.k();
            }
        }
        this.b.clear();
    }

    @Override // tb.suj
    public com.taobao.themis.kernel.container.ui.titlebar.c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.ui.titlebar.c) ipChange.ipc$dispatch("d5b8bdd6", new Object[]{this});
        }
        if (!this.g.get()) {
            return null;
        }
        com.taobao.themis.kernel.container.ui.titlebar.c cVar = this.e;
        if (cVar == null) {
            q.b("mTabBar");
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
        if (r1 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.themis.kernel.page.ITMSPage a(com.taobao.themis.kernel.page.ITMSPage r12, java.lang.String r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.app.page.i.a(com.taobao.themis.kernel.page.ITMSPage, java.lang.String, boolean, int):com.taobao.themis.kernel.page.ITMSPage");
    }

    private final void a(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7070be", new Object[]{this, iTMSPage, iTMSPage2});
            return;
        }
        com.taobao.themis.kernel.extension.page.f fVar = (com.taobao.themis.kernel.extension.page.f) iTMSPage2.a(com.taobao.themis.kernel.extension.page.f.class);
        if (fVar == null) {
            return;
        }
        iTMSPage.a(fVar);
    }

    private final boolean a(ITMSPage iTMSPage, TabBarItem tabBarItem) {
        com.taobao.themis.kernel.container.b b2;
        String b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff7ca381", new Object[]{this, iTMSPage, tabBarItem})).booleanValue();
        }
        String pageId = tabBarItem.getPageId();
        if (pageId == null || (b2 = o.b(this.c.b(), pageId)) == null || (b3 = b2.b()) == null) {
            return false;
        }
        com.taobao.themis.kernel.utils.i iVar = com.taobao.themis.kernel.utils.i.INSTANCE;
        QueryPass queryPass = tabBarItem.getQueryPass();
        Uri b4 = com.taobao.themis.utils.o.b(iTMSPage.b().g());
        q.b(b4, "TMSUrlUtils.parseUrl(originPage.getInstance().url)");
        return !q.a((Object) iTMSPage.e(), (Object) iVar.a(b3, queryPass, b4.getEncodedQuery()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TabPageExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(2003568689);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
