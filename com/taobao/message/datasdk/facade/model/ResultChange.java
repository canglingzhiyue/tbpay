package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ResultChange<DATA, INDEX> implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ExtData> diffMap;
    private INDEX index;
    private INDEX lastIndex;
    private ResultData<DATA> resultData;
    private int type;

    static {
        kge.a(-1648303826);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index, Map<String, ExtData> map) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
        if (map != null) {
            this.diffMap = Collections.unmodifiableMap(map);
        }
    }

    public ResultChange(int i, ResultData<DATA> resultData, INDEX index, INDEX index2, Map<String, ExtData> map) {
        this.diffMap = Collections.unmodifiableMap(new HashMap());
        this.type = i;
        this.resultData = resultData;
        this.index = index;
        this.lastIndex = index2;
        if (map != null) {
            this.diffMap = Collections.unmodifiableMap(map);
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public INDEX getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INDEX) ipChange.ipc$dispatch("77774bef", new Object[]{this}) : this.index;
    }

    public ResultData<DATA> getResultData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultData) ipChange.ipc$dispatch("78bbdaf9", new Object[]{this}) : this.resultData;
    }

    public Map<String, ExtData> getDiffMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("35772b1d", new Object[]{this}) : this.diffMap;
    }

    public INDEX getLastIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INDEX) ipChange.ipc$dispatch("b499e025", new Object[]{this}) : this.lastIndex;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResultChange{type=" + this.type + ", index=" + this.index + ", resultData=" + this.resultData + '}';
    }
}
