package com.taobao.android.icart.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends com.taobao.android.dinamicx.widget.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTFLOWSEPARATORLAYOUT_CARTFLOWSEPARATORLAYOUT = -586831095097893784L;

    static {
        kge.a(-61254527);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new j();
    }
}
