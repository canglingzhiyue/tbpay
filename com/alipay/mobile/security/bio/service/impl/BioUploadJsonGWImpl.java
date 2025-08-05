package com.alipay.mobile.security.bio.service.impl;

import android.util.Base64;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioStoreParameter;
import com.alipay.mobile.security.bio.service.BioStoreResult;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioUploadJsonGWImpl extends BioUploadGW<BisJsonUploadGwRequest> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(BioUploadJsonGWImpl bioUploadJsonGWImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BioUploadJsonGWImpl(BioServiceManager bioServiceManager) {
        super(bioServiceManager);
    }

    @Override // com.alipay.mobile.security.bio.service.impl.BioUploadGW
    public BioUploadResult upload(BioUploadItem bioUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("3767d3e4", new Object[]{this, bioUploadItem});
        }
        if (StringUtil.isNullorEmpty(bioUploadItem.publicKey)) {
            return b(bioUploadItem);
        }
        return a(bioUploadItem);
    }

    private BioUploadResult a(BioUploadItem bioUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("abd76d84", new Object[]{this, bioUploadItem});
        }
        byte[] random = this.b.getRandom();
        BioStoreParameter bioStoreParameter = new BioStoreParameter();
        bioStoreParameter.content = bioUploadItem.log;
        bioStoreParameter.publicKey = bioUploadItem.publicKey;
        bioStoreParameter.random = random;
        BioStoreResult encryptWithRandom = this.b.encryptWithRandom(bioStoreParameter);
        BisJsonUploadGwRequest bisJsonUploadGwRequest = new BisJsonUploadGwRequest();
        bisJsonUploadGwRequest.bisToken = bioUploadItem.bisToken;
        if (encryptWithRandom != null) {
            bisJsonUploadGwRequest.behavLog = Base64.encodeToString(encryptWithRandom.encodeContent, 10);
            bisJsonUploadGwRequest.behavLogSig = Base64.encodeToString(encryptWithRandom.encodeSeed, 10);
        }
        if (bioUploadItem.content == null) {
            return a(bisJsonUploadGwRequest, bioUploadItem.isNeedSendResponse);
        }
        bisJsonUploadGwRequest.content = new String(bioUploadItem.content);
        bisJsonUploadGwRequest.contentSig = Base64.encodeToString(bioUploadItem.contentSig, 10);
        return a(bisJsonUploadGwRequest, bioUploadItem.isNeedSendResponse);
    }

    private BioUploadResult b(BioUploadItem bioUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("67809ba3", new Object[]{this, bioUploadItem});
        }
        BisJsonUploadGwRequest bisJsonUploadGwRequest = new BisJsonUploadGwRequest();
        bisJsonUploadGwRequest.bisToken = bioUploadItem.bisToken;
        bisJsonUploadGwRequest.behavLogSig = "";
        bisJsonUploadGwRequest.contentSig = "";
        bisJsonUploadGwRequest.content = new String(bioUploadItem.content);
        bisJsonUploadGwRequest.behavLog = Base64.encodeToString(bioUploadItem.log, 10);
        return a(bisJsonUploadGwRequest, bioUploadItem.isNeedSendResponse);
    }
}
