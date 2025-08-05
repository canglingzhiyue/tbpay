package com.alibaba.android.aura.service.aspect;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public final class AURAAspectServiceInput implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.android.aura.datamodel.a mAspectInfo;
    private b mError;
    private AURAInputData mInputData;
    private boolean mIsAspectError;
    private boolean mIsError;
    private c mOutputData;
    private int mType;

    static {
        kge.a(-875829790);
        kge.a(1028243835);
    }

    private AURAAspectServiceInput() {
    }

    public static AURAAspectServiceInput beforeServiceExecute(String str, String str2, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("2ae84660", new Object[]{str, str2, aURAInputData});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 2;
        aURAAspectServiceInput.mInputData = aURAInputData;
        aURAAspectServiceInput.mAspectInfo = new com.alibaba.android.aura.datamodel.a(str, str2);
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput afterServiceExecute(String str, String str2, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("f07d3cad", new Object[]{str, str2, cVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 3;
        aURAAspectServiceInput.mOutputData = cVar;
        aURAAspectServiceInput.mIsError = z;
        aURAAspectServiceInput.mAspectInfo = new com.alibaba.android.aura.datamodel.a(str, str2);
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput beforeFlowExecute(String str, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("128a2b01", new Object[]{str, aURAInputData});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 0;
        aURAAspectServiceInput.mInputData = aURAInputData;
        aURAAspectServiceInput.mAspectInfo = new com.alibaba.android.aura.datamodel.a(str, "");
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput afterFlowExecute(String str, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("9b4b5e12", new Object[]{str, cVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 1;
        aURAAspectServiceInput.mOutputData = cVar;
        aURAAspectServiceInput.mIsError = z;
        aURAAspectServiceInput.mAspectInfo = new com.alibaba.android.aura.datamodel.a(str, "");
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput error(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("6dc5c1b6", new Object[]{bVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 4;
        aURAAspectServiceInput.mError = bVar;
        aURAAspectServiceInput.mIsAspectError = z;
        return aURAAspectServiceInput;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mType;
    }

    public AURAInputData getInputData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAInputData) ipChange.ipc$dispatch("76763cfa", new Object[]{this}) : this.mInputData;
    }

    public c getOutputData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e762c495", new Object[]{this}) : this.mOutputData;
    }

    public b getError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5eb97435", new Object[]{this}) : this.mError;
    }

    public boolean isError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59cf5489", new Object[]{this})).booleanValue() : this.mIsError;
    }

    public boolean isAspectError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4aff291", new Object[]{this})).booleanValue() : this.mIsAspectError;
    }

    public com.alibaba.android.aura.datamodel.a getAspectInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.aura.datamodel.a) ipChange.ipc$dispatch("5f1bc9dc", new Object[]{this}) : this.mAspectInfo;
    }
}
