package com.alibaba.security.ccrc.common.http.model;

import com.alibaba.security.ccrc.service.build.C1238p;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class VersionInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> algo;
    public Map<String, Object> ext;
    public Map<String, Object> ruleSet;

    public boolean compare(VersionInfo versionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cc674c", new Object[]{this, versionInfo})).booleanValue();
        }
        if (this == versionInfo) {
            return true;
        }
        if (!C1238p.a(this.algo, versionInfo.algo) || !C1238p.a(this.ruleSet, versionInfo.ruleSet)) {
            return false;
        }
        return C1238p.a(this.ext, versionInfo.ext);
    }

    public boolean needUpdate(VersionInfo versionInfo) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("11c29572", new Object[]{this, versionInfo})).booleanValue() : (versionInfo == null || (map = this.ruleSet) == null || this.algo == null || map.equals(versionInfo.ruleSet) || !this.algo.equals(versionInfo.algo)) ? false : true;
    }
}
