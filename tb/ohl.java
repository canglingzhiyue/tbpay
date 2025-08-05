package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;

/* loaded from: classes8.dex */
public class ohl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1638408024);
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab8fb58", new Object[]{view, onGlobalLayoutListener});
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    public static int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-i, -i2);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            ogg.a("ViewUtil", "updateApmInvalid: " + view);
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        }
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else if (view == null) {
        } else {
            ogg.a("ViewUtil", "updateApmValid:" + view);
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }
}
