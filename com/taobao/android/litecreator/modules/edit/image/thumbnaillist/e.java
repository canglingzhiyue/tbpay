package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import tb.gzs;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends com.taobao.android.litecreator.widgets.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13358a = true;
    private a b;

    /* loaded from: classes5.dex */
    public interface a {
        String a();

        void a(int i);

        void a(int i, int i2);
    }

    static {
        kge.a(1273642028);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1744814362) {
            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
            return null;
        } else if (hashCode != 900549641) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.getMovementFlags((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]));
        }
    }

    @Override // com.taobao.android.litecreator.widgets.d
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f13358a = z;
        }
    }

    @Override // com.taobao.android.litecreator.widgets.d, android.support.v7.widget.helper.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98003ee6", new Object[]{this, recyclerView, viewHolder});
            return;
        }
        super.clearView(recyclerView, viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        int layoutPosition = viewHolder.getLayoutPosition();
        u.a("BuyerShowItemTouchHelperCallback", "aYou thumbnail getAdapterPosition = " + adapterPosition + " ,getLayoutPosition= " + layoutPosition);
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(adapterPosition);
    }

    @Override // com.taobao.android.litecreator.widgets.d, android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue() : this.f13358a;
    }

    @Override // com.taobao.android.litecreator.widgets.d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2);
    }

    private boolean a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6090f29", new Object[]{this, viewHolder})).booleanValue() : (viewHolder instanceof gzs) && !b(viewHolder);
    }

    private boolean b(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d73f6208", new Object[]{this, viewHolder})).booleanValue() : this.b != null && StringUtils.equals(((gzs) viewHolder).b(), this.b.a());
    }

    @Override // com.taobao.android.litecreator.widgets.d, android.support.v7.widget.helper.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35ad4c09", new Object[]{this, recyclerView, viewHolder})).intValue();
        }
        a(a(viewHolder));
        return super.getMovementFlags(recyclerView, viewHolder);
    }

    @Override // com.taobao.android.litecreator.widgets.d, android.support.v7.widget.helper.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16312429", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue() : a(viewHolder) && a(viewHolder2);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f624a9", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }
}
