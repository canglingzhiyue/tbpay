package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class MonitorInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void record(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f949696a", new Object[]{monitorLoggerModel});
        } else {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().record(monitorLoggerModel);
        }
    }

    public static void startLinkRecordPhase(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c745bc", new Object[]{str, str2, map});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().startLinkRecordPhase(str, str2, map);
        } catch (Throwable th) {
            if (!InnerMiscUtil.isLoggable(Level.WARNING)) {
                return;
            }
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[startLinkRecordPhase] Exception = " + th.toString(), th);
        }
    }

    public static void endLinkRecordPhase(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea2c375", new Object[]{str, str2, map});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().endLinkRecordPhase(str, str2, map);
        } catch (Throwable th) {
            if (!InnerMiscUtil.isLoggable(Level.WARNING)) {
                return;
            }
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[endLinkRecordPhase] Exception = " + th.toString(), th);
        }
    }

    public static final void noteTraficConsume(TraficConsumeModel traficConsumeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3dd93b", new Object[]{traficConsumeModel});
        } else {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().noteTraficConsume(traficConsumeModel);
        }
    }

    public static final boolean isTraficConsumeAccept(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f297ccf2", new Object[]{str})).booleanValue() : MonitorInfoManagerFactory.getInstance().getDefaultBean().isTraficConsumeAccept(str);
    }

    public static final void flushMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2205735", new Object[0]);
        } else {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().flushMonitorLog();
        }
    }

    public static final void doUploadMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69389d", new Object[0]);
        } else {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().doUploadMonitorLog();
        }
    }

    public static final void recordException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4c490", new Object[]{th});
        } else {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().recordException(th);
        }
    }

    public static final void recordUnavailable(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f79961", new Object[]{str, str2, str3, map});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().recordUnavailable(str, str2, str3, map);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[kickOnNetworkBindService] Exception: " + th.toString());
        }
    }

    public static final void kickOnNetworkBindService(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154435fe", new Object[]{str, new Boolean(z), str2});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().kickOnNetworkBindService(str, z, str2);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[kickOnNetworkBindService] Exception: " + th.toString());
        }
    }

    public static final void setUploadSizeOfFootprint(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd99d38", new Object[]{new Integer(i)});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().setUploadSizeOfFootprint(i);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[setUploadSizeOfFootprint] Exception: " + th.toString());
        }
    }

    public static final void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202200d", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().footprint(str, str2, str3, str4, str5, map);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[setUploadSizeOfFootprint] Exception: " + th.toString());
        }
    }

    public static final void kickOnNetworkDiagnose(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6188750", new Object[]{new Boolean(z), str});
            return;
        }
        try {
            MonitorInfoManagerFactory.getInstance().getDefaultBean().kickOnNetworkDiagnose(z, str);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[kickOnNetworkDiagnose] Exception: " + th.toString());
        }
    }
}
