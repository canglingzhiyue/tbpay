package com.alipay.mobile.security.bio.service.impl;

import android.util.Base64;
import com.alipay.mobile.security.bio.security.AESEncrypt;
import com.alipay.mobile.security.bio.security.RSAEncrypt;
import com.alipay.mobile.security.bio.security.RandomHelper;
import com.alipay.mobile.security.bio.service.BioStoreParameter;
import com.alipay.mobile.security.bio.service.BioStoreResult;
import com.alipay.mobile.security.bio.service.BioStoreService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioStoreServiceImpl extends BioStoreService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.security.bio.service.BioStoreService
    public String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{this, str, str2});
        }
        byte[] bArr = null;
        try {
            byte[] random = RandomHelper.random(16);
            byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(str2), random);
            byte[] encrypt2 = AESEncrypt.encrypt(str.getBytes(), random);
            bArr = new byte[encrypt.length + encrypt2.length];
            System.arraycopy(encrypt2, 0, bArr, 0, encrypt2.length);
            System.arraycopy(encrypt, 0, bArr, encrypt2.length, encrypt.length);
        } catch (Exception e) {
            BioLog.e(e.toString());
        }
        return Base64.encodeToString(bArr, 8);
    }

    @Override // com.alipay.mobile.security.bio.service.BioStoreService
    public byte[] getRandom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ad4df11d", new Object[]{this}) : RandomHelper.random(16);
    }

    @Override // com.alipay.mobile.security.bio.service.BioStoreService
    public byte[] encryptWithRandom(byte[] bArr, String str, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("239c1f0", new Object[]{this, bArr, str, bArr2});
        }
        byte[] bArr3 = null;
        try {
            byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(str), bArr2);
            byte[] encrypt2 = AESEncrypt.encrypt(bArr, bArr2);
            bArr3 = new byte[encrypt.length + encrypt2.length];
            System.arraycopy(encrypt2, 0, bArr3, 0, encrypt2.length);
            System.arraycopy(encrypt, 0, bArr3, encrypt2.length, encrypt.length);
            return bArr3;
        } catch (Exception e) {
            BioLog.e(e.toString());
            return bArr3;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioStoreService
    public BioStoreResult encryptWithRandom(BioStoreParameter bioStoreParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioStoreResult) ipChange.ipc$dispatch("2bafb2f", new Object[]{this, bioStoreParameter});
        }
        if (bioStoreParameter == null) {
            throw new IllegalArgumentException("parameter can not be null");
        }
        BioStoreResult bioStoreResult = new BioStoreResult();
        try {
            byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(bioStoreParameter.publicKey), bioStoreParameter.random);
            byte[] encrypt2 = AESEncrypt.encrypt(bioStoreParameter.content, bioStoreParameter.random);
            bioStoreResult.encodeSeed = encrypt;
            bioStoreResult.encodeContent = encrypt2;
        } catch (Exception e) {
            BioLog.e(e.toString());
        }
        return bioStoreResult;
    }
}
