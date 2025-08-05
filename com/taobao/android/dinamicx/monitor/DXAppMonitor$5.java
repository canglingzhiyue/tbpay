package com.taobao.android.dinamicx.monitor;

import java.util.HashMap;

/* loaded from: classes5.dex */
public class DXAppMonitor$5 extends HashMap<String, String> {
    public final /* synthetic */ float val$consumingTime;

    public DXAppMonitor$5(float f) {
        this.val$consumingTime = f;
        put(DXMonitorConstant.DX_MONITOR_CONSUMING_TIME, String.valueOf(this.val$consumingTime / 1000000.0f));
    }
}
