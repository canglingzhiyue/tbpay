package com.taobao.tao.recommend4.recyclerview;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend2.RecommendChannelType;
import tb.gbg;
import tb.kge;
import tb.ksk;

/* loaded from: classes8.dex */
public class k extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f20995a = "Home.nestedExposure";
    private int b = 1;
    private int c = -1;
    private int d = -1;
    private ksk e;
    private int f;
    private j g;

    static {
        kge.a(799604456);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 806944192) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != 2142696127) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public k(ksk kskVar) {
        this.e = kskVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f = 0;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (i2 == 0 || !(recyclerView instanceof ChildRecyclerView)) {
            return;
        }
        if (this.b * i2 < 0) {
            this.b = i2;
            a((ChildRecyclerView) recyclerView);
        }
        c((ChildRecyclerView) recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (!(recyclerView instanceof ChildRecyclerView)) {
            return;
        }
        ChildRecyclerView childRecyclerView = (ChildRecyclerView) recyclerView;
        if (i == 1) {
            a(childRecyclerView);
        } else if (i != 0) {
        } else {
            a(childRecyclerView);
            d(childRecyclerView);
            c(childRecyclerView);
        }
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b2cda1", new Object[]{this, jVar});
        } else {
            this.g = jVar;
        }
    }

    private ViewParent a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("d4755f0e", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ScrollView)) {
                return parent;
            }
        }
        return null;
    }

    private int a(ChildRecyclerView childRecyclerView, int i) {
        int height;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deb6e6cc", new Object[]{this, childRecyclerView, new Integer(i)})).intValue();
        }
        if (childRecyclerView == null) {
            return i;
        }
        ViewParent a2 = a((RecyclerView) childRecyclerView);
        if (a2 != null) {
            if (a2 instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) a2;
                if (coordinatorLayout.getChildCount() == 2) {
                    height = coordinatorLayout.getHeight();
                    i2 = coordinatorLayout.getChildAt(1).getTop();
                } else {
                    com.taobao.android.home.component.utils.e.e("Home.nestedExposure", "CoordinatorLayout ChildCount != 2");
                    return i;
                }
            } else if (!(a2 instanceof ScrollView)) {
                return i;
            } else {
                View view = (View) a2;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                childRecyclerView.getLocationInWindow(iArr2);
                height = view.getHeight() + iArr[1];
                i2 = iArr2[1];
            }
            return height - i2;
        }
        int[] iArr3 = new int[2];
        childRecyclerView.getLocationInWindow(iArr3);
        return Math.min(gbg.c(Globals.getApplication()) - iArr3[1], childRecyclerView.getHeight());
    }

    private void a(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd60b96a", new Object[]{this, childRecyclerView});
            return;
        }
        int b = b(childRecyclerView);
        if (b <= 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = childRecyclerView.getLayoutManager();
        int e = e(childRecyclerView);
        View findViewByPosition = layoutManager.findViewByPosition(e);
        if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0) {
            if (b <= findViewByPosition.getMeasuredHeight() / 2) {
                this.c = -1;
                this.d = -1;
                return;
            }
            if (findViewByPosition.getBottom() <= findViewByPosition.getMeasuredHeight() / 2) {
                e = f(childRecyclerView);
            }
            int i = this.c;
            if (e < i || i == -1) {
                this.c = e;
            }
        }
        int i2 = this.c;
        if (b < childRecyclerView.getHeight()) {
            while (i2 >= 0 && i2 < childRecyclerView.getAdapter().getItemCount()) {
                int i3 = i2 + 1;
                View findViewByPosition2 = layoutManager.findViewByPosition(i3);
                if (findViewByPosition2 == null || findViewByPosition2.getTop() > b || b - findViewByPosition2.getTop() <= findViewByPosition2.getMeasuredHeight() / 2) {
                    break;
                }
                i2 = i3;
            }
        } else {
            i2 = c((RecyclerView) childRecyclerView);
            View findViewByPosition3 = layoutManager.findViewByPosition(i2);
            if (findViewByPosition3 != null && findViewByPosition3.getMeasuredHeight() > 0 && (findViewByPosition3.getTop() > b || b - findViewByPosition3.getTop() <= findViewByPosition3.getMeasuredHeight() / 2)) {
                i2 = d((RecyclerView) childRecyclerView);
            }
        }
        if (i2 <= this.d) {
            return;
        }
        this.d = i2;
    }

    private int b(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87d659de", new Object[]{this, childRecyclerView})).intValue();
        }
        int height = childRecyclerView.getHeight();
        RecyclerView b = b((RecyclerView) childRecyclerView);
        if (b != null && !g(b)) {
            int c = c(b);
            if (c != b.getAdapter().getItemCount() - 1) {
                return 0;
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = b.findViewHolderForAdapterPosition(c);
            if (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.itemView != null) {
                height = b.getHeight() - findViewHolderForAdapterPosition.itemView.getTop();
            }
        } else if (b == null) {
            return a(childRecyclerView, height);
        }
        return height;
    }

    private void c(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424bfa6c", new Object[]{this, childRecyclerView});
            return;
        }
        int b = b(childRecyclerView);
        if (b <= 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = childRecyclerView.getLayoutManager();
        int c = c((RecyclerView) childRecyclerView);
        View findViewByPosition = layoutManager.findViewByPosition(c);
        if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0 && (findViewByPosition.getTop() > b || b - findViewByPosition.getTop() <= findViewByPosition.getMeasuredHeight() / 2)) {
            c = d((RecyclerView) childRecyclerView);
        }
        int i = c + 1;
        if (i <= this.f) {
            return;
        }
        this.f = i;
        j jVar = this.g;
        if (jVar == null) {
            return;
        }
        jVar.a(this.f);
    }

    private RecyclerView b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("688034cd", new Object[]{this, recyclerView});
        }
        ViewParent parent = recyclerView.getParent();
        while (true) {
            if (parent == null || (parent instanceof RecyclerView)) {
                break;
            } else if (i == 10) {
                parent = null;
                break;
            } else {
                i++;
                parent = parent.getParent();
            }
        }
        if (parent != null) {
            return (RecyclerView) parent;
        }
        return null;
    }

    private void d(ChildRecyclerView childRecyclerView) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc19aed", new Object[]{this, childRecyclerView});
            return;
        }
        h hVar = (h) childRecyclerView.getAdapter();
        if (hVar == null) {
            return;
        }
        if (this.c == -1 && this.d == -1) {
            return;
        }
        for (int i = this.c; i <= this.d; i++) {
            JSONObject a2 = hVar.a(i);
            if (a2 != null && !a2.getBooleanValue("isUIThreadTrack") && (jSONObject = a2.getJSONObject("ext")) != null && !jSONObject.getBooleanValue("hidden")) {
                ksk kskVar = this.e;
                if (kskVar != null) {
                    RecommendChannelType channelType = RecommendChannelType.getChannelType(kskVar.f30287a);
                    if (channelType == null || StringUtils.isEmpty(channelType.adNamespace)) {
                        com.taobao.android.home.component.utils.e.e("Home.nestedExposure", "channelType is null. containerType.containerId : " + this.e.f30287a);
                    } else {
                        a2.put("adNamespace", (Object) channelType.adNamespace);
                    }
                }
                a2.put("isUIThreadTrack", (Object) true);
                d.a(a2);
            }
        }
        this.c = -1;
        this.d = -1;
    }

    private int c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ba1ea8b", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findLastVisibleItemPositions.length; i2++) {
                if (findLastVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastVisibleItemPositions[i2])) {
                    i = findLastVisibleItemPositions[i2];
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            try {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } catch (Exception e) {
                com.taobao.android.home.component.utils.e.e(TLogTracker.SCENE_EXCEPTION, "RecommendViewExposureListener getLastVisiblePos exception:" + e.getMessage());
                return -1;
            }
        }
    }

    private int d(RecyclerView recyclerView) {
        int findLastCompletelyVisibleItemPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1642ad0c", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
            findLastCompletelyVisibleItemPosition = -1;
            for (int i = 0; i < findLastCompletelyVisibleItemPositions.length; i++) {
                if (findLastCompletelyVisibleItemPositions[i] >= 0 && (findLastCompletelyVisibleItemPosition == -1 || findLastCompletelyVisibleItemPosition < findLastCompletelyVisibleItemPositions[i])) {
                    findLastCompletelyVisibleItemPosition = findLastCompletelyVisibleItemPositions[i];
                }
            }
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            if (findLastCompletelyVisibleItemPosition == -1) {
                return linearLayoutManager.findLastVisibleItemPosition();
            }
        }
        return findLastCompletelyVisibleItemPosition;
    }

    private int e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0e36f8d", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findFirstVisibleItemPositions.length; i2++) {
                if (findFirstVisibleItemPositions[i2] >= 0 && (i == -1 || i > findFirstVisibleItemPositions[i2])) {
                    i = findFirstVisibleItemPositions[i2];
                }
            }
            return i;
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else {
            return -1;
        }
    }

    private int f(RecyclerView recyclerView) {
        int findFirstCompletelyVisibleItemPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b84320e", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            findFirstCompletelyVisibleItemPosition = -1;
            for (int i = 0; i < findFirstCompletelyVisibleItemPositions.length; i++) {
                if (findFirstCompletelyVisibleItemPositions[i] >= 0 && (findFirstCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition > findFirstCompletelyVisibleItemPositions[i])) {
                    findFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPositions[i];
                }
            }
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == -1) {
                return linearLayoutManager.findFirstVisibleItemPosition();
            }
        }
        return findFirstCompletelyVisibleItemPosition;
    }

    private boolean g(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e624f4a0", new Object[]{this, recyclerView})).booleanValue();
        }
        try {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter.getItemCount() == 0) {
                return true;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = adapter.getItemCount() - 1;
            if (itemCount <= 0) {
                return true;
            }
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount;
            }
            int[] findLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findLastCompletelyVisibleItemPositions.length; i2++) {
                if (findLastCompletelyVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastCompletelyVisibleItemPositions[i2])) {
                    i = findLastCompletelyVisibleItemPositions[i2];
                }
            }
            if (i < 0) {
                int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
                for (int i3 = 0; i3 < findLastVisibleItemPositions.length; i3++) {
                    if (findLastVisibleItemPositions[i3] >= 0 && (i == -1 || i < findLastVisibleItemPositions[i3])) {
                        i = findLastVisibleItemPositions[i3];
                    }
                }
                if (layoutManager.findViewByPosition(i) == null || layoutManager.findViewByPosition(i).getBottom() != recyclerView.getResources().getDisplayMetrics().heightPixels) {
                    i = -1;
                }
            }
            return i == itemCount;
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.a("Home.nestedExposure", "check reach bottom error", th);
        }
        return false;
    }
}
