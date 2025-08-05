package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.util.Constants;
import java.io.File;

/* loaded from: classes8.dex */
public class oba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1496337650);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r7, android.graphics.Bitmap r8, java.io.File r9, android.content.Context r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oba.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L23
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r1[r2] = r3
            r7 = 1
            r1[r7] = r8
            r7 = 2
            r1[r7] = r9
            r7 = 3
            r1[r7] = r10
            java.lang.String r7 = "dc74c0d1"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveBitmapToPath path: "
            r0.append(r1)
            java.lang.String r1 = r9.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MediaStoreUtil"
            tb.nyy.c(r1, r0)
            boolean r0 = r9.exists()
            if (r0 != 0) goto L46
            r9.mkdir()
        L46:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "tb_image_share_"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = ".jpg"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r9, r0)
            if (r7 == 0) goto L6e
            boolean r9 = a()
            if (r9 != 0) goto L86
        L6e:
            r9 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La4
            r0.<init>(r4)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La4
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r6 = 100
            r8.compress(r5, r6, r0)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r0.flush()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r0.close()     // Catch: java.io.IOException -> L82
            goto L86
        L82:
            r9 = move-exception
            r9.printStackTrace()
        L86:
            if (r7 != 0) goto L8d
            java.lang.String r7 = r4.getAbsolutePath()
            return r7
        L8d:
            boolean r7 = a()
            if (r7 != 0) goto L98
            java.lang.String r7 = a(r8, r4, r2, r10)
            return r7
        L98:
            java.lang.String r7 = a(r8, r4, r2)
            return r7
        L9d:
            r7 = move-exception
            goto Lc9
        L9f:
            r7 = move-exception
            goto La6
        La1:
            r7 = move-exception
            r0 = r9
            goto Lc9
        La4:
            r7 = move-exception
            r0 = r9
        La6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r8.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r10 = "saveBitmapToPath write to file failed: "
            r8.append(r10)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L9d
            r8.append(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L9d
            tb.nyy.c(r1, r7)     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto Lc8
            r0.close()     // Catch: java.io.IOException -> Lc4
            goto Lc8
        Lc4:
            r7 = move-exception
            r7.printStackTrace()
        Lc8:
            return r9
        Lc9:
            if (r0 == 0) goto Ld3
            r0.close()     // Catch: java.io.IOException -> Lcf
            goto Ld3
        Lcf:
            r8 = move-exception
            r8.printStackTrace()
        Ld3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oba.a(boolean, android.graphics.Bitmap, java.io.File, android.content.Context):java.lang.String");
    }

    public static String a(Bitmap bitmap, File file, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5f0b5bf", new Object[]{bitmap, file, new Long(j), context});
        }
        long j2 = j / 1000;
        try {
            ContentValues contentValues = new ContentValues();
            ContentResolver contentResolver = ShareBizAdapter.getInstance().getAppEnv().b().getContentResolver();
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("title", file.getName());
            contentValues.put("_display_name", file.getName());
            contentValues.put("datetaken", Long.valueOf(j));
            contentValues.put("date_added", Long.valueOf(j2));
            contentValues.put("date_modified", Long.valueOf(j2));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            contentValues.put("width", Integer.valueOf(bitmap.getWidth()));
            contentValues.put("height", Integer.valueOf(bitmap.getHeight()));
            contentValues.put("_size", Long.valueOf(file.length()));
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            nyy.c("MediaStoreUtil", "file.length=" + file.length() + "  uri=" + insert);
            String absolutePath = file.getAbsolutePath();
            nyy.c("MediaStoreUtil", "saveToMediaStore absolutePath=" + absolutePath);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + absolutePath)));
            return absolutePath;
        } catch (Exception e) {
            nyy.c("MediaStoreUtil", "saveToMediaStore to Mediastore failed: " + e.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.graphics.Bitmap r8, java.io.File r9, long r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oba.a(android.graphics.Bitmap, java.io.File, long):java.lang.String");
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : ShareBizAdapter.getInstance().getAppEnv().b().getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29;
    }
}
