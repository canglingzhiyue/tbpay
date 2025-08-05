package com.taobao.share.qrcode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-645598817);
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b8fa33b9", new Object[]{bitmap, bitmap2, new Integer(i)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            int[] iArr = new int[width * height];
            int i2 = 0;
            int i3 = 0;
            while (i2 < height) {
                int i4 = i3;
                for (int i5 = 0; i5 < width; i5++) {
                    int pixel = bitmap.getPixel(i5, i2);
                    if (pixel != -1) {
                        iArr[i4] = i;
                    } else {
                        iArr[i4] = pixel;
                    }
                    i4++;
                }
                i2++;
                i3 = i4;
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("be3e0906", new Object[]{bitmap, bitmap2});
        }
        try {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = (width2 / width) + 0.6f;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
            int width3 = createBitmap.getWidth();
            int height3 = createBitmap.getHeight();
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmap, (width3 - width2) / 2, (((height3 - height2) << 1) / 3) - 5, (Paint) null);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }
}
