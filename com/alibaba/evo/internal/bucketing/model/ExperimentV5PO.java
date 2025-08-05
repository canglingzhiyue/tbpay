package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentBetaDevice;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentV5PO implements Serializable {
    public static final int EXP_PUBLISH_BETA_PERCENT = 6;
    public static final int EXP_PUBLISH_BETA_SINGLE = 5;
    public static final int EXP_PUBLISH_GREY = 2;
    public static final int EXP_PUBLISH_RELEASE = 1;
    public static final int SUBTYPE_RETAIN_EXPERIMENT = 1;
    public static final String TYPE_AB_EXPERIMENT = "expt";
    public static final String TYPE_REDIRECT_EXPERIMENT = "dy";
    private static final long serialVersionUID = -8639945159859720122L;
    @JSONField(name = "begin")
    public long beginTime;
    @JSONField(name = "betaTestDevices")
    public List<ExperimentBetaDevice> betaDevices;
    @JSONField(name = "betaFactor")
    public String betaFactor;
    @JSONField(name = "betaRatio")
    public int betaRatio;
    @JSONField(name = "component")
    public String component;
    @JSONField(name = "conditions")
    public String condition;
    @JSONField(name = "end")
    public long endTime;
    @JSONField(name = "expIndexType")
    public int expIndexType;
    @JSONField(name = "groups")
    public List<ExperimentGroupV5PO> groups;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "module")
    public String module;
    @JSONField(name = "priorityLevel")
    public int priorityLevel;
    @JSONField(name = "publishType")
    public int publishType = 1;
    @JSONField(name = "releaseId")
    public long releaseId;
    @JSONField(name = "extType")
    public int subtype;
    @JSONField(name = "track")
    public ExperimentTrackV5PO track;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "variationConfig")
    public Map<String, ExperimentVariationConfigV5PO> variationConfigs;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    public Map<String, String> variations;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PublishType {
    }

    static {
        kge.a(-175653704);
        kge.a(1028243835);
    }
}
