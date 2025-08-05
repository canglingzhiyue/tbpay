package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SwitchMonitorLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SRC_AMDC = "amdc";
    public static final String SRC_PUSH = "push";
    public static final String SRC_RPC = "rpc";
    public static final String SUB_TYPE_RECV = "recv";
    public static final String SUB_TYPE_UPDATED = "updated";

    public static final void monitorLog(Context context, String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e6c24e", new Object[]{context, str, map, str2});
        } else if (map == null || map.isEmpty()) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  switchIdMap is empty");
        } else {
            String a2 = a(map);
            if (MiscUtils.isEmpty(a2)) {
                LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  switchId is empty");
            } else {
                monitorLog(context, str, a2, str2);
            }
        }
    }

    public static final void monitorLog(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4387a475", new Object[]{context, str, str2, str3});
        } else if (context == null) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  context is null");
        } else if (MiscUtils.isEmpty(str)) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  subType is empty");
        } else if (MiscUtils.isEmpty(str2)) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  switchId is empty");
        } else if (MiscUtils.isEmpty(str3)) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorLog.  source is empty");
        } else {
            try {
                MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                monitorLoggerModel.setSubType("SWITCH");
                monitorLoggerModel.setParam1("1.0");
                monitorLoggerModel.setParam2("-");
                monitorLoggerModel.setParam3(str);
                monitorLoggerModel.getExtPramas().put("switch_id", str2);
                monitorLoggerModel.getExtPramas().put("proc", MiscUtils.getCurShortProcessName(context));
                monitorLoggerModel.getExtPramas().put("source", str3);
                LogCatUtil.info(monitorLoggerModel.getSubType() + "_PERF", monitorLoggerModel.toString() + "\n");
                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            } catch (Throwable th) {
                LogCatUtil.error("SwitchMonitorLogUtil", "monitorLog. Print monitor log error", th);
            }
        }
    }

    public static void monitorCoreSwitchRecvLog(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcab05c4", new Object[]{context, str, str2});
            return;
        }
        try {
            JSONObject convertJSONObject = JSONUtil.convertJSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            putSwitchId(convertJSONObject, linkedHashMap, "stl1");
            monitorLog(context, SUB_TYPE_RECV, linkedHashMap, str2);
        } catch (Throwable th) {
            LogCatUtil.warn("SwitchMonitorLogUtil", "monitorCoreSwitchRecvLog fail", th);
        }
    }

    public static final void monitorSwitchUpdatedLog(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e394e774", new Object[]{context, str});
            return;
        }
        try {
            monitorLog(context, SUB_TYPE_UPDATED, a(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SWITCH_TAG_LOG1), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SWITCH_TAG_LOG2)), str);
        } catch (Throwable th) {
            LogCatUtil.error("SwitchMonitorLogUtil", "monitorSwitchUpdatedLog error", th);
        }
    }

    public static void putSwitchId(JSONObject jSONObject, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4bbff76", new Object[]{jSONObject, map, str});
        } else if (jSONObject == null || MiscUtils.isEmpty(str) || map == null) {
        } else {
            map.put(str, jSONObject.optString(str, TransportConfigureItem.SWITCH_TAG_LOG1.getStringValue()));
        }
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (MiscUtils.isEmpty(key) || MiscUtils.isEmpty(value)) {
                LogCatUtil.warn("SwitchMonitorLogUtil", "buildSwitchId.  stlKey:" + key + "，stlValue:" + value);
            } else {
                sb.append("|");
                sb.append(key);
                sb.append("_");
                sb.append(value);
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return "stl1_" + str + "|stl2_" + str2;
    }
}
