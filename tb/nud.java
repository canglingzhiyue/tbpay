package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes8.dex */
public class nud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1789898166);
    }

    public static /* synthetic */ void c(boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8290c07c", new Object[]{new Boolean(z), activity});
        } else {
            b(z, activity);
        }
    }

    public static void a(final boolean z, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0eeb1be", new Object[]{new Boolean(z), activity});
        } else {
            activity.runOnUiThread(new i() { // from class: tb.nud.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                        nud.c(z, activity);
                    } else {
                        Activity activity2 = activity;
                        SystemBarDecorator systemBarDecorator = activity2 instanceof BaseActivity ? ((BaseActivity) activity2).getSystemBarDecorator() : null;
                        if (systemBarDecorator == null) {
                            return;
                        }
                        systemBarDecorator.enableImmersiveStatusBar(z);
                    }
                }
            });
        }
    }

    private static void b(boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bfb91d", new Object[]{new Boolean(z), activity});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 23 ? z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193) : z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }
}
