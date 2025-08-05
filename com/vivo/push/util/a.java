package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public class a {
    private static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24252a;
    private byte[] b;

    private a(Context context) {
        ad.b().a(ContextDelegate.getContext(context));
        ad b = ad.b();
        this.f24252a = b.c();
        this.b = b.d();
    }

    public static a a(Context context) {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a(context.getApplicationContext());
                }
            }
        }
        return c;
    }

    private byte[] a() {
        byte[] bArr = this.f24252a;
        return (bArr == null || bArr.length <= 0) ? ad.b().c() : bArr;
    }

    private byte[] b() {
        byte[] bArr = this.b;
        return (bArr == null || bArr.length <= 0) ? ad.b().d() : bArr;
    }

    public final String a(String str) throws Exception {
        String a2 = j.a(a());
        String a3 = j.a(b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a3.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(a2.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    public final String b(String str) throws Exception {
        return new String(j.a(j.a(a()), j.a(b()), Base64.decode(str, 2)), "utf-8");
    }
}
