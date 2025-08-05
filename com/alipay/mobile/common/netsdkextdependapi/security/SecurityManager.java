package com.alipay.mobile.common.netsdkextdependapi.security;

/* loaded from: classes3.dex */
public interface SecurityManager {
    String decrypt(String str);

    byte[] decrypt(byte[] bArr);

    byte[] decrypt(byte[] bArr, String str);

    String encrypt(String str);

    byte[] encrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr, String str);

    String getApDid();

    SignResult signature(SignRequest signRequest);
}
