package com.taobao.homepage.view.widgets;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.utils.HomePageUtility;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ksp;

/* loaded from: classes7.dex */
public class b extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ON_SCROLL_START = 7952648158329995189L;
    public static final long DX_ON_SCROLL_STOP = -7968002352509477560L;

    /* renamed from: a  reason: collision with root package name */
    private int f17341a;
    private a b;

    /* loaded from: classes7.dex */
    public interface a {
        float a(View view);

        List<DXRootView> a(RecyclerView recyclerView);
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f17342a;

        static {
            kge.a(2036131096);
            f17342a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("dc256917", new Object[0]) : f17342a;
        }
    }

    static {
        kge.a(-339852499);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 806944192) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 1 || i == 2;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("dc256917", new Object[0]) : c.a();
    }

    private b() {
        this.f17341a = -1;
        this.b = new C0667b();
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            if (this.f17341a != -1 && a(this.f17341a) == a(i)) {
                return;
            }
            this.f17341a = i;
            List<DXRootView> a2 = this.b.a(recyclerView);
            if (i == 0) {
                ksp.c("RecyclerViewScrollEventPost", "post scroll stop event");
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    a(a2.get(i2), false);
                }
            } else if (i == 1 || i == 2) {
                ksp.c("RecyclerViewScrollEventPost", "post scroll start event");
                for (int i3 = 0; i3 < a2.size(); i3++) {
                    a(a2.get(i3), true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ksp.a("RecyclerViewScrollEventPost", "onScrollStateChanged error", e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public void a(DXRootView dXRootView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfdd60b", new Object[]{this, dXRootView, new Boolean(z)});
        } else if (dXRootView == null) {
        } else {
            DXEvent dXEvent = new DXEvent(z ? 7952648158329995189L : -7968002352509477560L);
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                return;
            }
            expandWidgetNode.sendBroadcastEvent(dXEvent);
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6fd46a19", new Object[]{this}) : this.b;
    }

    /* renamed from: com.taobao.homepage.view.widgets.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0667b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-911558523);
            kge.a(20667378);
        }

        public RecyclerView a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.homepage.view.widgets.b.a
        public float a(View view) {
            RecyclerView a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9501e35a", new Object[]{this, view})).floatValue();
            }
            if (view != null && (a2 = a()) != null) {
                return HomePageUtility.a(a2, view, false);
            }
            return -1.0f;
        }

        @Override // com.taobao.homepage.view.widgets.b.a
        public List<DXRootView> a(RecyclerView recyclerView) {
            DXRootView b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2626cdf1", new Object[]{this, recyclerView});
            }
            ArrayList arrayList = new ArrayList();
            if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                if (findFirstVisibleItemPositions.length != 0 && findLastVisibleItemPositions.length != 0) {
                    int i = findFirstVisibleItemPositions[0];
                    int i2 = findLastVisibleItemPositions[0];
                    int i3 = i;
                    for (int i4 = 1; i4 < findFirstVisibleItemPositions.length; i4++) {
                        i3 = Math.min(i3, findFirstVisibleItemPositions[i4]);
                    }
                    for (int i5 = 1; i5 < findLastVisibleItemPositions.length; i5++) {
                        i2 = Math.max(i2, findLastVisibleItemPositions[i5]);
                    }
                    if (i3 >= 0 && i2 >= 0) {
                        while (i3 <= i2) {
                            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i3);
                            if (findViewByPosition.getVisibility() == 0 && (b = b(findViewByPosition)) != null) {
                                arrayList.add(b);
                            }
                            i3++;
                        }
                    }
                }
            }
            return arrayList;
        }

        public static DXRootView b(View view) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (DXRootView) ipChange.ipc$dispatch("f094636e", new Object[]{view});
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return null;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DXRootView) {
                    return (DXRootView) childAt;
                }
                i++;
            }
        }
    }
}
