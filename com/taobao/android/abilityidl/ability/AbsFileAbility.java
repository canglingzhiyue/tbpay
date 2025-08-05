package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsFileAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1687203530);
    }

    public abstract void appendFile(als alsVar, av avVar, bp bpVar);

    public abstract void copyFile(als alsVar, ao aoVar, bp bpVar);

    public abstract void exists(als alsVar, an anVar, bp bpVar);

    public abstract void getDirInfo(als alsVar, an anVar, bq bqVar);

    public abstract void getFileInfo(als alsVar, ap apVar, br brVar);

    public abstract void makeDir(als alsVar, aq aqVar, bp bpVar);

    public abstract void readAsString(als alsVar, ar arVar, bs bsVar);

    public abstract void removeDir(als alsVar, as asVar, bp bpVar);

    public abstract void removeFile(als alsVar, an anVar, bp bpVar);

    public abstract void rename(als alsVar, at atVar, bt btVar);

    public abstract void unzip(als alsVar, au auVar, bu buVar);

    public abstract void writeFile(als alsVar, av avVar, bp bpVar);
}
