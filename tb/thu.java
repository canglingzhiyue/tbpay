package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class thu extends ItemTouchHelper.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final thx f34100a;

    static {
        kge.a(1722985108);
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1ecf46", new Object[]{this, viewHolder, new Integer(i)});
        }
    }

    public thu(thx thxVar) {
        this.f34100a = thxVar;
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35ad4c09", new Object[]{this, recyclerView, viewHolder})).intValue() : makeMovementFlags(15, 0);
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16312429", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
        }
        int layoutPosition = viewHolder.getLayoutPosition();
        int layoutPosition2 = viewHolder2.getLayoutPosition();
        thx thxVar = this.f34100a;
        if (thxVar != null) {
            thxVar.a(layoutPosition, layoutPosition2);
        }
        return true;
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue() : this.f34100a.f();
    }
}
