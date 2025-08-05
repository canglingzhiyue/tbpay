package com.alipay.mobile.security.bio.service.local.upload;

import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class MultiMediaUploadService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void uploadAsync(byte[] bArr, MultiMediaUploadCallback multiMediaUploadCallback);

    public abstract void uploadSync(byte[] bArr, MultiMediaUploadCallback multiMediaUploadCallback);
}
