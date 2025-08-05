package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.swipe.SwipeFrameLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class goh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-999910936);
    }

    public static boolean a(final bbz bbzVar, List<IDMComponent> list, RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ec67e9", new Object[]{bbzVar, list, viewHolder, new Integer(i)})).booleanValue();
        }
        final gpf gpfVar = new gpf(bbzVar);
        if (list != null && viewHolder != null && gpfVar.a()) {
            final IDMComponent iDMComponent = list.get(i);
            if (viewHolder.itemView instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) viewHolder.itemView;
                if (dXRootView.getFlattenWidgetNode() != null) {
                    DXWidgetNode queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("main");
                    View v = (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) ? null : queryWidgetNodeByUserId.getDXRuntimeContext().v();
                    if (v instanceof SwipeFrameLayout) {
                        SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) v;
                        swipeFrameLayout.setOnLongClickListener(null);
                        swipeFrameLayout.setOnLongClick(new View.OnLongClickListener() { // from class: tb.goh.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnLongClickListener
                            public boolean onLongClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                                }
                                if (!gon.this.a()) {
                                    return false;
                                }
                                bei.a(bbzVar, iDMComponent.getKey(), "itemLongClick");
                                return true;
                            }
                        });
                        viewHolder.itemView.setOnLongClickListener(null);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
