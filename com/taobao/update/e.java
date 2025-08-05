package com.taobao.update;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rev;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean apkUpdateEnabled;
    public boolean bundleUpdateEnabled;
    public boolean checkUpdateOnStartUp;
    public b config;
    public boolean enableNativeLibUpdate;
    public boolean hasTest;
    public boolean lightApkEnabled;

    static {
        kge.a(-1690821025);
    }

    public e(b bVar) {
        this.config = bVar;
    }

    public e enableMonitor(rev revVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9872c46a", new Object[]{this, revVar});
        }
        com.taobao.update.framework.a.registerInstance(revVar);
        return this;
    }

    public e enableApkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b4f5b068", new Object[]{this});
        }
        this.apkUpdateEnabled = true;
        return this;
    }

    public e enableCheckUpdateOnStartup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a6886776", new Object[]{this});
        }
        this.checkUpdateOnStartUp = true;
        return this;
    }
}
