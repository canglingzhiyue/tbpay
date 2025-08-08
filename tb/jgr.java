package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final Map<String, String> f29542a = new HashMap();

    /* loaded from: classes6.dex */
    public interface a {
        String apply();
    }

    public static /* synthetic */ String lambda$FtN2NY5GxmgXwZsVRSl95aT3d28(Context context) {
        return c(context);
    }

    public static /* synthetic */ String lambda$JIz0ttjWab690x0xhe01eBZX14M(Context context) {
        return d(context);
    }

    private static String a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2434810", new Object[]{str, aVar});
        }
        String str2 = f29542a.get(str);
        if (str2 != null) {
            return str2;
        }
        String apply = aVar.apply();
        f29542a.put(str, apply);
        return apply;
    }

    public static String a(final Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : a("appVersion", new a() { // from class: tb.-$$Lambda$jgr$JIz0ttjWab690x0xhe01eBZX14M
            @Override // tb.jgr.a
            public final String apply() {
                return jgr.lambda$JIz0ttjWab690x0xhe01eBZX14M(context);
            }
        });
    }

    public static /* synthetic */ String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return !StringUtils.isEmpty(str) ? str : "0.0.1";
        } catch (Exception e) {
            jfj.b(e);
            return "0.0.1";
        }
    }

    public static String b(final Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : a("processName", new a() { // from class: tb.-$$Lambda$jgr$FtN2NY5GxmgXwZsVRSl95aT3d28
            @Override // tb.jgr.a
            public final String apply() {
                return jgr.lambda$FtN2NY5GxmgXwZsVRSl95aT3d28(context);
            }
        });
    }

    public static /* synthetic */ String c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return "unknown";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "unknown";
        } catch (Exception e) {
            jfj.b(e);
            return "unknown";
        }
    }
}
