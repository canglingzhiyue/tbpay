package com.alipay.ma.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.ma.MaBuryRecord;
import com.alipay.ma.MaLogger;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import tb.mto;

/* loaded from: classes3.dex */
public class ImageTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImageTool";

    /* loaded from: classes3.dex */
    public static class ImageSampleOutInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int afterSampleHeight;
        public int afterSampleWidth;
        public int beforeSampleHeight;
        public int beforeSampleWidth;
        public int sampleSize;
        public String type;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ImageSampleOutInfo{sampleSize=" + this.sampleSize + ", type='" + this.type + "', beforeSampleWidth=" + this.beforeSampleWidth + ", beforeSampleHeight=" + this.beforeSampleHeight + ", afterSampleWidth=" + this.afterSampleWidth + ", afterSampleHeight=" + this.afterSampleHeight + '}';
        }
    }

    public static boolean rotateBitmapAtPath(String str, int i, Bitmap.CompressFormat compressFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb565899", new Object[]{str, new Integer(i), compressFormat})).booleanValue();
        }
        Bitmap rotateBitmap = rotateBitmap(str, i);
        if (rotateBitmap == null) {
            return false;
        }
        try {
            return rotateBitmap.compress(compressFormat, 100, new FileOutputStream(str));
        } catch (FileNotFoundException e) {
            MaLogger.e(TAG, "rotateBitmapAtPath Error", e);
            return false;
        }
    }

    public static Bitmap rotateBitmap(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("970a7fc6", new Object[]{str, new Integer(i)}) : rotateBitmap(BitmapFactory.decodeFile(str), i);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddbfca24", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap toGrayscale(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d06b6459", new Object[]{bitmap});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap toRoundCorner(Context context, Bitmap bitmap, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        Paint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e7f4bf2c", new Object[]{context, bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = context.getResources().getDisplayMetrics().density;
        Paint paint2 = new Paint();
        RectF rectF = new RectF(new Rect(0, 0, i2, i3));
        float f2 = i * f;
        paint2.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint2.setColor(-12434878);
        canvas.drawRoundRect(rectF, f2, f2, paint2);
        if (z) {
            paint = paint2;
            canvas.drawRect(0.0f, 0.0f, i2 / 2, i3 / 2, paint);
        } else {
            paint = paint2;
        }
        if (z2) {
            canvas.drawRect(i2 / 2, 0.0f, i2, i3 / 2, paint);
        }
        if (z3) {
            canvas.drawRect(0.0f, i3 / 2, i2 / 2, i3, paint);
        }
        if (z4) {
            canvas.drawRect(i2 / 2, i3 / 2, i2, i3, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap createThumbnail(FileDescriptor fileDescriptor, int i, int i2, ImageSampleOutInfo imageSampleOutInfo) {
        BitmapFactory.Options options;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("73a769ef", new Object[]{fileDescriptor, new Integer(i), new Integer(i2), imageSampleOutInfo});
        }
        Bitmap bitmap = null;
        if (fileDescriptor != null) {
            if (i <= 0 || i2 <= 0) {
                options = null;
            } else {
                try {
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    options.inSampleSize = computeSampleSize(options, Math.min(i, i2), i * i2);
                    options.inJustDecodeBounds = false;
                    options.inInputShareable = true;
                    options.inPurgeable = true;
                    if (imageSampleOutInfo != null) {
                        imageSampleOutInfo.sampleSize = options.inSampleSize;
                        imageSampleOutInfo.afterSampleHeight = options.outHeight;
                        imageSampleOutInfo.afterSampleWidth = options.outWidth;
                    }
                } catch (Throwable th) {
                    MaLogger.e(TAG, "createThumbnail error:" + th.getMessage());
                }
            }
            bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (imageSampleOutInfo != null) {
                Bitmap.Config config = bitmap.getConfig();
                imageSampleOutInfo.type = config != null ? config.name() : "null";
                imageSampleOutInfo.afterSampleHeight = options.outHeight;
                imageSampleOutInfo.afterSampleWidth = options.outWidth;
            }
        }
        return bitmap;
    }

    public static Bitmap createThumbnail(File file, int i, int i2, ImageSampleOutInfo imageSampleOutInfo) {
        BitmapFactory.Options options;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("41d24920", new Object[]{file, new Integer(i), new Integer(i2), imageSampleOutInfo});
        }
        Bitmap bitmap = null;
        if (file == null || !file.exists()) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            options = null;
        } else {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            options.inSampleSize = computeSampleSize(options, Math.min(i, i2), i * i2);
            options.inJustDecodeBounds = false;
            options.inInputShareable = true;
            options.inPurgeable = true;
            if (imageSampleOutInfo != null) {
                imageSampleOutInfo.sampleSize = options.inSampleSize;
                imageSampleOutInfo.beforeSampleHeight = options.outHeight;
                imageSampleOutInfo.beforeSampleWidth = options.outWidth;
            }
        }
        try {
            bitmap = BitmapFactory.decodeFile(file.getPath(), options);
            Bitmap.Config config = bitmap.getConfig();
            MaLogger.d(RPCDataItems.SWITCH_TAG_LOG, "type=" + config.name());
            if (imageSampleOutInfo != null) {
                imageSampleOutInfo.type = config.name();
                imageSampleOutInfo.afterSampleHeight = options.outHeight;
                imageSampleOutInfo.afterSampleWidth = options.outWidth;
            }
        } catch (OutOfMemoryError e) {
            MaLogger.d(RPCDataItems.SWITCH_TAG_LOG, "e" + e.getLocalizedMessage());
        }
        return bitmap;
    }

    public static int computeSampleSize(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d16e60da", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int a2 = a(options, i, i2);
        if (a2 > 8) {
            return ((a2 + 7) / 8) << 3;
        }
        while (i3 < a2) {
            i3 <<= 1;
        }
        return i3;
    }

    private static boolean a() {
        try {
            return ((Boolean) Class.forName("com.alipay.mobile.mascanengine.AlipayMaEngineUtils").getMethod("isBigPixelsScanMemoryRich", null).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int a(double d, double d2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa1b", new Object[]{new Double(d), new Double(d2)})).intValue();
        }
        if (d2 <= mto.a.GEO_NOT_SUPPORT || d <= mto.a.GEO_NOT_SUPPORT) {
            return -1;
        }
        if (d2 * d < 9.0E7d) {
            z = false;
        }
        if (!z) {
            return -1;
        }
        boolean a2 = a();
        MaLogger.d(TAG, "bigPixelsImagePreExecute isMemRich =" + a2);
        MaBuryRecord.recordBigPixelsImageScan(d, d2);
        return a2 ? 3000 : -1;
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        double d = options.outWidth;
        double d2 = options.outHeight;
        MaLogger.d(TAG, "computeInitialSampleSize w=" + d + ",h=" + d2);
        int a2 = a(d, d2);
        if (a2 > 0) {
            i2 = a2 * a2;
            MaLogger.d(TAG, "computeInitialSampleSize bigPixelsSampleSize=" + a2 + ",maxNumOfPixels=" + i2);
        } else {
            a2 = i;
        }
        int floor = i2 == -1 ? 1 : (int) Math.floor(Math.sqrt((d * d2) / i2));
        if (a2 == -1) {
            min = 128;
        } else {
            double d3 = a2;
            min = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (min < floor) {
            return floor;
        }
        if (i2 == -1 && a2 == -1) {
            return 1;
        }
        return a2 == -1 ? floor : min;
    }
}
