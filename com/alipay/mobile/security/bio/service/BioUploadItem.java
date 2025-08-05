package com.alipay.mobile.security.bio.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioUploadItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bisToken;
    public byte[] content;
    public byte[] contentSig;
    public boolean isNeedSendResponse = false;
    public byte[] log;
    public String publicKey;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BioUploadItem{, bisToken='" + this.bisToken + "', isNeedSendResponse=" + this.isNeedSendResponse + '}';
    }
}
