package com.alipay.mobile.common.transport.http.selfencrypt;

import com.alipay.mobile.common.mpaas_crypto.Client;
import com.alipay.mobile.common.transport.utils.GzipUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasNetConfigUtil;
import com.alipay.mobile.common.transport.utils.NumArrayUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* loaded from: classes3.dex */
public class ClientRpcPack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte ASYMMETRIC_ENCRYPT_ECC = 2;
    public static final byte ASYMMETRIC_ENCRYPT_RSA = 1;
    public static final byte ASYMMETRIC_ENCRYPT_SM2 = 3;
    public static final byte ASYMMETRIC_ENCRYPT_SM4 = 13;
    public static final byte SYMMETRIC_ENCRYPT_3DES = 12;
    public static final byte SYMMETRIC_ENCRYPT_AES = 11;

    /* renamed from: a  reason: collision with root package name */
    private byte f5574a;
    private byte b;
    private int c;
    private Client d;
    private byte[] e;
    private String f;

    public ClientRpcPack() {
        this.b = (byte) 11;
        boolean z = false;
        this.c = 0;
        if (!MpaasNetConfigUtil.isCrypt(TransportEnvUtil.getContext())) {
            return;
        }
        this.f5574a = MpaasNetConfigUtil.getAsymmetricEncryptMethod(TransportEnvUtil.getContext());
        if (this.f5574a == 3) {
            this.b = (byte) 13;
        } else {
            this.b = (byte) 11;
        }
        this.f = a();
        this.d = new Client();
        byte b = this.f5574a;
        if (b == 1) {
            this.c = 0;
            z = this.d.init(this.f, null, null);
        } else if (b == 2) {
            this.c = 1;
            z = this.d.init(null, this.f, null);
        } else if (b == 3) {
            this.c = 2;
            z = this.d.init(null, null, this.f);
        }
        if (z) {
            return;
        }
        LogCatUtil.error("ClientRpcPack", "fail to init client,error: " + this.d.error());
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String publicKey = MpaasNetConfigUtil.getPublicKey(TransportEnvUtil.getContext());
        if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("ClientRpcPack", "pubKey: \n" + publicKey);
        }
        return publicKey;
    }

    public byte[] encrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{this, bArr});
        }
        try {
            byte[][] encode = this.d.encode(MiscUtils.generateRandomStr(16).getBytes(), GzipUtils.toGzip(bArr), this.c);
            this.e = encode[0];
            return a(encode[2], encode[1]);
        } catch (Exception e) {
            LogCatUtil.error("ClientRpcPack", "encrypt ex: " + e.toString() + " ,error: " + this.d.error());
            throw e;
        }
    }

    public byte[] decrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{this, bArr});
        }
        try {
            return GzipUtils.unGzip(this.d.decode(this.e, bArr, this.c));
        } catch (Exception e) {
            LogCatUtil.error("ClientRpcPack", "decrypt ex: " + e.toString() + " ,error: " + this.d.error());
            throw e;
        }
    }

    private byte[] a(byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b2e6bb67", new Object[]{this, bArr, bArr2});
        }
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        }
        try {
            byte b = this.f5574a;
            byte[] mediumToByteArray = NumArrayUtils.mediumToByteArray(bArr.length);
            byte b2 = this.b;
            byte[] mediumToByteArray2 = NumArrayUtils.mediumToByteArray(bArr2.length);
            dataOutputStream.write(b);
            dataOutputStream.write(mediumToByteArray);
            dataOutputStream.write(bArr);
            dataOutputStream.write(b2);
            dataOutputStream.write(mediumToByteArray2);
            dataOutputStream.write(bArr2);
            LogCatUtil.debug("ClientRpcPack", "asymType: " + ((int) b) + ",encryptedKeyLen: " + bArr.length + ",symType: " + ((int) b2) + ",encryptedBodyLen: " + bArr2.length);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                LogCatUtil.error("ClientRpcPack", e);
            }
            try {
                dataOutputStream.close();
            } catch (Exception e2) {
                LogCatUtil.error("ClientRpcPack", e2);
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e3) {
                    LogCatUtil.error("ClientRpcPack", e3);
                }
            }
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (Exception e4) {
                    LogCatUtil.error("ClientRpcPack", e4);
                }
            }
            throw th;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            if (this.d != null) {
                this.d.exit();
                LogCatUtil.debug("ClientRpcPack", "client exit");
            }
            super.finalize();
        } catch (Throwable th) {
            LogCatUtil.error("ClientRpcPack", "finalize ex:" + th.toString());
        }
    }
}
