package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.x;

/* loaded from: classes2.dex */
public class bfk implements bfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;

    /* renamed from: a  reason: collision with root package name */
    private int f25849a = -1;
    private int c = 0;

    static {
        kge.a(226478871);
        kge.a(-501979590);
    }

    @Override // tb.bfj
    public void a(bmz bmzVar, int i) {
        DXWidgetNode flattenWidgetNode;
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f027d3a", new Object[]{this, bmzVar, new Integer(i)});
            return;
        }
        Object b = bmzVar.b("triggerView");
        if (!(b instanceof DXRootView) || (flattenWidgetNode = ((DXRootView) b).getFlattenWidgetNode()) == null) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("tabScroller");
        if (!(queryWidgetNodeByUserId instanceof x)) {
            return;
        }
        View view = queryWidgetNodeByUserId.getWRView().get();
        if (!(view instanceof DXNativeRecyclerView) || (layoutManager = ((DXNativeRecyclerView) view).getLayoutManager()) == null || i >= layoutManager.getItemCount()) {
            return;
        }
        int a2 = a(layoutManager, queryWidgetNodeByUserId.getWidth());
        this.f25849a = i;
        View findViewByPosition = layoutManager.findViewByPosition(i);
        int left = a2 + (findViewByPosition.getLeft() - ((queryWidgetNodeByUserId.getWidth() - findViewByPosition.getWidth()) / 2));
        this.b = left;
        this.c = left;
    }

    @Override // tb.bfj
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    @Override // tb.bfj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    private int a(RecyclerView.LayoutManager layoutManager, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40f91c7f", new Object[]{this, layoutManager, new Integer(i)})).intValue();
        }
        int a2 = a();
        return (this.b != a2 || (findViewByPosition = layoutManager.findViewByPosition(this.f25849a)) == null) ? a2 : (a2 + ((i - findViewByPosition.getWidth()) / 2)) - findViewByPosition.getLeft();
    }
}
