package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes5.dex */
public class gbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(456852190);
    }

    public static DXWidgetNode a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode) {
        DXWidgetNode dXWidgetNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4f15b795", new Object[]{dXRuntimeContext, dXWidgetNode});
        }
        if (dXWidgetNode == null || (dXWidgetNode2 = (DXWidgetNode) a(dXRuntimeContext, dXWidgetNode, true)) == null) {
            return null;
        }
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode2.removeAllChild();
            for (int i = 0; i < dXWidgetNode.getChildren().size(); i++) {
                dXWidgetNode2.addChild(a(dXRuntimeContext, dXWidgetNode.getChildren().get(i)), false);
            }
        }
        return dXWidgetNode2;
    }

    public static Object a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, boolean z) {
        DXWidgetNode build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9d3673d4", new Object[]{dXRuntimeContext, dXWidgetNode, new Boolean(z)});
        }
        if (dXWidgetNode == null || (build = dXWidgetNode.build(null)) == null) {
            return null;
        }
        if (dXWidgetNode.getDXRuntimeContext() != null) {
            build.setDXRuntimeContext(dXWidgetNode.getDXRuntimeContext().a(build));
        } else if (dXRuntimeContext != null) {
            build.setDXRuntimeContext(dXRuntimeContext.a(build));
        }
        build.onClone(dXWidgetNode, z);
        return build;
    }
}
