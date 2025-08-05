package tb;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class fmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getScreenHeight context is null!");
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealSize(point);
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point.y;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getScreenWidth context is null!");
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealSize(point);
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point.x;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getStatusBarHeight context is null!");
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        TLog.loge("AliNewDetailExtend", "ScreenUtils", "getStatusBarHeight resourceId is null!");
        return context.getResources().getDimensionPixelSize(identifier);
    }
}
