package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.Logger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SharedState implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient Diff diff;
    private Map<String, Object> jsRuntimeData;
    private Map<String, Object> originalData;
    private Map<String, Object> props;
    private Map<String, Object> runtimeData;

    static {
        kge.a(-337185749);
        kge.a(1028243835);
    }

    public SharedState() {
    }

    public SharedState(SharedState sharedState) {
        this.props = new HashMap(sharedState.props);
        this.originalData = new HashMap(sharedState.originalData);
        this.runtimeData = new HashMap(sharedState.runtimeData);
        this.jsRuntimeData = new HashMap(sharedState.jsRuntimeData);
        this.diff = new Diff(sharedState.diff);
    }

    public SharedState(SharedState sharedState, SharedState sharedState2, Diff diff, JSONArray jSONArray) {
        this.props = new HashMap(sharedState.props);
        this.originalData = new HashMap(sharedState.originalData);
        this.runtimeData = new HashMap(sharedState.runtimeData);
        this.jsRuntimeData = new HashMap(sharedState.jsRuntimeData);
        this.runtimeData.putAll(sharedState2.runtimeData);
        this.runtimeData.put("__InstantOperation", jSONArray);
        this.diff = new Diff(diff);
    }

    public SharedState(Map<String, Object> map) {
        this.props = map;
        this.originalData = new HashMap();
        this.runtimeData = new HashMap();
        this.jsRuntimeData = new HashMap();
        this.diff = new Diff();
    }

    public SharedState(String str) {
        parseFromJSON(str);
    }

    public SharedState updateOriginalData(Map<String, Object> map, Map<String, DeltaItem> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("cee4b46f", new Object[]{this, map, map2});
        }
        SharedState sharedState = new SharedState(this);
        sharedState.originalData.putAll(map);
        sharedState.diff = sharedState.diff.updateOriginalDiff(map2);
        return sharedState;
    }

    public SharedState updateJsRuntimeData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("9f63fc2c", new Object[]{this, map});
        }
        SharedState sharedState = new SharedState(this);
        sharedState.jsRuntimeData.putAll(map);
        return sharedState;
    }

    public <T> T getProp(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3db65f23", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.props.get(str);
        return t2 == null ? t : t2;
    }

    public <T> T getProp(String str, String str2, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1da3016d", new Object[]{this, str, str2, cls, t});
        }
        T t2 = (T) this.props.get(getKey(str, str2));
        return t2 == null ? t : t2;
    }

    public <T> T getOriginData(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cfda46f0", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.originalData.get(str);
        return t2 == null ? t : t2;
    }

    public <T> T getOriginData(String str, String str2, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fcab6ffa", new Object[]{this, str, str2, cls, t});
        }
        T t2 = (T) this.originalData.get(getKey(str, str2));
        return t2 == null ? t : t2;
    }

    public <T> T getRuntimeData(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("38672df6", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.runtimeData.get(str);
        return t2 == null ? t : t2;
    }

    public <T> T getRuntimeData(String str, String str2, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6a6ae180", new Object[]{this, str, str2, cls, t});
        }
        T t2 = (T) this.runtimeData.get(getKey(str, str2));
        return t2 == null ? t : t2;
    }

    public <T> T getJsRuntimeData(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb2025ad", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.jsRuntimeData.get(str);
        return t2 == null ? t : t2;
    }

    public <T> T getJsRuntimeData(String str, String str2, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("183ff977", new Object[]{this, str, str2, cls, t});
        }
        T t2 = (T) this.jsRuntimeData.get(getKey(str, str2));
        return t2 == null ? t : t2;
    }

    public SharedState updateRuntimeData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("91db0675", new Object[]{this, map});
        }
        if (map.isEmpty()) {
            return this;
        }
        SharedState copy = copy();
        copy.runtimeData.putAll(map);
        copy.diff = this.diff.autoRuntimeDiff(map);
        return copy;
    }

    public SharedState updateRuntimeData(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("b3cf583f", new Object[]{this, str, map});
        }
        if (map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(getKey(str, entry.getKey()), entry.getValue());
        }
        SharedState copy = copy();
        copy.runtimeData.putAll(hashMap);
        copy.diff = this.diff.autoRuntimeDiff(hashMap);
        return copy;
    }

    public SharedState addInstantOperation(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("f0b124db", new Object[]{this, list});
        }
        if (list.isEmpty()) {
            return this;
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = (JSONArray) this.runtimeData.get("__InstantOperation");
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            jSONArray.addAll(jSONArray2);
        }
        jSONArray.addAll(list);
        HashMap hashMap = new HashMap(1);
        hashMap.put("__InstantOperation", jSONArray);
        SharedState copy = copy();
        copy.runtimeData.putAll(hashMap);
        copy.diff = this.diff.autoRuntimeDiff(hashMap);
        return copy;
    }

    public static String getKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed510dc", new Object[]{str, str2});
        }
        if (str == null) {
            return str2;
        }
        return str + "_" + str2;
    }

    public SharedState resetDeltaAndInstant() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("5d49c7e0", new Object[]{this});
        }
        JSONArray jSONArray = (JSONArray) this.runtimeData.get("__InstantOperation");
        JSONArray jSONArray2 = (JSONArray) this.jsRuntimeData.get("__InstantOperation");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            z = true;
        }
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            z = true;
        }
        if (this.diff.isEmpty() && !z) {
            return this;
        }
        SharedState copy = copy();
        copy.diff = new Diff();
        copy.runtimeData.put("__InstantOperation", new JSONArray());
        copy.jsRuntimeData.put("__InstantOperation", new JSONArray());
        return copy;
    }

    public int getRuntimeDataSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f418287", new Object[]{this})).intValue() : this.runtimeData.size();
    }

    public int getJsRuntimeDataSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("927a33fe", new Object[]{this})).intValue() : this.jsRuntimeData.size();
    }

    public int getPropsSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c41af5d5", new Object[]{this})).intValue() : this.props.size();
    }

    public int getOriginalDataSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7c1eeac", new Object[]{this})).intValue() : this.originalData.size();
    }

    public Diff getDiff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Diff) ipChange.ipc$dispatch("e180228d", new Object[]{this}) : this.diff;
    }

    public SharedState setDiff(Diff diff) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("a2b6a4d", new Object[]{this, diff});
        }
        SharedState copy = copy();
        copy.diff = diff;
        return copy;
    }

    public SharedState copy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("25b23a3e", new Object[]{this}) : new SharedState(this);
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("props", (Object) this.props);
        jSONObject.put("originalData", (Object) this.originalData);
        jSONObject.put("runtimeData", (Object) this.runtimeData);
        jSONObject.put("jsRuntimeData", (Object) this.jsRuntimeData);
        return jSONObject;
    }

    public void parseFromJSON(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a151a436", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = null;
            try {
                jSONObject = JSONObject.parseObject(str);
            } catch (Throwable th) {
                Logger.e("SharedState", Log.getStackTraceString(th));
            }
            if (jSONObject == null) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("props");
            if (jSONObject2 != null) {
                this.props = jSONObject2.getInnerMap();
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("originalData");
            if (jSONObject3 != null) {
                this.originalData = jSONObject3.getInnerMap();
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("runtimeData");
            if (jSONObject4 != null) {
                this.runtimeData = jSONObject4.getInnerMap();
            }
            JSONObject jSONObject5 = jSONObject.getJSONObject("jsRuntimeData");
            if (jSONObject5 == null) {
                return;
            }
            this.jsRuntimeData = jSONObject5.getInnerMap();
        }
    }
}
