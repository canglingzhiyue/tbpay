package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import tb.kge;

/* loaded from: classes8.dex */
public class ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1688890169);
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dd11d7b", new Object[]{aVar, openAbilityCompontentTypeEnum})).booleanValue() : (aVar == null || aVar.o() == null || aVar.o().abilityCompontent == null || !aVar.o().abilityCompontent.b(openAbilityCompontentTypeEnum)) ? false : true;
    }
}
