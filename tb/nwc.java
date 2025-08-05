package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class nwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : Build.VERSION.SDK_INT >= 23 ? Process.is64Bit() : context.getApplicationInfo().nativeLibraryDir.contains("lib/arm64");
    }
}
