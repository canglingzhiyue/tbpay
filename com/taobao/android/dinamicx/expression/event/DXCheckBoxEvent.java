package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXCheckBoxEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isChecked;

    static {
        kge.a(-1798935894);
    }

    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue() : this.isChecked;
    }

    public void setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7b2d68", new Object[]{this, new Boolean(z)});
        } else {
            this.isChecked = z;
        }
    }

    public DXCheckBoxEvent(long j) {
        super(j);
    }
}
