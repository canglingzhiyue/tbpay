package tb;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(311799876);
    }

    public static int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return 1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 1;
        }
        return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
    }

    private static boolean a(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85acc031", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getTop() < 0) ? false : true;
    }

    private static boolean b(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f244dd0", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getLeft() < 0) ? false : true;
    }

    public static int b(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager).getSpanCount()) <= 0) {
            return -1;
        }
        int[] iArr = new int[spanCount];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public static boolean c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ba1ea9c", new Object[]{recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int b = b(recyclerView);
        if (b == -1 || b > 0) {
            return false;
        }
        int a2 = a(recyclerView);
        if (a2 == 0) {
            return b(recyclerView, b);
        }
        if (a2 == 1) {
            return a(recyclerView, b);
        }
        return false;
    }

    private static boolean c(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f89bdb6f", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getBottom() > recyclerView.getHeight()) ? false : true;
    }

    private static boolean d(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b213690e", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getRight() > recyclerView.getWidth()) ? false : true;
    }

    public static int d(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1642ad0c", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager).getSpanCount()) <= 0) {
            return -1;
        }
        int[] iArr = new int[spanCount];
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
        int length = iArr.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        if (i == -1) {
            return -1;
        }
        return i;
    }

    public static boolean e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0e36f9e", new Object[]{recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int d = d(recyclerView);
        if (d == -1 || d < itemCount) {
            return false;
        }
        int b = d - b(recyclerView);
        int a2 = a(recyclerView);
        if (a2 == 0) {
            return d(recyclerView, b);
        }
        if (a2 == 1) {
            return c(recyclerView, b);
        }
        return false;
    }
}
