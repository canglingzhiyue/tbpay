package com.alipay.android.msp.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alipay.android.msp.framework.minizxing.BarcodeFormat;
import com.alipay.android.msp.framework.minizxing.BitMatrix;
import com.alipay.android.msp.framework.minizxing.EncodeHintType;
import com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel;
import com.alipay.android.msp.framework.minizxing.MultiFormatWriter;
import com.alipay.android.msp.framework.minizxing.WriterException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Hashtable;

/* loaded from: classes3.dex */
public class ZXingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String TAG = "ZXingHelper";
    public static final ErrorCorrectionLevel errorLevel = ErrorCorrectionLevel.H;
    public static final float rate = 0.17391305f;

    private static Bitmap encodeAsBitmapDecimal(String str, BarcodeFormat barcodeFormat, int i, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4, String str2, boolean z) throws WriterException {
        int i5;
        Bitmap softResample;
        int i6 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4bbd0fb0", new Object[]{str, barcodeFormat, new Integer(i), new Integer(i6), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4), str2, new Boolean(z)});
        }
        if (str == null || i6 > 10000 || i3 > 10000) {
            LogUtil.record(1, TAG, "out encodeAsBitmapDecimal too big");
            return null;
        } else if (i3 <= 0 || i6 <= 0) {
            LogUtil.record(1, TAG, "too small image!");
            return null;
        } else {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.ERROR_CORRECTION, errorCorrectionLevel);
            hashtable.put(EncodeHintType.MARGIN, 0);
            int i7 = 0;
            try {
                BitMatrix encode = new MultiFormatWriter().encode(str, barcodeFormat, 1, 1, hashtable);
                LogUtil.record(1, TAG, String.format("id=%s,img_width=%d,img_height=%d,result(%d,%d),type=%s", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(encode.getWidth()), Integer.valueOf(encode.getHeight()), barcodeFormat));
                int width = encode.getWidth();
                int height = encode.getHeight();
                int[] iArr = new int[width * height];
                for (int i8 = 0; i8 < height; i8++) {
                    int i9 = i8 * width;
                    for (int i10 = 0; i10 < width; i10++) {
                        iArr[i9 + i10] = encode.get(i10, i8) ? -16777216 : i;
                    }
                }
                if (barcodeFormat == BarcodeFormat.QR_CODE) {
                    fixCornerColor(iArr, width, i4);
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                if (barcodeFormat == BarcodeFormat.QR_CODE) {
                    i5 = Math.min((i3 / height) * height, (i6 / width) * width);
                    i6 = i5;
                } else {
                    i5 = (i3 / height) * height;
                }
                if (z || isMeizuPro6Plus()) {
                    softResample = softResample(createBitmap, i, i6, i5);
                } else {
                    softResample = Bitmap.createBitmap(i6, i5, Bitmap.Config.ARGB_8888);
                    Paint paint = new Paint();
                    paint.setAntiAlias(false);
                    paint.setDither(false);
                    paint.setFilterBitmap(false);
                    new Canvas(softResample).drawBitmap(createBitmap, (Rect) null, new Rect(0, 0, softResample.getWidth(), softResample.getHeight()), paint);
                    createBitmap.recycle();
                }
                if (barcodeFormat == BarcodeFormat.QR_CODE && bitmap != null) {
                    softResample = addAvander(softResample, bitmap);
                }
                String formatDisplayedBarcodeWith1718 = formatDisplayedBarcodeWith1718(str);
                if (barcodeFormat == BarcodeFormat.CODE_128) {
                    Canvas canvas = new Canvas(softResample);
                    Paint paint2 = new Paint();
                    LogUtil.record(1, TAG, "contents = ".concat(String.valueOf(formatDisplayedBarcodeWith1718)));
                    paint2.setColor(i);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    int i11 = i6 / 16;
                    float f = i6;
                    canvas.drawRect(0.0f, (i5 - i11) - 4, f, i5, paint2);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint2.setColor(-16777216);
                    paint2.setAntiAlias(true);
                    if (!TextUtils.equals(str2, "DONT_DRAW_TEXT")) {
                        if (!TextUtils.isEmpty(str2)) {
                            paint2.setTextSize(i6 / 20);
                            paint2.setColor(-10981992);
                            canvas.drawText(str2, (f - paint2.measureText(str2)) / 2.0f, i5 - 10, paint2);
                        } else {
                            paint2.setTextSize(i11);
                            int length = formatDisplayedBarcodeWith1718.length();
                            float f2 = i6 / 6;
                            float f3 = (f - (2.0f * f2)) / length;
                            while (i7 < length) {
                                int i12 = i7 + 1;
                                canvas.drawText(formatDisplayedBarcodeWith1718.substring(i7, i12), (i7 * f3) + f2, i5 - 4, paint2);
                                i7 = i12;
                            }
                        }
                    }
                }
                return softResample;
            } catch (IllegalArgumentException unused) {
                LogUtil.record(1, TAG, "out 2 encodeAsBitmapDecimal");
                return null;
            }
        }
    }

    private static Bitmap softResample(Bitmap bitmap, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2b220b81", new Object[]{bitmap, new Integer(i8), new Integer(i2), new Integer(i3)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double width2 = i2 / bitmap.getWidth();
        double height2 = i3 / bitmap.getHeight();
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        canvas.drawColor(i8);
        int i9 = 0;
        while (i9 < width) {
            int floor = (int) Math.floor(i9 * width2);
            int i10 = i9 + 1;
            int floor2 = (int) Math.floor(i10 * width2);
            int i11 = 0;
            while (i11 < height) {
                if (iArr[(i11 * width) + i9] != i8) {
                    i4 = i11;
                    i5 = floor2;
                    i6 = i10;
                    i7 = floor;
                    canvas.drawRect(floor, (int) Math.floor(i11 * height2), floor2, (int) Math.floor((i11 + 1) * height2), paint);
                } else {
                    i4 = i11;
                    i5 = floor2;
                    i6 = i10;
                    i7 = floor;
                }
                i11 = i4 + 1;
                i10 = i6;
                floor = i7;
                floor2 = i5;
                i8 = i;
            }
            i9 = i10;
            i8 = i;
        }
        bitmap.recycle();
        return createBitmap;
    }

    private static void fixCornerColor(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5eaaae", new Object[]{iArr, new Integer(i), new Integer(i2)});
            return;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = (i3 + 2) * i;
                int i6 = i4 + 2;
                iArr[i5 + i6] = i2;
                int i7 = i - 3;
                iArr[((i7 - i3) * i) + i6] = i2;
                iArr[i5 + (i7 - i4)] = i2;
            }
        }
    }

    private static Bitmap addAvander(Bitmap bitmap, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("858cafb3", new Object[]{bitmap, bitmap2});
        }
        Canvas canvas = new Canvas(bitmap);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float min = Math.min(width, height) * 0.17391305f;
        Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        float f = width;
        float f2 = height;
        RectF rectF = new RectF((f - min) / 2.0f, (f2 - min) / 2.0f, (f + min) / 2.0f, (f2 + min) / 2.0f);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap2, rect, rectF, paint);
        return bitmap;
    }

    private static String formatDisplayedBarcodeWith1718(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("668d18e6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() >= 20 || str.length() <= 12) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(12, " ");
        sb.insert(8, " ");
        sb.insert(4, " ");
        String sb2 = sb.toString();
        String str2 = TAG;
        LogUtil.record(1, str2, " format code " + str + " to " + sb2);
        return sb2;
    }

    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("2a7f71a", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean(z), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4), str2}) : genCodeToImageView(str, barcodeFormat, i, imageView, z, i2, i3, errorCorrectionLevel, bitmap, i4, str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Bitmap] */
    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4, String str2, boolean z2) {
        ?? r0 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d03024f6", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean((boolean) r0), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4), str2, new Boolean(z2)});
        }
        if (imageView.getVisibility() != 0 || (imageView.getWidth() <= 0 && i2 <= 0)) {
            String str3 = TAG;
            LogUtil.record(1, str3, "out for iv.getWidth() = " + imageView.getWidth());
            return null;
        }
        try {
            if (r0 != 0) {
                Bitmap encodeAsBitmapDecimal = encodeAsBitmapDecimal(str, barcodeFormat, i, i3, i2, errorCorrectionLevel, bitmap, i4, str2, z2);
                if (encodeAsBitmapDecimal == null) {
                    return null;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                Bitmap createBitmap = Bitmap.createBitmap(encodeAsBitmapDecimal, 0, 0, encodeAsBitmapDecimal.getWidth(), encodeAsBitmapDecimal.getHeight(), matrix, true);
                encodeAsBitmapDecimal.recycle();
                imageView.setImageMatrix(matrix);
                imageView.setImageBitmap(createBitmap);
                return createBitmap;
            }
            r0 = encodeAsBitmapDecimal(str, barcodeFormat, i, (BarcodeFormat.QR_CODE != barcodeFormat || i2 <= i3) ? i2 : i3, i3, errorCorrectionLevel, bitmap, i4, str2, z2);
            if (r0 == 0) {
                return null;
            }
            imageView.setImageMatrix(null);
            imageView.setImageBitmap(r0);
            return r0;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("678da3d0", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean(z), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4)}) : genCodeToImageView(str, barcodeFormat, i, imageView, z, i2, i3, errorLevel, bitmap, i4, null);
    }

    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, Bitmap bitmap, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ee43d48a", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean(z), bitmap, new Integer(i2)}) : genCodeToImageView(str, barcodeFormat, i, imageView, z, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom(), errorLevel, bitmap, i2);
    }

    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, Bitmap bitmap, int i2, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e7fd2d54", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean(z), bitmap, new Integer(i2), str2}) : genCodeToImageView(str, barcodeFormat, i, imageView, z, bitmap, i2, str2, false);
    }

    public static Bitmap genCodeToImageView(String str, BarcodeFormat barcodeFormat, int i, ImageView imageView, boolean z, Bitmap bitmap, int i2, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("9581b5fc", new Object[]{str, barcodeFormat, new Integer(i), imageView, new Boolean(z), bitmap, new Integer(i2), str2, new Boolean(z2)}) : genCodeToImageView(str, barcodeFormat, i, imageView, z, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom(), errorLevel, bitmap, i2, str2, z2);
    }

    public static Bitmap createCodeBitmap(String str, BarcodeFormat barcodeFormat, int i, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("a2a3d954", new Object[]{str, barcodeFormat, new Integer(i), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4)}) : createCodeBitmap(str, barcodeFormat, i, i2, i3, errorCorrectionLevel, bitmap, i4, null);
    }

    public static Bitmap createCodeBitmap(String str, BarcodeFormat barcodeFormat, int i, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("3655539e", new Object[]{str, barcodeFormat, new Integer(i), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4), str2}) : createCodeBitmap(str, barcodeFormat, i, i2, i3, errorCorrectionLevel, bitmap, i4, str2, false);
    }

    public static Bitmap createCodeBitmap(String str, BarcodeFormat barcodeFormat, int i, int i2, int i3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap, int i4, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("122e58f2", new Object[]{str, barcodeFormat, new Integer(i), new Integer(i2), new Integer(i3), errorCorrectionLevel, bitmap, new Integer(i4), str2, new Boolean(z)});
        }
        try {
            return encodeAsBitmapDecimal(str, barcodeFormat, i, i2, i3, errorCorrectionLevel, bitmap, i4, str2, z);
        } catch (WriterException e) {
            LogUtil.record(8, TAG, e.getMessage());
            return null;
        }
    }

    public static boolean isMeizuPro6Plus() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d47650", new Object[0])).booleanValue();
        }
        String str = Build.MANUFACTURER + Build.MODEL;
        if (str.toUpperCase().contains("MEIZU") && str.toUpperCase().contains("PRO 6 PLUS")) {
            z = true;
        }
        LogUtil.record(1, TAG, "isMeizuPro6Plus: ".concat(String.valueOf(z)));
        return z;
    }
}
