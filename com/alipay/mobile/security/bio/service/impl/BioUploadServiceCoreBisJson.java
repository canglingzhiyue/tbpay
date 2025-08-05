package com.alipay.mobile.security.bio.service.impl;

import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwResult;
import com.alipay.bis.common.service.facade.gw.upload.BisJsonUploadGwFacade;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioUploadServiceCoreBisJson extends BioUploadServiceCore<BisJsonUploadGwRequest> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.security.bio.service.BioUploadServiceCore
    public BioUploadResult upload(BisJsonUploadGwRequest bisJsonUploadGwRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("aa64c5ba", new Object[]{this, bisJsonUploadGwRequest, new Boolean(z)});
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        try {
            BioLog.w("upload(): request= " + bisJsonUploadGwRequest);
            BisJsonUploadGwResult upload = ((BisJsonUploadGwFacade) ((BioRPCService) this.e.getBioService(BioRPCService.class)).getRpcProxy(BisJsonUploadGwFacade.class)).upload(bisJsonUploadGwRequest);
            BioLog.w("upload(): response= " + upload);
            if (upload != null) {
                bioUploadResult.productRetCode = Integer.parseInt(upload.retCode);
            } else {
                bioUploadResult.productRetCode = 3002;
            }
        } catch (Exception e) {
            BioLog.w(e);
            bioUploadResult.productRetCode = 3001;
        }
        return bioUploadResult;
    }
}
