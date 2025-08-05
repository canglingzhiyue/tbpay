package tb;

import android.os.SystemClock;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import tb.mly;

/* loaded from: classes.dex */
public class mmo extends mmc<mlc, mlb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public mmo(MetricContext metricContext, mly mlyVar, mlc mlcVar) {
        super(metricContext, mlyVar, mlcVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{16};
    }

    @Override // tb.mmc
    public void a(mlb mlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b4a155", new Object[]{this, mlbVar});
        } else if (mlbVar == mlb.f31083a) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
            mly.a c = e().c();
            c.a("packageName", mlbVar.i());
            c.a("exitTime", mlbVar.f() - currentTimeMillis);
            c.a("exitTimestampInterval", currentTimeMillis);
            c.a(MspDBHelper.BizEntry.COLUMN_NAME_PID, mlbVar.a());
            c.a("reason", mlbVar.b());
            c.a("subReason", mlbVar.h());
            c.a("status", mlbVar.c());
            c.a("description", mlbVar.g());
            c.a("pss", mlbVar.d());
            c.a("rss", mlbVar.e());
            c.a();
            TLog.loge("MetricKit.AppExitMetric", mlbVar.toString());
        }
    }
}
