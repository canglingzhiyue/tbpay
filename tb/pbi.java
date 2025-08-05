package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class pbi extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Integer> f32544a;

    static {
        kge.a(130341194);
    }

    public static /* synthetic */ Object ipc$super(pbi pbiVar, String str, Object... objArr) {
        if (str.hashCode() == 1092366570) {
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public pbi(Context context) {
        super(context);
        this.f32544a = new HashMap();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411c30ea", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        i.a("OffsetLinearLayoutManager", "count:" + childCount);
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            this.f32544a.put(Integer.valueOf(i2), Integer.valueOf(childAt.getHeight()));
            i += childAt.getHeight();
            i.a("OffsetLinearLayoutManager", "view:" + childAt);
        }
        i.a("OffsetLinearLayoutManager", "totalHeight:" + i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96c84ce8", new Object[]{this, state})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i2 = 0; i2 < findFirstVisibleItemPosition; i2++) {
                i += this.f32544a.get(Integer.valueOf(i2)) == null ? 0 : this.f32544a.get(Integer.valueOf(i2)).intValue();
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
