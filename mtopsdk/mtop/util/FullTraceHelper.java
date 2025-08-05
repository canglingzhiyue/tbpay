package mtopsdk.mtop.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.b;
import com.network.diagnosis.e;
import com.taobao.analysis.v3.k;
import mtopsdk.common.util.TBSdkLog;
import tb.kge;

/* loaded from: classes.dex */
public class FullTraceHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "mtop";
    private static final String TAG = "mtop.FullTraceHelper";
    private static boolean isAnalysisValid;

    static {
        kge.a(-1977659743);
        try {
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            Class.forName("com.network.diagnosis.b");
            isAnalysisValid = true;
        } catch (Throwable unused) {
            isAnalysisValid = false;
            TBSdkLog.e(TAG, "FullTraceAnalysis is not fount.");
        }
    }

    public static void recordReqStart(MtopStatistics mtopStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab48987", new Object[]{mtopStatistics, str});
            return;
        }
        mtopStatistics.bizReqStart = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        Object obj = mtopStatistics.openTraceSpan;
        log(obj, "bizReqStart", "api=" + str);
    }

    public static void recordReqProcessStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588eb948", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.bizReqProcessStart = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        log(mtopStatistics.openTraceSpan, "bizReqProcessStart");
    }

    public static void recordReqSignStart(MtopStatistics mtopStatistics) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a4e980", new Object[]{mtopStatistics});
        } else if (!isAnalysisValid || (a2 = e.a()) == null) {
        } else {
            a2.a().a(mtopStatistics.falcoId);
        }
    }

    public static void recordReqSignFinish(MtopStatistics mtopStatistics) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8241c45", new Object[]{mtopStatistics});
        } else if (!isAnalysisValid || (a2 = e.a()) == null) {
        } else {
            a2.a().b(mtopStatistics.falcoId);
        }
    }

    public static void recordRspProcessStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dc0cb9", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.bizRspProcessStart = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        log(mtopStatistics.openTraceSpan, "bizRspProcessStart");
    }

    public static void recordRspCbDispatch(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9bea7f", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbDispatch = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        log(mtopStatistics.openTraceSpan, "bizRspCbDispatch");
    }

    public static void recordRspCbStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c4044d", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbStart = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        log(mtopStatistics.openTraceSpan, "bizRspCbStart");
    }

    public static void recordRspCbEnd(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71936ac6", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbEnd = System.currentTimeMillis();
        if (!isAnalysisValid) {
            return;
        }
        log(mtopStatistics.openTraceSpan, "bizRspCbEnd");
    }

    public static void recordFinish(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3f77f1", new Object[]{obj, str});
        } else if (!isAnalysisValid) {
        } else {
            log(obj, "bizFinish", str);
        }
    }

    private static void log(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0976f1", new Object[]{obj, str});
        } else {
            log(obj, str, "");
        }
    }

    private static void log(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3703267b", new Object[]{obj, str, str2});
            return;
        }
        if (obj != null && (obj instanceof k)) {
            try {
                ((k) obj).a("module=mtop,stage=" + str + ",content=" + str2);
            } catch (Throwable unused) {
            }
        }
    }
}
