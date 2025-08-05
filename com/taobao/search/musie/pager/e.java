package com.taobao.search.musie.pager;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class e extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OrientationHelper f19266a;
    private RecyclerView b;
    private int c;
    private final b d;

    static {
        kge.a(970268129);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -464207520) {
            if (hashCode != -164457479) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.attachToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
    }

    public e(b bVar) {
        this.d = bVar;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // android.support.v7.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63293f9", new Object[]{this, recyclerView});
            return;
        }
        super.attachToRecyclerView(recyclerView);
        if (recyclerView == null) {
            return;
        }
        this.b = recyclerView;
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, targetView});
        }
        q.c(layoutManager, "layoutManager");
        q.c(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(targetView, a(layoutManager));
        }
        return iArr;
    }

    private final View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8cc4564b", new Object[]{this, layoutManager, orientationHelper});
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
                z = true;
            }
            if (z && (bVar = this.d) != null) {
                bVar.onItemSelected(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
            }
            if (findFirstVisibleItemPosition == -1 || z) {
                return null;
            }
            View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (orientationHelper.getDecoratedEnd(findViewByPosition) >= orientationHelper.getDecoratedMeasurement(findViewByPosition) / 2 && orientationHelper.getDecoratedEnd(findViewByPosition) > 0) {
                return findViewByPosition;
            }
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != layoutManager.getItemCount() - 1) {
                return layoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
            }
            return null;
        }
        return super.findSnapView(layoutManager);
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e454c160", new Object[]{this, layoutManager});
        }
        Integer num = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (a2 = a(layoutManager, a(layoutManager))) == null) {
            return null;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            q.b(OrderConfigs.RECYCLERVIEW);
        }
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(a2);
        if (childViewHolder != null) {
            num = Integer.valueOf(childViewHolder.getAdapterPosition());
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.onItemSelected(num != null ? num.intValue() : -1);
        }
        return a2;
    }

    private final int a(View view, OrientationHelper orientationHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4d7bf09", new Object[]{this, view, orientationHelper})).intValue() : (orientationHelper.getDecoratedStart(view) - orientationHelper.getStartAfterPadding()) - this.c;
    }

    private final OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("2d7109c7", new Object[]{this, layoutManager});
        }
        if (this.f19266a == null) {
            this.f19266a = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        OrientationHelper orientationHelper = this.f19266a;
        if (orientationHelper == null) {
            q.a();
        }
        return orientationHelper;
    }
}
