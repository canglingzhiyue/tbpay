package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAudioContextAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-25930983);
    }

    public abstract void pause(als alsVar, gml gmlVar);

    public abstract void play(als alsVar, gml gmlVar);

    public abstract void prepare(als alsVar, m mVar, gml gmlVar);

    public abstract void seek(als alsVar, n nVar, gml gmlVar);

    public abstract void setEventListener(als alsVar, bf bfVar);

    public abstract void setLoop(als alsVar, k kVar, gml gmlVar);

    public abstract void setMuted(als alsVar, k kVar, gml gmlVar);

    public abstract void setPauseInBackground(als alsVar, k kVar, gml gmlVar);

    public abstract void setVolume(als alsVar, l lVar, gml gmlVar);

    public abstract void stop(als alsVar, gml gmlVar);
}
