package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class myg extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f31321a;

    public static /* synthetic */ Object ipc$super(myg mygVar, String str, Object... objArr) {
        if (str.hashCode() == -602204034) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public myg(int i, int i2) {
        super(i, i2);
    }

    public myg a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myg) ipChange.ipc$dispatch("15cffb55", new Object[]{this, recyclerView});
        }
        this.f31321a = recyclerView;
        return this;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        boolean a2 = myd.a(this.f31321a);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        myd.a(this.f31321a, i, scrollVerticallyBy, a2);
        if (myd.a(this.f31321a, i, scrollVerticallyBy) == 0) {
            return scrollVerticallyBy;
        }
        return 0;
    }
}
