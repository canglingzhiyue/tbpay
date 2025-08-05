package com.alipay.zoloz.isp;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerIsp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(int i, int i2, int i3, int i4, int i5, float[] fArr, float[][][] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9042c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), fArr, fArr2});
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public IspResult adjustIsp(byte[] bArr, byte[] bArr2, Rect rect, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IspResult) ipChange.ipc$dispatch("b0decfe3", new Object[]{this, bArr, bArr2, rect, new Long(j), new Integer(i)});
        }
        String str = "ToygerIsp.adjustIsp(), ispResult=" + ((Object) null);
        return null;
    }
}
