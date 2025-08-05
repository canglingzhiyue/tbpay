package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.ssrcore.MtopSsrStatistics;
import mtopsdk.ssrcore.b;
import mtopsdk.ssrcore.callback.SsrFinishEvent;
import mtopsdk.ssrcore.d;

/* loaded from: classes9.dex */
public class rzn extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_FINISHED = 2;
    public static final int ON_RECEIVE_DATA = 1;
    public static final int ON_RESPONSE = 0;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f33435a;

    private rzn(Looper looper) {
        super(looper);
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]);
        }
        if (f33435a == null) {
            synchronized (rzn.class) {
                if (f33435a == null) {
                    f33435a = new rzn(Looper.getMainLooper());
                }
            }
        }
        return f33435a;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        MtopSsrStatistics mtopSsrStatistics;
        MtopSsrStatistics.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        rzo rzoVar = (rzo) message.obj;
        String str = "";
        if (rzoVar == null) {
            TBSdkLog.e("ssr.SsrHandlerMgr", str, "SsrHandlerMgr is null");
            return;
        }
        if (rzoVar.b != null) {
            str = rzoVar.b.a();
            if (rzoVar.b.e()) {
                TBSdkLog.i("ssr.SsrHandlerMgr", str, "The request of SsrBusiness is cancelled.");
                return;
            }
        }
        if (message.what == 0 && rzoVar.b != null) {
            rzoVar.b.a(rzoVar.d, rzoVar.e, rzoVar.f);
            message.obj = null;
        } else if (message.what == 1 && rzoVar.b != null) {
            rzoVar.b.a(rzoVar.d, rzoVar.g);
            message.obj = null;
        } else {
            if (message.what == 2) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("ssr.SsrHandlerMgr", str, "onReceive: ON_FINISHED.");
                }
                long j = 0;
                MtopEvent mtopEvent = rzoVar.f33436a;
                if (mtopEvent instanceof SsrFinishEvent) {
                    mtopSsrStatistics = ((SsrFinishEvent) mtopEvent).statistics;
                    aVar = mtopSsrStatistics != null ? mtopSsrStatistics.d() : null;
                } else {
                    mtopSsrStatistics = null;
                    aVar = null;
                }
                if (aVar != null) {
                    j = mtopSsrStatistics.a();
                    d.e(mtopSsrStatistics);
                }
                rzoVar.b.a(rzoVar.c);
                if (aVar != null) {
                    aVar.c = mtopSsrStatistics.a() - j;
                    d.f(mtopSsrStatistics);
                }
                if (mtopSsrStatistics != null) {
                    mtopSsrStatistics.a(true);
                    mtopSsrStatistics.g();
                }
            }
            message.obj = null;
        }
    }

    public static rzo a(MtopEvent mtopEvent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rzo) ipChange.ipc$dispatch("3dcb1266", new Object[]{mtopEvent, bVar}) : new rzo(mtopEvent, bVar);
    }

    public static rzo a(b bVar, mtj mtjVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rzo) ipChange.ipc$dispatch("e151a07e", new Object[]{bVar, mtjVar, new Integer(i), map}) : new rzo(bVar, mtjVar, i, map);
    }

    public static rzo a(b bVar, mtj mtjVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rzo) ipChange.ipc$dispatch("9505b7f9", new Object[]{bVar, mtjVar, bArr}) : new rzo(bVar, mtjVar, bArr);
    }
}
