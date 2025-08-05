package com.alipay.android.msp.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class BitmapUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static android.graphics.Bitmap getHttpBitmap(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.utils.BitmapUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "d68e9f7c"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            return r4
        L15:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L4e
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L4e
            r4.setDoInput(r2)     // Catch: java.lang.Throwable -> L48
            r4.connect()     // Catch: java.lang.Throwable -> L48
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Throwable -> L48
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L3d
        L37:
            if (r4 == 0) goto L5e
            r4.disconnect()     // Catch: java.io.IOException -> L35
            goto L5e
        L3d:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4)
            goto L5e
        L41:
            r2 = move-exception
            goto L51
        L43:
            r1 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
            goto L64
        L48:
            r2 = move-exception
            r1 = r0
            goto L51
        L4b:
            r4 = move-exception
            r1 = r0
            goto L64
        L4e:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L51:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r2)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.io.IOException -> L35
        L59:
            if (r4 == 0) goto L5e
            r4.disconnect()     // Catch: java.io.IOException -> L35
        L5e:
            return r0
        L5f:
            r0 = move-exception
            r3 = r1
            r1 = r4
            r4 = r0
            r0 = r3
        L64:
            if (r0 == 0) goto L6c
            r0.close()     // Catch: java.io.IOException -> L6a
            goto L6c
        L6a:
            r0 = move-exception
            goto L72
        L6c:
            if (r1 == 0) goto L75
            r1.disconnect()     // Catch: java.io.IOException -> L6a
            goto L75
        L72:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
        L75:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.BitmapUtil.getHttpBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap zoomImage(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1d9abdbd", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap getRoundedBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("493cc940", new Object[]{bitmap, new Integer(i)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static String saveBitmap(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbcdc53d", new Object[]{context, bitmap, str});
        }
        String str2 = null;
        if (context == null || bitmap == null) {
            return null;
        }
        try {
            str2 = insertPicture(context, bitmap, str, "");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return getFilePathFromContentUri(str2, context.getContentResolver());
    }

    private static String insertPicture(Context context, Bitmap bitmap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22d90eda", new Object[]{context, bitmap, str, str2});
        }
        tryInitPicturesDir();
        return MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, str, str2);
    }

    private static String getFilePathFromContentUri(String str, ContentResolver contentResolver) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2131bdad", new Object[]{str, contentResolver});
        }
        String str2 = null;
        if (str == null || contentResolver == null) {
            return null;
        }
        try {
            cursor = MediaStore.Images.Media.query(contentResolver, Uri.parse(str), new String[]{"_data"});
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                str2 = cursor.getString(cursor.getColumnIndex("_data"));
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                LogUtil.printExceptionStackTrace(th);
                return str2;
            } finally {
                FileUtils.close(cursor);
            }
        }
        return str2;
    }

    private static void tryInitPicturesDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab02c8b4", new Object[0]);
            return;
        }
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (externalStoragePublicDirectory.exists()) {
                return;
            }
            externalStoragePublicDirectory.mkdirs();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
