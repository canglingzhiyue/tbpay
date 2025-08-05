package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.util.MediaUtils;
import java.io.File;

/* loaded from: classes5.dex */
public class heo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1280949469);
    }

    public static int a(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d8c4737", new Object[]{context, str, bitmap})).intValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int a2 = MediaUtils.a(context, Uri.fromFile(new File(str)));
        if (a2 == 6 || a2 == 8) {
            z = true;
        }
        if (!z) {
            width = height;
            height = width;
        }
        return a(options, height, width);
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            while (true) {
                if (i4 / i3 <= i2 && i5 / i3 <= i) {
                    break;
                }
                i3 <<= 1;
            }
        }
        return i3;
    }

    public static Bitmap a(int i, Bitmap bitmap, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4927d800", new Object[]{new Integer(i), bitmap, crop});
        }
        float f = crop.transform.scale;
        float f2 = crop.transform.rotate;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = crop.transform.sampleSize;
        int i3 = ((int) crop.transform.offsetX) / i;
        int i4 = ((int) crop.transform.offsetY) / i;
        Rect rect = crop.rect;
        int round = Math.round((rect.width() * i2) / f) / i;
        int round2 = Math.round((rect.height() * i2) / f) / i;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        float[] a2 = pvl.a(rectF);
        float[] fArr = new float[8];
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        matrix.mapPoints(fArr, a2);
        RectF b = pvl.b(fArr);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((int) ((-i3) + Math.abs(b.left - rectF.left)), (int) ((-i4) + Math.abs(b.top - rectF.top)));
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(f2);
        canvas.drawBitmap(bitmap, matrix2, paint);
        return Bitmap.createBitmap(createBitmap, 0, 0, Math.min(width, round), Math.min(height, round2));
    }
}
