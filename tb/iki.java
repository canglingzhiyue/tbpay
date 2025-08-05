package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class iki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            final Context applicationContext = context.getApplicationContext();
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new OnFileCreatedListener() { // from class: tb.iki.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tcrash.OnFileCreatedListener
                public void onFileCreated(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b8cac13e", new Object[]{this, str});
                        return;
                    }
                    RSoLog.c("crash-> crash file created path=" + str);
                    ikq.a("Crash.register", new Runnable() { // from class: tb.iki.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                applicationContext.getSharedPreferences("rso_crash_monitor", 0).edit().putLong("native_crash_timestamp", iky.a()).apply();
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            ikq.a("CrashReporterUtils,register,error:", th);
        }
    }

    public static boolean a(Context context, int i) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i)})).booleanValue();
        }
        if (ikx.a(".forceCrashRisk")) {
            str = "crash-> isInCrashRisk=true, local config .forceCrashRisk ";
        } else {
            long j = context.getApplicationContext().getSharedPreferences("rso_crash_monitor", 0).getLong("native_crash_timestamp", 0L);
            if (TimeUnit.MILLISECONDS.toSeconds(iky.a() - j) >= i) {
                z = false;
            }
            str = "crash-> isInCrashRisk=" + z + ", current=" + iky.a() + ", nativeCrashTimestamp=" + j + ", riskIntervalInSeconds=" + i;
        }
        RSoLog.c(str);
        return z;
    }
}
