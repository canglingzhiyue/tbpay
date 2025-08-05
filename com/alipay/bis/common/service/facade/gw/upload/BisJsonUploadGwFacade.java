package com.alipay.bis.common.service.facade.gw.upload;

import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwResult;
import com.alipay.mobile.framework.service.annotation.OperationType;

/* loaded from: classes3.dex */
public interface BisJsonUploadGwFacade {
    @OperationType("alipay.customer.bis.jsonupload")
    BisJsonUploadGwResult upload(BisJsonUploadGwRequest bisJsonUploadGwRequest);
}
