package com.alipay.mobile.common.transport.http;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.String;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class HeaderMap<K extends String, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(HeaderMap headerMap, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -2084926247) {
            if (hashCode == -1515997081) {
                return new Boolean(super.containsKey(objArr[0]));
            }
            if (hashCode != -605927644) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.put((HeaderMap) objArr[0], objArr[1]);
        }
        return super.get(objArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((HeaderMap<K, V>) ((String) obj), (String) obj2);
    }

    public HeaderMap() {
    }

    public HeaderMap(int i) {
        super(i);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj}) : (V) super.get(getKeyString((String) obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue() : super.containsKey(getKeyString((String) obj));
    }

    public V put(K k, V v) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("fd14d676", new Object[]{this, k, v}) : (V) super.put((HeaderMap<K, V>) getKeyString(k), (String) v);
    }

    public String getKeyString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56b01c55", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        return str.toLowerCase();
    }
}
