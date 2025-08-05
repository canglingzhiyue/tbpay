package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {
        String A;

        /* renamed from: a  reason: collision with root package name */
        String f7834a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;
        String o;
        String p;
        String q;
        String r;
        String s;
        String t;
        String u;
        String v;
        String w;
        String x;
        String y;
        String z;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public static String a() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String str = "1";
            if (!l.a()) {
                str = "0";
            }
            int length = valueOf.length();
            return valueOf.substring(0, length - 2) + str + valueOf.substring(length - 1);
        } catch (Throwable th) {
            as.a(th, "CI", "TS");
            return null;
        }
    }

    public static String a(Context context) {
        return b(context);
    }

    public static String a(Context context, String str, String str2) {
        try {
            String e = l.e(context);
            return s.a(e + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            as.a(th, "CI", "Sco");
            return null;
        }
    }

    private static String a(a aVar) {
        return p.b(b(aVar));
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (!TextUtils.isEmpty(str)) {
            x.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, x.a(str));
        } else {
            x.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }

    public static byte[] a(Context context, boolean z, boolean z2) {
        try {
            return b(b(context, z, z2));
        } catch (Throwable th) {
            as.a(th, "CI", "gz");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        return p.a(bArr);
    }

    private static a b(Context context, boolean z, boolean z2) {
        a aVar = new a((byte) 0);
        aVar.f7834a = o.k();
        aVar.b = o.h();
        String f = o.f(context);
        if (f == null) {
            f = "";
        }
        aVar.c = f;
        aVar.d = l.c(context);
        aVar.e = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = l.b(context);
        aVar.i = l.d(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = o.n();
        aVar.l = o.m(context);
        StringBuilder sb = new StringBuilder();
        sb.append(o.j(context));
        aVar.m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o.i(context));
        aVar.n = sb2.toString();
        aVar.o = o.s(context);
        aVar.p = o.h(context);
        aVar.q = "";
        aVar.r = "";
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] i = o.i();
            aVar.s = i[0];
            aVar.t = i[1];
        }
        aVar.w = o.a();
        String a2 = o.a(context);
        if (!TextUtils.isEmpty(a2)) {
            aVar.x = a2;
        } else {
            aVar.x = "";
        }
        aVar.y = "aid=" + o.g();
        if ((z2 && ag.d) || ag.e) {
            String e = o.e(context);
            if (!TextUtils.isEmpty(e)) {
                aVar.y += "|oaid=" + e;
            }
        }
        String j = o.j();
        if (!TextUtils.isEmpty(j)) {
            aVar.y += "|multiImeis=" + j;
        }
        String m = o.m();
        if (!TextUtils.isEmpty(m)) {
            aVar.y += "|meid=" + m;
        }
        aVar.y += "|serial=" + o.f();
        String b = o.b();
        if (!TextUtils.isEmpty(b)) {
            aVar.y += "|adiuExtras=" + b;
        }
        aVar.y += "|storage=" + o.o() + "|ram=" + o.r(context) + "|arch=" + o.p();
        String b2 = ar.a().b();
        if (!TextUtils.isEmpty(b2)) {
            aVar.z = b2;
        } else {
            aVar.z = "";
        }
        if (z) {
            String a3 = ac.a(context).a();
            if (!TextUtils.isEmpty(a3)) {
                aVar.A = a3;
            }
        }
        return aVar;
    }

    private static String b(Context context) {
        try {
            return a(b(context, false, false));
        } catch (Throwable th) {
            as.a(th, "CI", "gCXi");
            return null;
        }
    }

    private static byte[] b(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream, aVar.f7834a);
                a(byteArrayOutputStream, aVar.b);
                a(byteArrayOutputStream, aVar.c);
                a(byteArrayOutputStream, aVar.d);
                a(byteArrayOutputStream, aVar.e);
                a(byteArrayOutputStream, aVar.f);
                a(byteArrayOutputStream, aVar.g);
                a(byteArrayOutputStream, aVar.h);
                a(byteArrayOutputStream, aVar.i);
                a(byteArrayOutputStream, aVar.j);
                a(byteArrayOutputStream, aVar.k);
                a(byteArrayOutputStream, aVar.l);
                a(byteArrayOutputStream, aVar.m);
                a(byteArrayOutputStream, aVar.n);
                a(byteArrayOutputStream, aVar.o);
                a(byteArrayOutputStream, aVar.p);
                a(byteArrayOutputStream, aVar.q);
                a(byteArrayOutputStream, aVar.r);
                a(byteArrayOutputStream, aVar.s);
                a(byteArrayOutputStream, aVar.t);
                a(byteArrayOutputStream, aVar.u);
                a(byteArrayOutputStream, aVar.v);
                a(byteArrayOutputStream, aVar.w);
                a(byteArrayOutputStream, aVar.x);
                a(byteArrayOutputStream, aVar.y);
                a(byteArrayOutputStream, aVar.z);
                a(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new String(byteArray);
                byte[] b = b(x.b(byteArray));
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return b;
            } catch (Throwable th2) {
                th = th2;
                try {
                    as.a(th, "CI", "gzx");
                    return null;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private static byte[] b(byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        PublicKey d = x.d();
        if (bArr.length > 117) {
            byte[] bArr2 = new byte[117];
            System.arraycopy(bArr, 0, bArr2, 0, 117);
            byte[] a2 = p.a(bArr2, d);
            byte[] bArr3 = new byte[(bArr.length + 128) - 117];
            System.arraycopy(a2, 0, bArr3, 0, 128);
            System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
            return bArr3;
        }
        return p.a(bArr, d);
    }
}
