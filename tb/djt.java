package tb;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class djt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26794a;
    private static boolean b;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : c(context);
    }

    static {
        kge.a(-1535226240);
        f26794a = false;
        b = false;
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 19) {
            if (f26794a) {
                return b;
            }
            ((AccessibilityManager) applicationContext.getSystemService("accessibility")).addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: tb.djt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public void onTouchExplorationStateChanged(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c140c907", new Object[]{this, new Boolean(z)});
                    } else {
                        djt.a(djt.b(applicationContext));
                    }
                }
            });
            f26794a = true;
            boolean c = c(applicationContext);
            b = c;
            return c;
        }
        return c(applicationContext);
    }
}
