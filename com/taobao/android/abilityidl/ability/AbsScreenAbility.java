package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsScreenAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1272557126);
    }

    public abstract com.alibaba.ability.result.g<Integer, ErrorResult> getBrightness(als alsVar);

    public abstract com.alibaba.ability.result.g<ScreenInfoResult, ErrorResult> getInfo(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getOrientation(als alsVar);

    public abstract com.alibaba.ability.result.g<Integer, ErrorResult> getStatusBarHeight(als alsVar);

    public abstract void keepOn(als alsVar, ea eaVar, gml gmlVar);

    public abstract void requestBrightness(als alsVar, cn cnVar);

    public abstract void setBrightness(als alsVar, ScreenSetBrightnessParams screenSetBrightnessParams, gml gmlVar);

    public abstract void setCaptureEnabled(als alsVar, dz dzVar, gml gmlVar);

    public abstract void setCaptureEnabledForAndroid(als alsVar, dz dzVar, gml gmlVar);

    public abstract void setCaptureListener(als alsVar, co coVar);

    public abstract void setOrientation(als alsVar, eb ebVar, gml gmlVar);

    public abstract void unsetCaptureListener(als alsVar, gml gmlVar);
}
