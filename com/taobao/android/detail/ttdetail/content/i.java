package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.u;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Content;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.TTDetailViewPager;
import com.taobao.taobao.R;
import tb.eyx;
import tb.kge;
import tb.tac;

/* loaded from: classes4.dex */
public class i implements com.taobao.android.detail.ttdetail.communication.g<com.taobao.android.detail.ttdetail.bizmessage.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONTENT_PAGE_INDEX = 1;
    public static final int DETAIL_PAGE_INDEX = 0;

    /* renamed from: a  reason: collision with root package name */
    private Context f10590a;
    private eyx b;
    private View c;
    private TTDetailViewPager d;
    private a e;
    private b f;
    private TTDContentController g;
    private com.taobao.android.detail.ttdetail.content.shop.b h;
    private boolean i;
    private boolean j;
    private String k;
    private String l;
    private tac m = new tac() { // from class: com.taobao.android.detail.ttdetail.content.i.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.tac
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
            } else if (!(obj2 instanceof Integer)) {
            } else {
                if (((Integer) obj2).intValue() == 1) {
                    z = true;
                }
                if (z) {
                    i.this.e();
                } else {
                    i.this.d();
                }
            }
        }
    };
    private SimpleEntry<Integer, Float> n;
    private SimpleEntry<Integer, Float> o;

    /* loaded from: classes4.dex */
    public interface b {
        View getMainView();
    }

    static {
        kge.a(1013618136);
        kge.a(-767194759);
    }

    public static /* synthetic */ eyx a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("da701ab", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ SimpleEntry b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleEntry) ipChange.ipc$dispatch("9d5a4f9f", new Object[]{iVar}) : iVar.n;
    }

    public static /* synthetic */ SimpleEntry c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleEntry) ipChange.ipc$dispatch("ddd5653e", new Object[]{iVar}) : iVar.o;
    }

    public static /* synthetic */ boolean d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a173307e", new Object[]{iVar})).booleanValue() : iVar.i;
    }

    public static /* synthetic */ b e(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c154374c", new Object[]{iVar}) : iVar.f;
    }

    public static /* synthetic */ TTDContentController f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDContentController) ipChange.ipc$dispatch("1e34c673", new Object[]{iVar}) : iVar.g;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(com.taobao.android.detail.ttdetail.bizmessage.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, bVar})).booleanValue() : a(bVar);
    }

    public i(Context context, eyx eyxVar, b bVar) {
        Float valueOf = Float.valueOf(0.0f);
        this.n = new SimpleEntry<>(0, valueOf);
        this.o = new SimpleEntry<>(0, valueOf);
        this.f10590a = context;
        this.b = eyxVar;
        this.f = bVar;
        a(this.f10590a);
        if (!com.taobao.android.detail.ttdetail.utils.e.a(this.f10590a)) {
            this.c = com.taobao.android.detail.ttdetail.performance.d.a(this.f10590a).a(this.f10590a, R.layout.tt_detail_horizontal_page_manager, null, true);
        } else {
            this.c = com.taobao.android.detail.ttdetail.performance.d.a(this.f10590a).a(this.f10590a, R.layout.tt_detail_horizontal_page_manager_pad, null, true);
        }
        this.d = (TTDetailViewPager) this.c.findViewById(R.id.vp_hscroll_container);
        TTDetailViewPager tTDetailViewPager = this.d;
        a aVar = new a();
        this.e = aVar;
        tTDetailViewPager.setAdapter(aVar);
        this.d.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.detail.ttdetail.content.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b = -1;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    return;
                }
                if (i2 == 0 && this.b != i) {
                    this.b = i;
                    i.a(i.this).e().a("pageType", Integer.valueOf(i));
                    if (i == 0) {
                        i.this.f();
                        i.this.g();
                    } else if (i == 1) {
                        i.this.j();
                        i.this.i();
                        i.this.h();
                    }
                }
                SimpleEntry<Integer, Float> a2 = a();
                a2.setKey(Integer.valueOf(i));
                a2.setValue(Float.valueOf(f));
                i.a(i.this).e().a("scrollOffset", a2);
            }

            private SimpleEntry<Integer, Float> a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SimpleEntry) ipChange.ipc$dispatch("221d722f", new Object[]{this}) : ((SimpleEntry) i.a(i.this).e().a("scrollOffset")) == i.b(i.this) ? i.c(i.this) : i.b(i.this);
            }
        });
    }

    public boolean a(com.taobao.android.detail.ttdetail.bizmessage.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79fdefe3", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar.a() || r()) {
            z = true;
        }
        this.d.setDisableHorizontalScroll(!z);
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(context, com.taobao.android.detail.ttdetail.bizmessage.b.class, this);
        this.b.e().a("pageType", this.m);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(context, com.taobao.android.detail.ttdetail.bizmessage.b.class);
        this.b.e().b("pageType", this.m);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!r()) {
            return false;
        }
        return d();
    }

    public void a(int i, int i2, Intent intent) {
        TTDContentController tTDContentController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i2 != -1 || i != 10 || (tTDContentController = this.g) == null) {
        } else {
            tTDContentController.k();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        n();
        this.e.notifyDataSetChanged();
        if (this.d.getCurrentItem() != 1) {
            return;
        }
        j();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (y.a(this.f10590a)) {
        } else {
            o();
            this.i = p();
            this.j = q();
            if (this.i && this.g == null) {
                this.g = new TTDContentController(this.f10590a, this.b, this);
            }
            if (this.j && this.h == null) {
                this.h = new com.taobao.android.detail.ttdetail.content.shop.b(this.f10590a, this.d);
            }
            TTDContentController tTDContentController = this.g;
            if (tTDContentController != null) {
                tTDContentController.a(this.i);
            }
            com.taobao.android.detail.ttdetail.content.shop.b bVar = this.h;
            if (bVar == null) {
                return;
            }
            bVar.a(this.l);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.k = null;
        this.l = null;
        this.i = false;
        this.j = false;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        Content content = (Content) this.b.a().a(Content.class);
        Feature feature = (Feature) this.b.a().a(Feature.class);
        return (feature == null || !feature.isDetail3() || content == null) ? false : true;
    }

    private boolean q() {
        JSONObject a2;
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        Feature feature = (Feature) this.b.a().a(Feature.class);
        if (feature == null || !feature.isDetail3HeadPic() || !feature.isDetail3() || (a2 = this.b.a().a()) == null || (e = com.taobao.android.detail.ttdetail.utils.g.e(a2)) == null || (jSONObject = e.getJSONObject("anchorpoint")) == null) {
            return false;
        }
        this.k = jSONObject.getString("shopTitle");
        this.l = jSONObject.getString(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL);
        return this.l != null;
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        TTDetailViewPager tTDetailViewPager = this.d;
        return tTDetailViewPager != null && tTDetailViewPager.getCurrentItem() == 1;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = this.d.getAdapter();
        if (adapter == null || adapter.getCount() <= 0) {
            return false;
        }
        this.d.setCurrentItem(0, true);
        return true;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = this.d.getAdapter();
        if (adapter == null || adapter.getCount() <= 1) {
            return false;
        }
        this.d.setCurrentItem(1, true);
        return true;
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        TTDContentController tTDContentController = this.g;
        if (tTDContentController != null) {
            tTDContentController.d(str);
            this.g.e(str2);
        }
        return e();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TTDContentController tTDContentController = this.g;
        if (tTDContentController == null || !this.i) {
            return;
        }
        tTDContentController.a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        u uVar = (u) this.b.b().a("headerPic");
        if (uVar == null) {
            return;
        }
        uVar.b(true);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        u uVar = (u) this.b.b().a("headerPic");
        if (uVar == null) {
            return;
        }
        uVar.a(true);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TTDContentController tTDContentController = this.g;
        if (tTDContentController == null || !this.i) {
            return;
        }
        tTDContentController.b();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        TTDContentController tTDContentController = this.g;
        if (tTDContentController == null || !this.i) {
            return;
        }
        tTDContentController.e();
    }

    public void k() {
        TTDContentController tTDContentController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.i || (tTDContentController = this.g) == null) {
        } else {
            tTDContentController.d();
        }
    }

    public void l() {
        TTDContentController tTDContentController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.i || (tTDContentController = this.g) == null) {
        } else {
            tTDContentController.c();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        o();
        TTDContentController tTDContentController = this.g;
        if (tTDContentController != null) {
            tTDContentController.f();
        }
        com.taobao.android.detail.ttdetail.content.shop.b bVar = this.h;
        if (bVar != null) {
            bVar.a();
        }
        b(this.f10590a);
    }

    /* loaded from: classes4.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1802463064);
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        private a() {
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : i.d(i.this) ? 2 : 1;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View view = null;
            if (i == 0) {
                view = i.e(i.this).getMainView();
            } else if (i == 1) {
                view = i.f(i.this).j();
            }
            if (view != null) {
                viewGroup.addView(view);
            }
            return view;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (!(obj instanceof View)) {
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (obj == i.e(i.this).getMainView()) {
                return 0;
            }
            return (obj != i.f(i.this).j() || !i.d(i.this)) ? -2 : 1;
        }
    }
}
