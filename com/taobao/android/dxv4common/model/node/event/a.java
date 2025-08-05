package com.taobao.android.dxv4common.model.node.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;
import tb.gfn;
import tb.ggz;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a implements gfn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte eventType;

    static {
        kge.a(-654575650);
        kge.a(155283706);
    }

    public byte getEventType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23373fb1", new Object[]{this})).byteValue() : this.eventType;
    }

    public ggz.a exeExprWithIndex(DXWidgetNode dXWidgetNode, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggz.a) ipChange.ipc$dispatch("1e6573ea", new Object[]{this, dXWidgetNode, new Integer(i), map});
        }
        ggz x = dXWidgetNode.getDXRuntimeContext().C().b().x();
        if (x == null) {
            return null;
        }
        ggz.a a2 = x.a(dXWidgetNode.getDXRuntimeContext(), i, u.g().d(), map);
        if (DinamicXEngine.j() && (a2 == null || !a2.f28327a)) {
            throw new RuntimeException(a2.b);
        }
        return a2;
    }
}
