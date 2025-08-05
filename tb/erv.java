package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes5.dex */
public abstract class erv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1631670754);
    }

    public static boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null) {
            return false;
        }
        return dXWidgetNode.isV4Node() ? dXWidgetNode.getDxv4Properties().a() != null && dXWidgetNode.getDxv4Properties().a().size() > 0 : dXWidgetNode.getEventHandlersExprNode() != null && dXWidgetNode.getEventHandlersExprNode().size() > 0;
    }
}
