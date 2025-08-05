package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\bJ\n\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001dR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "Lcom/alibaba/fastjson/JSONArray;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPNativeJsonPayload;", "payload", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArrayNativePayload;", "<init>", "(Lcom/alibaba/fastjson/JSONArray;)V", "size", "", "getSize", "()I", "toJsonString", "", "add", "", "anObject", "", "", "index", "getInt", "(I)Ljava/lang/Integer;", "getJsonObject", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getJsonArray", "nativePayload", "destroyNativePayload", "removeAt", "(I)Ljava/lang/Boolean;", "toList", "", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KMPJsonArray extends JSONArray {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2133684089);
        kge.a(-291143899);
    }

    public KMPJsonArray() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(KMPJsonArray kMPJsonArray, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -744798299:
                return super.toJSONString();
            case -509383267:
                return super.getJSONArray(((Number) objArr[0]).intValue());
            case -475350822:
                return super.mo1572remove(((Number) objArr[0]).intValue());
            case 195222152:
                return new Boolean(super.add(objArr[0]));
            case 497758839:
                super.add(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 845773819:
                return new Integer(super.size());
            case 1482398075:
                return super.getInteger(((Number) objArr[0]).intValue());
            case 2140714623:
                return super.getJSONObject(((Number) objArr[0]).intValue());
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

    public KMPJsonArray(JSONArray jSONArray) {
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                super.add(jSONArray.get(i));
            }
        }
    }

    public /* synthetic */ KMPJsonArray(JSONArray jSONArray, int i, o oVar) {
        this((i & 1) != 0 ? null : jSONArray);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    /* renamed from: remove */
    public /* synthetic */ Object mo1572remove(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)}) : Boolean.valueOf(mo1572remove(i));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, boolean] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, boolean] */
    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    /* renamed from: remove  reason: collision with other method in class */
    public final Object mo1572remove(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebab395c", new Object[]{this, new Integer(i)})).booleanValue() : removeAt(i).booleanValue();
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    public final String toJsonString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this}) : super.toJSONString();
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, obj})).booleanValue() : super.add(obj);
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public void add(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), obj});
        } else {
            super.add(i, obj);
        }
    }

    public final Integer getInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("d55d76aa", new Object[]{this, new Integer(i)}) : super.getInteger(i);
    }

    public final KMPJsonObject getJsonObject(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("b0a326f5", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = super.getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return new KMPJsonObject(jSONObject);
    }

    public final KMPJsonArray getJsonArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonArray) ipChange.ipc$dispatch("113b792b", new Object[]{this, new Integer(i)});
        }
        JSONArray jSONArray = super.getJSONArray(i);
        if (jSONArray == null) {
            return null;
        }
        return new KMPJsonArray(jSONArray);
    }

    public Boolean removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("88b12022", new Object[]{this, new Integer(i)});
        }
        super.mo1572remove(i);
        return true;
    }

    public final List<Object> toList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9a521c87", new Object[]{this}) : this;
    }
}
