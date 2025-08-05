package com.taobao.downgrade.rule;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes7.dex */
public class AvailableBizRule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> bizMap;

    public Map<String, String> getBizMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6e1c82fb", new Object[]{this}) : this.bizMap;
    }

    public void setBizMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9701dbf3", new Object[]{this, map});
        } else {
            this.bizMap = map;
        }
    }
}
