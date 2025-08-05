package tb;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes7.dex */
public class spq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f33818a;
    private static TextView b;

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else if (activity == null) {
        } else {
            try {
                if (f33818a != null && b != null && b.isAttachedToWindow()) {
                    f33818a.removeView(b);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            f33818a = (WindowManager) activity.getSystemService(a.ATOM_EXT_window);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
            layoutParams.gravity = 51;
            layoutParams.x = 0;
            layoutParams.y = 500;
            layoutParams.token = activity.getWindow().getDecorView().getWindowToken();
            TextView textView = new TextView(activity);
            b = textView;
            textView.setTextSize(15.0f);
            b.setTextColor(-65536);
            b.setText(str);
            f33818a.addView(b, layoutParams);
        }
    }
}
