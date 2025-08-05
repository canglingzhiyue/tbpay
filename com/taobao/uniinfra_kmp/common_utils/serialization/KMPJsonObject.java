package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\nJ\n\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPNativeJsonPayload;", "payload", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObjectNativePayload;", "", "<init>", "(Ljava/lang/Object;)V", "keys", "", "", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "toJsonString", "put", "", "key", "value", "remove", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "getJsonObject", "getJsonArray", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "nativePayload", "destroyNativePayload", "toMap", "", "Companion", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KMPJsonObject extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1333900591);
        kge.a(-291143899);
        Companion = new a(null);
    }

    public KMPJsonObject() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(KMPJsonObject kMPJsonObject, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1280511290:
                return super.entrySet();
            case -804860800:
                return super.getInteger((String) objArr[0]);
            case -798298958:
                return super.getJSONArray((String) objArr[0]);
            case -744798299:
                return super.toJSONString();
            case -48966026:
                return super.put((String) objArr[0], objArr[1]);
            case 75336718:
                return super.getJSONObject((String) objArr[0]);
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

    public void destroyNativePayload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee75a4", new Object[]{this});
        }
    }

    public Object nativePayload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("27378074", new Object[]{this}) : this;
    }

    public KMPJsonObject(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set keySet = map.keySet();
            int size = keySet.size();
            for (int i = 0; i < size; i++) {
                Object b = p.b(keySet, i);
                put((KMPJsonObject) String.valueOf(b), (String) map.get(b));
            }
        }
    }

    public /* synthetic */ KMPJsonObject(Object obj, int i, o oVar) {
        this((i & 1) != 0 ? null : obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj == null ? true : obj instanceof String)) {
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
        if (!(obj == null ? true : obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6aee8610", new Object[]{this}) : super.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj == null ? true : obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, (String) obj);
    }

    public Collection<Object> getValues() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("7d4fad88", new Object[]{this}) : super.values();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final Set<String> keySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this}) : getKeys();
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        put(str, obj);
        return t.INSTANCE;
    }

    @Override // com.alibaba.fastjson.JSONObject
    /* renamed from: put  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Object put2(String str, Object obj) {
        put(str, obj);
        return t.INSTANCE;
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // com.alibaba.fastjson.JSONObject, java.util.Map
    /* renamed from: remove  reason: avoid collision after fix types in other method */
    public final /* bridge */ /* synthetic */ Object remove2(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj == null ? true : obj instanceof String)) {
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

    public Set<String> getKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this});
        }
        Set<String> keySet = super.keySet();
        q.b(keySet, "<get-keys>(...)");
        return keySet;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    public final String toJsonString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this}) : super.toJSONString();
    }

    @Override // com.alibaba.fastjson.JSONObject
    public void put(String key, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, key, obj});
            return;
        }
        q.d(key, "key");
        super.put(key, obj);
    }

    public Boolean remove(String key) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dae44e52", new Object[]{this, key});
        }
        q.d(key, "key");
        if (super.remove((Object) key) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Integer getInt(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dc231331", new Object[]{this, key});
        }
        q.d(key, "key");
        return super.getInteger(key);
    }

    public final KMPJsonObject getJsonObject(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("dd1cab06", new Object[]{this, key});
        }
        q.d(key, "key");
        return new KMPJsonObject(super.getJSONObject(key));
    }

    public final KMPJsonArray getJsonArray(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonArray) ipChange.ipc$dispatch("dd040c76", new Object[]{this, key});
        }
        q.d(key, "key");
        return new KMPJsonArray(super.getJSONArray(key));
    }

    public final Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : this;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject$Companion;", "", "<init>", "()V", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-756046631);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
