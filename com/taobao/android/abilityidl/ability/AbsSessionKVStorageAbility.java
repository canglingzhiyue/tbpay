package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsSessionKVStorageAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2112868408);
    }

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> clear(als alsVar);

    public abstract com.alibaba.ability.result.g<List<String>, ErrorResult> getAllKeys(als alsVar);

    public abstract com.alibaba.ability.result.g<SessionKVStorageCurrentInfo, ErrorResult> getCurrentInfo(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getItem(als alsVar, ec ecVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> removeItem(als alsVar, ec ecVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> setItem(als alsVar, ed edVar);
}
