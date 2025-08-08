package com.taobao.update.dynamicfeature;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import tb.kge;

/* loaded from: classes9.dex */
public class FeatureUpdateData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appDeployVersion;
    public String baseVersion;
    public String beta;
    public String featureUpdateVersion;
    public String httpsUrl;
    public String md5;
    public boolean rollback;
    public long size;
    public List<FeatureInfo> updateFeatures;
    public int updateStrategy;
    public String url;
    public boolean lowDisk = false;
    public String urgentInfo = "";

    static {
        kge.a(842571844);
        kge.a(1028243835);
    }

    public String getDownloadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9b30508", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.httpsUrl)) {
            return this.httpsUrl;
        }
        return this.url;
    }

    /* loaded from: classes9.dex */
    public static class FeatureInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String appVersion;
        public String featureName;
        public String version;

        static {
            kge.a(1056844868);
            kge.a(1028243835);
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
                FeatureInfo featureInfo = (FeatureInfo) obj;
                if (this.featureName.equals(featureInfo.featureName) && this.appVersion.equals(featureInfo.appVersion) && this.version.equals(featureInfo.version)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.featureName, this.appVersion, this.version);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FeatureInfo{featureName='" + this.featureName + "', appVersion='" + this.appVersion + "', version='" + this.version + "'}";
        }
    }
}
