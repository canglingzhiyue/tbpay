package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;

/* loaded from: classes8.dex */
public class omo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) < 0.5d;
    }

    private static Drawable a(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("92e82563", new Object[]{drawable, new Integer(i)});
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    public static Drawable a(Context context, int i, int i2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9c24c4fa", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        if (context == null) {
            return null;
        }
        try {
            drawable = ContextCompat.getDrawable(context, i);
        } catch (Resources.NotFoundException unused) {
            TLog.loge(a.a(), "ColorUtil", "get res failed");
            drawable = null;
        }
        if (drawable != null) {
            return a(drawable.mutate(), i2);
        }
        return null;
    }
}
