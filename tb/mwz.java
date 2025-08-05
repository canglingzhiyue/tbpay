package tb;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mwz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(579443126);
    }

    public static int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) && !(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }
}
