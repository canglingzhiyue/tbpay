package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsLocalizationAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1552862585);
    }

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getLanguage(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getLocation(als alsVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isCnSite(als alsVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isI18nEdition(als alsVar);

    public abstract void setLocale(als alsVar, da daVar, bz bzVar);
}
