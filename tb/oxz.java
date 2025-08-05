package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* loaded from: classes8.dex */
public class oxz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1110396575);
    }

    public static synchronized Bitmap a(String str) {
        synchronized (oxz.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{str});
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                if (!file.exists()) {
                    return null;
                }
                return BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static Bitmap a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6a58e66a", new Object[]{drawable});
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static byte[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("eb5d66d7", new Object[]{bitmap});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static BitmapHolder a(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapHolder) ipChange.ipc$dispatch("2a02b4b9", new Object[]{str, num});
        }
        try {
            Bitmap a2 = oyj.a(num.intValue(), str);
            if (a2 == null) {
                return null;
            }
            return new BitmapHolder(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
