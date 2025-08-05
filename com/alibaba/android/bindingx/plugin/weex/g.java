package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.android.bindingx.core.internal.l;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.ui.component.WXRefresh;
import com.taobao.weex.ui.component.WXScroller;
import com.taobao.weex.ui.component.list.WXListComponent;
import com.taobao.weex.ui.view.WXHorizontalScrollView;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView;
import com.taobao.weex.utils.WXUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.mto;

/* loaded from: classes2.dex */
public class g extends com.alibaba.android.bindingx.core.internal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, a> v = new HashMap<>();
    private RecyclerView.OnScrollListener p;
    private WXSwipeLayout.OnRefreshOffsetChangedListener q;
    private WXScrollView.WXScrollViewListener r;
    private WXHorizontalScrollView.ScrollViewListener s;
    private AppBarLayout.a t;
    private boolean u;
    private String w;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2263a;
        public int b;

        public a(int i, int i2) {
            this.f2263a = i;
            this.b = i2;
        }
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : (i > 0 && i2 > 0) || (i < 0 && i2 < 0);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1340024952:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                return null;
            case 69046641:
                super.a((String) objArr[0], (Map) objArr[1], (l) objArr[2], (List) objArr[3], (d.a) objArr[4]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            case 1708636289:
                return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
            case 2084203519:
                super.a((String) objArr[0], ((Number) objArr[1]).doubleValue(), ((Number) objArr[2]).doubleValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).doubleValue(), ((Number) objArr[6]).doubleValue(), (Object[]) objArr[7]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ String a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f3bcea3", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ void a(g gVar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66fa2fd", new Object[]{gVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            super.a(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ void a(g gVar, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba015aa", new Object[]{gVar, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            super.a(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ boolean a(g gVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c1220c1", new Object[]{gVar, new Integer(i), new Integer(i2)})).booleanValue() : gVar.a(i, i2);
    }

    public static /* synthetic */ String b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96b56c2", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ void b(g gVar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc3f83e", new Object[]{gVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            super.a(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ void b(g gVar, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac6a509", new Object[]{gVar, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            super.a(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ int c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d56792", new Object[]{gVar})).intValue() : gVar.n;
    }

    public static /* synthetic */ void c(g gVar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19184d7f", new Object[]{gVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            super.a(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ void c(g gVar, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ed3468", new Object[]{gVar, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            super.a(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ int d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f0193", new Object[]{gVar})).intValue() : gVar.n;
    }

    public static /* synthetic */ void d(g gVar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ca2c0", new Object[]{gVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            super.a(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ void d(g gVar, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d913c3c7", new Object[]{gVar, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            gVar.a(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ String e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47f9ef1f", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ HashMap e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[0]) : v;
    }

    public static /* synthetic */ String f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b229773e", new Object[]{gVar}) : gVar.w;
    }

    public static /* synthetic */ boolean g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbcfa7", new Object[]{gVar})).booleanValue() : gVar.u;
    }

    public static /* synthetic */ String h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8688877c", new Object[]{gVar}) : gVar.e;
    }

    public g(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.u = false;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        WXSwipeLayout swipeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        WXScroller b2 = i.b(TextUtils.isEmpty(this.f) ? this.e : this.f, str);
        if (b2 == null) {
            com.alibaba.android.bindingx.core.h.d("[ExpressionScrollHandler]source component not found.");
            return false;
        }
        this.w = str;
        if (b2 instanceof WXScroller) {
            WXScroller wXScroller = b2;
            BounceScrollerView bounceScrollerView = (ViewGroup) wXScroller.getHostView();
            if (bounceScrollerView != null && (bounceScrollerView instanceof BounceScrollerView) && (swipeLayout = bounceScrollerView.getSwipeLayout()) != null) {
                this.q = new e();
                swipeLayout.addOnRefreshOffsetChangedListener(this.q);
            }
            WXHorizontalScrollView innerView = wXScroller.getInnerView();
            if (innerView != null && (innerView instanceof WXScrollView)) {
                this.r = new d();
                ((WXScrollView) innerView).addScrollViewListener(this.r);
                return true;
            } else if (innerView != null && (innerView instanceof WXHorizontalScrollView)) {
                this.s = new d();
                innerView.addScrollViewListener(this.s);
                return true;
            }
        } else if (b2 instanceof WXListComponent) {
            WXListComponent wXListComponent = (WXListComponent) b2;
            BounceRecyclerView bounceRecyclerView = (BounceRecyclerView) wXListComponent.getHostView();
            if (bounceRecyclerView != null) {
                WXSwipeLayout swipeLayout2 = bounceRecyclerView.getSwipeLayout();
                if (swipeLayout2 != null) {
                    this.q = new e();
                    swipeLayout2.addOnRefreshOffsetChangedListener(this.q);
                }
                WXRecyclerView wXRecyclerView = (WXRecyclerView) bounceRecyclerView.getInnerView();
                boolean z = wXListComponent.getOrientation() == 1;
                if (wXRecyclerView != null) {
                    HashMap<String, a> hashMap = v;
                    if (hashMap != null && hashMap.get(str) == null) {
                        v.put(str, new a(0, 0));
                    }
                    this.p = new c(z, new WeakReference(wXListComponent));
                    wXRecyclerView.addOnScrollListener(this.p);
                    return true;
                }
            }
        } else if (b2.mo1286getHostView() != null && (b2.mo1286getHostView() instanceof AppBarLayout)) {
            this.t = new b();
            ((AppBarLayout) b2.mo1286getHostView()).addOnOffsetChangedListener(this.t);
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map == null) {
            return;
        }
        this.u = WXUtils.getBoolean(map.get("disabledNormalize"), false).booleanValue();
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
        } else {
            super.a(str, map, lVar, list, aVar);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        BounceRecyclerView bounceRecyclerView;
        RecyclerView.OnScrollListener onScrollListener;
        WXHorizontalScrollView.ScrollViewListener scrollViewListener;
        WXScrollView.WXScrollViewListener wXScrollViewListener;
        WXSwipeLayout swipeLayout;
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        super.b(str, str2);
        if (v != null && !TextUtils.isEmpty(this.w) && (aVar = v.get(this.w)) != null) {
            aVar.f2263a = this.n;
            aVar.b = this.o;
        }
        WXScroller b2 = i.b(TextUtils.isEmpty(this.f) ? this.e : this.f, str);
        if (b2 == null) {
            com.alibaba.android.bindingx.core.h.d("[ExpressionScrollHandler]source component not found.");
            return false;
        }
        if (b2 instanceof WXScroller) {
            WXScroller wXScroller = b2;
            BounceScrollerView bounceScrollerView = (ViewGroup) wXScroller.getHostView();
            if (bounceScrollerView != null && (bounceScrollerView instanceof BounceScrollerView) && (swipeLayout = bounceScrollerView.getSwipeLayout()) != null && (onRefreshOffsetChangedListener = this.q) != null) {
                swipeLayout.removeOnRefreshOffsetChangedListener(onRefreshOffsetChangedListener);
            }
            WXHorizontalScrollView innerView = wXScroller.getInnerView();
            if (innerView != null && (innerView instanceof WXScrollView) && (wXScrollViewListener = this.r) != null) {
                ((WXScrollView) innerView).removeScrollViewListener(wXScrollViewListener);
                return true;
            } else if (innerView != null && (innerView instanceof WXHorizontalScrollView) && (scrollViewListener = this.s) != null) {
                innerView.removeScrollViewListener(scrollViewListener);
                return true;
            }
        } else if ((b2 instanceof WXListComponent) && (bounceRecyclerView = (BounceRecyclerView) ((WXListComponent) b2).getHostView()) != null) {
            if (bounceRecyclerView.getSwipeLayout() != null && this.q != null) {
                bounceRecyclerView.getSwipeLayout().removeOnRefreshOffsetChangedListener(this.q);
            }
            WXRecyclerView wXRecyclerView = (WXRecyclerView) bounceRecyclerView.getInnerView();
            if (wXRecyclerView != null && (onScrollListener = this.p) != null) {
                wXRecyclerView.removeOnScrollListener(onScrollListener);
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.p = null;
        this.r = null;
        this.t = null;
        HashMap<String, a> hashMap = v;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    /* loaded from: classes2.dex */
    public class b implements AppBarLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private int d;

        private b() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ad92cd2", new Object[]{bVar})).intValue() : bVar.b;
        }

        @Override // android.support.design.widget.AppBarLayout.a
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4cc97e1", new Object[]{this, appBarLayout, new Integer(i)});
                return;
            }
            int i2 = -i;
            final int i3 = i2 - this.b;
            this.b = i2;
            if (i3 == 0) {
                return;
            }
            if (!g.a(g.this, i3, this.d)) {
                this.c = this.b;
            } else {
                z = false;
            }
            int i4 = this.b;
            final int i5 = i4 - this.c;
            this.d = i3;
            if (z) {
                g.a(g.this, BindingXConstants.STATE_TURNING, mto.a.GEO_NOT_SUPPORT, i4, mto.a.GEO_NOT_SUPPORT, i3, mto.a.GEO_NOT_SUPPORT, i5, new Object[0]);
            }
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.g.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.a(g.this, 0, b.a(b.this), 0, i3, 0, i5);
                    }
                }
            }, g.a(g.this));
        }
    }

    /* loaded from: classes2.dex */
    public class d implements WXHorizontalScrollView.ScrollViewListener, WXScrollView.WXScrollViewListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40baada1", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollStopped(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("253d571a", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollToBottom(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3770d2b", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            }
        }

        private d() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }

        public static /* synthetic */ int a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ada1590", new Object[]{dVar})).intValue() : dVar.b;
        }

        public static /* synthetic */ int b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e653351", new Object[]{dVar})).intValue() : dVar.c;
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScroll(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0964985", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            } else {
                a(i, i2);
            }
        }

        public void onScrollChanged(WXHorizontalScrollView wXHorizontalScrollView, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3f3241d", new Object[]{this, wXHorizontalScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                a(i, i2);
            }
        }

        private void a(int i, int i2) {
            int i3;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            final int i4 = i - this.b;
            final int i5 = i2 - this.c;
            this.b = i;
            this.c = i2;
            if (i4 == 0 && i5 == 0) {
                return;
            }
            if (!g.a(g.this, i5, this.g)) {
                this.e = this.c;
            } else {
                z = false;
            }
            int i6 = this.b;
            int i7 = i6 - this.d;
            int i8 = this.c;
            final int i9 = i8 - this.e;
            this.f = i4;
            this.g = i5;
            if (z) {
                i3 = i7;
                g.b(g.this, BindingXConstants.STATE_TURNING, i6, i8, i4, i5, i7, i9, new Object[0]);
            } else {
                i3 = i7;
            }
            final int i10 = i3;
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.g.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.b(g.this, d.a(d.this), d.b(d.this), i4, i5, i10, i9);
                    }
                }
            }, g.b(g.this));
        }
    }

    /* loaded from: classes2.dex */
    public class e implements WXSwipeLayout.OnRefreshOffsetChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private int d;

        private e() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        public static /* synthetic */ int a(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ada89ef", new Object[]{eVar})).intValue() : eVar.b;
        }

        @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
        public void onOffsetChanged(int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = -i;
            final int i3 = i2 - this.b;
            this.b = i2;
            if (i3 == 0) {
                return;
            }
            if (!g.a(g.this, i3, this.d)) {
                this.c = this.b;
            } else {
                z = false;
            }
            final int i4 = this.b - this.c;
            this.d = i3;
            if (z) {
                g gVar = g.this;
                g.c(gVar, BindingXConstants.STATE_TURNING, g.c(gVar), this.b, mto.a.GEO_NOT_SUPPORT, i3, mto.a.GEO_NOT_SUPPORT, i4, new Object[0]);
            }
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.g.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.c(g.this, g.d(g.this), e.a(e.this), 0, i3, 0, i4);
                    }
                }
            }, g.e(g.this));
        }
    }

    /* loaded from: classes2.dex */
    public class c extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private int d = 0;
        private int e = 0;
        private int f = 0;
        private int g = 0;
        private boolean h;
        private WeakReference<WXListComponent> i;

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ad9a131", new Object[]{cVar})).intValue() : cVar.b;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e64bef2", new Object[]{cVar})).intValue() : cVar.c;
        }

        public c(boolean z, WeakReference<WXListComponent> weakReference) {
            a aVar;
            this.b = 0;
            this.c = 0;
            this.h = z;
            this.i = weakReference;
            if (TextUtils.isEmpty(g.f(g.this)) || g.e() == null || (aVar = (a) g.e().get(g.f(g.this))) == null) {
                return;
            }
            this.b = aVar.f2263a;
            this.c = aVar.b;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, final int i, final int i2) {
            boolean z;
            WeakReference<WXListComponent> weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            if (ViewCompat.isInLayout(recyclerView) && (weakReference = this.i) != null && weakReference.get() != null) {
                if (!g.g(g.this)) {
                    WXListComponent wXListComponent = this.i.get();
                    this.c = Math.abs(wXListComponent.calcContentOffset(recyclerView)) - ((wXListComponent.getChild(0) == null || !(wXListComponent.getChild(0) instanceof WXRefresh)) ? 0 : (int) wXListComponent.getChild(0).getLayoutHeight());
                } else {
                    this.c += i2;
                }
            } else {
                this.c += i2;
            }
            this.b += i;
            if (g.a(g.this, i, this.f) || this.h) {
                z = false;
            } else {
                this.d = this.b;
                z = true;
            }
            if (!g.a(g.this, i2, this.g) && this.h) {
                this.e = this.c;
                z = true;
            }
            int i3 = this.b;
            final int i4 = i3 - this.d;
            int i5 = this.c;
            final int i6 = i5 - this.e;
            this.f = i;
            this.g = i2;
            if (z) {
                g.d(g.this, BindingXConstants.STATE_TURNING, i3, i5, i, i2, i4, i6, new Object[0]);
            }
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.g.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.d(g.this, c.a(c.this), c.b(c.this), i, i2, i4, i6);
                    }
                }
            }, g.h(g.this));
        }
    }
}
