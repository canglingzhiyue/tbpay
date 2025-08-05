package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1848547016);
    }

    public static int a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("613bf3ba", new Object[]{dXWidgetNode})).intValue();
        }
        if (dXWidgetNode != null) {
            return (dXWidgetNode.getAutoId() << 16) + dXWidgetNode.getLastAutoId();
        }
        return 0;
    }

    public static DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4713c17", new Object[]{dXWidgetNode, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode2 = (DXWidgetNode) dXWidgetNode.shallowClone(dXRuntimeContext, true);
        dXWidgetNode2.setSourceWidget(dXWidgetNode.getSourceWidget());
        b(dXWidgetNode2);
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode2.children = new ArrayList();
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                dXWidgetNode2.addChild(a(dXWidgetNode.getChildAt(i), dXRuntimeContext));
            }
        }
        return dXWidgetNode2;
    }

    public static DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1a9e57fb", new Object[]{dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode dXWidgetNode2 = (DXWidgetNode) dXWidgetNode.shallowClone(dXRuntimeContext, true);
        dXWidgetNode2.setSourceWidget(dXWidgetNode.getSourceWidget());
        b(dXWidgetNode2);
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode2.children = new ArrayList();
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                DXWidgetNode childAt = dXWidgetNode.getChildAt(i);
                if (childAt instanceof ac) {
                    a2 = ((ac) childAt).a(dXRuntimeContext);
                } else {
                    a2 = a(childAt, dXRuntimeContext, z);
                }
                dXWidgetNode2.addChild(a2, z);
            }
        }
        return dXWidgetNode2;
    }

    public static void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{dXWidgetNode});
            return;
        }
        DXWidgetNode sourceWidget = dXWidgetNode.getSourceWidget();
        if (sourceWidget == null) {
            return;
        }
        dXWidgetNode.setAutoId(a(sourceWidget));
        sourceWidget.setLastAutoId(sourceWidget.getLastAutoId() + 1);
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
        }
    }
}
