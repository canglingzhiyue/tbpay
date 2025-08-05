package tb;

import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fzp extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fzq f28241a;
    private fzq b;

    static {
        kge.a(83551007);
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, view});
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, b(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, a(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        int end;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e083dbf8", new Object[]{this, layoutManager, view, orientationHelper})).intValue();
        }
        int decoratedStart = orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2);
        if (layoutManager.getClipToPadding()) {
            end = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            end = (orientationHelper.getEnd() / 2) - ((orientationHelper.getEnd() - orientationHelper.getDecoratedMeasurement(view)) / 2);
        }
        int i = decoratedStart - end;
        if (Math.abs(i) <= 1) {
            return 0;
        }
        return i;
    }

    public OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("2d7109c7", new Object[]{this, layoutManager});
        }
        fzq fzqVar = this.f28241a;
        if (fzqVar == null || fzqVar.a() != layoutManager) {
            this.f28241a = fzq.a(layoutManager);
        }
        return this.f28241a.b();
    }

    public OrientationHelper b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("70d77908", new Object[]{this, layoutManager});
        }
        fzq fzqVar = this.b;
        if (fzqVar == null || fzqVar.a() != layoutManager) {
            this.b = fzq.b(layoutManager);
        }
        return this.b.b();
    }
}
