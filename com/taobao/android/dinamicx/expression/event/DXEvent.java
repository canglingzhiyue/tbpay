package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class DXEvent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, f> args;
    public long eventId;
    public boolean isPrepareBind;

    static {
        kge.a(-751119475);
        kge.a(1028243835);
    }

    public Map<String, f> getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this}) : this.args;
    }

    public void setArgs(Map<String, f> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.args = map;
        }
    }

    public DXEvent(long j) {
        this.eventId = j;
    }

    public long getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce27561a", new Object[]{this})).longValue() : this.eventId;
    }

    public void setEventId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0ce06a", new Object[]{this, new Long(j)});
        } else {
            this.eventId = j;
        }
    }

    public boolean isPrepareBind() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79152de5", new Object[]{this})).booleanValue() : this.isPrepareBind;
    }

    public void setPrepareBind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7d804b", new Object[]{this, new Boolean(z)});
        } else {
            this.isPrepareBind = z;
        }
    }
}
