package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f3403a = "g";
    public static String b;
    public static String c;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (Environment.getExternalStorageState().equals("mounted") && context.getExternalCacheDir() != null) {
            b = context.getExternalCacheDir().getAbsolutePath() + File.separator + "verify";
        } else {
            b = context.getFilesDir().getAbsolutePath() + File.separator + "verify";
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6, android.content.Context r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.realidentity.g.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "b7da5f8a"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a(r6)
            r0.append(r1)
            java.lang.String r1 = "."
            int r1 = r6.lastIndexOf(r1)
            java.lang.String r1 = r6.substring(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = a(r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L47
            r1.mkdirs()
        L47:
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r0)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L57
            java.lang.String r6 = r1.getPath()
            return r6
        L57:
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            r0.<init>(r6)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            java.net.URLConnection r6 = r0.openConnection()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            r0 = 5000(0x1388, float:7.006E-42)
            r6.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            r6.setDoInput(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            int r0 = r6.getResponseCode()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto Lc6
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lb9
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> Lba
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> Lba
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
        L85:
            int r2 = r6.read(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r4 = -1
            if (r2 == r4) goto L90
            r0.write(r7, r3, r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            goto L85
        L90:
            java.lang.String r7 = r1.getPath()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r6.close()     // Catch: java.io.IOException -> L97
        L97:
            r0.close()     // Catch: java.io.IOException -> L9a
        L9a:
            return r7
        L9b:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto Lac
        La0:
            r7 = r0
            goto Lba
        La2:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto La9
        La7:
            r6 = move-exception
            r0 = r7
        La9:
            r5 = r0
            r0 = r6
            r6 = r5
        Lac:
            if (r6 == 0) goto Lb3
            r6.close()     // Catch: java.io.IOException -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            if (r7 == 0) goto Lb8
            r7.close()     // Catch: java.io.IOException -> Lb8
        Lb8:
            throw r0
        Lb9:
            r6 = r7
        Lba:
            if (r6 == 0) goto Lc1
            r6.close()     // Catch: java.io.IOException -> Lc0
            goto Lc1
        Lc0:
        Lc1:
            if (r7 == 0) goto Lc6
            r7.close()     // Catch: java.io.IOException -> Lc6
        Lc6:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.g.a(java.lang.String, android.content.Context):java.lang.String");
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9952961c", new Object[]{bitmap, new Integer(i)});
        }
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth(), bitmap.getHeight());
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, Context context) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17776e47", new Object[]{bArr, context});
        }
        String valueOf = String.valueOf((int) (((Math.random() * 9.0d) + 1.0d) * 1.0E7d));
        String b2 = b(context);
        File file = new File(b2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(b2, valueOf);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
                String path = file2.getPath();
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
                return path;
            } catch (IOException unused2) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (Environment.getExternalStorageState().equals("mounted") && context.getExternalCacheDir() != null) {
            c = context.getExternalCacheDir().getAbsolutePath() + File.separator + UCClient.UI_PARAMS_KEY_GESTURE;
        } else {
            c = context.getFilesDir().getAbsolutePath() + File.separator + UCClient.UI_PARAMS_KEY_GESTURE;
        }
        return c;
    }

    public static byte[] a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("805d4780", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > i && i2 >= 0) {
            byteArrayOutputStream.reset();
            i2 -= 10;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5eec20f0", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (str != null && new File(str).exists()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inSampleSize = a(options, i, i2);
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                return BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            } catch (Exception e) {
                a.a(f3403a, e);
            }
        }
        return null;
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > i2 && i7 / i3 > i) {
                i3 <<= 1;
            }
        }
        return i3;
    }
}
