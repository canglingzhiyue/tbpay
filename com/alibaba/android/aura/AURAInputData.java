package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAInputData<DATA extends Serializable> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DATA mData;
    private final AURAFlowData mFlowData;
    private final AURAGlobalData mGlobalData;

    static {
        kge.a(914812486);
        kge.a(1028243835);
    }

    public AURAInputData(DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        this.mData = data;
        this.mFlowData = aURAFlowData;
        this.mGlobalData = aURAGlobalData;
    }

    public DATA getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DATA) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}) : this.mData;
    }

    public AURAGlobalData getGlobalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this}) : this.mGlobalData;
    }

    public AURAFlowData getFlowData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAFlowData) ipChange.ipc$dispatch("7ff539a0", new Object[]{this}) : this.mFlowData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFInputData{mData=" + this.mData + ", mFlowData=" + this.mFlowData + ", mGlobalData=" + this.mGlobalData + '}';
    }
}
