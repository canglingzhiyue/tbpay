package com.taobao.android.searchbaseframe.ace.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class AceStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int id;
    private String name;
    private Map<String, String> params;
    private Map<String, AceSubStrategy> strategyMap = new HashMap();

    static {
        kge.a(2030680662);
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.id;
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.id = i;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this}) : this.params;
    }

    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.params = map;
        }
    }

    public AceSubStrategy getSubStrategy(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AceSubStrategy) ipChange.ipc$dispatch("f87e578f", new Object[]{this, str}) : this.strategyMap.get(str);
    }

    public Map<String, AceSubStrategy> getStrategyMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("139d6f6f", new Object[]{this}) : this.strategyMap;
    }

    public void setStrategyMap(Map<String, AceSubStrategy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3deef597", new Object[]{this, map});
        } else {
            this.strategyMap = map;
        }
    }
}
