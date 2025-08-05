package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;

/* loaded from: classes5.dex */
public class tbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1600744623);
    }

    public static Drawable a(Context context, Drawable drawable, Rect rect, int i) {
        Bitmap bitmap;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f26abfec", new Object[]{context, drawable, rect, new Integer(i)});
        }
        try {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } catch (Throwable th) {
            th = th;
            bitmap = null;
        }
        try {
            int width2 = rect.width() - bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width2 > 0) {
                if (i >= bitmap.getWidth()) {
                    return drawable;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i - 1, height);
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, i, 0, 1, height);
                    Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, i + 1, 0, (bitmap.getWidth() - i) - 1, height);
                    Bitmap createBitmap4 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap4);
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    for (int i2 = 0; i2 <= width2; i2++) {
                        canvas.drawBitmap(createBitmap2, (i2 + i) - 1, 0.0f, (Paint) null);
                    }
                    canvas.drawBitmap(createBitmap3, width2 + i, 0.0f, (Paint) null);
                    createBitmap.recycle();
                    createBitmap2.recycle();
                    createBitmap3.recycle();
                    return new BitmapDrawable(context.getResources(), createBitmap4);
                }
            }
            if (width2 >= 0 || (width = (bitmap.getWidth() - i) + width2) <= 0) {
                return drawable;
            }
            Bitmap createBitmap5 = Bitmap.createBitmap(bitmap, 0, 0, i, height);
            Bitmap createBitmap6 = Bitmap.createBitmap(bitmap, i - width2, 0, width, height);
            Bitmap createBitmap7 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap7);
            canvas2.drawBitmap(createBitmap5, 0.0f, 0.0f, (Paint) null);
            canvas2.drawBitmap(createBitmap6, i, 0.0f, (Paint) null);
            createBitmap5.recycle();
            createBitmap6.recycle();
            return new BitmapDrawable(context.getResources(), createBitmap7);
        } catch (Throwable th2) {
            th = th2;
            if (bitmap != null) {
                i.a("BackgroundImgUtils", "imgSplitAndMerge fail.Bitmap split=" + i + ",bitmap w==" + bitmap.getWidth() + ", h==" + bitmap.getHeight(), th);
            } else {
                i.a("BackgroundImgUtils", "imgSplitAndMerge fail.Bitmap split=" + i + ",bitmap == null", th);
            }
            return drawable;
        }
    }

    public static boolean a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd037b90", new Object[]{drawable})).booleanValue();
        }
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                return true;
            }
        }
        return false;
    }

    public static Rect a(int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("970d2767", new Object[]{new Integer(i), rect});
        }
        if (rect.height() == 0) {
            return new Rect();
        }
        return new Rect(0, 0, (int) Math.ceil(((rect.width() * 1.0d) * i) / rect.height()), i);
    }
}
