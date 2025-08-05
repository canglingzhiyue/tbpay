package com.alipay.zoloz.toyger.face;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerDataInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int dataType;
    public byte[] rawData;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerDataInfo{rawData =" + new String(this.rawData) + ", dataType=" + this.dataType + '}';
    }
}
