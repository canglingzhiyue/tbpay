package com.loc;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public final class cg extends ci {

    /* renamed from: a  reason: collision with root package name */
    public static int f7721a = 13;
    public static int b = 6;
    private Context e;

    public cg(Context context, ci ciVar) {
        super(ciVar);
        this.e = context;
    }

    private static byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            x.a(byteArrayOutputStream, "1.2." + f7721a + "." + b);
            x.a(byteArrayOutputStream, "Android");
            x.a(byteArrayOutputStream, o.k());
            x.a(byteArrayOutputStream, o.h());
            x.a(byteArrayOutputStream, o.f(context));
            x.a(byteArrayOutputStream, Build.MANUFACTURER);
            x.a(byteArrayOutputStream, Build.MODEL);
            x.a(byteArrayOutputStream, Build.DEVICE);
            x.a(byteArrayOutputStream, o.n());
            x.a(byteArrayOutputStream, l.c(context));
            x.a(byteArrayOutputStream, l.d(context));
            x.a(byteArrayOutputStream, l.f(context));
            byteArrayOutputStream.write(new byte[]{0});
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bArr;
    }

    @Override // com.loc.ci
    protected final byte[] a(byte[] bArr) {
        byte[] a2 = a(this.e);
        byte[] bArr2 = new byte[a2.length + bArr.length];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(bArr, 0, bArr2, a2.length, bArr.length);
        return bArr2;
    }
}
