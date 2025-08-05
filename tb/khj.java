package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class khj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float COMPRESS_SCALE = 0.8f;
    public static final float DEFAULT_SCALE = 0.75f;

    static {
        kge.a(294565689);
    }

    public static Bitmap a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("79d2cfa4", new Object[]{bitmap});
        }
        khu.b("bitmapCompress before size:" + bitmap.getByteCount() + "width:" + bitmap.getWidth() + ",height" + bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 0.8f), (int) (((float) bitmap.getHeight()) * 0.8f), true);
        khu.b("bitmapCompress after size:" + createScaledBitmap.getByteCount() + "width:" + createScaledBitmap.getWidth() + ",height" + createScaledBitmap.getHeight());
        return createScaledBitmap;
    }
}
