package mtopsdk.ssrcore.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.ssrcore.MtopSsrStatistics;
import mtopsdk.ssrcore.b;
import mtopsdk.ssrcore.d;
import tb.mtj;
import tb.mtk;
import tb.rzn;
import tb.rzo;

/* loaded from: classes9.dex */
public class SsrCallbackImpl implements SsrCallbackListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ssr.SsrCallbackImpl";
    public b ssrBusiness;

    public SsrCallbackImpl(b bVar) {
        this.ssrBusiness = bVar;
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onResponse(mtj mtjVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar, new Integer(i), map});
            return;
        }
        String a2 = this.ssrBusiness.a();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, a2, "SSR onResponse  received.");
        }
        if (this.ssrBusiness.b.handler != null) {
            this.ssrBusiness.a(mtjVar, i, map);
        } else {
            rzn.a().obtainMessage(0, rzn.a(this.ssrBusiness, mtjVar, i, map)).sendToTarget();
        }
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onReceiveData(mtj mtjVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d536689", new Object[]{this, mtjVar, bArr});
            return;
        }
        String a2 = this.ssrBusiness.a();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, a2, "SSR onReceiveData  received.");
        }
        if (this.ssrBusiness.b.handler != null) {
            this.ssrBusiness.a(mtjVar, bArr);
        } else {
            rzn.a().obtainMessage(1, rzn.a(this.ssrBusiness, mtjVar, bArr)).sendToTarget();
        }
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onFinish(SsrFinishEvent ssrFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab39d204", new Object[]{this, ssrFinishEvent});
            return;
        }
        String a2 = this.ssrBusiness.a();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, a2, "SSR onFinish received.");
        }
        if (this.ssrBusiness.e()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, a2, "The request of SsrBusiness is canceled.");
            }
            commitFullTrace(ssrFinishEvent, a2);
        }
        if (ssrFinishEvent == null) {
            TBSdkLog.e(TAG, a2, "SsrCallbackImpl is null.");
            return;
        }
        mtk ssrResponse = ssrFinishEvent.getSsrResponse();
        if (ssrResponse == null) {
            TBSdkLog.e(TAG, a2, "The SsrResponse of SsrFinishEvent is null.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        rzo a3 = rzn.a(ssrFinishEvent, this.ssrBusiness);
        a3.c = ssrResponse;
        MtopSsrStatistics mtopSsrStatistics = ssrFinishEvent.statistics;
        if (mtopSsrStatistics != null) {
            MtopSsrStatistics.a d = mtopSsrStatistics.d();
            d.f25031a = currentTimeMillis - this.ssrBusiness.d;
            d.b = mtopSsrStatistics.a() - mtopSsrStatistics.z;
        }
        if (this.ssrBusiness.b.handler != null) {
            if (mtopSsrStatistics != null) {
                d.e(mtopSsrStatistics);
            }
            a3.b.a(a3.c);
            if (mtopSsrStatistics == null) {
                return;
            }
            d.f(mtopSsrStatistics);
            mtopSsrStatistics.g();
            mtopSsrStatistics.a(true);
            return;
        }
        if (mtopSsrStatistics != null) {
            d.d(mtopSsrStatistics);
        }
        rzn.a().obtainMessage(2, a3).sendToTarget();
    }

    private void commitFullTrace(SsrFinishEvent ssrFinishEvent, String str) {
        MtopSsrStatistics mtopSsrStatistics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59c7001", new Object[]{this, ssrFinishEvent, str});
        } else if (ssrFinishEvent == null) {
        } else {
            try {
                if (ssrFinishEvent.getSsrResponse() == null || (mtopSsrStatistics = ssrFinishEvent.statistics) == null) {
                    return;
                }
                mtopSsrStatistics.s = true;
                d.e(mtopSsrStatistics);
                d.f(mtopSsrStatistics);
                mtopSsrStatistics.g();
            } catch (Throwable th) {
                TBSdkLog.e(TAG, str, "commitFullTrace error.", th);
            }
        }
    }
}
