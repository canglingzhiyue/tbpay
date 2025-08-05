package com.taobao.android.dinamicx;

import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes.dex */
public interface bn {
    void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext);

    void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext);
}
