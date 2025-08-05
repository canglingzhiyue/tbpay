package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsDownloaderAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1486175395);
    }

    public abstract void cancel(als alsVar, gml gmlVar);

    public abstract void download(als alsVar, fb fbVar, ff ffVar);
}
