package com.meizu.cloud.pushsdk.e.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.e.d.k;
import com.meizu.cloud.pushsdk.e.h.g;
import java.io.IOException;
import java.net.URLConnection;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes4.dex */
public class b {
    public static int a(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 <= min) {
                f = f2;
            } else {
                return (int) f;
            }
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    public static c<Bitmap> a(k kVar, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        byte[] bArr = new byte[0];
        try {
            bArr = g.a(kVar.a().f()).b();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int a2 = a(i, i2, i3, i4, scaleType);
            int a3 = a(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i3, i4, a2, a3);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (a(decodeByteArray, a2, a3)) {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
                decodeByteArray.recycle();
            } else {
                bitmap = decodeByteArray;
            }
        }
        return bitmap == null ? c.a(b(new com.meizu.cloud.pushsdk.e.c.a(kVar))) : c.a(bitmap);
    }

    public static com.meizu.cloud.pushsdk.e.c.a a(com.meizu.cloud.pushsdk.e.c.a aVar) {
        aVar.b("connectionError");
        aVar.a(0);
        aVar.a(aVar.getMessage());
        return aVar;
    }

    public static com.meizu.cloud.pushsdk.e.c.a a(com.meizu.cloud.pushsdk.e.c.a aVar, com.meizu.cloud.pushsdk.e.b.b bVar, int i) {
        com.meizu.cloud.pushsdk.e.c.a a2 = bVar.a(aVar);
        a2.a(i);
        a2.b("responseFromServerError");
        return a2;
    }

    public static com.meizu.cloud.pushsdk.e.c.a a(Exception exc) {
        com.meizu.cloud.pushsdk.e.c.a aVar = new com.meizu.cloud.pushsdk.e.c.a(exc);
        aVar.b((Build.VERSION.SDK_INT < 11 || !(exc instanceof NetworkOnMainThreadException)) ? "connectionError" : "networkOnMainThreadError");
        aVar.a(0);
        return aVar;
    }

    public static String a(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return contentTypeFor == null ? UploadConstants.FILE_CONTENT_TYPE : contentTypeFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.meizu.cloud.pushsdk.e.d.k r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            com.meizu.cloud.pushsdk.e.d.l r3 = r3.a()     // Catch: java.lang.Throwable -> L49
            java.io.InputStream r3 = r3.e()     // Catch: java.lang.Throwable -> L49
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L47
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L1b
            r2.mkdirs()     // Catch: java.lang.Throwable -> L47
        L1b:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L47
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L47
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L47
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L47
        L25:
            int r4 = r3.read(r0)     // Catch: java.lang.Throwable -> L45
            r1 = -1
            if (r4 == r1) goto L31
            r1 = 0
            r5.write(r0, r1, r4)     // Catch: java.lang.Throwable -> L45
            goto L25
        L31:
            r5.flush()     // Catch: java.lang.Throwable -> L45
            r3.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r3 = move-exception
            r3.printStackTrace()
        L3c:
            r5.close()     // Catch: java.io.IOException -> L40
            return
        L40:
            r3 = move-exception
            r3.printStackTrace()
            return
        L45:
            r4 = move-exception
            goto L4c
        L47:
            r4 = move-exception
            goto L4b
        L49:
            r4 = move-exception
            r3 = r1
        L4b:
            r5 = r1
        L4c:
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r3 = move-exception
            r3.printStackTrace()
        L56:
            if (r5 == 0) goto L60
            r5.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r3 = move-exception
            r3.printStackTrace()
        L60:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.i.b.a(com.meizu.cloud.pushsdk.e.d.k, java.lang.String, java.lang.String):void");
    }

    private static boolean a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return false;
        }
        return bitmap.getWidth() > i || bitmap.getHeight() > i2;
    }

    public static com.meizu.cloud.pushsdk.e.c.a b(com.meizu.cloud.pushsdk.e.c.a aVar) {
        aVar.a(0);
        aVar.b("parseError");
        aVar.a(aVar.getMessage());
        return aVar;
    }
}
