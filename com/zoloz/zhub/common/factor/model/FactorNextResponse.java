package com.zoloz.zhub.common.factor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class FactorNextResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Integer nextIndex;
    public String versionToken = "";
    public List<FactorNextResponseInner> response = new ArrayList();
    public List<Map<String, String>> zStack = new ArrayList();

    static {
        kge.a(-267499682);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FactorNextResponse{nextIndex = " + this.nextIndex + ", versionToken = " + this.versionToken + ", response = " + this.response.toString() + ", zStack = " + this.zStack.toString() + '}';
    }
}
