package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentTrackV5PO implements Serializable {
    private static final long serialVersionUID = 1584139115513200489L;
    @JSONField(name = "global")
    public boolean appScope;
    @JSONField(name = "pageNames")
    public String[] pageNames;

    static {
        kge.a(-1283530513);
        kge.a(1028243835);
    }
}
