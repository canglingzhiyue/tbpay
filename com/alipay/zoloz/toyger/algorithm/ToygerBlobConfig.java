package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class ToygerBlobConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String pubkey;

    public abstract float getCompressRate(int i);

    public abstract String getUploadImageType();

    public Integer getDesiredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cbf35430", new Object[]{this});
        }
        return -1;
    }
}
