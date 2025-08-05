package com.alipay.zoloz.toyger.blob;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes3.dex */
public class CryptoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6270a;
    private byte[] b;
    private byte[] c;
    private RSAPublicKey d;

    public CryptoManager(String str, boolean z) {
        this.f6270a = true;
        try {
            this.d = RSAEncrypt.loadPublicKeyByStr(str);
            this.b = a(16);
            this.c = RSAEncrypt.encrypt(this.d, this.b);
            this.f6270a = z;
        } catch (Exception unused) {
            throw new IllegalArgumentException("fail to init crypto manager");
        }
    }

    public byte[] encrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{this, bArr}) : this.f6270a ? AESEncrypt.encrypt(bArr, this.b) : bArr;
    }

    public byte[] getAESCypher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6f7f80a2", new Object[]{this}) : this.c;
    }

    private byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
