package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PreventRepetitionFilter implements com.taobao.android.trade.event.g, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DEFAULT_INTERVAL = 300;
    private long mInterval;
    private Event mLastEvent;
    private long mLastTime;

    static {
        kge.a(-117120026);
        kge.a(1028243835);
        kge.a(449547903);
    }

    public PreventRepetitionFilter() {
        this.mInterval = 300L;
        emu.a("com.taobao.android.detail.core.event.basic.PreventRepetitionFilter");
    }

    public PreventRepetitionFilter(long j) {
        this.mInterval = j;
        emu.a("com.taobao.android.detail.core.event.basic.PreventRepetitionFilter");
    }

    @Override // com.taobao.android.trade.event.g
    public boolean filterEvent(Event event) {
        boolean checkInterval;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("985312b5", new Object[]{this, event})).booleanValue();
        }
        if (event != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (event.equals(this.mLastEvent)) {
                    checkInterval = checkInterval(currentTimeMillis);
                } else {
                    Object param = event.getParam();
                    Object param2 = this.mLastEvent == null ? null : this.mLastEvent.getParam();
                    if (param == null) {
                        if (param2 == null) {
                            checkInterval = checkInterval(currentTimeMillis);
                        }
                    } else if (param.equals(param2)) {
                        checkInterval = checkInterval(currentTimeMillis);
                    }
                }
                return checkInterval;
            } finally {
                this.mLastEvent = event;
                this.mLastTime = currentTimeMillis;
            }
        }
        return true;
    }

    private boolean checkInterval(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c83a8954", new Object[]{this, new Long(j)})).booleanValue() : j - this.mLastTime >= this.mInterval;
    }
}
