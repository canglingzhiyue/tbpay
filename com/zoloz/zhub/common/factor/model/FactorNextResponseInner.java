package com.zoloz.zhub.common.factor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class FactorNextResponseInner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> outParams;
    public String retCode;
    public String retCodeSub;
    public String retMessageSub;
    public Integer taskIndex;

    static {
        kge.a(-1251606120);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FactorNextResponseInner{taskIndex = " + this.taskIndex + ", retCode = " + this.retCode + ", retCodeSub = " + this.retCodeSub + ", retMessageSub = " + this.retMessageSub + ", outParams = " + this.outParams.toString() + '}';
    }
}
