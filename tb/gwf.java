package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1959301280);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            activity.getWindow().addFlags(67108864);
        }
    }

    public static final int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : ohd.i(context);
    }
}
