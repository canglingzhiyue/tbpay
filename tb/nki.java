package tb;

import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(584318570);
    }

    public static boolean a(AbsListView absListView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d192db31", new Object[]{absListView})).booleanValue();
        }
        if (absListView != null) {
            Adapter adapter = absListView.getAdapter();
            if (adapter == null || adapter.isEmpty()) {
                return true;
            }
            if (absListView.getFirstVisiblePosition() <= 0 && (childAt = absListView.getChildAt(0)) != null && childAt.getTop() >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(AbsListView absListView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6a9732", new Object[]{absListView})).booleanValue();
        }
        if (absListView == null) {
            return false;
        }
        Adapter adapter = absListView.getAdapter();
        if (adapter != null && !adapter.isEmpty()) {
            int count = absListView.getCount() - 1;
            int lastVisiblePosition = absListView.getLastVisiblePosition();
            if (lastVisiblePosition < count || (childAt = absListView.getChildAt(lastVisiblePosition - absListView.getFirstVisiblePosition())) == null || childAt.getBottom() > absListView.getHeight()) {
                return false;
            }
        }
        return true;
    }
}
