package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1385478911);
    }

    public int a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26196deb", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        if (f == 0.0f) {
            return i;
        }
        if (f == 1.0f) {
            return i2;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        return Color.argb(alpha + ((int) ((Color.alpha(i2) - alpha) * f)), red + ((int) ((Color.red(i2) - red) * f)), green + ((int) ((Color.green(i2) - green) * f)), blue + ((int) ((Color.blue(i2) - blue) * f)));
    }
}
