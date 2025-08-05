package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsMEMKVStorageAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(918513015);
    }

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getItem(als alsVar, dc dcVar);

    public abstract com.alibaba.ability.result.g<Long, ErrorResult> getItemTTL(als alsVar, dc dcVar);

    public abstract void removeItem(als alsVar, dc dcVar, gml gmlVar);

    public abstract void setItem(als alsVar, dd ddVar, gml gmlVar);

    public abstract void setItemTTL(als alsVar, de deVar, gml gmlVar);
}
