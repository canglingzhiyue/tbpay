package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public final class atp extends VirtualLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean g;
    private a h;
    private RecyclerView i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(RecyclerView.State state);
    }

    static {
        kge.a(-1346202207);
    }

    public static /* synthetic */ Object ipc$super(atp atpVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -955963047:
                super.a((List) objArr[0]);
                return null;
            case -602204034:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 1092366570:
                super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public atp(Context context) {
        super(context);
        this.g = false;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796e307e", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (!this.g) {
        } else {
            super.requestLayout();
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager
    public void a(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.g = false;
        super.a(list);
        this.g = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411c30ea", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.a(state);
    }

    public atp a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atp) ipChange.ipc$dispatch("15ca7533", new Object[]{this, recyclerView});
        }
        this.i = recyclerView;
        return this;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager, com.alibaba.android.ultron.ext.vlayout.b, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return super.scrollVerticallyBy(i, recycler, state);
        }
        boolean a2 = myd.a(recyclerView);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        myd.a(this.i, i, scrollVerticallyBy, a2);
        if (myd.a(this.i, i, scrollVerticallyBy) == 0) {
            return scrollVerticallyBy;
        }
        return 0;
    }
}
