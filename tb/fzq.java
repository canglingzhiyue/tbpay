package tb;

import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OrientationHelper f28242a;
    private RecyclerView.LayoutManager b;

    static {
        kge.a(-99769971);
    }

    public static fzq a(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzq) ipChange.ipc$dispatch("86d42ad2", new Object[]{layoutManager});
        }
        fzq fzqVar = new fzq();
        fzqVar.f28242a = OrientationHelper.createVerticalHelper(layoutManager);
        fzqVar.b = layoutManager;
        return fzqVar;
    }

    public static fzq b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzq) ipChange.ipc$dispatch("f103b2f1", new Object[]{layoutManager});
        }
        fzq fzqVar = new fzq();
        fzqVar.f28242a = OrientationHelper.createHorizontalHelper(layoutManager);
        fzqVar.b = layoutManager;
        return fzqVar;
    }

    public RecyclerView.LayoutManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutManager) ipChange.ipc$dispatch("5441521d", new Object[]{this}) : this.b;
    }

    public OrientationHelper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrientationHelper) ipChange.ipc$dispatch("2da7f959", new Object[]{this}) : this.f28242a;
    }
}
