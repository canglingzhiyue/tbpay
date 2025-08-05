package mtopsdk.mtop.global.init;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.log.a;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.AntiAttackHandlerImpl;
import mtopsdk.mtop.deviceid.DeviceIDManager;
import mtopsdk.mtop.domain.EntranceEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetworkPropertyServiceImpl;
import mtopsdk.mtop.stat.UploadStatAppMonitorImpl;
import tb.arr;
import tb.kge;
import tb.rxf;
import tb.ryk;
import tb.ryv;
import tb.ryw;
import tb.tok;

/* loaded from: classes.dex */
public class InnerMtopInitTask implements IExtendMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerMtopInitTask";

    static {
        kge.a(5437014);
        kge.a(1681207459);
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeCoreTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb5a3", new Object[]{this, mtopConfig});
            return;
        }
        TBSdkLog.setLogAdapter(MtopConfig.logAdapterImpl != null ? MtopConfig.logAdapterImpl : new a());
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
                mtopConfig.uploadStats = new UploadStatAppMonitorImpl();
            }
            mtopConfig.networkPropertyService = new NetworkPropertyServiceImpl();
            mtopsdk.xstate.a.a(mtopConfig.context);
            mtopsdk.xstate.a.a(str, "ttid", mtopConfig.ttid);
            mtopConfig.networkPropertyService.setTtid(mtopConfig.ttid);
            RemoteConfig.getInstance().loadLocalConfig(mtopConfig.context);
            mtopConfig.processId = Process.myPid();
            mtopConfig.filterManager = new ryk();
            if (mtopConfig.antiAttackHandler == null) {
                mtopConfig.antiAttackHandler = new AntiAttackHandlerImpl(mtopConfig.context);
            }
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new mtopsdk.network.impl.a(mtopConfig.context);
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
            arr.a();
            if (mtopConfig.enableNewDeviceId) {
                DeviceIDManager.getInstance().getDeviceID(mtopConfig.context, mtopConfig.appKey);
            }
            SwitchConfig.getInstance().initConfig(mtopConfig.context);
            rxf.a().a(mtopConfig);
            tok.a().a(mtopConfig.context);
            if (SwitchConfig.getInstance().dynamicInjectMtopInstance() && SwitchConfig.getInstance().fetchRemoteMtopInstance() && StringUtils.isStringEqual(mtopConfig.mtopInstance.getInstanceId(), Mtop.Id.INNER)) {
                mtopsdk.instanceconfigs.a.a().a(mtopConfig.context, mtopConfig.appKey);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitExtraTask] execute MtopSDK initExtraTask error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra end");
    }

    @Override // mtopsdk.mtop.global.init.IExtendMtopInitTask
    public void executeSignTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d05edc1", new Object[]{this, mtopConfig});
            return;
        }
        ryv ryvVar = mtopConfig.sign;
        if (ryvVar == null) {
            ryvVar = new ryw();
        }
        ryvVar.a(mtopConfig);
        mtopConfig.entrance = EntranceEnum.GW_INNER;
        mtopConfig.sign = ryvVar;
        if (!StringUtils.isEmpty(mtopConfig.appKey)) {
            return;
        }
        mtopConfig.appKey = ryvVar.a(new ryv.a(mtopConfig.appKeyIndex, mtopConfig.authCode));
    }
}
