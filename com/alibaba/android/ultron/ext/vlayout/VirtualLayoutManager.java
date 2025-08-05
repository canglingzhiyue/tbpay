package com.alibaba.android.ultron.ext.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.alibaba.android.ultron.ext.vlayout.extend.PerformanceMonitor;
import com.alibaba.android.ultron.ext.vlayout.extend.ViewLifeCycleHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.bln;
import tb.blo;
import tb.blp;
import tb.blq;
import tb.bls;
import tb.kge;

/* loaded from: classes2.dex */
public class VirtualLayoutManager extends com.alibaba.android.ultron.ext.vlayout.b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static com.alibaba.android.ultron.ext.vlayout.c A = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static boolean d;
    private com.alibaba.android.ultron.ext.vlayout.c B;
    private f C;
    private Rect D;
    private boolean E;
    private int F;
    private boolean G;
    public g e;
    public g f;
    private RecyclerView g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private com.alibaba.android.ultron.ext.vlayout.extend.a l;
    private boolean m;
    private int n;
    private PerformanceMonitor o;
    private ViewLifeCycleHelper p;
    private Comparator<Pair<h<Integer>, Integer>> q;
    private com.alibaba.android.ultron.ext.vlayout.d r;
    private blp s;
    private HashMap<Integer, com.alibaba.android.ultron.ext.vlayout.c> t;
    private HashMap<Integer, com.alibaba.android.ultron.ext.vlayout.c> u;
    private bln.a v;
    private a w;
    private int x;
    private c y;
    private List<Pair<h<Integer>, Integer>> z;

    /* loaded from: classes2.dex */
    public static class InflateLayoutParams extends LayoutParams {
        static {
            kge.a(-748170942);
        }

        public InflateLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2639a;
        public int b;
        public boolean c;

        static {
            kge.a(1736541467);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean a();
    }

    /* loaded from: classes2.dex */
    public static class d extends RecyclerView.ViewHolder {
        static {
            kge.a(319145744);
        }

        public d(View view) {
            super(view);
        }
    }

    public static /* synthetic */ Object ipc$super(VirtualLayoutManager virtualLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2103993952:
                return super.findViewByPosition(((Number) objArr[0]).intValue());
            case -1988132884:
                return new Integer(super.scrollHorizontallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1862045111:
                super.b((View) objArr[0]);
                return null;
            case -1828779796:
                return super.onFocusSearchFailed((View) objArr[0], ((Number) objArr[1]).intValue(), (RecyclerView.Recycler) objArr[2], (RecyclerView.State) objArr[3]);
            case -1809655966:
                super.setStackFromEnd(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1795038358:
                super.a((View) objArr[0]);
                return null;
            case -1602403907:
                super.assertNotInLayoutOrScroll((String) objArr[0]);
                return null;
            case -1530261315:
                super.moveView(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447122930:
                super.setOrientation(((Number) objArr[0]).intValue());
                return null;
            case -1382357996:
                return new Integer(super.getOrientation());
            case -1227808903:
                return new Integer(super.findLastVisibleItemPosition());
            case -1078087916:
                super.offsetChildrenVertical(((Number) objArr[0]).intValue());
                return null;
            case -1031978259:
                super.a((com.alibaba.android.ultron.ext.vlayout.a) objArr[0]);
                return null;
            case -863390362:
                super.detachAndScrapView((View) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case -741263064:
                return super.computeScrollVectorForPosition(((Number) objArr[0]).intValue());
            case -602204034:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -574012007:
                return new Boolean(super.canScrollHorizontally());
            case -401900624:
                super.a((RecyclerView.State) objArr[0], (b.a) objArr[1]);
                return null;
            case -62336886:
                return new Integer(super.getWidth());
            case 27005610:
                return super.onSaveInstanceState();
            case 69461489:
                return new Integer(super.findFirstVisibleItemPosition());
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 243344899:
                super.setReverseLayout(((Boolean) objArr[0]).booleanValue());
                return null;
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 962696753:
                super.onAdapterChanged((RecyclerView.Adapter) objArr[0], (RecyclerView.Adapter) objArr[1]);
                return null;
            case 1133151231:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1191436823:
                return new Integer(super.getHeight());
            case 1238488515:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            case 1626618577:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1743346472:
                super.detachAndScrapViewAt(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1820198362:
                super.onMeasure((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1956946854:
                super.offsetChildrenHorizontal(((Number) objArr[0]).intValue());
                return null;
            case 1985896760:
                return new Integer(super.a(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 2011679854:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 2115935995:
                super.detachAndScrapAttachedViews((RecyclerView.Recycler) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ RecyclerView a(VirtualLayoutManager virtualLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("e27cf39a", new Object[]{virtualLayoutManager}) : virtualLayoutManager.g;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public /* bridge */ /* synthetic */ void a(com.alibaba.android.ultron.ext.vlayout.a aVar) {
        super.a(aVar);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ void assertNotInLayoutOrScroll(String str) {
        super.assertNotInLayoutOrScroll(str);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public /* bridge */ /* synthetic */ PointF computeScrollVectorForPosition(int i) {
        return super.computeScrollVectorForPosition(i);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int findFirstVisibleItemPosition() {
        return super.findFirstVisibleItemPosition();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int findLastVisibleItemPosition() {
        return super.findLastVisibleItemPosition();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.onFocusSearchFailed(view, i, recycler, state);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.scrollVerticallyBy(i, recycler, state);
    }

    static {
        kge.a(669095055);
        kge.a(149142298);
        d = false;
        A = new blo();
    }

    public VirtualLayoutManager(Context context) {
        this(context, 1);
    }

    public VirtualLayoutManager(Context context, int i) {
        this(context, i, false);
    }

    public VirtualLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        int i2 = 0;
        this.h = false;
        this.i = false;
        this.m = false;
        this.n = -1;
        this.q = new Comparator<Pair<h<Integer>, Integer>>() { // from class: com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(Pair<h<Integer>, Integer> pair, Pair<h<Integer>, Integer> pair2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, pair, pair2})).intValue() : a(pair, pair2);
            }

            public int a(Pair<h<Integer>, Integer> pair, Pair<h<Integer>, Integer> pair2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("89f26c1b", new Object[]{this, pair, pair2})).intValue();
                }
                if (pair == null && pair2 == null) {
                    return 0;
                }
                if (pair == null) {
                    return -1;
                }
                if (pair2 != null) {
                    return ((Integer) ((h) pair.first).a()).intValue() - ((Integer) ((h) pair2.first).a()).intValue();
                }
                return 1;
            }
        };
        this.s = blp.mDefaultAdjuster;
        this.t = new HashMap<>();
        this.u = new HashMap<>();
        this.w = new a();
        this.x = 0;
        this.y = new c();
        this.z = new ArrayList();
        this.B = A;
        this.C = new f() { // from class: com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.ext.vlayout.f
            public View a(Context context2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context2}) : new LayoutView(context2);
            }
        };
        this.D = new Rect();
        this.E = false;
        this.F = 0;
        this.G = false;
        this.e = g.a(this, i);
        this.f = g.a(this, i != 1 ? 1 : i2);
        this.k = super.canScrollVertically();
        this.j = super.canScrollHorizontally();
        a(new i());
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void a(com.alibaba.android.ultron.ext.vlayout.extend.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97914db6", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    public void a(com.alibaba.android.ultron.ext.vlayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27ea00a", new Object[]{this, dVar});
        } else if (dVar == null) {
            throw new IllegalArgumentException("finder is null");
        } else {
            LinkedList linkedList = new LinkedList();
            com.alibaba.android.ultron.ext.vlayout.d dVar2 = this.r;
            if (dVar2 != null) {
                for (com.alibaba.android.ultron.ext.vlayout.c cVar : dVar2.a()) {
                    linkedList.add(cVar);
                }
            }
            this.r = dVar;
            if (linkedList.size() > 0) {
                this.r.a(linkedList);
            }
            this.E = false;
            requestLayout();
        }
    }

    public void a(List<com.alibaba.android.ultron.ext.vlayout.c> list) {
        bln.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            this.u.put(Integer.valueOf(System.identityHashCode(cVar)), cVar);
        }
        if (list != null) {
            int i = 0;
            for (com.alibaba.android.ultron.ext.vlayout.c cVar2 : list) {
                if (cVar2 instanceof blq) {
                    ((blq) cVar2).a(this.s);
                }
                if ((cVar2 instanceof bln) && (aVar = this.v) != null) {
                    ((bln) cVar2).a(aVar);
                }
                if (cVar2.f() > 0) {
                    cVar2.b(i, (cVar2.f() + i) - 1);
                } else {
                    cVar2.b(-1, -1);
                }
                i += cVar2.f();
            }
        }
        this.r.a(list);
        for (com.alibaba.android.ultron.ext.vlayout.c cVar3 : this.r.a()) {
            this.t.put(Integer.valueOf(System.identityHashCode(cVar3)), cVar3);
        }
        Iterator<Map.Entry<Integer, com.alibaba.android.ultron.ext.vlayout.c>> it = this.u.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            if (this.t.containsKey(key)) {
                this.t.remove(key);
                it.remove();
            }
        }
        for (com.alibaba.android.ultron.ext.vlayout.c cVar4 : this.u.values()) {
            cVar4.d(this);
        }
        if (!this.u.isEmpty() || !this.t.isEmpty()) {
            this.E = false;
        }
        this.u.clear();
        this.t.clear();
        requestLayout();
    }

    public List<com.alibaba.android.ultron.ext.vlayout.c> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.r.a();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, com.alibaba.android.ultron.ext.vlayout.e
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, com.alibaba.android.ultron.ext.vlayout.e
    public int getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue() : super.getOrientation();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = g.a(this, i);
        super.setOrientation(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e812603", new Object[]{this, new Boolean(z)});
        } else if (z) {
            throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
        } else {
            super.setReverseLayout(false);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422d762", new Object[]{this, new Boolean(z)});
        } else if (z) {
            throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void a(RecyclerView.State state, b.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80b7bb0", new Object[]{this, state, aVar});
            return;
        }
        super.a(state, aVar);
        while (z) {
            this.w.f2639a = aVar.f2642a;
            this.w.b = aVar.b;
            this.w.c = aVar.c;
            com.alibaba.android.ultron.ext.vlayout.c a2 = this.r.a(aVar.f2642a);
            if (a2 != null) {
                a2.a(state, this.w, this);
            }
            if (this.w.f2639a == aVar.f2642a) {
                z = false;
            } else {
                aVar.f2642a = this.w.f2639a;
            }
            aVar.b = this.w.b;
            this.w.f2639a = -1;
        }
        this.w.f2639a = aVar.f2642a;
        this.w.b = aVar.b;
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.b(state, this.w, this);
        }
    }

    public com.alibaba.android.ultron.ext.vlayout.c a(com.alibaba.android.ultron.ext.vlayout.c cVar, boolean z) {
        List<com.alibaba.android.ultron.ext.vlayout.c> a2;
        int indexOf;
        com.alibaba.android.ultron.ext.vlayout.c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.ext.vlayout.c) ipChange.ipc$dispatch("f65f4ef0", new Object[]{this, cVar, new Boolean(z)});
        }
        if (cVar == null || (indexOf = (a2 = this.r.a()).indexOf(cVar)) == -1) {
            return null;
        }
        int i = z ? indexOf - 1 : indexOf + 1;
        if (i >= 0 && i < a2.size() && (cVar2 = a2.get(i)) != null && !cVar2.g()) {
            return cVar2;
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int a(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c2d0b5d", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue() : a(getPosition(view), z, z2);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int a(int i, boolean z, boolean z2) {
        com.alibaba.android.ultron.ext.vlayout.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2621734e", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (i != -1 && (a2 = this.r.a(i)) != null) {
            return a2.a(i - a2.e().a().intValue(), z, z2, this);
        }
        return 0;
    }

    public int c(View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("139bd69f", new Object[]{this, view, new Boolean(z)})).intValue() : b(view, z, true);
    }

    public int b(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e065e7c", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (view == null) {
            return 0;
        }
        return a(view, z, z2);
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886596d8", new Object[]{this, recycler, state});
            return;
        }
        if (this.x == 0) {
            for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.b()) {
                cVar.a(recycler, state, this);
            }
        }
        this.x++;
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844db72b", new Object[]{this, recycler, state, new Integer(i)});
            return;
        }
        this.x--;
        if (this.x > 0) {
            return;
        }
        this.x = 0;
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            try {
                cVar.a(recycler, state, findFirstVisibleItemPosition, findLastVisibleItemPosition, i, this);
            } catch (Exception e) {
                if (d) {
                    throw e;
                }
            }
        }
        ViewLifeCycleHelper viewLifeCycleHelper = this.p;
        if (viewLifeCycleHelper == null) {
            return;
        }
        viewLifeCycleHelper.a();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection("VLM onLayoutChildren");
        }
        if (this.h && state.didStructureChange()) {
            this.E = false;
            this.G = true;
        }
        a(recycler, state);
        try {
            try {
                super.onLayoutChildren(recycler, state);
                a(recycler, state, Integer.MAX_VALUE);
                if ((this.i || this.h) && this.G) {
                    this.E = true;
                    View childAt = getChildAt(getChildCount() - 1);
                    if (childAt != null) {
                        this.F = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin + a(childAt, true, false);
                        RecyclerView recyclerView = this.g;
                        if (recyclerView != null && this.i) {
                            ViewParent parent = recyclerView.getParent();
                            if (parent instanceof View) {
                                this.F = Math.min(this.F, ((View) parent).getMeasuredHeight());
                            }
                        }
                    } else {
                        this.G = false;
                    }
                    this.G = false;
                    if (this.g != null && getItemCount() > 0) {
                        this.g.post(new Runnable() { // from class: com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (VirtualLayoutManager.a(VirtualLayoutManager.this) == null) {
                                } else {
                                    VirtualLayoutManager.a(VirtualLayoutManager.this).requestLayout();
                                }
                            }
                        });
                    }
                }
                if (Build.VERSION.SDK_INT < 18) {
                    return;
                }
                Trace.endSection();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        } catch (Throwable th) {
            a(recycler, state, Integer.MAX_VALUE);
            throw th;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int a(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765e6138", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection("VLM scroll");
        }
        a(recycler, state);
        try {
            try {
                if (!this.h) {
                    i = super.a(i, recycler, state);
                } else {
                    if (getChildCount() != 0 && i != 0) {
                        this.f2641a.b = true;
                        a();
                        int i3 = i > 0 ? 1 : -1;
                        int abs = Math.abs(i);
                        a(i3, abs, true, state);
                        int a2 = this.f2641a.h + a(recycler, this.f2641a, state, false);
                        if (a2 < 0) {
                            return 0;
                        }
                        if (abs > a2) {
                            i = i3 * a2;
                        }
                    }
                    return 0;
                }
                i2 = i;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                if (d) {
                    throw e;
                }
            }
            if (Build.VERSION.SDK_INT >= 18) {
                Trace.endSection();
            }
            return i2;
        } finally {
            a(recycler, state, 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.a(i, findFirstVisibleItemPosition, findLastVisibleItemPosition, this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a4a3a6", new Object[]{this, new Integer(i)});
            return;
        }
        super.offsetChildrenHorizontal(i);
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.a(i, this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbdaf14", new Object[]{this, new Integer(i)});
            return;
        }
        super.offsetChildrenVertical(i);
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.b(i, this);
        }
        ViewLifeCycleHelper viewLifeCycleHelper = this.p;
        if (viewLifeCycleHelper == null) {
            return;
        }
        viewLifeCycleHelper.a();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f2641a.g;
    }

    private int a(h<Integer> hVar) {
        Pair<h<Integer>, Integer> pair;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2807179", new Object[]{this, hVar})).intValue();
        }
        int size = this.z.size();
        if (size == 0) {
            return -1;
        }
        int i2 = size - 1;
        int i3 = -1;
        while (true) {
            pair = null;
            if (i > i2) {
                break;
            }
            i3 = (i + i2) / 2;
            Pair<h<Integer>, Integer> pair2 = this.z.get(i3);
            h<Integer> hVar2 = (h) pair2.first;
            if (hVar2 == null) {
                break;
            } else if (hVar2.a((h<Integer>) hVar.a()) || hVar2.a((h<Integer>) hVar.b()) || hVar.a(hVar2)) {
                break;
            } else if (hVar2.a().intValue() > hVar.b().intValue()) {
                i2 = i3 - 1;
            } else if (hVar2.b().intValue() < hVar.a().intValue()) {
                i = i3 + 1;
            }
        }
        if (pair != null) {
            return i3;
        }
        return -1;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, b.c cVar, bls blsVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4634d304", new Object[]{this, recycler, state, cVar, blsVar});
            return;
        }
        int i2 = cVar.e;
        c.a(this.y, cVar);
        com.alibaba.android.ultron.ext.vlayout.d dVar = this.r;
        com.alibaba.android.ultron.ext.vlayout.c a2 = dVar == null ? null : dVar.a(i2);
        if (a2 == null) {
            a2 = this.B;
        }
        a2.b(recycler, state, this.y, blsVar, this);
        c.a(this.y, (b.c) null);
        if (cVar.e == i2) {
            if (d) {
                String str = "layoutHelper[" + a2.getClass().getSimpleName() + "@" + a2.toString() + "] consumes no item!";
            }
            blsVar.b = true;
            return;
        }
        int i3 = cVar.e - cVar.f;
        if (!blsVar.c) {
            i = blsVar.f25966a;
        }
        h<Integer> hVar = new h<>(Integer.valueOf(Math.min(i2, i3)), Integer.valueOf(Math.max(i2, i3)));
        int a3 = a(hVar);
        if (a3 >= 0) {
            Pair<h<Integer>, Integer> pair = this.z.get(a3);
            if (pair != null && ((h) pair.first).equals(hVar) && ((Integer) pair.second).intValue() == i) {
                return;
            }
            this.z.remove(a3);
        }
        this.z.add(Pair.create(hVar, Integer.valueOf(i)));
        Collections.sort(this.z, this.q);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            super.scrollToPosition(i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
        } else {
            super.smoothScrollToPosition(recyclerView, state, i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue() : this.b == null;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e4abf4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e92f94", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca990af", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c0777c", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635d2888", new Object[]{this, recyclerView});
            return;
        }
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.c(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bec3bc73", new Object[]{this, layoutParams})).booleanValue() : layoutParams instanceof LayoutParams;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("fdddbac1", new Object[]{this}) : new LayoutParams(-2, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("8b40b36f", new Object[]{this, layoutParams});
        }
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) ((LayoutParams) layoutParams));
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("1de802f0", new Object[]{this, context, attributeSet}) : new InflateLayoutParams(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39619631", new Object[]{this, adapter, adapter2});
        } else {
            super.onAdapterChanged(adapter, adapter2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d1d5c3", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.g = recyclerView;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438a83ff", new Object[]{this, recyclerView, recycler});
            return;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
        for (com.alibaba.android.ultron.ext.vlayout.c cVar : this.r.a()) {
            cVar.d(this);
        }
        this.g = null;
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALIDE_SIZE = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public int f2638a;
        public float b;
        private int c;
        private int d;

        static {
            kge.a(-810343579);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2638a = 0;
            this.b = Float.NaN;
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2638a = 0;
            this.b = Float.NaN;
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2638a = 0;
            this.b = Float.NaN;
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2638a = 0;
            this.b = Float.NaN;
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2638a = 0;
            this.b = Float.NaN;
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ITEM_DIRECTION_HEAD = -1;
        public static final int ITEM_DIRECTION_TAIL = 1;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;

        /* renamed from: a  reason: collision with root package name */
        private b.c f2640a;

        static {
            kge.a(41961825);
        }

        public static /* synthetic */ b.c a(c cVar, b.c cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b.c) ipChange.ipc$dispatch("35ed920b", new Object[]{cVar, cVar2});
            }
            cVar.f2640a = cVar2;
            return cVar2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f2640a.c;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f2640a.e;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f2640a.l != null;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            this.f2640a.e += this.f2640a.f;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f2640a.f2644a;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f2640a.d;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f2640a.f;
        }

        public int h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f2640a.g;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f2640a.i;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f2640a.k;
        }

        public boolean a(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a85392d", new Object[]{this, state})).booleanValue() : this.f2640a.a(state);
        }

        public View a(RecyclerView.Recycler recycler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("60f824d9", new Object[]{this, recycler}) : this.f2640a.a(recycler);
        }

        public View a(RecyclerView.Recycler recycler, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("f21f76ce", new Object[]{this, recycler, new Integer(i)});
            }
            int i2 = this.f2640a.e;
            this.f2640a.e = i;
            View a2 = a(recycler);
            this.f2640a.e = i2;
            return a2;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public final View d_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5985744", new Object[]{this});
        }
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return null;
        }
        View a2 = this.C.a(recyclerView.getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        a(layoutParams, new d(a2));
        a2.setLayoutParams(layoutParams);
        return a2;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void moveView(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ca10bd", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.moveView(i, i2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void a(c cVar, View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1da6a7", new Object[]{this, cVar, view});
            return;
        }
        if (cVar.g() == 1) {
            i = -1;
        }
        a(cVar, view, i);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void a(c cVar, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4997a13c", new Object[]{this, cVar, view, new Integer(i)});
            return;
        }
        b(view);
        if (!cVar.c()) {
            addView(view, i);
        } else {
            addDisappearingView(view, i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void a_(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6332167", new Object[]{this, view, new Boolean(z)});
            return;
        }
        b(view);
        a(view, z);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void b(View view, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b89ab", new Object[]{this, view, new Boolean(z)});
            return;
        }
        b(view);
        if (!z) {
            i = -1;
        }
        addView(view, i);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else {
            a_(view, false);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, com.alibaba.android.ultron.ext.vlayout.e
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            super.a(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b, com.alibaba.android.ultron.ext.vlayout.e
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            super.b(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public RecyclerView.ViewHolder f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("3658f542", new Object[]{this, view});
        }
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return null;
        }
        return recyclerView.getChildViewHolder(view);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public boolean d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8906900b", new Object[]{this, view})).booleanValue();
        }
        RecyclerView.ViewHolder f = f(view);
        return f == null || a(f);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else {
            removeView(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("bcdc21ab", new Object[]{this}) : this.e;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public g d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7653af4a", new Object[]{this}) : this.f;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.e
    public void measureChild(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe4ded", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else {
            a(view, i, i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.e
    public void measureChildWithMargins(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e27560a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else {
            b(view, i, i2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public int a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2619b8ff", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)})).intValue() : getChildMeasureSpec(i, 0, i2, z);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.ext.vlayout.extend.a aVar = this.l;
        return this.j && !this.h && (aVar == null || aVar.b());
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.ext.vlayout.extend.a aVar = this.l;
        return this.k && !this.h && (aVar == null || aVar.a());
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        PerformanceMonitor performanceMonitor = this.o;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("layout", view);
        }
        layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
        PerformanceMonitor performanceMonitor2 = this.o;
        if (performanceMonitor2 == null) {
            return;
        }
        performanceMonitor2.recordEnd("layout", view);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void b(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8054e89", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        PerformanceMonitor performanceMonitor = this.o;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("layout", view);
        }
        layoutDecorated(view, i, i2, i3, i4);
        PerformanceMonitor performanceMonitor2 = this.o;
        if (performanceMonitor2 == null) {
            return;
        }
        performanceMonitor2.recordEnd("layout", view);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void a(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac9faf7", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            if (d) {
                String str = "Recycling " + Math.abs(i - i2) + " items";
            }
            if (i2 > i) {
                View childAt = getChildAt(i2 - 1);
                int position = getPosition(getChildAt(i));
                int position2 = getPosition(childAt);
                int i3 = i;
                while (i < i2) {
                    int position3 = getPosition(getChildAt(i3));
                    if (position3 != -1) {
                        com.alibaba.android.ultron.ext.vlayout.c a2 = this.r.a(position3);
                        if (a2 == null || a2.a(position3, position, position2, this, true)) {
                            removeAndRecycleViewAt(i3, recycler);
                        } else {
                            i3++;
                        }
                    } else {
                        removeAndRecycleViewAt(i3, recycler);
                    }
                    i++;
                }
                return;
            }
            View childAt2 = getChildAt(i);
            int position4 = getPosition(getChildAt(i2 + 1));
            int position5 = getPosition(childAt2);
            while (i > i2) {
                int position6 = getPosition(getChildAt(i));
                if (position6 != -1) {
                    com.alibaba.android.ultron.ext.vlayout.c a3 = this.r.a(position6);
                    if (a3 == null || a3.a(position6, position4, position5, this, false)) {
                        removeAndRecycleViewAt(i, recycler);
                    }
                } else {
                    removeAndRecycleViewAt(i, recycler);
                }
                i--;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1e9efb", new Object[]{this, recycler});
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            RecyclerView.ViewHolder f = f(getChildAt(childCount));
            if ((f instanceof b) && ((b) f).a()) {
                b.d.a(f, 0, 6);
            }
        }
        super.detachAndScrapAttachedViews(recycler);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void detachAndScrapViewAt(int i, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e95b28", new Object[]{this, new Integer(i), recycler});
            return;
        }
        RecyclerView.ViewHolder f = f(getChildAt(i));
        if ((f instanceof b) && ((b) f).a()) {
            b.d.a(f, 0, 4);
        }
        super.detachAndScrapViewAt(i, recycler);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void detachAndScrapView(View view, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc89b566", new Object[]{this, view, recycler});
        } else {
            super.detachAndScrapView(view, recycler);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : super.getWidth();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : super.getHeight();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : isLayoutRTL();
    }

    private void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        calculateItemDecorationsForChild(view, this.D);
        int a2 = a(i, this.D.left, this.D.right);
        int a3 = a(i2, this.D.top, this.D.bottom);
        PerformanceMonitor performanceMonitor = this.o;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(a2, a3);
        PerformanceMonitor performanceMonitor2 = this.o;
        if (performanceMonitor2 == null) {
            return;
        }
        performanceMonitor2.recordEnd("measure", view);
    }

    private void b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfe6469", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        calculateItemDecorationsForChild(view, this.D);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (getOrientation() == 1) {
            i = a(i, layoutParams.leftMargin + this.D.left, layoutParams.rightMargin + this.D.right);
        }
        if (getOrientation() == 0) {
            i2 = a(i2, this.D.top, this.D.bottom);
        }
        PerformanceMonitor performanceMonitor = this.o;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(i, i2);
        PerformanceMonitor performanceMonitor2 = this.o;
        if (performanceMonitor2 == null) {
            return;
        }
        performanceMonitor2.recordEnd("measure", view);
    }

    private int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        if ((View.MeasureSpec.getSize(i) - i2) - i3 < 0) {
            return View.MeasureSpec.makeMeasureSpec(0, mode);
        }
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("829799a0", new Object[]{this, new Integer(i)});
        }
        View findViewByPosition = super.findViewByPosition(i);
        if (findViewByPosition != null && getPosition(findViewByPosition) == i) {
            return findViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public void g(View view) {
        ViewParent parent;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0b3ca4", new Object[]{this, view});
        } else if (this.g == null || (parent = view.getParent()) == null || parent != (recyclerView = this.g)) {
        } else {
            this.g.getRecycledViewPool().putRecycledView(recyclerView.getChildViewHolder(view));
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.e
    public com.alibaba.android.ultron.ext.vlayout.c a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.ext.vlayout.c) ipChange.ipc$dispatch("5b19541e", new Object[]{this, new Integer(i)}) : this.r.a(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(android.support.v7.widget.RecyclerView.Recycler r9, android.support.v7.widget.RecyclerView.State r10, int r11, int r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L28
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r1[r3] = r9
            r9 = 2
            r1[r9] = r10
            r9 = 3
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r1[r9] = r10
            r9 = 4
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r1[r9] = r10
            java.lang.String r9 = "6c7e05da"
            r0.ipc$dispatch(r9, r1)
            return
        L28:
            boolean r0 = r8.h
            if (r0 != 0) goto L34
            boolean r0 = r8.i
            if (r0 != 0) goto L34
            super.onMeasure(r9, r10, r11, r12)
            return
        L34:
            android.support.v7.widget.RecyclerView r0 = r8.g
            r1 = 134217727(0x7ffffff, float:3.8518597E-34)
            if (r0 == 0) goto L54
            boolean r4 = r8.i
            if (r4 == 0) goto L54
            int r4 = r8.n
            if (r4 <= 0) goto L45
            r0 = r4
            goto L57
        L45:
            android.view.ViewParent r0 = r0.getParent()
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L54
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            goto L57
        L54:
            r0 = 134217727(0x7ffffff, float:3.8518597E-34)
        L57:
            boolean r4 = r8.E
            if (r4 == 0) goto L5d
            int r0 = r8.F
        L5d:
            boolean r4 = r8.h
            if (r4 == 0) goto Lb9
            boolean r4 = r8.E
            r4 = r4 ^ r3
            r8.G = r4
            int r4 = r8.getChildCount()
            if (r4 > 0) goto L82
            int r4 = r8.getChildCount()
            int r5 = r8.getItemCount()
            if (r4 == r5) goto L77
            goto L82
        L77:
            int r1 = r8.getItemCount()
            if (r1 != 0) goto Lb9
            r8.E = r3
            r8.G = r2
            goto Lba
        L82:
            int r4 = r8.getChildCount()
            int r4 = r4 - r3
            android.view.View r4 = r8.getChildAt(r4)
            int r5 = r8.F
            if (r4 == 0) goto La1
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.RecyclerView$LayoutParams r5 = (android.support.v7.widget.RecyclerView.LayoutParams) r5
            int r6 = r8.getDecoratedBottom(r4)
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r5 = r8.a(r4, r3, r2)
            int r5 = r5 + r6
        La1:
            int r6 = r8.getChildCount()
            int r7 = r8.getItemCount()
            if (r6 != r7) goto Lb1
            if (r4 == 0) goto Lb9
            int r4 = r8.F
            if (r5 == r4) goto Lb9
        Lb1:
            r8.E = r2
            r8.G = r3
            r2 = 134217727(0x7ffffff, float:3.8518597E-34)
            goto Lba
        Lb9:
            r2 = r0
        Lba:
            int r0 = r8.getOrientation()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r3) goto Lca
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            super.onMeasure(r9, r10, r11, r12)
            return
        Lca:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            super.onMeasure(r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.onMeasure(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, int, int):void");
    }
}
