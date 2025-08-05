package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentDomainV5PO implements Serializable {
    private static final long serialVersionUID = -891148281697796559L;
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "launchLayers")
    public List<ExperimentLayerV5PO> launchLayers;
    @JSONField(name = "normalLayers")
    public List<ExperimentLayerV5PO> normalLayers;
    @JSONField(name = "ratioRanges")
    public int[][] ratioRange;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    public Map<String, String> variations;

    static {
        kge.a(766615580);
        kge.a(1028243835);
    }
}
