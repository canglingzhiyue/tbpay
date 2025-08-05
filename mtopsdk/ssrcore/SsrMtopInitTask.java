package mtopsdk.ssrcore;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.network.NetworkPropertyServiceImpl;
import mtopsdk.mtop.stat.UploadStatAppMonitorImpl;
import tb.ryv;
import tb.ryw;
import tb.rzf;
import tb.rzs;

/* loaded from: classes.dex */
public class SsrMtopInitTask implements IMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ssr.SsrMtopInitTask";

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeExtraTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4401378a", new Object[]{this, mtopConfig});
        }
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeCoreTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb5a3", new Object[]{this, mtopConfig});
            return;
        }
        TBSdkLog.setLogAdapter(MtopConfig.logAdapterImpl != null ? MtopConfig.logAdapterImpl : new mtopsdk.common.log.a());
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeSsrCoreTask]MtopSDK initcore start. ");
        }
        try {
            if (mtopConfig.uploadStats == null) {
                mtopConfig.uploadStats = new UploadStatAppMonitorImpl();
            }
            mtopConfig.networkPropertyService = new NetworkPropertyServiceImpl();
            mtopsdk.xstate.a.a(mtopConfig.context);
            mtopsdk.xstate.a.a(str, "ttid", mtopConfig.ttid);
            mtopConfig.networkPropertyService.setTtid(mtopConfig.ttid);
            ryv ryvVar = mtopConfig.sign;
            if (ryvVar == null) {
                ryvVar = new ryw();
            }
            ryvVar.a(mtopConfig);
            mtopConfig.sign = ryvVar;
            if (StringUtils.isEmpty(mtopConfig.appKey)) {
                mtopConfig.appKey = ryvVar.a(new ryv.a(mtopConfig.appKeyIndex, mtopConfig.authCode));
            }
            mtopConfig.mFilterManager = new rzf();
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new rzs(mtopConfig.context);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitCoreTask]MtopSDK initCore error", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initCore end");
    }
}
