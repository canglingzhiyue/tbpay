package com.taobao.android.searchbaseframe.ace.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class AceStrategySummary {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private String name;
    private Map<String, String> params;
    private String requestAlias;
    private String type;

    static {
        kge.a(1872058480);
    }

    public static AceStrategySummary mock(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AceStrategySummary) ipChange.ipc$dispatch("75e00766", new Object[]{str, str2});
        }
        AceStrategySummary aceStrategySummary = new AceStrategySummary();
        aceStrategySummary.setType("mock");
        aceStrategySummary.setId(str);
        aceStrategySummary.setRequestAlias(str2);
        return aceStrategySummary;
    }

    public static AceStrategySummary strategy(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AceStrategySummary) ipChange.ipc$dispatch("89b96b93", new Object[]{new Integer(i), str, map});
        }
        AceStrategySummary aceStrategySummary = new AceStrategySummary();
        aceStrategySummary.setType("strategy");
        aceStrategySummary.setName(str);
        aceStrategySummary.setParams(map);
        aceStrategySummary.setId(String.valueOf(i));
        return aceStrategySummary;
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

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
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

    public String getRequestAlias() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eda8c7e2", new Object[]{this}) : this.requestAlias;
    }

    public void setRequestAlias(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580ea8d4", new Object[]{this, str});
        } else {
            this.requestAlias = str;
        }
    }
}
