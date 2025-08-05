package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import tb.kge;

/* loaded from: classes8.dex */
public class ar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1887615509);
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || (aTaoLiveOpenEntity = aVar.n) == null) {
            return false;
        }
        if (aTaoLiveOpenEntity.abilityCompontent == null) {
            return true;
        }
        return aTaoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume);
    }
}
