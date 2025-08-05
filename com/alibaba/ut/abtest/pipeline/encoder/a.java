package com.alibaba.ut.abtest.pipeline.encoder;

import com.alibaba.ut.abtest.internal.util.n;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Mac f4213a;

    static {
        kge.a(-383264233);
    }

    public static Mac a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mac) ipChange.ipc$dispatch("d2f6fef2", new Object[]{str, bArr});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Null key");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, str);
            Mac mac = Mac.getInstance(str);
            mac.init(secretKeySpec);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Deprecated
    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : new a(HmacAlgorithms.HMAC_MD5, str).b(str2);
    }

    private a(Mac mac) {
        this.f4213a = mac;
    }

    public a(String str, byte[] bArr) {
        this(a(str, bArr));
    }

    public a(HmacAlgorithms hmacAlgorithms, String str) {
        this(hmacAlgorithms.getName(), n.d(str));
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str}) : this.f4213a.doFinal(n.d(str));
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : n.a(a(str));
    }
}
