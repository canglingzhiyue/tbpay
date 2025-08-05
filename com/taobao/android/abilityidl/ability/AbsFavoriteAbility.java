package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsFavoriteAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1515600618);
    }

    public abstract void addFavorite(als alsVar, am amVar, bo boVar);

    public abstract void markFavorite(als alsVar, am amVar, bo boVar);

    public abstract void removeFavorite(als alsVar, am amVar, bo boVar);

    public abstract void requestFavoriteStatus(als alsVar, am amVar, bo boVar);
}
