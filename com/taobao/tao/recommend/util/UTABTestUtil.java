package com.taobao.tao.recommend.util;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Vector;
import tb.kge;

/* loaded from: classes8.dex */
public class UTABTestUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Vector<ExperimentInfo> f20896a;

    static {
        kge.a(-1762891858);
        f20896a = new Vector<>();
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        Variation a2 = a(str, str2, str3);
        return a2 == null ? z : a2.getValueAsBoolean(z);
    }

    public static int a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0bfab70", new Object[]{str, str2, str3, new Integer(i)})).intValue();
        }
        Variation a2 = a(str, str2, str3);
        return a2 == null ? i : a2.getValueAsInt(i);
    }

    private static Variation a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Variation) ipChange.ipc$dispatch("bce32371", new Object[]{str, str2, str3});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null) {
            return null;
        }
        a(activate);
        return activate.getVariation(str3);
    }

    private static void a(VariationSet variationSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa25d5b", new Object[]{variationSet});
        } else if (variationSet == null) {
        } else {
            String str = null;
            String valueOf = variationSet.getExperimentId() == 0 ? null : String.valueOf(variationSet.getExperimentId());
            String valueOf2 = variationSet.getExperimentReleaseId() == 0 ? null : String.valueOf(variationSet.getExperimentReleaseId());
            if (variationSet.getExperimentBucketId() != 0) {
                str = String.valueOf(variationSet.getExperimentBucketId());
            }
            ExperimentInfo experimentInfo = new ExperimentInfo(valueOf, valueOf2, str);
            if (experimentInfo.checkEmpty() || f20896a.contains(experimentInfo)) {
                return;
            }
            f20896a.add(experimentInfo);
        }
    }

    /* loaded from: classes8.dex */
    public static class ExperimentInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String experimentBucketId;
        private String experimentId;
        private String experimentReleaseId;

        static {
            kge.a(380875297);
            kge.a(1028243835);
        }

        public ExperimentInfo(String str, String str2, String str3) {
            this.experimentId = str;
            this.experimentReleaseId = str2;
            this.experimentBucketId = str3;
        }

        public String getExperimentId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edc7734b", new Object[]{this}) : this.experimentId;
        }

        public String getExperimentReleaseId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2df17d8a", new Object[]{this}) : this.experimentReleaseId;
        }

        public String getExperimentBucketId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13499c41", new Object[]{this}) : this.experimentBucketId;
        }

        public boolean checkEmpty() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18f5ff30", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.experimentId) || TextUtils.isEmpty(this.experimentReleaseId) || TextUtils.isEmpty(this.experimentBucketId);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (this.experimentId + this.experimentReleaseId + this.experimentBucketId).hashCode();
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj != null && (obj instanceof ExperimentInfo)) {
                ExperimentInfo experimentInfo = (ExperimentInfo) obj;
                if (TextUtils.equals(this.experimentId, experimentInfo.getExperimentId()) && TextUtils.equals(this.experimentReleaseId, experimentInfo.getExperimentReleaseId()) && TextUtils.equals(this.experimentBucketId, experimentInfo.getExperimentBucketId())) {
                    return true;
                }
            }
            return false;
        }
    }
}
