package tb;

import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.a;
import com.taobao.android.job.core.task.c;
import com.taobao.android.job.core.task.e;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes.dex */
public class guo extends a<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(guo guoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.job.core.task.e
    public /* synthetic */ Object execute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c5e0536", new Object[]{this}) : a();
    }

    public guo(e<String, Void> eVar) {
        super(eVar);
    }

    @Override // com.taobao.android.job.core.task.a, com.taobao.android.job.core.task.e
    public boolean intercept(c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue() : !guq.a(getId()) && getTargetTask().intercept(cVar);
    }

    public Void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("ca430795", new Object[]{this});
        }
        long j = 0;
        if (LauncherRuntime.l) {
            j = System.currentTimeMillis();
            gsl.a("LauncherTask", "Executing launcher # %s, thread priority:%d", getId(), Integer.valueOf(Process.getThreadPriority(Process.myTid())));
        }
        String id = getId();
        try {
            gvt.a(id);
            gvi.a(id);
            Void execute = getTargetTask().execute();
            gvi.b(id);
            gvt.a();
            if (LauncherRuntime.l) {
                gsl.a("LauncherTask", "Executed launcher # %s, Execution Done with result=%s, cost=%d ms", getId(), execute, Long.valueOf(gsn.a(j)));
            }
            return execute;
        } catch (Throwable th) {
            try {
                a(th);
            } finally {
                gvi.b(id);
                gvt.a();
                if (LauncherRuntime.l) {
                    gsl.a("LauncherTask", "Executed launcher # %s, Execution Done with result=%s, cost=%d ms", getId(), null, Long.valueOf(gsn.a(j)));
                }
            }
        }
    }

    private void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        if (LauncherRuntime.l) {
            gsl.b("LauncherTask", "execute task '%s' failed with exception:", getId(), th);
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig("launch_config", "is_report_crash", "1");
        String config2 = orangeConfig.getConfig("launch_config", "crash_white_list", "");
        if (!"1".equals(config)) {
            return;
        }
        if (!StringUtils.isEmpty(config2) && config2.contains(getId())) {
            return;
        }
        gvc.a(LauncherRuntime.g, getId(), th);
    }
}
