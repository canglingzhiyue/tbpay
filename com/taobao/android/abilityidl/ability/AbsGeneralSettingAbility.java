package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsGeneralSettingAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-452710678);
    }

    public abstract com.alibaba.ability.result.g<String, ErrorResult> get(als alsVar, aw awVar);

    public abstract void setChangeListener(als alsVar, aw awVar, bv bvVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> unsetChangeListener(als alsVar, aw awVar);
}
