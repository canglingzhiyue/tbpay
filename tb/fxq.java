package tb;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1767604357);
    }

    public static ColorFilter a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorFilter) ipChange.ipc$dispatch("80200a73", new Object[]{new Integer(i)});
        }
        if (i != 1) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static void a(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017121", new Object[]{imageView, new Integer(i)});
        } else {
            a(imageView, i, null);
        }
    }

    public static void a(ImageView imageView, int i, ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a93fbb9", new Object[]{imageView, new Integer(i), colorFilter});
            return;
        }
        ColorFilter a2 = a(i);
        if (a2 != null) {
            imageView.setColorFilter(a2);
        } else if (colorFilter != null) {
            imageView.setColorFilter(colorFilter);
        } else {
            imageView.clearColorFilter();
        }
    }
}
