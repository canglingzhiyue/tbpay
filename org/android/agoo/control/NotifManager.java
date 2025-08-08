package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.a;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.agoo.TaobaoConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;
import tb.kge;
import tb.mto;
import tb.suq;

/* loaded from: classes.dex */
public class NotifManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACK_MESSAGE = "accs.ackMessage";
    private static final int EVENT_ID = 66001;
    private static final String TAG = "NotifManager";
    private static Context mContext;
    public static String tokenReportDataId;

    public void pingApp(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70acbcf", new Object[]{this, str, str2, str3, new Integer(i)});
        }
    }

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]) : mContext;
    }

    public static /* synthetic */ void access$100(Map map, String str, String str2, boolean z) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde95a93", new Object[]{map, str, str2, new Boolean(z)});
        } else {
            report(map, str, str2, z);
        }
    }

    static {
        kge.a(-437997619);
        mContext = null;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            mContext = context;
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274a8d25", new Object[]{this, msgDO, extraInfo});
        } else if (msgDO == null) {
        } else {
            if (StringUtils.isEmpty(msgDO.msgIds) && StringUtils.isEmpty(msgDO.removePacks) && StringUtils.isEmpty(msgDO.errorCode)) {
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("api", AgooConstants.AGOO_SERVICE_AGOOACK);
                hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
                if (!StringUtils.isEmpty(msgDO.removePacks)) {
                    hashMap.put("del_pack", msgDO.removePacks);
                }
                if (!StringUtils.isEmpty(msgDO.errorCode)) {
                    hashMap.put(RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY, msgDO.errorCode);
                }
                if (!StringUtils.isEmpty(msgDO.type)) {
                    hashMap.put("type", msgDO.type);
                }
                if (!StringUtils.isEmpty(msgDO.extData)) {
                    hashMap.put("ext", msgDO.extData);
                }
                hashMap.put("appkey", Config.getAgooAppKey(mContext));
                hashMap.put("utdid", c.d(mContext));
                if (l.s(mContext)) {
                    hashMap.put("regId", l.q(mContext));
                }
                byte[] bytes = new JSONObject(hashMap).toString().getBytes("UTF-8");
                d.a("accs", BaseMonitor.COUNT_AGOO_ACK, "handlerACKMessage", mto.a.GEO_NOT_SUPPORT);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, bytes, null, null, null, null);
                if (msgDO != null) {
                    accsRequest.setTag(msgDO.msgIds);
                }
                Context context = mContext;
                String sendPushResponse = ACCSManager.getAccsInstance(context, Config.getAgooAppKey(context), Config.getAccsConfigTag(mContext)).sendPushResponse(mContext, accsRequest, extraInfo);
                ALog.i(TAG, "handlerACKMessage,endRequest,dataId=" + sendPushResponse, new Object[0]);
            } catch (Throwable th) {
                ALog.e(TAG, "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th.toString(), new Object[0]);
            }
        }
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd369131", new Object[]{this, msgDO, extraInfo});
        } else if (StringUtils.isEmpty(msgDO.reportStr)) {
        } else {
            try {
                if (Integer.parseInt(msgDO.reportStr) < -1) {
                    return;
                }
                reportMethod(msgDO, extraInfo);
                if (msgDO.isFromCache) {
                    return;
                }
                d.a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, mto.a.GEO_NOT_SUPPORT);
            } catch (Throwable th) {
                ALog.e(TAG, "[report] is error", th, new Object[0]);
            }
        }
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5251c8a", new Object[]{this, msgDO});
        } else if (msgDO == null) {
        } else {
            try {
                d.a("accs", BaseMonitor.COUNT_AGOO_REPORT_ID, msgDO.msgIds, mto.a.GEO_NOT_SUPPORT);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
                Context context = mContext;
                ACCSManager.getAccsInstance(context, Config.getAgooAppKey(context), Config.getAccsConfigTag(mContext)).sendPushResponse(mContext, accsRequest, null);
                ALog.e(TAG, "reportNotifyMessage", "dataId", accsRequest.dataId, "status", msgDO.msgStatus, "evokeAppStatus", Integer.valueOf(msgDO.evokeAppStatus), "messageId", msgDO.msgIds);
                d.a("accs", BaseMonitor.COUNT_AGOO_CLICK, msgDO.msgStatus, mto.a.GEO_NOT_SUPPORT);
                d.a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, mto.a.GEO_NOT_SUPPORT);
            } catch (Throwable th) {
                ALog.e(TAG, "[reportNotifyMessage] is error", th, new Object[0]);
                d.a("accs", "error", th.toString(), mto.a.GEO_NOT_SUPPORT);
            }
        }
    }

    private byte[] convertMsgToBytes(MsgDO msgDO) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5ddb47eb", new Object[]{this, msgDO});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api", "agooReport");
        hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
        hashMap.put("ext", msgDO.extData);
        hashMap.put("status", msgDO.msgStatus);
        if (!StringUtils.isEmpty(msgDO.errorCode)) {
            hashMap.put(RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY, msgDO.errorCode);
        }
        if (!StringUtils.isEmpty(msgDO.type)) {
            hashMap.put("type", msgDO.type);
        }
        if (!StringUtils.isEmpty(msgDO.fromPkg)) {
            hashMap.put("fromPkg", msgDO.fromPkg);
        }
        if (!StringUtils.isEmpty(msgDO.fromAppkey)) {
            hashMap.put(AgooConstants.MESSAGE_FROM_APPKEY, msgDO.fromAppkey);
        }
        if (!StringUtils.isEmpty(msgDO.notifyEnable)) {
            hashMap.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!StringUtils.isEmpty(msgDO.extData)) {
            hashMap.put("ext", msgDO.extData);
        }
        hashMap.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        hashMap.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, String.valueOf(msgDO.triggerType));
        hashMap.put("appVersion", UtilityImpl.getAppVersion(mContext));
        hashMap.put("appkey", Config.getAgooAppKey(mContext));
        hashMap.put("utdid", c.d(mContext));
        hashMap.put("evokeAppStatus", String.valueOf(msgDO.evokeAppStatus));
        hashMap.put("lastActiveTime", String.valueOf(msgDO.lastActiveTime));
        hashMap.put("isGlobalClick", String.valueOf(msgDO.isGlobalClick));
        if (l.s(mContext)) {
            hashMap.put("regId", l.q(mContext));
        }
        return new JSONObject(hashMap).toString().getBytes("UTF-8");
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a7f0f2", new Object[]{this, msgDO, extraInfo});
            return;
        }
        try {
            if (msgDO == null) {
                ALog.e(TAG, "reportMethod msg null", new Object[0]);
                return;
            }
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = mContext;
            ALog.e(TAG, "reportMethod", "dataId", ACCSManager.getAccsInstance(context, Config.getAgooAppKey(context), Config.getAccsConfigTag(mContext)).sendPushResponse(mContext, accsRequest, extraInfo), "status", msgDO.msgStatus, "evokeAppStatus", Integer.valueOf(msgDO.evokeAppStatus), "messageId", msgDO.msgIds);
        } catch (Throwable th) {
            d.a("accs", "error", th.toString(), mto.a.GEO_NOT_SUPPORT);
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7315ed", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            reportThirdPushToken(str, str2, null, z);
        }
    }

    public void reportThirdPushToken(final String str, final String str2, final String str3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5543f123", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
            ALog.i(TAG, "reportThirdPushToken thirdId is empty", new Object[0]);
        } else {
            ALog.e(TAG, "start reportThirdPushToken", "thirdId", str);
            Launcher_InitPush.manuMonitor.isTokenEmpty = false;
            a.a(new Runnable() { // from class: org.android.agoo.control.NotifManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("thirdTokenType", str2);
                        hashMap.put("token", str);
                        hashMap.put("appkey", Config.getAgooAppKey(NotifManager.access$000()));
                        hashMap.put("utdid", c.d(NotifManager.access$000()));
                        if (!StringUtils.isEmpty(str3)) {
                            hashMap.put("vendorSdkVersion", str3);
                        }
                        NotifManager.access$100(hashMap, str, str2, z);
                    } catch (Throwable th) {
                        ALog.e(NotifManager.TAG, "[report] is error", th, new Object[0]);
                    }
                }
            }, m.d() ? 0L : 10L, TimeUnit.SECONDS);
            try {
                Intent intent = new Intent();
                intent.setAction(AgooConstants.ACTION_THIRD_PUSH_TOKEN);
                intent.putExtra(AgooConstants.AGOO_PARAM_THIRD_BRAND_TYPE, str2);
                intent.putExtra(AgooConstants.AGOO_PARAM_THIRD_PUSH_TOKEN, str);
                mContext.sendBroadcast(intent);
            } catch (Exception e) {
                ALog.e(TAG, "[report] send push token broadcast error", e, new Object[0]);
            }
        }
    }

    private static void report(Map<String, Object> map, String str, String str2, boolean z) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a4cc16", new Object[]{map, str, str2, new Boolean(z)});
            return;
        }
        boolean s = l.s(mContext);
        String q = l.q(mContext);
        if (s) {
            map.put("cmd", "thirdTokenReport");
            map.put("regId", q);
        }
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, getServiceId(mContext, "agooTokenReport"), new JSONObject(map).toString().getBytes("UTF-8"), null, null, null, null);
        Context context = mContext;
        com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, Config.getAgooAppKey(context), Config.getAccsConfigTag(mContext));
        if (z) {
            tokenReportDataId = accsInstance.sendData(mContext, accsRequest);
        } else {
            tokenReportDataId = accsInstance.sendPushResponse(mContext, accsRequest, new TaoBaseService.ExtraInfo());
        }
        ALog.e(TAG, "reportThirdPushToken, dataId=" + tokenReportDataId + ",thirdId=" + str + ",type=" + str2, new Object[0]);
    }

    public void reportThirdPushToken(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149855c7", new Object[]{this, str, str2});
        } else {
            reportThirdPushToken(str, str2, true);
        }
    }

    public void doUninstall(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb4e7ec", new Object[]{this, str, new Boolean(z)});
            return;
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "doUninstall", mto.a.GEO_NOT_SUPPORT);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pack", str);
            hashMap.put("appkey", Config.getAgooAppKey(mContext));
            hashMap.put("utdid", c.d(mContext));
            if (l.s(mContext)) {
                hashMap.put("cmd", "uninstallReport");
                hashMap.put("regId", l.q(mContext));
            }
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, getServiceId(mContext, "agooKick"), new JSONObject(hashMap).toString().getBytes("UTF-8"), null, null, null, null);
            Context context = mContext;
            ACCSManager.getAccsInstance(context, Config.getAgooAppKey(context), Config.getAccsConfigTag(mContext)).sendPushResponse(mContext, accsRequest, new TaoBaseService.ExtraInfo());
        } catch (Throwable th) {
            ALog.e(TAG, "[doUninstall] is error", th, new Object[0]);
        }
    }

    private boolean isAppInstalled(String str) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aa872f8", new Object[]{this, str})).booleanValue();
        }
        try {
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        packageInfo = mContext.getPackageManager().getPackageInfo(str, 0);
        if (packageInfo == null) {
            return false;
        }
        ALog.i(TAG, "isAppInstalled true..", new Object[0]);
        return true;
    }

    private String getVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a58234d", new Object[]{this, str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return "null";
            }
            String str2 = mContext.getPackageManager().getPackageInfo(str, 0).versionName;
            ALog.d(TAG, "getVersion###版本号为 : " + str2, new Object[0]);
            return str2;
        } catch (Throwable unused) {
            return "null";
        }
    }

    public static String getServiceId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7476b74f", new Object[]{context, str}) : l.s(context) ? TaobaoConstants.SERVICE_ID_AGOO : str;
    }
}
