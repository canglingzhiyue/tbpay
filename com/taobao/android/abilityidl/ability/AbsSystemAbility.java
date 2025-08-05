package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsSystemAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1919879971);
    }

    public abstract com.alibaba.ability.result.g<String, ErrorResult> checkAppInstallStatus(als alsVar, ef efVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> checkLocation(als alsVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isNFCReadingSupported(als alsVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isVoiceOverOn(als alsVar);

    public abstract void openAppSettings(als alsVar, gml gmlVar);

    public abstract void openBrowser(als alsVar, eg egVar, gml gmlVar);

    public abstract void openLocationSettings(als alsVar, gml gmlVar);

    public abstract void openNotificationSettings(als alsVar, gml gmlVar);

    public abstract void requestNotificationSettings(als alsVar, cq cqVar);
}
