package com.loc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public final class bz {

    /* renamed from: a  reason: collision with root package name */
    private Context f7713a;
    private String b;
    private String c;
    private String d;
    private String e;

    public bz(Context context, String str, String str2, String str3) throws k {
        if (StringUtils.isEmpty(str3) || str3.length() > 256) {
            throw new k("无效的参数 - IllegalArgumentException");
        }
        this.f7713a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.b = str3;
    }

    private static byte[] a(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    private byte[] b(String str) {
        byte[] a2;
        if (!StringUtils.isEmpty(str) && (a2 = x.a(this.e)) != null) {
            return x.a(a2.length);
        }
        return new byte[]{0, 0};
    }

    public final void a(String str) throws k {
        if (StringUtils.isEmpty(str) || str.length() > 65536) {
            throw new k("无效的参数 - IllegalArgumentException");
        }
        this.e = str;
    }

    public final byte[] a() {
        int i = 0;
        byte[] bArr = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    x.a(byteArrayOutputStream2, this.c);
                    x.a(byteArrayOutputStream2, this.d);
                    x.a(byteArrayOutputStream2, this.b);
                    x.a(byteArrayOutputStream2, String.valueOf(o.j(this.f7713a)));
                    try {
                        i = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                    }
                    byteArrayOutputStream2.write(a(i));
                    byteArrayOutputStream2.write(b(this.e));
                    byteArrayOutputStream2.write(x.a(this.e));
                    bArr = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        av.b(th, "se", "tds");
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return bArr;
                    } catch (Throwable th2) {
                        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                        if (byteArrayOutputStream3 != null) {
                            try {
                                byteArrayOutputStream3.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return bArr;
    }
}
