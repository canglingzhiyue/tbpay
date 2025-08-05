package com.alipay.mobile.security.bio.transfer.diagdata;

import com.alipay.mobile.security.bio.service.local.transfer.ProgressCallback;
import com.alipay.mobile.security.bio.service.local.transfer.TransferService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class DiagDataUploadService extends TransferService<IDiagDataReq, Object, IDiagDataRsp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void uploadAsync(IDiagDataReq iDiagDataReq, ProgressCallback<IDiagDataReq, IDiagDataRsp> progressCallback);

    public abstract void uploadSync(IDiagDataReq iDiagDataReq, ProgressCallback<IDiagDataReq, IDiagDataRsp> progressCallback);

    @Override // com.alipay.mobile.security.bio.service.local.transfer.TransferService
    @Deprecated
    public final void transfer(IDiagDataReq iDiagDataReq, Object obj, boolean z, ProgressCallback<IDiagDataReq, IDiagDataRsp> progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e4a9d6", new Object[]{this, iDiagDataReq, obj, new Boolean(z), progressCallback});
        } else if (z) {
            uploadSync(iDiagDataReq, progressCallback);
        } else {
            uploadAsync(iDiagDataReq, progressCallback);
        }
    }
}
