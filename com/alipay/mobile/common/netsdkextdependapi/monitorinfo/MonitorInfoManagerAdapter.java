package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class MonitorInfoManagerAdapter implements MonitorInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void doUploadMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69389d", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void endLinkRecordPhase(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea2c375", new Object[]{this, str, str2, map});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void flushMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2205735", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202200d", new Object[]{this, str, str2, str3, str4, str5, map});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public boolean isTraficConsumeAccept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f297ccf2", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void kickOnNetworkBindService(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154435fe", new Object[]{this, str, new Boolean(z), str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void kickOnNetworkDiagnose(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6188750", new Object[]{this, new Boolean(z), str});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void noteTraficConsume(TraficConsumeModel traficConsumeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3dd93b", new Object[]{this, traficConsumeModel});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void recordException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4c490", new Object[]{this, th});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void recordUnavailable(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f79961", new Object[]{this, str, str2, str3, map});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void setUploadSizeOfFootprint(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd99d38", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void startLinkRecordPhase(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c745bc", new Object[]{this, str, str2, map});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
    public void record(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f949696a", new Object[]{this, monitorLoggerModel});
        } else if (monitorLoggerModel == null) {
        } else {
            Level level = Level.INFO;
            InnerMiscUtil.log(level, "[MonitorInfoManagerAdapter#record] [record] subType=" + monitorLoggerModel.getSubType());
        }
    }
}
