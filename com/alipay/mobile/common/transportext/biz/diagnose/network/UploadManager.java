package com.alipay.mobile.common.transportext.biz.diagnose.network;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class UploadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void access$000(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0eae209", new Object[]{monitorLoggerModel});
        } else {
            b(monitorLoggerModel);
        }
    }

    public static /* synthetic */ void access$100(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866bbca", new Object[]{monitorLoggerModel});
        } else {
            a(monitorLoggerModel);
        }
    }

    public static void writeLog(List<String> list, final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b617c", new Object[]{list, str, new Integer(i)});
        } else if (list == null || list.isEmpty()) {
        } else {
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new String[list.size()]);
            Collections.copy(arrayList, list);
            if (str == null) {
                str = "0.0";
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.UploadManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                        monitorLoggerModel.setSubType("NetDiago");
                        monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("NetDiago"));
                        monitorLoggerModel.setParam2("INFO");
                        monitorLoggerModel.getExtPramas().put("diagVer", str);
                        monitorLoggerModel.getExtPramas().put("diagType", "diagnose");
                        if (NetworkUtils.isVpnUsed()) {
                            monitorLoggerModel.getExtPramas().put("VPN", "T");
                        }
                        int i2 = 0;
                        for (String str2 : arrayList) {
                            if (!StringUtils.isEmpty(str2)) {
                                i2++;
                                monitorLoggerModel.addExtParam("RES_" + i2, str2);
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                        if (3 == i) {
                            UploadManager.access$000(monitorLoggerModel);
                        } else {
                            UploadManager.access$100(monitorLoggerModel);
                        }
                        LogCatUtil.debug("DIAGNOSE-UPLOAD", monitorLoggerModel.toString());
                    } catch (Exception e) {
                        LogCatUtil.warn("DIAGNOSE-UPLOAD", e.toString());
                    }
                }
            });
        }
    }

    private static void a(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84505d7a", new Object[]{monitorLoggerModel});
        } else {
            MonitorLoggerUtils.uploadDiagLog(monitorLoggerModel);
        }
    }

    private static void b(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c9b37b", new Object[]{monitorLoggerModel});
        } else {
            MonitorLoggerUtils.uploadAutoDiagLog(monitorLoggerModel);
        }
    }
}
