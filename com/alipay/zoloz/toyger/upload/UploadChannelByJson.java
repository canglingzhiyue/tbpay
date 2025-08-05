package com.alipay.zoloz.toyger.upload;

import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UploadChannelByJson extends UploadChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BioUploadService f6297a;

    public UploadChannelByJson(BioServiceManager bioServiceManager) {
        if (bioServiceManager == null) {
            throw new BioIllegalArgumentException("BioServiceManager is null...");
        }
        this.f6297a = (BioUploadService) bioServiceManager.getBioService(BioUploadService.class);
    }

    @Override // com.alipay.zoloz.toyger.upload.UploadChannel
    public void uploadFaceInfo(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f871b31b", new Object[]{this, uploadContent, bisBehavLog, str, str2});
        } else if (uploadContent == null || bisBehavLog == null) {
        } else {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.contentSig = uploadContent.contentSig;
            bioUploadItem.isNeedSendResponse = true;
            this.f6297a.upload(bioUploadItem);
        }
    }

    @Override // com.alipay.zoloz.toyger.upload.UploadChannel
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
            this.f6297a.upload(bioUploadItem);
        }
    }

    @Override // com.alipay.zoloz.toyger.upload.UploadChannel
    public void uploadBehaviourLog(BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37bafe7", new Object[]{this, bisBehavLog, str, str2});
        } else if (bisBehavLog == null) {
        } else {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.isNeedSendResponse = false;
            this.f6297a.upload(bioUploadItem);
        }
    }
}
