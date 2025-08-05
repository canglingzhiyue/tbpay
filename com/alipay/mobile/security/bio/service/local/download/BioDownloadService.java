package com.alipay.mobile.security.bio.service.local.download;

import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioDownloadService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract String checkModelsExist(String str, String str2);

    public abstract void downloadByFileID(String str, String str2, String str3);
}
