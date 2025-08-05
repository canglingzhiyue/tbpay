package com.alibaba.android.aura;

import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAFlowData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private String mFlowCode;
    private Map<String, Object> mMap;

    static {
        kge.a(-628934650);
        kge.a(1028243835);
    }

    public AURAFlowData(String str) {
        this.TAG = AURAFlowData.class.getSimpleName();
        this.mMap = new ConcurrentHashMap() { // from class: com.alibaba.android.aura.AURAFlowData.1
            {
                put("aura_trace_id", AURATraceUtil.a());
            }
        };
        this.mFlowCode = str;
    }

    private AURAFlowData(AURAFlowData aURAFlowData) {
        this.TAG = AURAFlowData.class.getSimpleName();
        Map<String, Object> map = aURAFlowData.mMap;
        if (map != null) {
            this.mMap = new ConcurrentHashMap(map);
            this.mFlowCode = aURAFlowData.getFlowCode();
        }
    }

    public <T> T get(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e8a6d3c", new Object[]{this, str, cls});
        }
        Map<String, Object> map = this.mMap;
        if (map != null) {
            return (T) map.get(str);
        }
        return null;
    }

    public AURAFlowData copyOnWrite(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("55ab385e", new Object[]{this, map});
        }
        AURAFlowData aURAFlowData = new AURAFlowData(this);
        if (aURAFlowData.mMap == null) {
            aURAFlowData.mMap = new ConcurrentHashMap();
        }
        if (map != null) {
            aURAFlowData.mMap.putAll(map);
        }
        return aURAFlowData;
    }

    public void update(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843003f6", new Object[]{this, str, obj});
            return;
        }
        Map<String, Object> map = this.mMap;
        if (map == null || str == null || obj == null) {
            ard a2 = arc.a();
            String str2 = this.TAG;
            a2.c(str2, "update", "mMap or key or value is null,key=" + str + ",value=" + obj);
            return;
        }
        map.put(str, obj);
    }

    public Map<String, Object> getMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this}) : this.mMap;
    }

    public String getFlowCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this}) : this.mFlowCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURAFlowData{mMap=" + this.mMap + '}';
    }
}
