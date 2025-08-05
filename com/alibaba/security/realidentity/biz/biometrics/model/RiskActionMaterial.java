package com.alibaba.security.realidentity.biz.biometrics.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class RiskActionMaterial implements Serializable {
    @JSONField(name = "flActionLog")
    public String flActionLog;
    @JSONField(name = "sensorActionLog")
    public String sensorActionLog;
}
