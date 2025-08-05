package com.uc.webview.base;

import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23769a = "a";
    private static final byte[] b = {38, 40, 85, 99, 83, 100, 107, 56, 56, 40, 56, 56, 35, 61, 61, 61};

    /* renamed from: com.uc.webview.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1033a {

        /* renamed from: a  reason: collision with root package name */
        protected byte[] f23770a;

        public C1033a(byte[] bArr) {
            this.f23770a = bArr;
        }

        public byte[] a() {
            return this.f23770a;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        private final String c;
        private final String d;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f23771a = null;
        public File b = null;
        private String e = null;

        public b(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public static b a() {
            return new b("MD5", "%032x");
        }

        public static b b() {
            return new b("SHA-1", "%040x");
        }

        private String d() {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(this.c);
                messageDigest.update(this.f23771a);
                return String.format(Locale.CHINA, this.d, new BigInteger(1, messageDigest.digest()));
            } catch (Throwable th) {
                Log.e(a.f23769a, "dataDigest failed", th);
                return null;
            }
        }

        private String e() {
            BufferedInputStream bufferedInputStream;
            byte[] bArr = new byte[131072];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(this.c);
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.b));
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 131072);
                        if (read == -1) {
                            return String.format(Locale.CHINA, this.d, new BigInteger(1, messageDigest.digest()));
                        }
                        messageDigest.update(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Log.e(a.f23769a, "fileDigest failed", th);
                            return null;
                        } finally {
                            com.uc.webview.base.io.d.a(bufferedInputStream);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        }

        public final String c() {
            if (TextUtils.isEmpty(this.e)) {
                this.e = this.b != null ? e() : d();
            }
            return this.e;
        }
    }

    /* loaded from: classes9.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f23772a = {126, 147, 115, 241, 101, 198, 215, 134};

        public static String a(String str) {
            try {
                return new String(Base64.encode(a(str.getBytes()), 2), Charset.forName("UTF-8"));
            } catch (Throwable th) {
                Log.d(a.f23769a, "encode failed", th);
                return null;
            }
        }

        private static byte[] a(byte[] bArr) {
            byte[] bArr2 = null;
            if (bArr == null) {
                return null;
            }
            int length = bArr.length;
            try {
                bArr2 = new byte[length + 2];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = bArr[i];
                    bArr2[i] = (byte) (f23772a[i % 8] ^ b2);
                    b = (byte) (b ^ b2);
                }
                int[] iArr = f23772a;
                bArr2[length] = (byte) (iArr[0] ^ b);
                bArr2[length + 1] = (byte) (iArr[1] ^ b);
            } catch (Exception unused) {
            }
            return bArr2;
        }

        public static String b(String str) {
            try {
                return new String(b(Base64.decode(str, 2)), Charset.forName("UTF-8"));
            } catch (Throwable th) {
                Log.d(a.f23769a, "decode failed", th);
                return null;
            }
        }

        private static byte[] b(byte[] bArr) {
            if (bArr != null && bArr.length >= 2) {
                int length = bArr.length - 2;
                try {
                    byte[] bArr2 = new byte[length];
                    byte b = 0;
                    for (int i = 0; i < length; i++) {
                        byte b2 = (byte) (bArr[i] ^ f23772a[i % 8]);
                        bArr2[i] = b2;
                        b = (byte) (b ^ b2);
                    }
                    byte b3 = bArr[length];
                    int[] iArr = f23772a;
                    if (b3 == ((byte) ((iArr[0] ^ b) & 255)) && bArr[length + 1] == ((byte) ((iArr[1] ^ b) & 255))) {
                        return bArr2;
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }
}
