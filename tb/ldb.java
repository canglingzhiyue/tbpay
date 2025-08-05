package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode;

/* loaded from: classes.dex */
public class ldb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IInfoFlowDarkMode f30490a;

    static {
        kge.a(-1112350523);
    }

    public static void a(IInfoFlowDarkMode iInfoFlowDarkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b54e7f1", new Object[]{iInfoFlowDarkMode});
        } else {
            f30490a = iInfoFlowDarkMode;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        IInfoFlowDarkMode iInfoFlowDarkMode = f30490a;
        if (iInfoFlowDarkMode == null) {
            ldf.b("InfoFlowDarkMode", "isInDarkTheme gInfoFlowDarkMode == null");
            return false;
        }
        try {
            return iInfoFlowDarkMode.a(context);
        } catch (Throwable th) {
            ldf.a("InfoFlowDarkMode", "isInDarkTheme error", th);
            return false;
        }
    }
}
