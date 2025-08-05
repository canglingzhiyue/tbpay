package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class HybridEncryption {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HybridEncryption f5458a;
    private static String b = AESUtil.class.getName() + RSAUtil.class.getName() + Base64.class.getName() + LoggingUtil.class.getName() + MD5Util.class.getName();
    private String c;
    private byte[] d;
    private byte[] e;
    private boolean f;
    private boolean g;
    private boolean h;

    public static HybridEncryption getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HybridEncryption) ipChange.ipc$dispatch("4eb90e45", new Object[0]);
        }
        HybridEncryption hybridEncryption = f5458a;
        if (hybridEncryption == null) {
            throw new IllegalStateException("need createInstance befor use");
        }
        return hybridEncryption;
    }

    public static synchronized HybridEncryption createInstance(Context context) {
        synchronized (HybridEncryption.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HybridEncryption) ipChange.ipc$dispatch("aefe7887", new Object[]{context});
            }
            if (f5458a == null) {
                f5458a = new HybridEncryption(context);
            }
            return f5458a;
        }
    }

    private HybridEncryption(Context context) {
        this.c = a(context);
    }

    private static String a(Context context) {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            return applicationInfo.metaData.getString("setting.logging.encryption.pubkey");
        }
        return null;
    }

    public byte[] getSecureSeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("683c2978", new Object[]{this}) : this.e;
    }

    public byte[] encrypt(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c457156a", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (this.d == null || this.e == null) {
            try {
                bArr2 = UUID.randomUUID().toString().getBytes();
            } catch (Throwable unused) {
                if (!this.f) {
                    this.f = true;
                }
                bArr2 = null;
            }
            if (bArr2 == null) {
                try {
                    bArr2 = String.valueOf(System.currentTimeMillis()).getBytes();
                } catch (Throwable unused2) {
                    if (!this.g) {
                        this.g = true;
                    }
                }
            }
            this.d = AESUtil.getRawKey(bArr2);
            this.e = RSAUtil.encrypt(this.d, this.c);
        }
        byte[] bArr3 = this.d;
        if (bArr3 != null && this.e != null) {
            try {
                return AESUtil.encrypt(bArr3, bArr, i, i2);
            } catch (Throwable unused3) {
                if (!this.h) {
                    this.h = true;
                }
            }
        }
        return null;
    }
}
