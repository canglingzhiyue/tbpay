package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ExperimentVariationConfigV5PO implements Serializable {
    public static final String SCOPE_APP = "app";
    @JSONField(name = Constants.Name.SCOPE)
    public String scope;

    static {
        kge.a(1155580505);
        kge.a(1028243835);
    }
}
