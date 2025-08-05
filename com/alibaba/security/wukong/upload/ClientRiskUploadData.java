package com.alibaba.security.wukong.upload;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.risk.uploadv2")
/* loaded from: classes3.dex */
public class ClientRiskUploadData extends BaseRequest {
    public String actionResult;
    public String context;
    public String eventId;
    public String extras;
    public String metaId;
    public String riskId;
    public String sampleData;
    public String sampleId;
    public long ts;

    public ClientRiskUploadData(String str) {
        super(str);
    }
}
