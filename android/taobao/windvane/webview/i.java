package android.taobao.windvane.webview;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1917469825);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return (Build.MODEL != null && Build.MODEL.contains("GT-I95") && Build.MANUFACTURER != null && Build.MANUFACTURER.equals("samsung")) && (Build.VERSION.SDK_INT == 18);
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT != 17 || context == null) {
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (!accessibilityManager.isEnabled()) {
                return;
            }
            Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod(com.taobao.android.weex_framework.util.a.ATOM_EXT_setState, Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(accessibilityManager, 0);
        } catch (Throwable unused) {
        }
    }
}
