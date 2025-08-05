package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes2.dex */
public class bhy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(398855111);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : a(context.getApplicationInfo().nativeLibraryDir);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return iju.ABI_ARM;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return iju.ABI_ARM;
        }
        return (Build.VERSION.SDK_INT < 21 || !file.getName().toLowerCase().startsWith("arm64")) ? iju.ABI_ARM : iju.ABI_ARM64;
    }
}
