package com.taobao.tao.recommend4.recyclerview;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend2.view.widget.weex.AutoDispatchScrollView;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.mto;
import tb.osm;
import tb.osn;

/* loaded from: classes8.dex */
public class p implements osn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<osm> f21007a;

    static {
        kge.a(-519136293);
        kge.a(-1350278169);
        kge.a(963302453);
    }

    public p(osm osmVar) {
        this.f21007a = new WeakReference<>(osmVar);
    }

    private int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView d = d(recyclerView);
        if (!(d instanceof RecyclerView)) {
            return b(recyclerView);
        }
        return d.getHeight();
    }

    private int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        ViewParent c = c(recyclerView);
        if (c == null) {
            return recyclerView.getHeight();
        }
        return ((View) c).getHeight();
    }

    private ViewParent c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("b7187e10", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ListView) || (parent instanceof AutoDispatchScrollView)) {
                return parent;
            }
        }
        return null;
    }

    private RecyclerView d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("f87ef18b", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public double a(int i) {
        RecyclerView i2;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219389", new Object[]{this, new Integer(i)})).doubleValue();
        }
        osm a2 = a();
        if (a2 == null || (i2 = a2.i()) == null || (findViewByPosition = i2.getLayoutManager().findViewByPosition(i)) == null || findViewByPosition.getMeasuredHeight() <= 0) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        float a3 = (a(i2) - i2.getTop()) - findViewByPosition.getTop();
        return a3 <= 0.0f ? mto.a.GEO_NOT_SUPPORT : a3 / findViewByPosition.getMeasuredHeight();
    }

    @Override // tb.osn
    public int a(String str, int i, boolean z) {
        RecyclerView i2;
        View findViewByPosition;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        osm a3 = a();
        if (a3 == null || (i2 = a3.i()) == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = i2.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i3 = 1; i3 < 6; i3++) {
            int i4 = i + i3;
            View findViewByPosition2 = layoutManager.findViewByPosition(i4);
            if (findViewByPosition2 == null && z && (a2 = a(a3.i().getAdapter(), i)) > 0) {
                return a2;
            }
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i4;
            }
        }
        return -1;
    }

    @Override // tb.osn
    public int a(String str, int i) {
        RecyclerView i2;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        osm a2 = a();
        if (a2 == null || (i2 = a2.i()) == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = i2.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i3 = 1; i3 < 6; i3++) {
            int i4 = i - i3;
            View findViewByPosition2 = layoutManager.findViewByPosition(i4);
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i4;
            }
        }
        return -1;
    }

    public int a(RecyclerView.Adapter adapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee48fb2b", new Object[]{this, adapter, new Integer(i)})).intValue();
        }
        int i2 = i + 2;
        if (i2 >= adapter.getItemCount()) {
            return -1;
        }
        return i2;
    }

    @Override // tb.osn
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253bde", new Object[]{this, str, new Integer(i)})).doubleValue() : a(i);
    }

    public osm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osm) ipChange.ipc$dispatch("f08d735", new Object[]{this});
        }
        WeakReference<osm> weakReference = this.f21007a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
