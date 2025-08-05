package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public final class lch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            TLog.loge("InformationFlowTBAD", str, str2);
            if (!a()) {
                return;
            }
            Log.e(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge("InformationFlowTBAD", str, str2 + ", error:", th);
            if (!a()) {
                return;
            }
            Log.e(str, str2 + ", error:", th);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
