package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.h;
import com.taobao.android.dinamicx.eventchain.i;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes5.dex */
public class fxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(3896087);
    }

    public static void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddbf248", new Object[]{dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 == null || dXWidgetNode == dXWidgetNode2 || dXWidgetNode2.getAutoId() != dXWidgetNode.getAutoId()) {
        } else {
            a(dXWidgetNode);
        }
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        DinamicXEngine engine;
        i g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode == null || (engine = dXWidgetNode.getEngine()) == null || (g = engine.g()) == null) {
        } else {
            g.a(dXWidgetNode);
        }
    }

    public static boolean a(DXWidgetNode dXWidgetNode, DXEvent dXEvent) {
        h E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c73ff14d", new Object[]{dXWidgetNode, dXEvent})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (dXRuntimeContext == null || (E = dXRuntimeContext.E()) == null) {
            return false;
        }
        boolean f = E.f();
        if (f && DinamicXEngine.j()) {
            fuw.d("EventChainCancel", "RL onEvent cancel by eventChain: " + dXEvent.getEventId());
        }
        return f;
    }
}
