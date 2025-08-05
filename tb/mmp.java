package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.orange.OConstant;
import tb.mly;

/* loaded from: classes7.dex */
public class mmp extends mmc<mla, mkz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public mmp(MetricContext metricContext, mly mlyVar, mla mlaVar) {
        super(metricContext, mlyVar, mlaVar);
        mlyVar.c().a(OConstant.DIMEN_PROCESS_START_TIME, metricContext.getProcessStartTime()).a("appLauncherStartTime", metricContext.getLauncherStartTime()).a("startupTimestampInterval", System.currentTimeMillis() - SystemClock.uptimeMillis()).a();
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{1};
    }

    @Override // tb.mmc
    public void a(mkz mkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b172bc", new Object[]{this, mkzVar});
        } else if (mkzVar.a() == 0) {
        } else {
            mly.a c = e().c();
            c.a("cumulativeForegroundTime", mkzVar.a() + e().a("cumulativeForegroundTime", 0L));
            c.a();
        }
    }
}
