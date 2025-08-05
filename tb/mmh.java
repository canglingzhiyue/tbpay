package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;

/* loaded from: classes7.dex */
public class mmh extends mmc<mki, mkj> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public mmh(MetricContext metricContext, mly mlyVar, mki mkiVar) {
        super(metricContext, mlyVar, mkiVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{92};
    }

    @Override // tb.mmc
    public void a(mkj mkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4aa2ccc", new Object[]{this, mkjVar});
        } else if (e().a("powerSaveMode", -1L) != -1) {
        } else {
            e().c().a("powerSaveMode", SystemClock.uptimeMillis()).a();
        }
    }
}
