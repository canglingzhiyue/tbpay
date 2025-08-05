package com.taobao.update.dynamicfeature;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.kge;

/* loaded from: classes9.dex */
public class FeatureUpdateData2 implements Serializable {
    public String appDeployVersion;
    public String baseVersion;
    public List<UpdateFeatureInfo> updateFeatures = new ArrayList();

    static {
        kge.a(349923438);
        kge.a(1028243835);
    }

    /* loaded from: classes9.dex */
    public static class UpdateFeatureInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean beta;
        public boolean deployed;
        public String featureUpdateVersion;
        public List<FeatureUpdateData.FeatureInfo> features = new ArrayList();
        public String httpsUrl;
        public String md5;
        public boolean rollback;
        public long size;
        public int updateStrategy;
        public String url;

        static {
            kge.a(2145625445);
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
                UpdateFeatureInfo updateFeatureInfo = (UpdateFeatureInfo) obj;
                if (this.deployed == updateFeatureInfo.deployed && this.rollback == updateFeatureInfo.rollback && this.size == updateFeatureInfo.size && this.beta == updateFeatureInfo.beta && this.updateStrategy == updateFeatureInfo.updateStrategy && this.featureUpdateVersion.equals(updateFeatureInfo.featureUpdateVersion) && this.httpsUrl.equals(updateFeatureInfo.httpsUrl) && this.md5.equals(updateFeatureInfo.md5) && this.features.equals(updateFeatureInfo.features) && this.url.equals(updateFeatureInfo.url)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.featureUpdateVersion, Boolean.valueOf(this.deployed), this.httpsUrl, this.md5, Boolean.valueOf(this.rollback), Long.valueOf(this.size), Boolean.valueOf(this.beta), this.features, Integer.valueOf(this.updateStrategy), this.url);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "UpdateFeatureInfo{featureUpdateVersion='" + this.featureUpdateVersion + "', deployed=" + this.deployed + ", httpsUrl='" + this.httpsUrl + "', md5='" + this.md5 + "', rollback=" + this.rollback + ", size=" + this.size + ", beta=" + this.beta + ", features=" + this.features + ", updateStrategy=" + this.updateStrategy + ", url='" + this.url + "'}";
        }
    }
}
