package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohz extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f32077a;
    private boolean b;

    static {
        kge.a(1741297472);
    }

    public static /* synthetic */ Object ipc$super(ohz ohzVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447122930:
                super.setOrientation(((Number) objArr[0]).intValue());
                return null;
            case -574012007:
                return new Boolean(super.canScrollHorizontally());
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 1626618577:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public ohz(Context context) {
        super(context);
        this.f32077a = 1.0f;
        this.b = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            super.setOrientation(i);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f32077a = f;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            ogg.a("ListViewComponent", e.getMessage());
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("fdddbac1", new Object[]{this});
        }
        if (getOrientation() == 1) {
            return new RecyclerView.LayoutParams(-1, -2);
        }
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        oia.f32078a = this.f32077a;
        oia oiaVar = new oia(recyclerView.getContext());
        this.f32077a = 1.0f;
        oia.f32078a = 1.0f;
        oiaVar.setTargetPosition(i);
        startSmoothScroll(oiaVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        return super.canScrollVertically();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        return super.canScrollHorizontally();
    }
}
