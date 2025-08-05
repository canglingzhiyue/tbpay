package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;

/* loaded from: classes7.dex */
public class myd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2febb869", new Object[]{recyclerView, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 != 0 && (recyclerView instanceof myc)) {
            ((myc) recyclerView).onDisabledDirection(0);
        }
        int i3 = i - i2;
        if (i3 != 0 && (recyclerView instanceof myc)) {
            myc mycVar = (myc) recyclerView;
            mycVar.onDisabledDirection(i);
            mycVar.onReachedEdge(i3, 0);
        }
        return i3;
    }

    public static boolean a(RecyclerView recyclerView) {
        mya nestedScrollChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4660659a", new Object[]{recyclerView})).booleanValue();
        }
        if (!(recyclerView instanceof ParentRecyclerView) || (nestedScrollChild = ((ParentRecyclerView) recyclerView).getNestedScrollChild()) == null) {
            return false;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt == nestedScrollChild && (childAt.getTop() > 0 || childAt.getBottom() < recyclerView.getHeight())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(RecyclerView recyclerView, int i, int i2, boolean z) {
        ParentRecyclerView parentRecyclerView;
        mya nestedScrollChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8c0922", new Object[]{recyclerView, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
        }
        if (!(recyclerView instanceof ParentRecyclerView) || (nestedScrollChild = (parentRecyclerView = (ParentRecyclerView) recyclerView).getNestedScrollChild()) == null || i - i2 != 0) {
            return false;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (childAt == nestedScrollChild) {
                if (childAt.getTop() > 0 || childAt.getBottom() < recyclerView.getHeight() || (z && childAt.getTop() <= 0 && childAt.getBottom() >= recyclerView.getHeight()) || parentRecyclerView.acceptNestedScroll(i)) {
                    nestedScrollChild.onScrolledByNestedParent(parentRecyclerView);
                    return true;
                }
            }
        }
        return false;
    }
}
