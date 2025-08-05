package com.taobao.android.stdpop.api;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class StdPopNativeParams extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(247825134);
    }

    public static /* synthetic */ Object ipc$super(StdPopNativeParams stdPopNativeParams, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1280511290:
                return super.entrySet();
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj != null ? obj instanceof String : true)) {
            return false;
        }
        return containsKey((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this}) : getEntries();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj != null ? obj instanceof String : true)) {
            return null;
        }
        return get((String) obj);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public Set getEntries() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6aee8610", new Object[]{this}) : super.entrySet();
    }

    public Set getKeys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this}) : super.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj != null ? obj instanceof String : true) ? obj2 : getOrDefault((String) obj, obj2);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, (String) obj);
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    public Collection getValues() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("7d4fad88", new Object[]{this}) : super.values();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final Set<String> keySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this}) : getKeys();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj != null ? obj instanceof String : true)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj != null ? obj instanceof String : true)) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final Collection<Object> values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this}) : getValues();
    }

    public StdPopNativeParams(JSONObject popConfig) {
        q.d(popConfig, "popConfig");
        put((StdPopNativeParams) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) popConfig);
    }

    public final StdPopNativeParams extConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("5bc0ba31", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            put((StdPopNativeParams) com.taobao.android.abilitykit.ability.pop.model.c.KEY_EXT_CONFIG, (String) jSONObject);
        }
        return this;
    }

    public final StdPopNativeParams popId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("3c32629a", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "popId", str);
        }
        return this;
    }

    public final StdPopNativeParams url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("60fc8317", new Object[]{this, str});
        }
        put((StdPopNativeParams) "url", str);
        return this;
    }

    public final StdPopNativeParams bizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("7142a218", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "bizId", str);
        }
        return this;
    }

    public final StdPopNativeParams namespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("6f22d1ab", new Object[]{this, str});
        }
        if (str != null) {
            put((StdPopNativeParams) "namespace", str);
        }
        return this;
    }
}
