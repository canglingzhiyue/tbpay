package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsUserKVStorageAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1786396189);
    }

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> clear(als alsVar, ek ekVar);

    public abstract com.alibaba.ability.result.g<List<String>, ErrorResult> getAllKeys(als alsVar, ek ekVar);

    public abstract com.alibaba.ability.result.g<UserKVStorageCurrentInfo, ErrorResult> getCurrentInfo(als alsVar, ek ekVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getItem(als alsVar, el elVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> removeItem(als alsVar, el elVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> setItem(als alsVar, em emVar);
}
