package com.alibaba.android.aura.datamodel.rule;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AURALocalAdjustIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a mLocalAdjustModel;
    private final String mRuleType;

    static {
        kge.a(-177987867);
    }

    public AURALocalAdjustIO(String str, a aVar) {
        this.mRuleType = str;
        this.mLocalAdjustModel = aVar;
    }

    public a getLocalAdjustModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e2b78654", new Object[]{this});
        }
        a aVar = this.mLocalAdjustModel;
        return aVar == null ? new a() : aVar;
    }

    public String getLocalAdjustType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8ebabb", new Object[]{this});
        }
        String str = this.mRuleType;
        return str == null ? "" : str;
    }
}
