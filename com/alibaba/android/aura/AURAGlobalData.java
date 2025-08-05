package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAGlobalData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private Map<String, Object> mMap;

    static {
        kge.a(368946299);
        kge.a(1028243835);
    }

    @Deprecated
    public AURAGlobalData() {
        this.TAG = AURAGlobalData.class.getSimpleName();
        this.mMap = new ConcurrentHashMap();
    }

    public AURAGlobalData(AURAGlobalData aURAGlobalData) {
        this.TAG = AURAGlobalData.class.getSimpleName();
        this.mMap = new ConcurrentHashMap();
        Map<String, Object> map = aURAGlobalData.mMap;
        if (map != null) {
            this.mMap = new ConcurrentHashMap(map);
        }
    }

    public Map<String, Object> getMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this}) : this.mMap;
    }

    public <T> T get(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e8a6d3c", new Object[]{this, str, cls});
        }
        Map<String, Object> map = this.mMap;
        if (map == null) {
            return null;
        }
        try {
            return (T) map.get(str);
        } catch (Throwable th) {
            arc.a().c(this.TAG, "get", th.getMessage());
            return null;
        }
    }

    public AURAGlobalData copyOnWrite(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("b5611c49", new Object[]{this, map});
        }
        AURAGlobalData aURAGlobalData = new AURAGlobalData(this);
        if (aURAGlobalData.mMap == null) {
            aURAGlobalData.mMap = new ConcurrentHashMap();
        }
        if (map != null) {
            aURAGlobalData.mMap.putAll(map);
        }
        return aURAGlobalData;
    }

    public void update(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843003f6", new Object[]{this, str, obj});
            return;
        }
        Map<String, Object> map = this.mMap;
        if (map != null && str != null) {
            if (obj == null) {
                map.remove(str);
                return;
            } else {
                map.put(str, obj);
                return;
            }
        }
        ard a2 = arc.a();
        String str2 = this.TAG;
        a2.c(str2, "update", "mMap or key or value is null,key=" + str);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFGlobalData{map=" + this.mMap + '}';
    }
}
