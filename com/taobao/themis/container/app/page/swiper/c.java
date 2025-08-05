package com.taobao.themis.container.app.page.swiper;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.h;
import com.taobao.themis.kernel.extension.page.o;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qqa;
import tb.rnc;
import tb.sui;
import tb.tbz;
import tb.tca;
import tb.tcb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0010H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/SwiperPageExtension;", "Lcom/taobao/themis/kernel/extension/page/swiper/ISwiperPageExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mHeaderPage", "mIsDestroyed", "", "mSwiperAdapter", "Lcom/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter;", "mSwiperContainer", "Lcom/taobao/themis/container/app/page/swiper/TMSSwiperPageContainer;", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "addSwiperItem", "index", "", "pageId", "", "getCurrentSubPage", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "getSwiperView", "Landroid/view/View;", "hideSwiperHeader", "onUnRegister", "", "removeSwiperItem", "setSwiperEnable", "enable", "showSwiperHeader", "headerPageId", "height", "", "slideTo", "swiperIndex", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c implements tca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f22377a;
    private final e b;
    private ITMSPage c;
    private boolean d;
    private final ITMSPage e;

    static {
        kge.a(392189519);
        kge.a(1315297298);
    }

    public c(ITMSPage page) {
        int a2;
        q.d(page, "page");
        this.e = page;
        Activity o = this.e.b().o();
        q.b(o, "page.getInstance().activity");
        this.f22377a = new d(o, this.e);
        this.b = new e(this.e, new a());
        this.f22377a.b().setAdapter(this.b);
        this.b.a(new tcb() { // from class: com.taobao.themis.container.app.page.swiper.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tcb
            public void a(int i, int i2) {
                com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
                List<tcb> a3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                tbz tbzVar = (tbz) c.this.f().b().b(tbz.class);
                if (tbzVar != null && (a3 = tbzVar.a()) != null) {
                    for (tcb tcbVar : a3) {
                        tcbVar.a(i, i2);
                    }
                }
                ITMSPage b2 = c.this.b();
                if (b2 == null) {
                    return;
                }
                qpm f = c.this.f().f();
                if (f != null && (titleBar = f.getTitleBar()) != null) {
                    titleBar.resetTitle(b2);
                }
                h hVar = (h) b2.a(h.class);
                if (hVar == null) {
                    return;
                }
                hVar.b();
            }
        });
        com.taobao.themis.kernel.container.b e = this.e.c().e();
        o oVar = (o) this.e.a(o.class);
        boolean a3 = oVar != null ? oVar.a() : false;
        int i = e.i();
        if (a3 && n.bM()) {
            String instanceUrl = this.e.b().g();
            List<String> k = e.k();
            if (k != null) {
                q.b(instanceUrl, "instanceUrl");
                if (kotlin.text.n.b((CharSequence) instanceUrl, (CharSequence) "uniapp_sub_page", false, 2, (Object) null) && (a2 = p.a((List<? extends String>) k, Uri.parse(instanceUrl).getQueryParameter("uniapp_sub_page"))) >= 0 && a2 < k.size()) {
                    i = a2;
                }
            }
        }
        this.f22377a.b().setCurrentItem(i);
        this.e.a(new qqa.b() { // from class: com.taobao.themis.container.app.page.swiper.c.2
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
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.p();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.p();
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
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.q();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.q();
            }

            @Override // tb.qqa.b
            public void a(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb549213", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.i();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.i();
            }

            @Override // tb.qqa.b
            public void b(ITMSPage page2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("95f55494", new Object[]{this, page2});
                    return;
                }
                q.d(page2, "page");
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.j();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.j();
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
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.u();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.u();
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
                ITMSPage b2 = c.this.b();
                if (b2 != null) {
                    b2.v();
                }
                ITMSPage c = c.c(c.this);
                if (c == null) {
                    return;
                }
                c.v();
            }
        });
    }

    public static final /* synthetic */ d a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5e6dcbb5", new Object[]{cVar}) : cVar.f22377a;
    }

    public static final /* synthetic */ ITMSPage c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("39b43a84", new Object[]{cVar}) : cVar.c;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        tca.a.a(this, page);
    }

    public final ITMSPage f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("4e6ddf4", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            tca.a.b(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/container/app/page/swiper/SwiperPageExtension$mSwiperAdapter$1", "Lcom/taobao/themis/container/app/page/swiper/SwiperAbility;", "addOnPageChangeListener", "", DataReceiveMonitor.CB_LISTENER, "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "setCurrentItem", "index", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements com.taobao.themis.container.app.page.swiper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.container.app.page.swiper.a
        public void a(ViewPager.OnPageChangeListener listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3062ac6", new Object[]{this, listener});
                return;
            }
            q.d(listener, "listener");
            c.a(c.this).b().addOnPageChangeListener(listener);
        }

        @Override // com.taobao.themis.container.app.page.swiper.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                c.a(c.this).b().setCurrentItem(i, false);
            }
        }
    }

    @Override // tb.tca
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= this.b.getCount()) {
            return false;
        }
        this.f22377a.b().setCurrentItem(i);
        return true;
    }

    @Override // tb.tca
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f22377a.b().setAcceptTouchEvent(z);
        }
    }

    @Override // tb.tca
    public boolean a(int i, String pageId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), pageId})).booleanValue();
        }
        q.d(pageId, "pageId");
        return this.b.a(i, pageId);
    }

    @Override // tb.tca
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : this.b.a(i);
    }

    @Override // tb.tca
    public boolean a(String headerPageId, double d) {
        String b2;
        String a2;
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81239a50", new Object[]{this, headerPageId, new Double(d)})).booleanValue();
        }
        q.d(headerPageId, "headerPageId");
        if (d <= 0) {
            return false;
        }
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.k();
        }
        com.taobao.themis.kernel.container.b b3 = com.taobao.themis.kernel.utils.o.b(this.e.b(), headerPageId);
        if (b3 == null || (b2 = b3.b()) == null || (a2 = b3.a()) == null) {
            return false;
        }
        i iVar = i.INSTANCE;
        QueryPass j = b3.j();
        Uri b4 = com.taobao.themis.utils.o.b(this.e.b().g());
        q.b(b4, "TMSUrlUtils.parseUrl(page.getInstance().url)");
        String a3 = iVar.a(b2, j, b4.getEncodedQuery());
        ITMSPageFactory m = this.e.b().m();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_TAB_ITEM_PAGE, (String) true);
        jSONObject2.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_HEADER_PAGE, (String) true);
        t tVar = t.INSTANCE;
        this.c = m.a(a2, (Window) null, a3, jSONObject);
        ITMSPage iTMSPage2 = this.c;
        if (iTMSPage2 == null) {
            return false;
        }
        if (n.aR() && (oVar = (o) iTMSPage2.a(o.class)) != null) {
            oVar.a(false);
        }
        iTMSPage2.a(new com.taobao.themis.kernel.extension.page.p(iTMSPage2, this.e));
        sui suiVar = (sui) this.e.a(sui.class);
        if (suiVar != null) {
            iTMSPage2.a(suiVar);
        }
        iTMSPage2.h();
        iTMSPage2.a(new b(d));
        View g = iTMSPage2.g();
        if (g != null) {
            g.setBackgroundColor(0);
            this.f22377a.a(g, k.a(this.e.b().o(), (float) d));
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/taobao/themis/container/app/page/swiper/SwiperPageExtension$showSwiperHeader$2$2", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ double b;

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            return null;
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this});
            }
            return null;
        }

        public b(double d) {
            this.b = d;
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
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : c.this.f().b().o();
        }
    }

    @Override // tb.tca
    public rnc e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("2dd0b5d3", new Object[]{this}) : this.f22377a;
    }

    @Override // tb.tca
    public boolean j() {
        View g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        ITMSPage iTMSPage = this.c;
        if (iTMSPage == null || (g = iTMSPage.g()) == null) {
            return false;
        }
        g.setVisibility(8);
        return true;
    }

    @Override // com.taobao.themis.kernel.extension.page.ae
    public ITMSPage b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("f9353878", new Object[]{this}) : this.b.a();
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d) {
        } else {
            this.d = true;
            ITMSPage iTMSPage = this.c;
            if (iTMSPage != null) {
                iTMSPage.k();
            }
            this.b.b();
            this.f22377a.b().removeAllViews();
        }
    }
}
