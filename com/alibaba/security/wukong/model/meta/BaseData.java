package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseData implements Data {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> extras;
    public long ts;

    public BaseData(long j) {
        this.ts = j;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
        }
        if (this.extras == null) {
            this.extras = new HashMap();
        }
        return this.extras;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.ts;
    }

    public void setExtras(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba0699", new Object[]{this, map});
        } else {
            this.extras = map;
        }
    }

    public void setTs(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706a353c", new Object[]{this, new Long(j)});
        } else {
            this.ts = j;
        }
    }
}
