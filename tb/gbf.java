package tb;

import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.y;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gbf extends RecyclerView.ViewCacheExtension implements y.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE_VIEW_POSITION_TAG;
    public static final int DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER;
    public static final int INVALID_PRE_RENDING_STATE = -1;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<SparseArray<View>> f28275a = new SparseArray<>();
    private WeakReference<RecyclerView.Recycler> b;
    private WeakReference<RecyclerView> c;
    private final String d;

    /* loaded from: classes5.dex */
    public interface a {
        View a(RecyclerView recyclerView, int i);

        boolean a(int i);
    }

    static {
        kge.a(-2021186293);
        kge.a(-337578759);
        CACHE_VIEW_POSITION_TAG = R.id.cache_view_position_tag;
        DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER = R.id.dx_recycler_view_cache_scroll_listener;
    }

    public gbf(String str) {
        DinamicXEngine.a(this);
        this.d = str;
    }

    public static void a(final RecyclerView recyclerView, final gbf gbfVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c848fb28", new Object[]{recyclerView, gbfVar, new Integer(i)});
            return;
        }
        recyclerView.setViewCacheExtension(gbfVar);
        Object tag = recyclerView.getTag(DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER);
        if (tag instanceof RecyclerView.OnScrollListener) {
            recyclerView.removeOnScrollListener((RecyclerView.OnScrollListener) tag);
        }
        if (tag instanceof View.OnAttachStateChangeListener) {
            recyclerView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) tag);
        }
        if (gbfVar == null) {
            if (tag == null) {
                return;
            }
            recyclerView.setTag(DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER, null);
            return;
        }
        gbfVar.getClass();
        b bVar = new b();
        recyclerView.setTag(DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER, bVar);
        recyclerView.addOnScrollListener(bVar);
        recyclerView.addOnAttachStateChangeListener(bVar);
        if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", recyclerView + " setupWithRecyclerViewWithPosition: " + i);
        }
        gbfVar.a(recyclerView);
        if (gbfVar.b() != null) {
            return;
        }
        fxe.a(new Runnable() { // from class: tb.gbf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("DXRecyclerViewCacheExtension", RecyclerView.this + " setupWithRecyclerViewWithPosition preRender: " + i);
                }
                gbfVar.a(i, RecyclerView.this);
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.ViewCacheExtension
    public View getViewForPositionAndType(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("82102940", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        }
        RecyclerView d = d();
        if (this.b == null && recycler != null && d != null) {
            a(i, d, true);
        }
        this.b = new WeakReference<>(recycler);
        return null;
    }

    public RecyclerView.Recycler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Recycler) ipChange.ipc$dispatch("f8b3af98", new Object[]{this});
        }
        WeakReference<RecyclerView.Recycler> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8b1dc9", new Object[]{this, new Integer(i), recyclerView});
            return;
        }
        try {
            if (e() && recyclerView != null) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if ((adapter instanceof a) && i >= 0 && i <= adapter.getItemCount() - 1) {
                    if (!((a) adapter).a(i)) {
                        if (!DinamicXEngine.j()) {
                            return;
                        }
                        fuw.d("DXRecyclerViewCacheExtension", recyclerView + "isItemNeedPreRender false 跳过预渲染 at " + i);
                        return;
                    }
                    int itemViewType = adapter.getItemViewType(i);
                    RecyclerView.Recycler b2 = b();
                    if (b2 != null) {
                        a(b2, i, itemViewType, recyclerView);
                    } else {
                        a((a) adapter, i, itemViewType, recyclerView);
                    }
                }
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            String str = this.d;
            if (str == null) {
                str = "dinamicx";
            }
            s sVar = new s(str);
            sVar.c = new ArrayList();
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RECYCLER, DXMonitorConstant.DX_MONITOR_RECYCLER, s.DX_CONTAINER_PRE_RENDER_ERROR);
            aVar.e = th.getMessage();
            aVar.f = new HashMap();
            aVar.f.put("trace", com.taobao.android.dinamicx.exception.a.a(th));
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        SparseArray<View> sparseArray = this.f28275a.get(i);
        if (sparseArray == null || sparseArray.size() == 0) {
            return null;
        }
        int size = sparseArray.size() - 1;
        View valueAt = sparseArray.valueAt(size);
        if (valueAt != null) {
            if (DinamicXEngine.j()) {
                fuw.d("DXRecyclerViewCacheExtension", d() + "extraCache 命中缓存 withViewType " + i);
            }
            sparseArray.removeAt(size);
        } else if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", d() + "extraCache 未命中缓存 withViewType " + i);
        }
        return valueAt;
    }

    public void a(RecyclerView.Recycler recycler, int i, int i2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100ff925", new Object[]{this, recycler, new Integer(i), new Integer(i2), recyclerView});
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", recyclerView + "start 预渲染 by recycler View at " + i);
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", recyclerView + "end 预渲染 by recycler View at " + i);
        }
        recycler.recycleView(viewForPosition);
    }

    public void a(a aVar, int i, int i2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb46727e", new Object[]{this, aVar, new Integer(i), new Integer(i2), recyclerView});
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", recyclerView + " start 预渲染 by strategy View at " + i);
        }
        View a2 = aVar.a(recyclerView, i);
        if (DinamicXEngine.j()) {
            fuw.d("DXRecyclerViewCacheExtension", recyclerView + " end 预渲染 by strategy View at " + i);
        }
        if (a2 == null) {
            return;
        }
        SparseArray<View> sparseArray = this.f28275a.get(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f28275a.put(i2, sparseArray);
        }
        sparseArray.put(i, a2);
    }

    public void a(final int i, final RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d94e2b", new Object[]{this, new Integer(i), recyclerView, new Boolean(z)});
        } else if (i < 0) {
        } else {
            if (z) {
                fxe.a(new Runnable() { // from class: tb.gbf.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        gbf.this.a(i - 1, recyclerView);
                        gbf.this.a(i + 1, recyclerView);
                    }
                });
                return;
            }
            a(i - 1, recyclerView);
            a(i + 1, recyclerView);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView d = d();
        if (b() != null || d == null) {
            return;
        }
        a(i, d, true);
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
            this.c = null;
        } else {
            this.c = new WeakReference<>(recyclerView);
        }
    }

    public RecyclerView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3eeee379", new Object[]{this});
        }
        WeakReference<RecyclerView> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f28275a.clear();
        }
    }

    @Override // com.taobao.android.dinamicx.y.a
    public void M_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b56539", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // com.taobao.android.dinamicx.y.a
    public String N_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0821c8", new Object[]{this});
        }
        if (!DinamicXEngine.j()) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f28275a.size(); i2++) {
            SparseArray<View> sparseArray = this.f28275a.get(i2);
            if (sparseArray != null) {
                i += sparseArray.size();
            }
        }
        return " DXRecyclerViewCacheExtension mExtraCacheSize: " + i;
    }

    /* loaded from: classes5.dex */
    public class b extends RecyclerView.OnScrollListener implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1721004922);
            kge.a(-1859085092);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        public b() {
        }

        public static /* synthetic */ void a(b bVar, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e481ae3", new Object[]{bVar, recyclerView, linearLayoutManager, new Integer(i), new Integer(i2)});
            } else {
                bVar.a(recyclerView, linearLayoutManager, i, i2);
            }
        }

        public static /* synthetic */ void a(b bVar, RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c20004de", new Object[]{bVar, recyclerView, staggeredGridLayoutManager, new Integer(i), new Integer(i2)});
            } else {
                bVar.a(recyclerView, staggeredGridLayoutManager, i, i2);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            if (DinamicXEngine.j()) {
                fuw.d("DXRecyclerViewCacheExtension", view + " detached clearAllCache");
            }
            gbf.this.f();
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(final RecyclerView recyclerView, final int i, final int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (recyclerView == null) {
            } else {
                final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                fxe.a(new Runnable() { // from class: tb.gbf.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager2 = layoutManager;
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            b.a(b.this, recyclerView, (LinearLayoutManager) layoutManager2, i, i2);
                        } else if (!(layoutManager2 instanceof StaggeredGridLayoutManager)) {
                        } else {
                            b.a(b.this, recyclerView, (StaggeredGridLayoutManager) layoutManager2, i, i2);
                        }
                    }
                });
            }
        }

        private void a(final RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("489a85ea", new Object[]{this, recyclerView, linearLayoutManager, new Integer(i), new Integer(i2)});
                return;
            }
            if (linearLayoutManager.getOrientation() != 0) {
                i = i2;
            }
            if (i == 0 || linearLayoutManager.getChildCount() == 0) {
                return;
            }
            final int i4 = -1;
            if (i > 0) {
                if (!linearLayoutManager.getReverseLayout()) {
                    i3 = linearLayoutManager.getChildCount() - 1;
                }
                View childAt = linearLayoutManager.getChildAt(i3);
                if (childAt != null) {
                    if (!linearLayoutManager.getReverseLayout()) {
                        i4 = 1;
                    }
                    i4 = linearLayoutManager.getPosition(childAt) + i4;
                }
            } else {
                if (linearLayoutManager.getReverseLayout()) {
                    i3 = linearLayoutManager.getChildCount() - 1;
                }
                View childAt2 = linearLayoutManager.getChildAt(i3);
                if (childAt2 != null) {
                    if (linearLayoutManager.getReverseLayout()) {
                        i4 = 1;
                    }
                    i4 += linearLayoutManager.getPosition(childAt2);
                }
            }
            if (i4 < 0) {
                return;
            }
            fxe.a(new Runnable() { // from class: tb.gbf.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        gbf.this.a(i4, recyclerView);
                    }
                }
            });
        }

        private void a(final RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5773f7", new Object[]{this, recyclerView, staggeredGridLayoutManager, new Integer(i), new Integer(i2)});
                return;
            }
            if (staggeredGridLayoutManager.getOrientation() != 0) {
                i = i2;
            }
            if (i == 0 || staggeredGridLayoutManager.getChildCount() == 0 || staggeredGridLayoutManager.getSpanCount() != 1) {
                return;
            }
            final int i4 = -1;
            if (i > 0) {
                if (!staggeredGridLayoutManager.getReverseLayout()) {
                    i3 = staggeredGridLayoutManager.getChildCount() - 1;
                }
                View childAt = staggeredGridLayoutManager.getChildAt(i3);
                if (childAt != null) {
                    if (!staggeredGridLayoutManager.getReverseLayout()) {
                        i4 = 1;
                    }
                    i4 = staggeredGridLayoutManager.getPosition(childAt) + i4;
                }
            } else {
                if (staggeredGridLayoutManager.getReverseLayout()) {
                    i3 = staggeredGridLayoutManager.getChildCount() - 1;
                }
                View childAt2 = staggeredGridLayoutManager.getChildAt(i3);
                if (childAt2 != null) {
                    if (staggeredGridLayoutManager.getReverseLayout()) {
                        i4 = 1;
                    }
                    i4 += staggeredGridLayoutManager.getPosition(childAt2);
                }
            }
            if (i4 < 0) {
                return;
            }
            fxe.a(new Runnable() { // from class: tb.gbf.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        gbf.this.a(i4, recyclerView);
                    }
                }
            });
        }
    }
}
