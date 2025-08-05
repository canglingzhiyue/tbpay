package com.alibaba.security.client.smart.core.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class RiskUploadModel implements Serializable {
    public String dataId;
    public String risk;
    public String riskLevel;
    public String ruleId;
    public String url;

    public RiskUploadModel(String str, String str2, String str3, String str4, String str5) {
        this.risk = str;
        this.ruleId = str2;
        this.dataId = str3;
        this.riskLevel = str4;
        this.url = str5;
    }
}
