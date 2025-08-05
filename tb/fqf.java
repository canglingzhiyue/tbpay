package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes5.dex */
public class fqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1100080750);
    }

    public static DXWidgetNode a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("1e0c66e6", new Object[]{dXWidgetNode}) : dXWidgetNode.getParentWidget() == null ? dXWidgetNode : a(dXWidgetNode.getParentWidget());
    }

    public static boolean b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b57726a", new Object[]{dXWidgetNode})).booleanValue();
        }
        DXWidgetNode a2 = a(dXWidgetNode);
        DXRootView dXRootView = null;
        if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null) {
            dXRootView = dXWidgetNode.getDXRuntimeContext().s();
        }
        return dXRootView == null || dXRootView.getExpandWidgetNode() != a2;
    }
}
