package com.alibaba.ut.abtest.internal.windvane;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes3.dex */
public class WVActivateApiResponseData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "experimentBucketId")
    private long experimentBucketId;
    @JSONField(name = "experimentId")
    private long experimentId;
    @JSONField(name = "experimentReleaseId")
    private long experimentReleaseId;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    private Map<String, Object> variations;

    static {
        kge.a(-1443307789);
        kge.a(1028243835);
    }

    public Map<String, Object> getVariations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6a5875b2", new Object[]{this}) : this.variations;
    }

    public void setVariations(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abae61c", new Object[]{this, map});
        } else {
            this.variations = map;
        }
    }

    @Deprecated
    public long getExperimentBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ceabe33", new Object[]{this})).longValue() : this.experimentBucketId;
    }

    @Deprecated
    public void setExperimentBucketId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d65d9", new Object[]{this, new Long(j)});
        } else {
            this.experimentBucketId = j;
        }
    }

    @Deprecated
    public long getExperimentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue() : this.experimentId;
    }

    @Deprecated
    public void setExperimentId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d994b7e3", new Object[]{this, new Long(j)});
        } else {
            this.experimentId = j;
        }
    }

    @Deprecated
    public long getExperimentReleaseId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64f91dca", new Object[]{this})).longValue() : this.experimentReleaseId;
    }

    @Deprecated
    public void setExperimentReleaseId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f7dcba", new Object[]{this, new Long(j)});
        } else {
            this.experimentReleaseId = j;
        }
    }
}
