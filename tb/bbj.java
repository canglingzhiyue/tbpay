package tb;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bbj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1668771097);
    }

    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } catch (Throwable unused) {
        }
        if (accessibilityManager == null) {
            return false;
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
