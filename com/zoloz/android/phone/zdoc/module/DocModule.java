package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class DocModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AlgorithmModule algorithm;
    private CollModule coll = new CollModule();

    static {
        kge.a(-450465514);
        kge.a(1028243835);
    }

    public CollModule getColl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollModule) ipChange.ipc$dispatch("939aecd6", new Object[]{this}) : this.coll;
    }

    public void setColl(CollModule collModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d5117e", new Object[]{this, collModule});
        } else {
            this.coll = collModule;
        }
    }

    public AlgorithmModule getAlgorithm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgorithmModule) ipChange.ipc$dispatch("cf5eb304", new Object[]{this}) : this.algorithm;
    }

    public void setAlgorithm(AlgorithmModule algorithmModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f730d0e0", new Object[]{this, algorithmModule});
        } else {
            this.algorithm = algorithmModule;
        }
    }
}
