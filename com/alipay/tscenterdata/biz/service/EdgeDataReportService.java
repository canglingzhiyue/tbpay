package com.alipay.tscenterdata.biz.service;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbResult;

/* loaded from: classes3.dex */
public interface EdgeDataReportService {
    @OperationType("alipay.security.edge.data.report")
    ReportPbResult upload(ReportPbRequest reportPbRequest);
}
