package tb;

import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.ContentController;
import com.taobao.android.detail.core.detail.content.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class dyk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONTENT_PAGE_INDEX = 1;
    public static final int DETAIL_PAGE_INDEX = 0;
    public static final int UNKNOWN_INDEX = -1;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27106a;
    private ContentController b;
    private eci c;
    private ViewPager d;
    private View e;
    private View f;
    private boolean g;
    private boolean h;
    private ViewGroup i;
    private int j;
    private String k;
    private String l;

    static {
        kge.a(786335941);
    }

    public static /* synthetic */ boolean a(dyk dykVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6144ca6", new Object[]{dykVar})).booleanValue() : dykVar.g;
    }

    public static /* synthetic */ View b(dyk dykVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("815288a5", new Object[]{dykVar}) : dykVar.e;
    }

    public static /* synthetic */ View c(dyk dykVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("963b50e6", new Object[]{dykVar}) : dykVar.f;
    }

    public static /* synthetic */ DetailCoreActivity d(dyk dykVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("cd501af0", new Object[]{dykVar}) : dykVar.f27106a;
    }

    public dyk(DetailCoreActivity detailCoreActivity) {
        this.f27106a = detailCoreActivity;
        this.d = (ViewPager) this.f27106a.findViewById(R.id.detail_pager);
        emu.a("com.taobao.android.detail.core.detail.controller.PagerController");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f27106a.isFinishing()) {
        } else {
            if (Build.VERSION.SDK_INT >= 17 && this.f27106a.isDestroyed()) {
                return;
            }
            j();
            this.g = l();
            this.h = k();
            ContentController contentController = this.b;
            if (contentController != null) {
                contentController.d();
            } else if (this.g) {
                this.b = new ContentController(this.f27106a, this);
                this.f = this.b.i();
            }
            eci eciVar = this.c;
            if (eciVar != null) {
                eciVar.a();
            } else if (this.h) {
                this.c = new eci(this.f27106a);
            }
            if (!this.g && !this.h) {
                return;
            }
            this.e = this.f27106a.findViewById(R.id.pagecontent);
            View view = this.e;
            if (view == null) {
                return;
            }
            this.i = (ViewGroup) view.getParent();
            this.j = this.i.indexOfChild(this.e);
            this.i.removeView(this.e);
            this.d.setAdapter(new a());
            this.d.addOnPageChangeListener(new b());
            if (this.g) {
                this.b.c();
            }
            if (!this.h) {
                return;
            }
            this.c.a(this.l);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.k = null;
        this.l = null;
        this.g = false;
        this.h = false;
        ViewPager viewPager = this.d;
        if (viewPager == null || this.e == null || this.i == null) {
            return;
        }
        try {
            viewPager.setAdapter(null);
            this.d.clearOnPageChangeListeners();
            View view = this.e;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            this.i.addView(this.e, this.j);
        } catch (Exception e) {
            i.a("PagerController", "clear data error : ", e);
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.f27106a.C() == null || this.f27106a.C().f10055a == null) {
            i.d("PagerController", "content tab node bundle error");
            return false;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.f27106a.C().f10055a;
        FeatureNode f = eqb.f(bVar);
        if (f != null && f.isDetail3HeaderPic && f.isDetail3) {
            try {
                JSONObject jSONObject = bVar.l().getJSONArray("apiStack").getJSONObject(0);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    jSONObject2 = jSONObject.getJSONObject("value");
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("anchorpoint");
                this.k = jSONObject3.getString("shopTitle");
                this.l = jSONObject3.getString(g.KEY_APM_SHOP_URL);
            } catch (Exception e) {
                i.a("PagerController", "anchorpoint parse exception:" + e.getMessage());
            }
            if (this.l != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : l() || k();
    }

    public ViewPager c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("1ba83556", new Object[]{this}) : this.d;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        eci eciVar = this.c;
        if (eciVar == null) {
            return;
        }
        eciVar.c();
    }

    public void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3062ac6", new Object[]{this, onPageChangeListener});
            return;
        }
        ViewPager viewPager = this.d;
        if (viewPager == null) {
            return;
        }
        viewPager.addOnPageChangeListener(onPageChangeListener);
    }

    public void b(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7bcb47", new Object[]{this, onPageChangeListener});
            return;
        }
        ViewPager viewPager = this.d;
        if (viewPager == null) {
            return;
        }
        viewPager.removeOnPageChangeListener(onPageChangeListener);
    }

    public ContentController e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentController) ipChange.ipc$dispatch("f1f90757", new Object[]{this}) : this.b;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (!eis.c) {
            i.d("PagerController", "content tab orange is false");
            return false;
        } else if (this.f27106a.C() == null || this.f27106a.C().f10055a == null) {
            i.d("PagerController", "content tab node bundle error");
            return false;
        } else {
            JSONObject a2 = this.f27106a.C().f10055a.a();
            if (a2 == null) {
                i.d("PagerController", "content tab root data error");
                return false;
            }
            JSONObject jSONObject = a2.getJSONObject("content");
            JSONObject jSONObject2 = a2.getJSONObject("feature");
            return jSONObject != null && (jSONObject2 != null && Boolean.TRUE.toString().equals(jSONObject2.get(dwy.KEY_DETAIL)));
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.d;
        return (viewPager == null || viewPager.getAdapter() == null || this.d.getCurrentItem() != 1) ? false : true;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ViewPager viewPager = this.d;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.d.setCurrentItem(i, true);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.g) {
        } else {
            this.b.b();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.g) {
        } else {
            this.b.a();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        j();
        ContentController contentController = this.b;
        if (contentController != null) {
            contentController.g();
        }
        eci eciVar = this.c;
        if (eciVar == null) {
            return;
        }
        eciVar.b();
    }

    /* loaded from: classes4.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1465516196);
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
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : dyk.a(dyk.this) ? 2 : 1;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i == 0) {
                viewGroup.addView(dyk.b(dyk.this));
                return dyk.b(dyk.this);
            } else if (i != 1) {
                return null;
            } else {
                View c = dyk.c(dyk.this);
                viewGroup.addView(c);
                return c;
            }
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
            if (obj == dyk.b(dyk.this)) {
                return 0;
            }
            return obj == dyk.c(dyk.this) ? 1 : -1;
        }
    }

    /* loaded from: classes4.dex */
    public class b extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float b;

        static {
            kge.a(170846791);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private b() {
            this.b = -1.0f;
        }

        @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            a(i, f);
            if (f > 0.1f && i == 0) {
                c();
                b();
            } else if (i != 0 || f != 0.0f) {
            } else {
                a();
                this.b = -1.0f;
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a(dyk.d(dyk.this).d, (RecyclerView) dyk.d(dyk.this).findViewById(R.id.mainpage2));
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                b(dyk.d(dyk.this).d, (RecyclerView) dyk.d(dyk.this).findViewById(R.id.mainpage2));
            }
        }

        private void a(int i, float f) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            ehu r = dyk.d(dyk.this).r();
            if (!(r instanceof ehv) || !(r instanceof View) || i != 0) {
                return;
            }
            View findViewById = ((View) r).findViewById(R.id.ll_bottom_bar);
            ehv ehvVar = (ehv) r;
            if (findViewById == null) {
                return;
            }
            if (Float.compare(-1.0f, this.b) == 0) {
                if (findViewById.getVisibility() != 0) {
                    return;
                }
                this.b = findViewById.getAlpha();
            }
            float f2 = (1.0f - f) * this.b;
            if (f2 < 0.1f) {
                i2 = 8;
            }
            ehvVar.setNavTabsBarAlphaAndVisibility(f2, i2);
        }

        private void c() {
            dyy dyyVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (dyk.d(dyk.this).b == null || dyk.d(dyk.this).b.k == null || (dyyVar = dyk.d(dyk.this).b.k.b) == null || !dyyVar.k()) {
            } else {
                f.a(dyk.d(dyk.this), new com.taobao.android.detail.core.event.video.a(true));
            }
        }

        public void a(bd bdVar, RecyclerView recyclerView) {
            com.taobao.android.dinamicx.videoc.b u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8710ead0", new Object[]{this, bdVar, recyclerView});
            } else if (bdVar == null || recyclerView == null || (u = bdVar.d().u()) == null) {
            } else {
                u.b(recyclerView, null);
                u.e(recyclerView, null);
            }
        }

        public void b(bd bdVar, RecyclerView recyclerView) {
            com.taobao.android.dinamicx.videoc.b u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87df6951", new Object[]{this, bdVar, recyclerView});
            } else if (bdVar == null || recyclerView == null || (u = bdVar.d().u()) == null) {
            } else {
                u.f(recyclerView, null);
                u.c(recyclerView, null);
            }
        }
    }
}
