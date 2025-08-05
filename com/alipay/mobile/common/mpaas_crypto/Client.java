package com.alipay.mobile.common.mpaas_crypto;

import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Client {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CT_ecc_aes = 1;
    public static final int CT_rsa_aes = 0;
    public static final int CT_sm2_sm4 = 2;
    public long handle;

    public native byte[] decode(byte[] bArr, byte[] bArr2, int i);

    public native byte[] decryptSm4(byte[] bArr, byte[] bArr2);

    public native byte[][] encode(byte[] bArr, byte[] bArr2, int i);

    public native byte[] encryptSm4(byte[] bArr, byte[] bArr2);

    public native String error();

    public native void exit();

    public native boolean init(String str, String str2, String str3);

    public Client() {
        this.handle = 0L;
        this.handle = 0L;
    }

    static {
        try {
            Class.forName("com.alipay.mobile.common.utils.load.LibraryLoadUtils").getMethod("loadLibrary", String.class, Boolean.TYPE).invoke(null, "openssl", false);
            LogCatUtil.info(HttpWorker.TAG, "LibraryLoadUtils load success.");
        } catch (Throwable th) {
            LogCatUtil.warn(HttpWorker.TAG, "LibraryLoadUtils load fail. " + th.toString());
            try {
                System.loadLibrary("openssl");
            } catch (Throwable th2) {
                LogCatUtil.warn(HttpWorker.TAG, "System.loadLibrary load fail. " + th2.toString());
            }
        }
    }
}
