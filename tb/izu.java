package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class izu extends izy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERMODIFYCURRENTITEMDATA = "-1682233800684224822";

    static {
        kge.a(-1118254492);
    }

    @Override // tb.izy, tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 30011;
    }

    @Override // tb.izy, tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar}) : a(dlhVar, dXRecyclerLayout, dXWidgetNode, lVar, DXRecyclerLayout.MSG_METHOD_MODIFY_CURRENT_ITEM_DATA);
    }
}
