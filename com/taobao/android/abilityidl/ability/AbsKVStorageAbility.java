package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsKVStorageAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1277407282);
    }

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> clear(als alsVar, cx cxVar);

    public abstract com.alibaba.ability.result.g<List<String>, ErrorResult> getAllKeys(als alsVar, cx cxVar);

    public abstract com.alibaba.ability.result.g<KVStorageCurrentInfo, ErrorResult> getCurrentInfo(als alsVar, cx cxVar);

    public abstract com.alibaba.ability.result.g<KVStorageCurrentInfoAndKeys, ErrorResult> getCurrentInfoAndKeys(als alsVar, cx cxVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getItem(als alsVar, cy cyVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> removeItem(als alsVar, cy cyVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> setItem(als alsVar, cz czVar);
}
