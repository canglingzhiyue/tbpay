package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ResultData<DATA> implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DATA mainData;
    private Map<String, Object> subData;

    static {
        kge.a(-645266264);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public ResultData(DATA data, Map<String, Object> map) {
        this.mainData = data;
        this.subData = Collections.unmodifiableMap(map);
    }

    public DATA getMainData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DATA) ipChange.ipc$dispatch("4874a4b2", new Object[]{this}) : this.mainData;
    }

    public Map<String, Object> getSubData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ddcf8f50", new Object[]{this}) : this.subData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.subData.keySet()) {
            sb.append(str);
            sb.append("|");
            sb.append(this.subData.get(str));
        }
        return "ResultData{mainData=" + this.mainData + ", subData=" + sb.toString() + '}';
    }
}
