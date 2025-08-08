package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;
import tb.mto;

/* loaded from: classes.dex */
public class lin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1017703704);
    }

    public int a(RecyclerView recyclerView, int i, boolean z) {
        View findViewByPosition;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2febf83a", new Object[]{this, recyclerView, new Integer(i), new Boolean(z)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i2 = 1; i2 < 6; i2++) {
            int i3 = i + i2;
            View findViewByPosition2 = layoutManager.findViewByPosition(i3);
            if (findViewByPosition2 == null && z && (a2 = a(recyclerView.getAdapter(), i)) > 0) {
                return a2;
            }
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i3;
            }
        }
        return -1;
    }

    public int a(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85acc020", new Object[]{this, recyclerView, new Integer(i)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i2 = 1; i2 < 6; i2++) {
            int i3 = i - i2;
            View findViewByPosition2 = layoutManager.findViewByPosition(i3);
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i3;
            }
        }
        return -1;
    }

    public double b(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f244dba", new Object[]{this, recyclerView, new Integer(i)})).doubleValue();
        }
        if (recyclerView == null || (findViewByPosition = recyclerView.getLayoutManager().findViewByPosition(i)) == null || findViewByPosition.getMeasuredHeight() <= 0) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        float b = b(recyclerView) - findViewByPosition.getTop();
        return b <= 0.0f ? mto.a.GEO_NOT_SUPPORT : b / findViewByPosition.getMeasuredHeight();
    }

    public View c(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("88308eed", new Object[]{this, recyclerView, new Integer(i)});
        }
        if (recyclerView != null) {
            return recyclerView.getLayoutManager().findViewByPosition(i);
        }
        return null;
    }

    public BaseSectionModel<?> a(lia liaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("e29deecf", new Object[]{this, liaVar, new Integer(i)});
        }
        if (liaVar != null) {
            return liaVar.a(i);
        }
        return null;
    }

    public int a(lia liaVar, String str) {
        List<BaseSectionModel> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4269ea91", new Object[]{this, liaVar, str})).intValue();
        }
        if (liaVar == null || StringUtils.isEmpty(str) || (b = liaVar.b()) == null) {
            return -1;
        }
        for (int i = 0; i < b.size(); i++) {
            BaseSectionModel baseSectionModel = b.get(i);
            if (baseSectionModel != null && StringUtils.equals(str, baseSectionModel.getSectionBizCode())) {
                return i;
            }
        }
        return -1;
    }

    public int[] a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("85ac4e0e", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int a2 = a(iArr);
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
        return new int[]{a2, b(iArr)};
    }

    private int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c198169", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    private int b(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90ffbcaa", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    private int a(RecyclerView.Adapter adapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee48fb2b", new Object[]{this, adapter, new Integer(i)})).intValue();
        }
        int i2 = i + 2;
        if (i2 >= adapter.getItemCount()) {
            return -1;
        }
        return i2;
    }

    private int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        ViewParent parent = recyclerView.getParent();
        return parent != null ? ((ViewGroup) parent).getHeight() - recyclerView.getTop() : recyclerView.getHeight();
    }

    public void a(RecyclerView recyclerView, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e547efde", new Object[]{this, recyclerView, baseSectionModel});
            return;
        }
        lia liaVar = (lia) recyclerView.getAdapter();
        if (liaVar == null) {
            return;
        }
        liaVar.a(baseSectionModel);
    }
}
