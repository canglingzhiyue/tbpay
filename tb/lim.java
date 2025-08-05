package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lim extends RecyclerView.AdapterDataObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lkt<RecyclerView> f30656a;

    static {
        kge.a(1793660465);
    }

    public static /* synthetic */ Object ipc$super(lim limVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1902625302:
                super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1756146412:
                super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1389471316:
                super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            case -1172900388:
                super.onChanged();
                return null;
            case -238222724:
                super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1882209744:
                super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public lim(lkt<RecyclerView> lktVar) {
        this.f30656a = lktVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            return;
        }
        super.onChanged();
        this.f30656a.c();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeChanged(i, i2);
        this.f30656a.a(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        super.onItemRangeChanged(i, i2, obj);
        this.f30656a.a(i, i2, obj);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeInserted(i, i2);
        this.f30656a.b(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeRemoved(i, i2);
        this.f30656a.c(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        super.onItemRangeMoved(i, i2, i3);
        this.f30656a.a(i, i2, i3);
    }
}
