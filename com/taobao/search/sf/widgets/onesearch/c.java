package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.support.v4.view.ViewCompat;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.onesearch.b;
import com.taobao.search.sf.widgets.onesearch.g;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.hth;
import tb.iom;
import tb.iqt;
import tb.itl;
import tb.iug;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.nnq;
import tb.nom;
import tb.nov;
import tb.ntx;
import tb.nwk;
import tb.nxa;

/* loaded from: classes8.dex */
public class c extends ius<SFOnesearchBean, FrameLayout, com.taobao.search.sf.a> implements com.taobao.android.searchbaseframe.uikit.screentype.a, com.taobao.search.mmd.onesearch.f, com.taobao.search.refactor.a, iom, itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable A;
    private boolean B;
    private ScreenType C;
    private SFOnesearchBean D;
    private View E;
    private int F;
    private float G;

    /* renamed from: a  reason: collision with root package name */
    private a f19552a;
    private e b;
    private g c;
    private b d;
    private com.taobao.search.sf.widgets.onesearch.a e;
    private View f;
    private View g;
    private View h;
    private com.taobao.search.mmd.onesearch.c i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private String u;
    private boolean v;
    private Integer w;
    private Integer x;
    private Integer y;
    private OneSearchBean z;

    static {
        kge.a(1646340662);
        kge.a(2125559488);
        kge.a(733709958);
        kge.a(-1327398134);
        kge.a(1958462425);
        kge.a(92233292);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFOnesearchWidget";
    }

    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        return null;
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc1b3879", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.F = i;
        return i;
    }

    public static /* synthetic */ OneSearchBean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OneSearchBean) ipChange.ipc$dispatch("5ab7ef44", new Object[]{cVar}) : cVar.z;
    }

    public static /* synthetic */ Runnable a(c cVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a32c8999", new Object[]{cVar, runnable});
        }
        cVar.A = runnable;
        return runnable;
    }

    public static /* synthetic */ e b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6bf201eb", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ Runnable c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("3c54095", new Object[]{cVar}) : cVar.A;
    }

    public static /* synthetic */ g d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("30a82fe7", new Object[]{cVar}) : cVar.c;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((SFOnesearchBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : k();
    }

    public c(Activity activity, ium iumVar, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        this.f19552a = new a();
        this.m = false;
        this.n = 0;
        this.r = false;
        this.s = 0;
        this.t = false;
        this.u = "";
        this.v = true;
        this.w = null;
        this.x = null;
        this.y = null;
        this.B = false;
        this.G = 1.0f;
        this.p = false;
        this.q = false;
        this.j = false;
        subscribeEvent(this);
        if ((getActivity() instanceof com.taobao.android.searchbaseframe.uikit.a) && ((com.taobao.android.searchbaseframe.uikit.a) getActivity()).aF_()) {
            this.k = true;
        }
        this.C = ScreenType.a(activity);
        ScreenType screenType = this.C;
        if (screenType != null) {
            screenType.a(this);
        }
    }

    public FrameLayout k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("98759a27", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_onesearch, getContainer(), false);
        if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.search.sf.widgets.onesearch.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = i3 - i;
                    int i10 = i7 - i5;
                    c.a(c.this, i9);
                    if (i9 == 0 || i10 == 0 || i9 == i10) {
                        return;
                    }
                    ((FrameLayout) c.this.getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.onesearch.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.this.a(c.a(c.this));
                            }
                        }
                    });
                }
            });
        }
        return frameLayout;
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        if (getView() != 0) {
            this.f = ((FrameLayout) getView()).findViewById(R.id.progressLayout);
            this.g = ((FrameLayout) getView()).findViewById(R.id.ll_onesearch_mask);
            this.h = ((FrameLayout) getView()).findViewById(R.id.v_non_gradient_mask);
            this.E = ((FrameLayout) getView()).findViewById(R.id.v_gradient_mask_bottom);
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = l.a(48) + SystemBarDecorator.getStatusBarHeight(getActivity());
    }

    public void a(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b1a402", new Object[]{this, sFOnesearchBean});
            return;
        }
        if (!TextUtils.isEmpty(sFOnesearchBean.utLogMap) && !TextUtils.isEmpty(sFOnesearchBean.expArg1)) {
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", r.c(sFOnesearchBean.utLogMap));
            hashMap.put("spm", "a2141.7631557.0.0");
            com.taobao.search.mmd.util.e.b(sFOnesearchBean.expArg1, hashMap);
        }
        OneSearchBean convertFromSFOnesearchBean = OneSearchBean.convertFromSFOnesearchBean(sFOnesearchBean);
        if (b(convertFromSFOnesearchBean)) {
            return;
        }
        this.D = sFOnesearchBean;
        try {
            c(sFOnesearchBean);
        } catch (Throwable unused) {
            q.b("SFOnesearchWidget", "setup onesearch container error");
        }
        a(convertFromSFOnesearchBean);
        b(sFOnesearchBean);
        y();
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        hth A = A();
        if (!(A instanceof com.taobao.search.refactor.g)) {
            return;
        }
        ((com.taobao.search.refactor.g) A).a(getModel().d(), this);
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        hth A = A();
        if (!(A instanceof com.taobao.search.refactor.g)) {
            return;
        }
        ((com.taobao.search.refactor.g) A).b(getModel().d(), this);
    }

    private boolean b(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dff1bf2", new Object[]{this, oneSearchBean})).booleanValue();
        }
        if (oneSearchBean == null || !oneSearchBean.isRedirect) {
            return false;
        }
        this.z = oneSearchBean;
        this.n = ntx.a(getActivity(), 0);
        this.mActivity.finish();
        Nav.from(this.mActivity).toUri(oneSearchBean.url);
        return true;
    }

    private void b(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb56f61", new Object[]{this, sFOnesearchBean});
        } else if (sFOnesearchBean == null || !sFOnesearchBean.hideNavibar) {
        } else {
            postEvent(nxa.a.a());
        }
    }

    private void c(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b93ac0", new Object[]{this, sFOnesearchBean});
            return;
        }
        OneSearchContainer oneSearchContainer = getView() instanceof OneSearchContainer ? (OneSearchContainer) getView() : null;
        if (oneSearchContainer != null) {
            oneSearchContainer.setInterceptTouch(false);
        }
        if (sFOnesearchBean == null) {
            return;
        }
        if (!sFOnesearchBean.isFull && !sFOnesearchBean.disableHeaderScroll) {
            z = false;
        }
        if (oneSearchContainer == null || !(getModel().d() instanceof j)) {
            return;
        }
        oneSearchContainer.setInterceptTouch(z);
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    public void a(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11204cf", new Object[]{this, oneSearchBean});
            return;
        }
        try {
            if (oneSearchBean == null) {
                p();
                this.j = false;
                this.z = null;
                ViewCompat.setBackground(getView(), null);
                return;
            }
            if (nom.VALUE_YES.equals(r.a(oneSearchBean.url, nom.KEY_X_IMMERSE_STYLE))) {
                oneSearchBean.url = r.a(oneSearchBean.url, "offsetbottom", String.valueOf(Math.ceil(l.c(12))));
                oneSearchBean.url = r.a(oneSearchBean.url, "bottomPx", "12");
            }
            if (this.C != null) {
                oneSearchBean.url = r.a(oneSearchBean.url, p.KEY_SCREEN_STYLE, ScreenType.a(this.C.a()));
            }
            this.z = oneSearchBean;
            this.j = true;
            if (l()) {
                findView(R.id.v_non_gradient_mask).setVisibility(8);
            } else {
                findView(R.id.v_non_gradient_mask).setVisibility(0);
            }
            this.w = com.taobao.android.searchbaseframe.util.g.a(r.a(oneSearchBean.url, "_xsearchTabTextNormalColor"), (Integer) null);
            this.x = com.taobao.android.searchbaseframe.util.g.a(r.a(oneSearchBean.url, "_xsearchTabTextSelectedColor"), (Integer) null);
            this.y = Integer.valueOf(SFPromotionBean.a(r.a(oneSearchBean.url, "_xsearchStatusBarStyle")));
            if (!TextUtils.isEmpty(this.z.backgroundColor)) {
                ((FrameLayout) getView()).setBackgroundColor(com.taobao.android.searchbaseframe.util.g.a(this.z.backgroundColor, -1));
            } else {
                ViewCompat.setBackground(getView(), null);
            }
            this.l = nov.a(oneSearchBean.url);
            if (this.r) {
                this.l = 0;
                q.k("NxStrategyUtil", "NX force downgrade");
            }
            int i = this.l;
            if (i == 0) {
                c(oneSearchBean);
            } else if (i == 3) {
                d(oneSearchBean);
            } else if (i == 6) {
                e(oneSearchBean);
            }
            if (this.m) {
                postEvent(new nwk.e(this.s));
                if (this.g != null) {
                    a(TextUtils.equals(r.a(oneSearchBean.url, "_xsearchHideMaskView"), nom.VALUE_YES));
                }
            } else {
                postEvent(new nwk.f(this.s));
                if (this.g != null) {
                    this.g.setVisibility(8);
                }
            }
            if (!this.t) {
                return;
            }
            postEvent(new nwk.d(this.u));
        } catch (Exception e) {
            q.a("SFOnesearchWidget", "error bind data", e);
            this.e = null;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            if (a()) {
                this.E.setVisibility(0);
                this.h.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.E.setVisibility(8);
            this.h.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    private void c(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec330d", new Object[]{this, oneSearchBean});
        } else if (getView() == 0) {
        } else {
            x();
            if (TextUtils.equals(this.o, oneSearchBean.url)) {
                q.a("SFOnesearchWidget", "url一致，不展示");
                o();
                return;
            }
            String str = oneSearchBean.url;
            boolean b = b(str);
            int a2 = a(str);
            this.i.f19176a = a2;
            if (!TextUtils.isEmpty(str)) {
                this.o = str;
            }
            if (a2 != -1) {
                final String a3 = r.a(c(str), "_s_nx_from", oneSearchBean.from);
                int a4 = a(oneSearchBean, b, oneSearchBean.isSearchBarHidden);
                ((FrameLayout) getView()).setVisibility(0);
                a(this.i);
                if (!oneSearchBean.isFull && this.b.getView() != 0) {
                    ((FrameLayout) this.b.getView()).setBackgroundColor(0);
                }
                if (getModel() != null && getModel().d() != null && getModel().d().isMetaMode()) {
                    this.A = new Runnable() { // from class: com.taobao.search.sf.widgets.onesearch.c.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.b(c.this).a(a3);
                            }
                        }
                    };
                    if (!this.B) {
                        this.B = true;
                        ((FrameLayout) getView()).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.search.sf.widgets.onesearch.c.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                                } else if (c.c(c.this) == null) {
                                } else {
                                    c.c(c.this).run();
                                    c.a(c.this, (Runnable) null);
                                }
                            }
                        });
                    }
                } else {
                    this.b.a(a3);
                }
                this.e = new h(this.b);
                b(a4);
                return;
            }
            ((FrameLayout) getView()).setVisibility(8);
            e eVar = this.b;
            if (eVar == null) {
                return;
            }
            eVar.e();
            this.b.d();
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.a(i);
        View view = this.f;
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = i;
    }

    private float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue();
        }
        String str = this.z.url;
        String a2 = r.a(str, nom.KEY_X_IMMERSE_STYLE);
        this.m = false;
        this.t = false;
        if (nom.VALUE_YES.equals(a2)) {
            this.m = true;
            String a3 = r.a(str, nom.KEY_X_NAVI_STYLE);
            if (!TextUtils.isEmpty(a3)) {
                this.t = true;
                this.u = a3;
            }
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private boolean a() {
        List<TabBean> tabs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().c().getTotalSearchResult();
        return (commonSearchResult == null || (tabs = commonSearchResult.getTabs()) == null || tabs.size() <= 1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if (r11.m != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(com.taobao.search.mmd.datasource.bean.OneSearchBean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.onesearch.c.a(com.taobao.search.mmd.datasource.bean.OneSearchBean, boolean, boolean):int");
    }

    private int a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0fea5b", new Object[]{this, new Float(f), new Float(f2)})).intValue();
        }
        ScreenType screenType = this.C;
        float f3 = 375.0f;
        if (screenType != null) {
            int a2 = screenType.a();
            if (a2 == 1) {
                f2 = 188.0f;
            } else if (a2 == 2) {
                f2 = 107.0f;
            } else if (a2 == 3) {
                f2 = 191.0f;
            }
            return (int) ((f2 * b()) / f3);
        }
        f3 = f;
        return (int) ((f2 * b()) / f3);
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = this.F;
        return i > 0 ? i : ntx.a();
    }

    public boolean l() {
        OneSearchBean oneSearchBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        com.taobao.android.meta.srp.a m = m();
        return m != null && (oneSearchBean = this.z) != null && !oneSearchBean.isFull && m.ai();
    }

    public com.taobao.android.meta.srp.a m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.srp.a) ipChange.ipc$dispatch("991a5059", new Object[]{this}) : (com.taobao.android.meta.srp.a) getModel().a();
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || str.contains(k.URL_PAY_INIT)) {
            return -1;
        }
        if (str.contains(k.URL_TRIPH_INIT)) {
            return 0;
        }
        if (str.contains(k.URL_STARSHOP_INIT)) {
            return 2;
        }
        return (!str.contains(k.URL_SIMBA) || !str.contains("f=app")) ? 9 : 2;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : TextUtils.isEmpty(str) || (!str.startsWith("http://s.m.taobao.com/page") && !str.startsWith("https://s.m.taobao.com/page"));
    }

    private void d(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d94a2c", new Object[]{this, oneSearchBean});
        } else if (getView() == 0) {
        } else {
            w();
            this.f.setVisibility(8);
            int a2 = a(oneSearchBean, b(oneSearchBean.url), oneSearchBean.isSearchBarHidden);
            final g.a a3 = g.a.a(oneSearchBean);
            a3.c = 1;
            a3.b = a2;
            ((FrameLayout) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.onesearch.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.d(c.this).a(a3);
                    }
                }
            });
            ((FrameLayout) getView()).setVisibility(0);
            this.e = new i(this.c);
        }
    }

    private void e(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6614b", new Object[]{this, oneSearchBean});
            return;
        }
        cj_();
        this.d.a(new b.a(oneSearchBean.url, a(oneSearchBean, true, oneSearchBean.isSearchBarHidden), oneSearchBean.isNewSearch));
        ((FrameLayout) getView()).setVisibility(0);
    }

    private void cj_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3ad95f", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new b(getActivity(), this, getModel(), (ViewGroup) getView(), new iug((ViewGroup) getView()));
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (getView() == 0) {
        } else {
            if (this.c == null) {
                this.c = new g(getActivity(), this, getModel(), (ViewGroup) getView(), new iug((ViewGroup) getView(), 1));
            }
            this.q = true;
        }
    }

    private void a(com.taobao.search.mmd.onesearch.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdb9656", new Object[]{this, cVar});
        } else if (getView() == 0 || this.b != null) {
        } else {
            this.b = new e(getActivity(), this, getModel(), (ViewGroup) getView(), new iug((ViewGroup) getView(), 1), this);
            this.b.b();
            this.b.a(cVar);
            this.b.attachToContainer();
        }
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (this.p) {
        } else {
            this.i = new com.taobao.search.mmd.onesearch.c();
            this.i.a(new f(getActivity(), this));
            this.p = true;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        e eVar = this.b;
        if (eVar != null) {
            eVar.d();
        }
        if (getView() == 0) {
            return;
        }
        ((FrameLayout) getView()).setVisibility(8);
    }

    private String c(String str) {
        String str2 = "?";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        try {
            if (!str.startsWith(com.etao.feimagesearch.e.h5_online) && !str.startsWith("https://h5.m.taobao.com")) {
                q.a("SFOnesearchWidget", "无需城市信息");
                return str;
            }
            TBLocationDTO a2 = nnq.a();
            if (a2 == null) {
                q.a("SFOnesearchWidget", "获取地理位置失败");
                return str;
            }
            String cityName = a2.getCityName();
            if (TextUtils.isEmpty(cityName)) {
                q.a("SFOnesearchWidget", "获取城市失败");
                return str;
            }
            if (str.contains(str2)) {
                str2 = "&";
            }
            String str3 = str + str2 + "onesearchCity=" + cityName;
            q.a("SFOnesearchWidget", "添加城市：" + str3);
            return str3;
        } catch (Exception unused) {
            q.b("SFOnesearchWidget", "添加城市名称失败");
            return str;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if ((!this.p && !this.q) || !this.j || getView() == 0) {
        } else {
            ((FrameLayout) getView()).setVisibility(0);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!this.p && !this.q) {
        } else {
            if (getView() != 0) {
                ((FrameLayout) getView()).setVisibility(8);
            }
            postEvent(new nwk.c());
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.r = true;
        a(this.z);
    }

    public OneSearchBean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OneSearchBean) ipChange.ipc$dispatch("7e271223", new Object[]{this}) : this.z;
    }

    @Override // tb.iom
    public int aK_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9088278f", new Object[]{this})).intValue();
        }
        if (this.z != null) {
            return this.n;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        z();
        com.taobao.search.mmd.util.k.a((View) getView());
        this.A = null;
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        onComponentDestroy();
        this.A = null;
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        com.taobao.search.sf.widgets.onesearch.a aVar = this.e;
        if (aVar != null) {
            if (this.G < 0.5f && f >= 0.5f) {
                aVar.d();
            } else if (this.G >= 0.5f && f < 0.5f) {
                this.e.e();
            }
        }
        this.G = f;
        if (!z) {
            return;
        }
        ((FrameLayout) getView()).setAlpha(f);
        postEvent(iqt.a.a((int) ((1.0f - f) * aK_())));
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
            return;
        }
        com.taobao.search.sf.widgets.onesearch.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
            return;
        }
        com.taobao.search.sf.widgets.onesearch.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        OneSearchBean oneSearchBean = this.z;
        if ((oneSearchBean != null && (oneSearchBean.isNewSearch || this.z.isFull)) || !d()) {
            return 0;
        }
        return DensityUtil.dip2px(Globals.getApplication(), 10.0f);
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
        } else {
            ((FrameLayout) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.onesearch.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c cVar = c.this;
                    cVar.a(c.a(cVar));
                }
            });
        }
    }

    @Override // com.taobao.search.mmd.onesearch.f
    public void a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d86eb9", new Object[]{this, str, str2, wVCallBackContext});
        } else if ("getData".equals(str)) {
            android.taobao.windvane.jsbridge.r rVar = new android.taobao.windvane.jsbridge.r();
            rVar.a("data", this.D.model);
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.error("action " + str + " 暂不支持");
        }
    }

    @Override // com.taobao.search.refactor.a
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            this.e.c();
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f19557a;

        static {
            kge.a(666652727);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }

        private a() {
            this.f19557a = false;
        }
    }

    public void onEventMainThread(nwk.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12482910", new Object[]{this, gVar});
        } else {
            t();
        }
    }

    public void onEventMainThread(iqt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, aVar});
        } else if (!getModel().g()) {
        } else {
            c(Math.abs(aVar.f29233a));
            if (getModel().d().isMetaMode()) {
                return;
            }
            ((FrameLayout) getView()).setTranslationY(aVar.f29233a);
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.search.sf.widgets.onesearch.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (i >= this.n && this.v) {
            this.v = false;
            aVar.b();
        } else if (i >= this.n || this.v) {
        } else {
            this.v = true;
            this.e.a();
        }
    }

    private hth A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hth) ipChange.ipc$dispatch("18d0ffe2", new Object[]{this}) : (hth) getModel().e().b("controller");
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (this.e == null || !this.j || !getModel().g()) {
            return;
        }
        this.e.a();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        if (this.e == null || !this.j || !getModel().g()) {
            return;
        }
        this.e.b();
    }

    @Override // tb.iom
    public boolean d() {
        OneSearchBean oneSearchBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        OneSearchBean oneSearchBean2 = this.z;
        if (oneSearchBean2 != null && oneSearchBean2.isNewSearch) {
            return false;
        }
        return this.m || ((oneSearchBean = this.z) != null && !TextUtils.isEmpty(oneSearchBean.backgroundColor));
    }

    @Override // tb.iom
    public Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.w;
    }

    @Override // tb.iom
    public Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.x;
    }

    @Override // tb.iom
    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.y;
    }
}
