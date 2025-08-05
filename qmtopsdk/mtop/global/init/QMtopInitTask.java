package qmtopsdk.mtop.global.init;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.deviceid.DeviceIDManager;
import mtopsdk.mtop.domain.EntranceEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.a;
import tb.kge;
import tb.rxf;
import tb.sce;
import tb.sch;
import tb.scj;

/* loaded from: classes9.dex */
public class QMtopInitTask implements IMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "qmtopsdk.QMtopInitTask";

    static {
        kge.a(877532450);
        kge.a(113818985);
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeCoreTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb5a3", new Object[]{this, mtopConfig});
            return;
        }
        if (MtopConfig.logAdapterImpl != null) {
            TBSdkLog.setLogAdapter(MtopConfig.logAdapterImpl);
        }
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initcore start. ");
        }
        try {
            Mtop mtop = mtopConfig.mtopInstance;
            MtopFeatureManager.setMtopFeatureFlag(mtop, 1, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 2, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 4, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 5, true);
            if (mtopConfig.uploadStats == null) {
                mtopConfig.uploadStats = new sch();
            }
            a.a(mtopConfig.context);
            a.a(str, "ttid", mtopConfig.ttid);
            mtopConfig.entrance = EntranceEnum.GW_INNER;
            if (TextUtils.isEmpty(mtopConfig.appKey)) {
                TBSdkLog.e(TAG, str + " [executeInitCoreTask]appkey is null, please call MtopSetting.setAppKey()");
            }
            mtopConfig.processId = Process.myPid();
            mtopConfig.filterManager = new sce();
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new scj(mtopConfig.context, MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor());
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitCoreTask]MtopSDK initCore error", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initCore end");
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeExtraTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4401378a", new Object[]{this, mtopConfig});
            return;
        }
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra start");
        }
        try {
            if (mtopConfig.enableNewDeviceId) {
                DeviceIDManager.getInstance().getDeviceID(mtopConfig.context, mtopConfig.appKey);
            }
            SwitchConfig.getInstance().initConfig(mtopConfig.context);
            rxf.a().a(mtopConfig);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitExtraTask] execute MtopSDK initExtraTask error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra end");
    }
}
