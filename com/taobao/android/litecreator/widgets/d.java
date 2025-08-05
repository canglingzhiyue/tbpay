package com.taobao.android.litecreator.widgets;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class d extends ItemTouchHelper.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1081929358);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1744814362) {
            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
            return null;
        } else if (hashCode == -298668841) {
            super.onSelectedChanged((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1142860821) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMoved((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1], ((Number) objArr[2]).intValue(), (RecyclerView.ViewHolder) objArr[3], ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue());
            return null;
        }
    }

    public abstract void a(int i, int i2);

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16312429", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
        }
        return true;
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1ecf46", new Object[]{this, viewHolder, new Integer(i)});
        }
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35ad4c09", new Object[]{this, recyclerView, viewHolder})).intValue() : makeMovementFlags(12, 0);
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441eac15", new Object[]{this, recyclerView, viewHolder, new Integer(i), viewHolder2, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        a(adapterPosition, adapterPosition2);
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98003ee6", new Object[]{this, recyclerView, viewHolder});
            return;
        }
        super.clearView(recyclerView, viewHolder);
        if (!a()) {
            return;
        }
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        viewHolder.itemView.setAlpha(1.0f);
    }

    @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee32acd7", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (i == 2 && a()) {
            viewHolder.itemView.setScaleX(1.2f);
            viewHolder.itemView.setScaleY(1.2f);
            viewHolder.itemView.setAlpha(1.0f);
        }
        super.onSelectedChanged(viewHolder, i);
    }
}
