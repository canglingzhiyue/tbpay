package com.alipay.mobile.security.bio.service.impl;

import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioStoreService;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioUploadGW<Request> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BASE64_FLAGS = 10;

    /* renamed from: a  reason: collision with root package name */
    public BioServiceManager f5813a;
    public BioStoreService b;
    private BioUploadServiceCore c;

    public abstract BioUploadResult upload(BioUploadItem bioUploadItem);

    public BioUploadGW(BioServiceManager bioServiceManager) {
        if (bioServiceManager == null) {
            throw new BioIllegalArgumentException("BioServiceManager can't be null");
        }
        this.f5813a = bioServiceManager;
        this.b = (BioStoreService) this.f5813a.getBioService(BioStoreService.class);
    }

    public BioUploadResult a(Request request, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("210accc9", new Object[]{this, request, new Boolean(z)});
        }
        if (this.c == null) {
            this.c = (BioUploadServiceCore) this.f5813a.getBioService(BioUploadServiceCore.class);
        }
        BioUploadServiceCore bioUploadServiceCore = this.c;
        if (bioUploadServiceCore != null) {
            return bioUploadServiceCore.upload(request, z);
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        bioUploadResult.productRetCode = 3002;
        bioUploadResult.subCode = ZcodeConstants.ZCODE_SYSTEM_EXC;
        bioUploadResult.subMsg = ZcodeConstants.getMessage(ZcodeConstants.ZCODE_SYSTEM_EXC);
        return bioUploadResult;
    }
}
