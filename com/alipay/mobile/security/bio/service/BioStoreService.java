package com.alipay.mobile.security.bio.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioStoreService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract String encrypt(String str, String str2);

    public abstract BioStoreResult encryptWithRandom(BioStoreParameter bioStoreParameter);

    public abstract byte[] encryptWithRandom(byte[] bArr, String str, byte[] bArr2);

    public abstract byte[] getRandom();
}
