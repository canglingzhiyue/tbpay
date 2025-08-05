package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.b;

/* loaded from: classes9.dex */
public class rfi implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(649454962);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(final ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (!apkUpdateContext.isForceUpdate()) {
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.rfi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rgq.killChildProcesses(apkUpdateContext.context);
                    int myPid = Process.myPid();
                    String str = "atlas killprocess:" + myPid;
                    Process.killProcess(myPid);
                }
            }, 1000L);
        }
    }
}
