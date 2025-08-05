package tb;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohy extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f32076a;
    private boolean b;

    static {
        kge.a(-638189249);
    }

    public static /* synthetic */ Object ipc$super(ohy ohyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -574012007) {
            if (hashCode == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            if (hashCode != 1626618577) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        return new Boolean(super.canScrollHorizontally());
    }

    public ohy(Context context, int i) {
        super(context, i);
        this.f32076a = 1.0f;
        this.b = true;
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            ogg.a("ListViewComponent", "CustomGridLayoutManager:" + e.getMessage());
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f32076a = f;
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

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        oia.f32078a = this.f32076a;
        oia oiaVar = new oia(recyclerView.getContext());
        this.f32076a = 1.0f;
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
