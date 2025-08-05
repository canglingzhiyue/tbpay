package com.ali.user.open.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class SerializableMap implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> map;

    static {
        kge.a(-1236888153);
        kge.a(1028243835);
    }

    public Map<String, String> getMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this}) : this.map;
    }

    public void setMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b53044", new Object[]{this, map});
        } else {
            this.map = map;
        }
    }
}
