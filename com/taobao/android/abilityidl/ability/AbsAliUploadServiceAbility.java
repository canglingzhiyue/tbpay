package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAliUploadServiceAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(42227964);
    }

    public abstract void cancel(als alsVar, gml gmlVar);

    public abstract void upload(als alsVar, fw fwVar, fx fxVar);
}
