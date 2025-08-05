package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ah;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.taobao.R;
import tb.fqi;
import tb.gai;
import tb.gaj;
import tb.gak;
import tb.gar;
import tb.gat;
import tb.gaw;
import tb.kge;

/* loaded from: classes5.dex */
public class WaterfallLayout implements d, TBSwipeRefreshLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView A;
    private TBSwipeRefreshLayout B;
    private TBAbsRefreshHeader C;
    private DXNestedScrollerView D;
    private boolean E;
    private boolean F;
    private com.taobao.android.dinamicx.widget.recycler.b G;
    private int H;
    private boolean I;
    private boolean J;
    private DXRefreshLayout K;
    private gar L;
    private gai M;
    private int N;
    private int O;
    private o P;
    private String Q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12120a;
    public boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String[] q;
    private String[] r;
    private TBSwipeRefreshLayout.b s;
    private TBSwipeRefreshLayout.c t;
    private RecyclerView.OnScrollListener u;
    private WaterfallLayoutRelativeLayout v;
    private StickyLayout w;
    private k x;
    private j y;
    private RecyclerView.LayoutManager z;

    static {
        kge.a(-1583751132);
        kge.a(902792211);
        kge.a(1075213739);
    }

    private WaterfallLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String[] strArr, String[] strArr2, boolean z3, TBAbsRefreshHeader tBAbsRefreshHeader, DXNestedScrollerView dXNestedScrollerView, boolean z4, boolean z5, int i12, boolean z6, boolean z7, gai gaiVar, int i13, int i14, o oVar, String str) {
        this.c = 1;
        this.d = -1;
        this.f12120a = false;
        this.b = true;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = z;
        this.o = z2;
        this.q = strArr;
        this.r = strArr2;
        this.p = z3;
        this.C = tBAbsRefreshHeader;
        this.D = dXNestedScrollerView;
        this.E = z4;
        this.F = z5;
        this.H = i12;
        this.I = z6;
        this.J = z7;
        this.M = gaiVar;
        this.N = i13;
        this.O = i14;
        this.P = oVar;
        this.Q = str;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String[] strArr, String[] strArr2, boolean z3, boolean z4, int i12, int i13, boolean z5) {
        boolean z6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e08bf9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11), new Boolean(z), new Boolean(z2), strArr, strArr2, new Boolean(z3), new Boolean(z4), new Integer(i12), new Integer(i13), new Boolean(z5)});
            return;
        }
        if (this.v != null) {
            if (this.l != i10 || this.m != i11) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                marginLayoutParams.leftMargin = i10;
                marginLayoutParams.rightMargin = i11;
                this.v.setLayoutParams(marginLayoutParams);
            }
            if (this.h != i6 || this.k != i9 || this.i != i7 || this.j != i8) {
                this.v.setPadding(i6, i8, i7, i9);
            }
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.B;
        if (tBSwipeRefreshLayout != null) {
            if (z) {
                tBSwipeRefreshLayout.enablePullRefresh(true);
            } else {
                tBSwipeRefreshLayout.enablePullRefresh(false);
            }
            if (z2) {
                this.B.enableLoadMore(true);
            } else {
                this.B.enableLoadMore(false);
            }
            this.B.setLoadMoreTips(strArr2);
            this.B.setRefreshTips(strArr);
            this.B.setOnChildScrollUpCallback(this);
        }
        if (this.A != null) {
            k kVar = this.x;
            if (kVar != null) {
                kVar.a();
            }
            if (this.e != i3 || this.f != i4 || this.g != i5 || this.c != i) {
                this.A.removeItemDecoration(this.y);
                this.y = new j(i3, i4, i5, i, z4);
                this.A.addItemDecoration(this.y);
            }
            z6 = z3;
            if (z6) {
                this.A.setOverScrollMode(2);
            } else {
                this.A.setOverScrollMode(0);
            }
            if (this.c != i) {
                this.c = i;
                if (z5 && (this.z instanceof StaggeredGridLayoutManager) && !com.taobao.android.dinamicx.model.f.e()) {
                    ((StaggeredGridLayoutManager) this.z).setSpanCount(i);
                } else {
                    this.z = c();
                    this.A.setLayoutManager(this.z);
                }
            }
        } else {
            z6 = z3;
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = z;
        this.o = z2;
        this.q = strArr;
        this.r = strArr2;
        this.p = z6;
        this.N = i12;
        this.O = i13;
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        a(dXRefreshLayout);
    }

    public View a(Context context, boolean z) {
        ViewGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("70c03db6", new Object[]{this, context, new Boolean(z)});
        }
        this.v = new WaterfallLayoutRelativeLayout(context);
        this.v.setTranslationY(-1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.leftMargin = this.l;
        marginLayoutParams.rightMargin = this.m;
        this.v.setLayoutParams(marginLayoutParams);
        this.v.setPadding(this.h, this.j, this.i, this.k);
        View b2 = b(context);
        RecyclerView recyclerView = this.A;
        if (!z) {
            a2 = a(context, b2);
        } else {
            a2 = a(context, b2, recyclerView);
        }
        this.v.addView(a2, -1, -1);
        if (this.D.getmRootList() == null) {
            this.D.addView(this.v);
            this.D.setRoot(recyclerView);
            return this.D;
        }
        DXNestedScrollerView dXNestedScrollerView = this.D;
        if (dXNestedScrollerView != null && dXNestedScrollerView.getmChildList() == null) {
            this.D.setCurrentChild(recyclerView);
        }
        return this.v;
    }

    private View b(Context context) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        DXRecyclerView a2 = a(context);
        this.x = new k(this.I);
        a2.addItemDecoration(this.x);
        this.y = new j(this.e, this.f, this.g, this.c, this.E);
        a2.addItemDecoration(this.y);
        this.A = a2;
        RecyclerView.OnScrollListener onScrollListener = this.u;
        if (onScrollListener != null && (recyclerView = this.A) != null) {
            recyclerView.addOnScrollListener(onScrollListener);
        }
        a(a2, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(a2);
        this.w = new StickyLayout(context);
        this.w.setRecyclerView(this.A);
        frameLayout.addView(this.w, -1, -1);
        this.x.a(this.w);
        this.w.setHeightUpdateListener(this);
        return frameLayout;
    }

    private ViewGroup a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ec988163", new Object[]{this, context, view});
        }
        this.B = new TBSwipeRefreshLayout(context);
        this.B.setOnChildScrollUpCallback(this);
        TBAbsRefreshHeader tBAbsRefreshHeader = this.C;
        if (tBAbsRefreshHeader != null) {
            this.B.setHeaderView(tBAbsRefreshHeader);
        }
        if (this.n) {
            this.B.enablePullRefresh(true);
        }
        if (this.o) {
            this.B.enableLoadMore(true);
        }
        TBSwipeRefreshLayout.c cVar = this.t;
        if (cVar != null) {
            this.B.setOnPushLoadMoreListener(cVar);
        }
        TBSwipeRefreshLayout.b bVar = this.s;
        if (bVar != null) {
            this.B.setOnPullRefreshListener(bVar);
        }
        this.B.setLoadMoreTips(this.r);
        this.B.setRefreshTips(this.q);
        this.B.addView(view);
        return this.B;
    }

    private ViewGroup a(Context context, View view, final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a97aa675", new Object[]{this, context, view, recyclerView});
        }
        this.K = new DXRefreshLayout(context);
        a(this.K);
        this.K.setEnableScrollContentWhenLoaded(true);
        this.K.setScrollBoundaryDecider(new gat() { // from class: com.taobao.android.dinamicx.widget.recycler.WaterfallLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode != -1862045107) {
                    if (hashCode != -1795038354) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    return new Boolean(super.a((View) objArr[0]));
                }
                return new Boolean(super.b((View) objArr[0]));
            }

            @Override // tb.gat, tb.gao
            public boolean a(View view2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view2})).booleanValue() : super.a(recyclerView);
            }

            @Override // tb.gat, tb.gao
            public boolean b(View view2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9103724d", new Object[]{this, view2})).booleanValue() : super.b(recyclerView);
            }
        });
        this.K.setRefreshContent(view);
        return this.K;
    }

    private void a(DXRefreshLayout dXRefreshLayout) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416df561", new Object[]{this, dXRefreshLayout});
        } else if (dXRefreshLayout == null || (context = dXRefreshLayout.getContext()) == null) {
        } else {
            if (this.J) {
                if (this.M == null) {
                    this.M = new gaj(context);
                }
                dXRefreshLayout.setEnablePullLoadMore(true);
            } else {
                dXRefreshLayout.setEnablePullLoadMore(false);
                if (this.n) {
                    if (this.M == null) {
                        this.M = new gak(context, this.C);
                    }
                    dXRefreshLayout.setHeaderHeightPx((int) context.getResources().getDimension(R.dimen.uik_refresh_header_height));
                    dXRefreshLayout.setEnableRefresh(true);
                } else {
                    dXRefreshLayout.setEnableRefresh(false);
                }
            }
            if (fqi.ap()) {
                dXRefreshLayout.setEnableLoadMore(false);
            } else {
                dXRefreshLayout.setEnableLoadMore(true);
            }
            gai gaiVar = this.M;
            if (gaiVar != null) {
                gaiVar.a(this.q);
                this.M.a(this.N);
                this.M.b(this.O);
                dXRefreshLayout.setRefreshHeader(this.M);
            }
            gar garVar = this.L;
            if (garVar == null) {
                return;
            }
            gai gaiVar2 = this.M;
            if (gaiVar2 != null) {
                gaiVar2.a(garVar);
            }
            dXRefreshLayout.setOnRefreshListener(this.L);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f12120a = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public RecyclerView b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("b91610bb", new Object[]{this}) : this.A;
    }

    public TBSwipeRefreshLayout o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("644d86ca", new Object[]{this}) : this.B;
    }

    public void a(com.taobao.android.dinamicx.widget.recycler.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7553230", new Object[]{this, aVar});
            return;
        }
        this.A.setAdapter(aVar);
        aVar.a(this.A);
        this.x.a(aVar);
    }

    public void a(RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb707af2", new Object[]{this, recyclerView, context});
            return;
        }
        this.A = recyclerView;
        if (this.F) {
            recyclerView.setItemAnimator(new DefaultItemAnimator());
        } else {
            recyclerView.setItemAnimator(null);
        }
        recyclerView.setHasFixedSize(true);
        if (this.p) {
            recyclerView.setOverScrollMode(2);
        }
        this.z = c();
        recyclerView.setDescendantFocusability(131072);
        recyclerView.setLayoutManager(this.z);
        recyclerView.setClipToPadding(false);
        recyclerView.setSaveEnabled(false);
    }

    public DXRecyclerView a(Context context) {
        DXRecyclerView waterFallLayoutCustomRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("5e639587", new Object[]{this, context});
        }
        o oVar = this.P;
        return (oVar == null || (waterFallLayoutCustomRecyclerView = oVar.getWaterFallLayoutCustomRecyclerView(context)) == null) ? new DXRecyclerView(context) : waterFallLayoutCustomRecyclerView;
    }

    public RecyclerView.LayoutManager c() {
        i waterFallLayoutCustomLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("6e1b805b", new Object[]{this});
        }
        o oVar = this.P;
        if (oVar != null && (waterFallLayoutCustomLayoutManager = oVar.getWaterFallLayoutCustomLayoutManager(this.c, this.H, this)) != null) {
            return waterFallLayoutCustomLayoutManager;
        }
        if (this.H == 0) {
            return new i(this.c, 0, this);
        }
        return new i(this.c, 1, this);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.A.removeItemDecoration(this.x);
        this.A.addItemDecoration(this.x);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.B;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.autoRefresh();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.B;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setAutoRefreshing(true);
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.finishRefresh();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.autoPullDownLoadMore();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.finishPullDownLoadMore();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.failPullDownLoadMore();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        dXRefreshLayout.noDataPullDownLoadMore();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout != null) {
            return dXRefreshLayout.isPullDownLoading();
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout != null) {
            return dXRefreshLayout.isPullDownNoData();
        }
        return false;
    }

    public void a(final TBSwipeRefreshLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ed0414", new Object[]{this, bVar});
            return;
        }
        this.s = bVar;
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.B;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setOnPullRefreshListener(bVar);
        } else if (this.K == null) {
        } else {
            if (bVar != null) {
                a(new gar() { // from class: com.taobao.android.dinamicx.widget.recycler.WaterfallLayout.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.gaq
                    public void a(DXRefreshLayout dXRefreshLayout) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("416df561", new Object[]{this, dXRefreshLayout});
                        } else {
                            bVar.a();
                        }
                    }

                    @Override // tb.gas
                    public void a(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7d917981", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
                            return;
                        }
                        gaw.a(dXRefreshState, TBAbsRefreshHeader.RefreshState.NONE);
                        gaw.a(dXRefreshState2, TBAbsRefreshHeader.RefreshState.NONE);
                    }
                });
            } else {
                a((gar) null);
            }
        }
    }

    private void a(gar garVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e3d100", new Object[]{this, garVar});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.K;
        if (dXRefreshLayout == null) {
            return;
        }
        this.L = garVar;
        dXRefreshLayout.setOnRefreshListener(garVar);
        gai gaiVar = this.M;
        if (gaiVar == null) {
            return;
        }
        gaiVar.a(garVar);
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
            return;
        }
        this.u = onScrollListener;
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            return;
        }
        recyclerView.clearOnScrollListeners();
        this.A.addOnScrollListener(onScrollListener);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.a
    public boolean a(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cdc5416", new Object[]{this, tBSwipeRefreshLayout})).booleanValue();
        }
        if (!fqi.w(this.Q)) {
            return !this.b;
        }
        RecyclerView b2 = b();
        if (b2 == null) {
            return true;
        }
        if (b2 == this.D.getmChildList()) {
            return !this.D.isChildReachTop();
        }
        RecyclerView.LayoutManager layoutManager = b2.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return true;
        }
        RecyclerView.Adapter adapter = b2.getAdapter();
        if (!(adapter instanceof h)) {
            return true;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
        int i = iArr[0];
        if (i < 0 || adapter.getItemCount() == 0) {
            return true;
        }
        if (i == 0) {
            return !this.D.isChildReachTop();
        }
        for (int i2 = 0; i2 < i && i <= adapter.getItemCount(); i2++) {
            if (!(((h) adapter).c(i2, true) instanceof ah)) {
                return true;
            }
        }
        return !this.D.isChildReachTop();
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61df1577", new Object[]{this, bVar});
            return;
        }
        WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout = this.v;
        if (waterfallLayoutRelativeLayout == null) {
            return;
        }
        waterfallLayoutRelativeLayout.setClipRadiusHandler(bVar);
    }

    public com.taobao.android.dinamicx.view.a l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.view.a) ipChange.ipc$dispatch("2c7fce8", new Object[]{this});
        }
        WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout = this.v;
        if (waterfallLayoutRelativeLayout == null) {
            return null;
        }
        return waterfallLayoutRelativeLayout.getCLipRadiusHandler();
    }

    /* loaded from: classes5.dex */
    public class WaterfallLayoutRelativeLayout extends RelativeLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.android.dinamicx.view.a cLipRadiusHandler;

        static {
            kge.a(27482738);
        }

        public static /* synthetic */ Object ipc$super(WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout, String str, Object... objArr) {
            if (str.hashCode() == 623593120) {
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public WaterfallLayoutRelativeLayout(Context context) {
            super(context);
        }

        public WaterfallLayoutRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public WaterfallLayoutRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void setClipRadiusHandler(com.taobao.android.dinamicx.view.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32bf7192", new Object[]{this, aVar});
            } else {
                this.cLipRadiusHandler = aVar;
            }
        }

        public com.taobao.android.dinamicx.view.a getCLipRadiusHandler() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.a) ipChange.ipc$dispatch("d24e3242", new Object[]{this}) : this.cLipRadiusHandler;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
                return;
            }
            com.taobao.android.dinamicx.view.a aVar = this.cLipRadiusHandler;
            if (aVar == null) {
                super.dispatchDraw(canvas);
            } else if (aVar.a()) {
                super.dispatchDraw(canvas);
            } else {
                this.cLipRadiusHandler.a(this, canvas);
                super.dispatchDraw(canvas);
                this.cLipRadiusHandler.b(this, canvas);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends com.taobao.android.dinamicx.view.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2103805428);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 91915245) {
                return new Boolean(super.b());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.android.dinamicx.view.a
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : super.b() && !"VTR-AL00".equals(Build.MODEL);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int A;
        private String B;

        /* renamed from: a  reason: collision with root package name */
        private int f12123a = 1;
        private int b = -1;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private boolean l;
        private boolean m;
        private String[] n;
        private String[] o;
        private boolean p;
        private TBAbsRefreshHeader q;
        private DXNestedScrollerView r;
        private boolean s;
        private boolean t;
        private int u;
        private boolean v;
        private boolean w;
        private gai x;
        private o y;
        private int z;

        static {
            kge.a(-1073720581);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3474c4b", new Object[]{this, new Integer(i)});
            }
            this.f12123a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5fb548aa", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fc234509", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("98914168", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34ff3dc7", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d16d3a26", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ecfe445c", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("896c40bb", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25da3d1a", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public a a(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c319f67", new Object[]{this, strArr});
            }
            this.n = strArr;
            return this;
        }

        public a g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6ddb3685", new Object[]{this, new Integer(i)});
            }
            this.z = i;
            return this;
        }

        public a h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a4932e4", new Object[]{this, new Integer(i)});
            }
            this.A = i;
            return this;
        }

        public a a(TBAbsRefreshHeader tBAbsRefreshHeader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("33563f7", new Object[]{this, tBAbsRefreshHeader});
            }
            this.q = tBAbsRefreshHeader;
            return this;
        }

        public a a(DXNestedScrollerView dXNestedScrollerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed480ff", new Object[]{this, dXNestedScrollerView});
            }
            this.r = dXNestedScrollerView;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c2483979", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a6b72f43", new Object[]{this, new Integer(i)});
            }
            this.u = i;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5eb635d8", new Object[]{this, new Boolean(z)});
            }
            this.v = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fb243237", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public a a(gai gaiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c002dd9", new Object[]{this, gaiVar});
            }
            this.x = gaiVar;
            return this;
        }

        public a a(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("357614d", new Object[]{this, oVar});
            }
            this.y = oVar;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d08106a2", new Object[]{this, str});
            }
            this.B = str;
            return this;
        }

        public WaterfallLayout a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WaterfallLayout) ipChange.ipc$dispatch("e3f57ff5", new Object[]{this}) : new WaterfallLayout(this.f12123a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.z, this.A, this.y, this.B);
        }
    }

    public RecyclerView.OnScrollListener m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("caf4a322", new Object[]{this}) : this.u;
    }

    public com.taobao.android.dinamicx.widget.recycler.b n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.recycler.b) ipChange.ipc$dispatch("3cfcc05c", new Object[]{this}) : this.G;
    }

    public void a(com.taobao.android.dinamicx.widget.recycler.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755a68f", new Object[]{this, bVar});
            return;
        }
        this.G = bVar;
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setOnTouchListener(bVar);
    }
}
