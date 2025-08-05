package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXSwitchEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isOn;

    static {
        kge.a(-256587143);
    }

    public DXSwitchEvent(long j) {
        super(j);
    }

    public boolean isOn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebba7cb4", new Object[]{this})).booleanValue() : this.isOn;
    }

    public void setOn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f630dec", new Object[]{this, new Boolean(z)});
        } else {
            this.isOn = z;
        }
    }
}
