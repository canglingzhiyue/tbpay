package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class meg extends RecyclerView.AdapterDataObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f31041a;

    public meg(RecyclerView recyclerView) {
        this.f31041a = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!(this.f31041a.getAdapter() instanceof meh)) {
        } else {
            meh mehVar = (meh) this.f31041a.getAdapter();
            if (mehVar.e() <= 0 || mehVar.i() != i2) {
                return;
            }
            this.f31041a.scrollToPosition(0);
        }
    }
}
