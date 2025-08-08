package com.taobao.orange.model;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.d;
import com.taobao.orange.util.f;
import com.taobao.orange.util.h;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class NameSpaceDO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_INIT = 0;
    public static final int HIGH_LAZY = 1;
    public static final String LEVEL_DEFAULT = "DEFAULT";
    public static final String LEVEL_HIGH = "HIGH";
    private static final String TAG = "NameSpaceDO";
    public static final String TYPE_CUSTOM = "CUSTOM";
    public static final String TYPE_STANDARD = "STANDARD";
    private static final long serialVersionUID = -4740785816043854483L;
    public List<CandidateDO> candidates;
    private String changeVersion;
    public transient CandidateDO curCandidateDO;
    public transient boolean hasChanged;
    public Integer highLazy = 0;
    public String loadLevel;
    public String md5;
    public String name;
    public String resourceId;
    public String type;
    public String version;

    static {
        kge.a(-194414446);
        kge.a(1028243835);
    }

    public boolean checkValid(ConfigDO configDO, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26266c4f", new Object[]{this, configDO, new Boolean(z)})).booleanValue();
        }
        if (skipCheckConfigValid(configDO, z)) {
            if (configDO != null) {
                OLog.e(TAG, "skipCheckConfigValid", "name", configDO.name, OConstant.DIMEN_CONFIG_CHANGE_VERSION, this.changeVersion, "version", this.version, "localChangeVersion", configDO.getChangeVersion(), com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_VERSION, configDO.getCurVersion());
            }
            return false;
        }
        long j = 0;
        long a2 = configDO == null ? 0L : f.a(configDO.getCurVersion());
        boolean z2 = (configDO == null || configDO.candidate == null) ? false : true;
        if (configDO != null && !z2) {
            j = f.a(configDO.version);
        }
        long a3 = f.a(this.version);
        List<CandidateDO> list = this.candidates;
        if (list != null && !list.isEmpty()) {
            if (OLog.isPrintLog(0)) {
                OLog.v(TAG, "checkCandidates start", "config", this.name, "candidates.size", Integer.valueOf(this.candidates.size()));
            }
            for (int i2 = 0; i2 < this.candidates.size(); i2++) {
                CandidateDO candidateDO = this.candidates.get(i2);
                if (OLog.isPrintLog(0)) {
                    Object[] objArr = new Object[i];
                    objArr[0] = "index";
                    objArr[1] = Integer.valueOf(i2);
                    objArr[2] = candidateDO;
                    OLog.v(TAG, "checkCandidate start", objArr);
                }
                if (candidateDO.checkValid() && candidateDO.checkMatch(this.name)) {
                    if (z2 && f.a(candidateDO.version) == a2) {
                        if (OLog.isPrintLog(1)) {
                            OLog.d(TAG, "checkCandidate match but no version update", new Object[0]);
                        }
                        return false;
                    }
                    if (OLog.isPrintLog(1)) {
                        OLog.d(TAG, "checkCandidate match", "localV", Long.valueOf(a2), "remoteV", candidateDO.version);
                    }
                    this.curCandidateDO = candidateDO;
                    return true;
                }
                i = 3;
            }
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "checkCandidates finish", "not any match");
            }
        }
        boolean z3 = a3 != j;
        if (!z3 && OLog.isPrintLog(1)) {
            OLog.d(TAG, "checkValid", "no version update");
        }
        return z3;
    }

    private boolean skipCheckConfigValid(ConfigDO configDO, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9312da32", new Object[]{this, configDO, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            if (StringUtils.isEmpty(com.taobao.orange.a.R)) {
                com.taobao.orange.a.R = (String) h.b(com.taobao.orange.a.g, "appVersion", "");
            }
            if (StringUtils.isEmpty(com.taobao.orange.a.S)) {
                com.taobao.orange.a.S = (String) h.b(com.taobao.orange.a.g, "osVersion", "");
            }
            if (!StringUtils.equals(com.taobao.orange.a.R, com.taobao.orange.a.j) || !StringUtils.equals(com.taobao.orange.a.S, String.valueOf(Build.VERSION.SDK_INT))) {
                if (configDO != null) {
                    configDO.setConfigStatus(2);
                    OLog.e(TAG, "skipCheckConfigValid localEnvironment changed", new Object[0]);
                    z = true;
                }
            } else if (configDO != null && configDO.getConfigStatus() == 2) {
                OLog.e(TAG, "skipCheckConfigValid update failed config", "name", configDO.name, com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_VERSION, configDO.getCurVersion(), "localChangeVersion", configDO.getChangeVersion(), OConstant.DIMEN_CONFIG_CHANGE_VERSION, this.changeVersion);
                d.a(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_UPDATE_FAIL_COUNTS, configDO.name, 1.0d);
                z = true;
            }
        }
        long a2 = configDO == null ? 0L : f.a(configDO.getChangeVersion());
        return !(a2 == 0 && f.a(this.changeVersion) == 0) && a2 >= f.a(this.changeVersion) && !z;
    }

    public String getChangeVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b837ee7", new Object[]{this}) : this.changeVersion;
    }

    public void setChangeVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398c3fd7", new Object[]{this, str});
        } else {
            this.changeVersion = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NameSpaceDO{loadLevel='" + this.loadLevel + "', name='" + this.name + "', version='" + this.version + "'}";
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NameSpaceDO nameSpaceDO = (NameSpaceDO) obj;
            String str = this.loadLevel;
            if (str == null ? nameSpaceDO.loadLevel != null : !str.equals(nameSpaceDO.loadLevel)) {
                return false;
            }
            String str2 = this.md5;
            if (str2 == null ? nameSpaceDO.md5 != null : !str2.equals(nameSpaceDO.md5)) {
                return false;
            }
            String str3 = this.name;
            if (str3 == null ? nameSpaceDO.name != null : !str3.equals(nameSpaceDO.name)) {
                return false;
            }
            String str4 = this.resourceId;
            if (str4 == null ? nameSpaceDO.resourceId != null : !str4.equals(nameSpaceDO.resourceId)) {
                return false;
            }
            String str5 = this.version;
            if (str5 == null ? nameSpaceDO.version != null : !str5.equals(nameSpaceDO.version)) {
                return false;
            }
            if (getChangeVersion() == null ? nameSpaceDO.getChangeVersion() != null : !getChangeVersion().equals(nameSpaceDO.getChangeVersion())) {
                return false;
            }
            List<CandidateDO> list = this.candidates;
            if (list != null) {
                return list.equals(nameSpaceDO.candidates);
            }
            if (nameSpaceDO.candidates == null) {
                return true;
            }
        }
        return false;
    }
}
