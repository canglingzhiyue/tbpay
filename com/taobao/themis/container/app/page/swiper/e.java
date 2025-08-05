package com.taobao.themis.container.app.page.swiper;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.qpm;
import tb.riy;
import tb.rnc;
import tb.sui;
import tb.tcb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0006\u0010\u001b\u001a\u00020\u0016J$\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u0004\u0018\u00010\u0003J\u0012\u0010$\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010%\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u001c\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nJ\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter;", "Landroid/support/v4/view/PagerAdapter;", "mSwiperPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "swiperAbility", "Lcom/taobao/themis/container/app/page/swiper/SwiperAbility;", "(Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/taobao/themis/container/app/page/swiper/SwiperAbility;)V", "mFirstSwiperItemRendered", "", "mSelectedIndex", "", "mSwiperSwitchListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/themis/kernel/extension/page/swiper/ISwiperSwitchListener;", "mViewPagerItems", "", "Lcom/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter$ViewPagerItemData;", "addSwiperItem", "index", "pageId", "", "addSwiperSwitchListener", "", DataReceiveMonitor.CB_LISTENER, "copyDocumentLoadInfo", "from", "to", "destroy", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "getCurrentPage", "getItemPosition", "instantiateItem", "isViewFromObject", "view", "Landroid/view/View;", "removeSwiperItem", "renderSubPage", "ViewPagerItemData", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f22383a;
    private int b;
    private CopyOnWriteArrayList<tcb> c;
    private boolean d;
    private final ITMSPage e;
    private final com.taobao.themis.container.app.page.swiper.a f;

    static {
        kge.a(-2009536510);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    public static final /* synthetic */ ITMSPage a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("77e20684", new Object[]{eVar}) : eVar.e;
    }

    public static final /* synthetic */ void a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf08e346", new Object[]{eVar, new Integer(i)});
        } else {
            eVar.b(i);
        }
    }

    public static final /* synthetic */ List b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("70388d0b", new Object[]{eVar}) : eVar.f22383a;
    }

    public static final /* synthetic */ void b(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4394c7", new Object[]{eVar, new Integer(i)});
        } else {
            eVar.b = i;
        }
    }

    public static final /* synthetic */ int c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1788300e", new Object[]{eVar})).intValue() : eVar.b;
    }

    public static final /* synthetic */ CopyOnWriteArrayList d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("b180b527", new Object[]{eVar}) : eVar.c;
    }

    public e(ITMSPage mSwiperPage, com.taobao.themis.container.app.page.swiper.a swiperAbility) {
        q.d(mSwiperPage, "mSwiperPage");
        q.d(swiperAbility, "swiperAbility");
        this.e = mSwiperPage;
        this.f = swiperAbility;
        this.c = new CopyOnWriteArrayList<>();
        com.taobao.themis.kernel.container.b e = this.e.c().e();
        List<String> k = e.k();
        if (!e.h()) {
            TMSLogger.d("TMSViewPagerAdapter", "pageModel is not swiper");
            this.f22383a = new ArrayList(0);
        } else {
            q.a(k);
            this.f22383a = new ArrayList(k.size());
            List<String> k2 = e.k();
            if (k2 != null) {
                for (String str : k2) {
                    this.f22383a.add(new a(null, null, str));
                }
            }
        }
        this.f.a(new ViewPager.OnPageChangeListener() { // from class: com.taobao.themis.container.app.page.swiper.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                } else if (this.b != 1) {
                } else {
                    if (f > 0.5f) {
                        e.a(e.this, i + 1);
                    } else {
                        e.a(e.this, i);
                    }
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange = $ipChange;
                int i2 = 0;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                sui suiVar = (sui) e.a(e.this).a(sui.class);
                if (suiVar != null) {
                    i2 = suiVar.b();
                }
                TMSLogger.a("TMSViewPagerAdapter", "onPageSelected with tabIndex=" + i2 + ", swiperIndex=" + i);
                ITMSPage a2 = ((a) e.b(e.this).get(e.c(e.this))).a();
                if (a2 != null) {
                    a2.v();
                }
                e.a(e.this, i);
                ITMSPage a3 = ((a) e.b(e.this).get(i)).a();
                if (a3 != null) {
                    a3.u();
                }
                e.b(e.this, i);
                for (tcb tcbVar : e.d(e.this)) {
                    tcbVar.a(i2, i);
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                } else {
                    this.b = i;
                }
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter$ViewPagerItemData;", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "containerView", "Landroid/widget/FrameLayout;", "pageId", "", "(Lcom/taobao/themis/kernel/page/ITMSPage;Landroid/widget/FrameLayout;Ljava/lang/String;)V", "getContainerView", "()Landroid/widget/FrameLayout;", "setContainerView", "(Landroid/widget/FrameLayout;)V", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "setPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", eau.PARSER_TAG, "", "other", "hashCode", "", "toString", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ITMSPage f22385a;
        private FrameLayout b;
        private String c;

        static {
            kge.a(-1359945895);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a(this.f22385a, aVar.f22385a) || !q.a(this.b, aVar.b) || !q.a((Object) this.c, (Object) aVar.c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            ITMSPage iTMSPage = this.f22385a;
            int hashCode = (iTMSPage != null ? iTMSPage.hashCode() : 0) * 31;
            FrameLayout frameLayout = this.b;
            int hashCode2 = (hashCode + (frameLayout != null ? frameLayout.hashCode() : 0)) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ViewPagerItemData(page=" + this.f22385a + ", containerView=" + this.b + ", pageId=" + this.c + riy.BRACKET_END_STR;
        }

        public a(ITMSPage iTMSPage, FrameLayout frameLayout, String str) {
            this.f22385a = iTMSPage;
            this.b = frameLayout;
            this.c = str;
        }

        public final ITMSPage a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("3648cf19", new Object[]{this}) : this.f22385a;
        }

        public final void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb549213", new Object[]{this, iTMSPage});
            } else {
                this.f22385a = iTMSPage;
            }
        }

        public final void a(FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            } else {
                this.b = frameLayout;
            }
        }

        public final FrameLayout b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("cec35b50", new Object[]{this}) : this.b;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }

    public final ITMSPage a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("3648cf19", new Object[]{this}) : this.f22383a.get(this.b).a();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (a aVar : this.f22383a) {
            ITMSPage a2 = aVar.a();
            if (a2 != null) {
                a2.k();
            }
        }
    }

    public final void a(tcb listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ba25", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.c.add(listener);
    }

    public final boolean a(int i, String pageId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), pageId})).booleanValue();
        }
        q.d(pageId, "pageId");
        if (i < -1 || i > this.f22383a.size()) {
            return false;
        }
        int size = i == -1 ? this.f22383a.size() : i;
        com.taobao.themis.kernel.container.b b2 = o.b(this.e.b(), pageId);
        if (b2 == null) {
            return false;
        }
        this.f22383a.add(size, new a(null, null, pageId));
        int i2 = this.b;
        if (i2 >= size) {
            this.b = i2 + 1;
        }
        notifyDataSetChanged();
        int i3 = this.b;
        if (i3 >= size) {
            this.f.a(i3 + 1);
        }
        TMSLogger.a("TMSViewPagerAdapter", "addSwiperItem with index=" + i + ", url=" + b2.b() + " and id=" + b2.a());
        return true;
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= this.f22383a.size() || i == this.b || this.f22383a.size() == 1) {
            return false;
        }
        TMSLogger.a("TMSViewPagerAdapter", "removeSwiperItem with index=" + i);
        int i2 = this.b;
        if (i2 > i) {
            this.f.a(i2 - 1);
        }
        ITMSPage a2 = this.f22383a.remove(i).a();
        if (a2 != null) {
            a2.k();
        }
        notifyDataSetChanged();
        return true;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f22383a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : q.a(view, obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        a aVar = this.f22383a.get(i);
        FrameLayout b2 = aVar.b();
        if (b2 == null) {
            b2 = new FrameLayout(this.e.b().o());
            aVar.a(b2);
            if (i != this.b) {
                z = false;
            }
            if (z) {
                b(i);
            }
        }
        ViewParent parent = b2.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.removeView(b2);
        }
        if (viewGroup != null) {
            viewGroup.addView(b2);
        }
        return b2;
    }

    private final void a(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7070be", new Object[]{this, iTMSPage, iTMSPage2});
            return;
        }
        f fVar2 = (f) iTMSPage.a(f.class);
        if (fVar2 == null) {
            return;
        }
        if (!n.cf() && (fVar = (f) iTMSPage2.a(f.class)) != null) {
            iTMSPage2.b(fVar);
        }
        iTMSPage2.a(fVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x019a, code lost:
        if (r1 == null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(int r22) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.app.page.swiper.e.b(int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter$renderSubPage$2", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "getTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : qpm.a.a(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : e.a(e.this).b().o();
        }

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            qpm f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
            }
            if (e.a(e.this).b().q().isFragmentContainer() && (f = e.a(e.this).f()) != null) {
                return f.getCurrentFragment();
            }
            return null;
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this});
            }
            qpm f = e.a(e.this).f();
            if (f == null) {
                return null;
            }
            return f.getPageContainer();
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this});
            }
            qpm f = e.a(e.this).f();
            if (f == null) {
                return null;
            }
            return f.getTitleBar();
        }
    }
}
