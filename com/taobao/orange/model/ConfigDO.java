package com.taobao.orange.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class ConfigDO implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ConfigDO";
    private static final long serialVersionUID = 6057693726984967889L;
    public String appKey;
    public String appVersion;
    public CandidateDO candidate;
    private String changeVersion;
    public Map<String, String> content;
    public String createTime;
    public String id;
    public String loadLevel;
    public String name;
    public String resourceId;
    public String type;
    public String version;
    private int configStatus = 0;
    public transient boolean persisted = true;
    public volatile transient boolean monitored = false;
    public boolean isCritical = false;
    public AtomicBoolean isExpired = new AtomicBoolean(false);

    /* loaded from: classes7.dex */
    public interface ConfigStatus {
        public static final int DEFAULT = 0;
        public static final int NEED_UPDATE = 2;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes7.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(-1525407423);
        kge.a(1028243835);
        kge.a(-673652961);
    }

    @Override // com.taobao.orange.model.a
    public boolean checkValid() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.appKey) || StringUtils.isEmpty(this.appVersion) || StringUtils.isEmpty(this.id) || StringUtils.isEmpty(this.name) || StringUtils.isEmpty(this.resourceId) || StringUtils.isEmpty(this.type) || StringUtils.isEmpty(this.loadLevel) || StringUtils.isEmpty(this.version) || (map = this.content) == null || map.isEmpty()) {
            OLog.w(TAG, "lack param", new Object[0]);
            return false;
        }
        if ((!"*".equals(this.appVersion) && !com.taobao.orange.a.j.equals(this.appVersion)) || !com.taobao.orange.a.h.equals(this.appKey)) {
            z = false;
        }
        if (!z) {
            OLog.w(TAG, "invaild", new Object[0]);
        }
        return z;
    }

    public String getCurVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c0bd4b", new Object[]{this});
        }
        CandidateDO candidateDO = this.candidate;
        return candidateDO == null ? this.version : candidateDO.version;
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

    public int getConfigStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("844e27c4", new Object[]{this})).intValue() : this.configStatus;
    }

    public void setConfigStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10d51c6", new Object[]{this, new Integer(i)});
        } else {
            this.configStatus = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConfigDO{name:'" + this.name + "', appVersion:'" + this.appVersion + "', verison:'" + this.version + "', type:'" + this.type + "'}";
    }
}
