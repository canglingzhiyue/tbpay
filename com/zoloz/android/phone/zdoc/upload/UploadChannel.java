package com.zoloz.android.phone.zdoc.upload;

import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class UploadChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1888197865);
    }

    public abstract void uploadNineShoot(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2);

    public abstract void uploadPaperInfo(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2);
}
