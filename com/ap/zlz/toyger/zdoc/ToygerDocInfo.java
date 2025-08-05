package com.ap.zlz.toyger.zdoc;

import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class ToygerDocInfo extends ToygerBiometricInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c attr;
    public TGFrame frame;
    public ToygerDocBlobConfig mBlobConfig;

    static {
        kge.a(-1015534433);
    }

    public ToygerDocInfo() {
    }

    public ToygerDocInfo(TGFrame tGFrame, c cVar) {
        this.frame = tGFrame;
        this.attr = cVar;
    }

    public ToygerDocBlobConfig getBlobConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerDocBlobConfig) ipChange.ipc$dispatch("9a306f59", new Object[]{this}) : this.mBlobConfig;
    }

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa23907", new Object[]{this, toygerDocBlobConfig});
        } else {
            this.mBlobConfig = toygerDocBlobConfig;
        }
    }
}
