package com.zoloz.android.phone.zdoc.upload;

import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class UploadChannelByJson extends UploadChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BioUploadService mBioUploadService;

    static {
        kge.a(-2057379800);
    }

    public UploadChannelByJson(BioServiceManager bioServiceManager) {
        if (bioServiceManager == null) {
            throw new BioIllegalArgumentException("BioServiceManager is null...");
        }
        this.mBioUploadService = (BioUploadService) bioServiceManager.getBioService(BioUploadService.class);
    }

    @Override // com.zoloz.android.phone.zdoc.upload.UploadChannel
    public void uploadPaperInfo(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c945dca8", new Object[]{this, uploadContent, bisBehavLog, str, str2});
        } else if (uploadContent == null) {
        } else {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.contentSig = uploadContent.contentSig;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.isNeedSendResponse = true;
            this.mBioUploadService.upload(bioUploadItem);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.upload.UploadChannel
    public void uploadNineShoot(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3df76db", new Object[]{this, uploadContent, bisBehavLog, str, str2});
        } else if (uploadContent == null || uploadContent.content == null) {
            BioLog.w(new IllegalArgumentException("content is empty"));
        } else {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.isNeedSendResponse = false;
            bioUploadItem.contentSig = uploadContent.contentSig;
            this.mBioUploadService.upload(bioUploadItem);
        }
    }
}
