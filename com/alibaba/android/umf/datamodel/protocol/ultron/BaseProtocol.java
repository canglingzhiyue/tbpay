package com.alibaba.android.umf.datamodel.protocol.ultron;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseProtocol implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(737597983);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public static Set<String> JSONArrayToSet(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("4b1519f4", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                hashSet.add((String) obj);
            }
        }
        return hashSet;
    }
}
