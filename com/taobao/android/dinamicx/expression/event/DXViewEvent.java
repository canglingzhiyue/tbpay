package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class DXViewEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int itemIndex;

    static {
        kge.a(-361441688);
    }

    public int getItemIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("165a1ac3", new Object[]{this})).intValue() : this.itemIndex;
    }

    public void setItemIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce01a3f", new Object[]{this, new Integer(i)});
        } else {
            this.itemIndex = i;
        }
    }

    public DXViewEvent(long j) {
        super(j);
    }
}
