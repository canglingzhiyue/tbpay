package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ocw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASPECT_MODE_16_9 = 3;
    public static final int ASPECT_MODE_1_1 = 1;
    public static final int ASPECT_MODE_3_4 = 2;
    public static final int ASPECT_MODE_4_3 = 8;
    public static final int ASPECT_MODE_9_16 = 0;

    static {
        kge.a(-451762281);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        double d = i / i2;
        if (d < 0.65625d) {
            return 0;
        }
        if (d < 0.875d) {
            return 2;
        }
        if (d < 1.167d) {
            return 1;
        }
        return d < 1.55d ? 8 : 3;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static GradientDrawable a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("e4aeb4f", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i2, i3);
        return gradientDrawable;
    }

    public static boolean a(Bitmap bitmap, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1b53714", new Object[]{bitmap, str})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
