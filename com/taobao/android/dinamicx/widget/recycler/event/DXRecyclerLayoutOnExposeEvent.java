package com.taobao.android.dinamicx.widget.recycler.event;

import com.taobao.android.dinamicx.expression.event.DXScrollLayoutBaseExposeEvent;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerLayoutOnExposeEvent extends DXRecyclerLayoutExposeEventBase {
    static {
        kge.a(1863805837);
    }

    public DXRecyclerLayoutOnExposeEvent(long j, int i, Object obj) {
        super(j, i, obj, -1L);
    }

    public DXRecyclerLayoutOnExposeEvent(int i, Object obj) {
        super(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE, i, obj, -1L);
    }
}
