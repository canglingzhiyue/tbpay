package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentLayerV5PO implements Serializable {
    public static final int DEFAULT_BUCKET_NUM = 1000000;
    public static final int ROUTING_TYPE_USERID = 2;
    public static final int ROUTING_TYPE_UTDID = 1;
    private static final long serialVersionUID = 3846611583832996881L;
    @JSONField(name = "bucketNum")
    public int bucketNum = 1000000;
    @JSONField(name = "domains")
    public List<ExperimentDomainV5PO> domains;
    @JSONField(name = "experiments")
    public List<ExperimentV5PO> experiments;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "routingAlg")
    public String routingAlg;
    @JSONField(name = "randomFactor")
    public String routingFactor;
    @JSONField(name = "routingType")
    public int routingType;

    static {
        kge.a(617173493);
        kge.a(1028243835);
    }
}
