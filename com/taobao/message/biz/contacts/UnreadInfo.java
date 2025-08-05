package com.taobao.message.biz.contacts;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class UnreadInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private int tipNumber;
    private int tipType;

    static {
        kge.a(1253004994);
        kge.a(1028243835);
    }

    public int getTipType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3cff8739", new Object[]{this})).intValue() : this.tipType;
    }

    public void setTipType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993acf89", new Object[]{this, new Integer(i)});
        } else {
            this.tipType = i;
        }
    }

    public int getTipNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c092688", new Object[]{this})).intValue() : this.tipNumber;
    }

    public void setTipNumber(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd12871a", new Object[]{this, new Integer(i)});
        } else {
            this.tipNumber = i;
        }
    }
}
