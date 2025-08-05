package com.alibaba.triver.cannal_engine.event;

import android.view.MotionEvent;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.triver.cannal_engine.event.WidgetTouchEventUtils")
/* loaded from: classes3.dex */
public interface IWidgetTouchEventBridge extends Proxiable {
    void onClick(MotionEvent motionEvent, App app);

    void onTouch(MotionEvent motionEvent, App app);
}
