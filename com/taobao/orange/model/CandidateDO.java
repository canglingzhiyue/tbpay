package com.taobao.orange.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.d;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class CandidateDO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CandidateDO";
    public String match;
    public String md5;
    public String resourceId;
    public String version;

    static {
        kge.a(844084954);
        kge.a(1028243835);
    }

    public boolean checkValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.resourceId) && !StringUtils.isEmpty(this.match) && !StringUtils.isEmpty(this.version)) {
            return true;
        }
        OLog.w(TAG, "lack param", new Object[0]);
        return false;
    }

    public boolean checkMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d66072", new Object[]{this, str})).booleanValue();
        }
        try {
            MultiAnalyze complie = MultiAnalyze.complie(this.match, true);
            boolean match = complie.match();
            if (complie.unitAnalyzes.size() == 1 && "did_hash".equals(complie.unitAnalyzes.get(0).key)) {
                String str2 = str + ":" + this.version + ":" + this.match;
                if (match) {
                    d.a(OConstant.MONITOR_MODULE, "did_hash", str2);
                } else {
                    d.a(OConstant.MONITOR_MODULE, "did_hash", str2, (String) null, (String) null);
                }
            }
            return match;
        } catch (Exception e) {
            OLog.e(TAG, "checkMatch", e, new Object[0]);
            return false;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CandidateDO{match:'" + this.match + "', version:'" + this.version + "'}";
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
            CandidateDO candidateDO = (CandidateDO) obj;
            String str = this.resourceId;
            if (str == null ? candidateDO.resourceId != null : !str.equals(candidateDO.resourceId)) {
                return false;
            }
            String str2 = this.match;
            if (str2 == null ? candidateDO.match != null : !str2.equals(candidateDO.match)) {
                return false;
            }
            String str3 = this.version;
            if (str3 != null) {
                return str3.equals(candidateDO.version);
            }
            if (candidateDO.version == null) {
                return true;
            }
        }
        return false;
    }
}
