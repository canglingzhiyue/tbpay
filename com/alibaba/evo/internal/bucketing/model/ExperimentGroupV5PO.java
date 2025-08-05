package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tb.djy;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentGroupV5PO implements Serializable {
    private static final long serialVersionUID = -4453267950431636643L;
    @JSONField(name = "conditions")
    public String condition;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "ignoreUrls")
    public Set<String> ignoreUrls;
    @JSONField(name = "ratioRanges")
    public int[][] ratioRange;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    public Map<String, String> variations;

    static {
        kge.a(798632995);
        kge.a(1028243835);
    }
}
