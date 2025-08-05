package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsPermissionAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1200582781);
    }

    public abstract void check(als alsVar, dq dqVar, cg cgVar);

    public abstract void request(als alsVar, dr drVar, ch chVar);

    public abstract void requestPermission(als alsVar, ds dsVar, ci ciVar);
}
