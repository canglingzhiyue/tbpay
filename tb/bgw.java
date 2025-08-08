package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.i;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(161871617);
    }

    public static boolean a(long j, long j2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d63e3a1", new Object[]{new Long(j), new Long(j2), map})).booleanValue();
        }
        try {
            if (a(k.a().b().t())) {
                k.a().b().v();
                String a2 = ((i) k.a()).a();
                if (!StringUtils.isEmpty(a2)) {
                    new bha(k.a(), a2).run();
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        String packageName = context.getPackageName();
        int myPid = Process.myPid();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
