package com.taobao.android.dinamicx;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXRecyclerEmptyView;
import tb.kge;

/* loaded from: classes5.dex */
public class ah extends com.taobao.android.dinamicx.widget.m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2056738289);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXRecyclerEmptyView(context);
    }
}
