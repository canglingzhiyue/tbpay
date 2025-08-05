package com.alibaba.security.wukong.upload;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.algo.data.uploadv2")
/* loaded from: classes3.dex */
public class AlgoResultUploadData extends BaseRequest {
    public String algoResultList;
    public boolean encry;
    public long ts;

    public AlgoResultUploadData(String str) {
        super(str);
    }
}
