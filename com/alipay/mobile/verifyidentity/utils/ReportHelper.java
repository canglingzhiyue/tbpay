package com.alipay.mobile.verifyidentity.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.engine.TaskManager;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.DeviceInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.alipay.mobileic.core.model.rpc.MICReportResponse;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ReportHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String CMStart = "CMStart";
    public static String KEY_LAST_REPORT_TIME = "KEY_LAST_REPORT_TIME";

    /* renamed from: a  reason: collision with root package name */
    private static String f6101a = "KEY_INFO_FOR_REPORTER";
    private static Map<String, String> b = null;
    public static String beHCert = "beHCert";
    private static List<String> c = null;
    public static String closeColdStartIfaa = "closeColdStartIfaa";
    public static String closeEngineCancelNotify = "closeEngineCancelNotify";
    public static String closeFaceBackgroudAction = "closeFaceBackgroudAction";
    public static String closeFpStatusAction = "closeFpStatusAction";
    public static String closeGetPwdDelay = "closeGetPwdDelay";
    public static String closeLogging = "closeLogging";
    public static String closeMultiThread = "closeMultiThread";
    public static String closeNewFpTrace = "closeNewFpTrace";
    public static String closePayLogReport = "closePayLogReport";
    public static String closeShowIntelligent = "closeShowIntelligent";
    public static String closeShowSortLoading = "closeShowSortLoading";
    public static String closeSimpleMultiThread = "closeSimpleMultiThread";
    public static String closeSnTimeout = "closeSnTimeout";
    public static String closeTimeoutControl = "closeTimeoutControl";
    public static String closemPaasFullLog = "closemPaasFullLog";
    public static String closemPaasThreadPool = "closemPaasThreadPool";
    public static String collectSecCam = "collectSecCam";
    public static Set<String> configKeyCacheSupported = null;
    public static List<String> configKeyList = null;
    public static String containsTokens = "containsTokens";
    private static List<String> d = null;
    public static String enableMultiCashierFixPolice = "enableMultiCashierFixPolice";
    public static String fp2PwdOnRpc = "fp2PwdOnRpc";
    public static String fpDelay = "fpDelay";
    public static String maxLogNum = "maxLogNum";
    public static String noBmiTimeOut = "noBmiTimeOut";
    public static String noMultiTask = "noMultiTask";
    public static String noOthersOnFace = "noOthersOnFace";
    public static String noUpSceneVID = "noUpSceneVID";
    public static String oldLocSZ = "oldLocSZ";
    public static String openCertSnConfig = "openCertSnConfig";
    public static String openOldAlert = "openOldAlert";
    public static String preCheckFp = "preCheckFp";
    public static String remindNext = "remindNext";
    public static String removeIdpData = "removeIdpData";
    public static String removeNewFaceEnv = "removeNewFaceEnv";
    public static String removeSimData = "removeSimData";
    public static String secdataOriIF = "secdataOriIF";
    public static String sentryConfig = "sentryConfig";
    public static String stopBiochange = "stopBiochange";
    public static String stopFrontReport = "stopFrontReport";
    public static String stopNewLoading = "stopNewLoading";
    public static String stopNewTid = "stopNewTid";
    public static String stopReport = "stopReport";
    public static String synKillPre = "synKillPre1";

    public static /* synthetic */ boolean access$000(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6620177", new Object[]{str, new Boolean(z)})).booleanValue() : a(str, z);
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f6101a;
    }

    static {
        ArrayList arrayList = new ArrayList();
        configKeyList = arrayList;
        arrayList.add(stopFrontReport);
        configKeyList.add(stopReport);
        configKeyList.add(containsTokens);
        configKeyList.add(CMStart);
        configKeyList.add(secdataOriIF);
        configKeyList.add(oldLocSZ);
        configKeyList.add(closeLogging);
        configKeyList.add(noUpSceneVID);
        configKeyList.add(maxLogNum);
        configKeyList.add(synKillPre);
        configKeyList.add(noOthersOnFace);
        configKeyList.add(preCheckFp);
        configKeyList.add(fpDelay);
        configKeyList.add(remindNext);
        configKeyList.add(beHCert);
        configKeyList.add(noMultiTask);
        configKeyList.add(fp2PwdOnRpc);
        configKeyList.add(closePayLogReport);
        configKeyList.add(noBmiTimeOut);
        configKeyList.add(removeSimData);
        configKeyList.add(removeIdpData);
        configKeyList.add(closeMultiThread);
        configKeyList.add(removeNewFaceEnv);
        configKeyList.add(closemPaasFullLog);
        configKeyList.add(closeColdStartIfaa);
        configKeyList.add(closeEngineCancelNotify);
        configKeyList.add(closeSnTimeout);
        configKeyList.add(closemPaasThreadPool);
        configKeyList.add(closeTimeoutControl);
        configKeyList.add(sentryConfig);
        configKeyList.add(openOldAlert);
        configKeyList.add(closeSimpleMultiThread);
        configKeyList.add(closeNewFpTrace);
        configKeyList.add(closeGetPwdDelay);
        configKeyList.add(closeShowIntelligent);
        configKeyList.add(closeFaceBackgroudAction);
        configKeyList.add(closeFpStatusAction);
        configKeyList.add(stopNewLoading);
        configKeyList.add(stopNewTid);
        configKeyList.add(collectSecCam);
        configKeyList.add(enableMultiCashierFixPolice);
        configKeyList.add(stopBiochange);
        HashSet hashSet = new HashSet();
        configKeyCacheSupported = hashSet;
        hashSet.add(closeLogging);
        b = Collections.synchronizedMap(new HashMap());
        ArrayList arrayList2 = new ArrayList(6);
        c = arrayList2;
        arrayList2.add("enable");
        c.add("delay");
        c.add(Constants.Name.INTERVAL);
        c.add("expire");
        c.add("capacity");
        c.add("timeout");
        d = new ArrayList();
    }

    public static void reportInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08e113", new Object[]{str});
            return;
        }
        try {
            reportInfo(false, str);
        } catch (Throwable th) {
            VerifyLogCat.i("ReportHelper", "report info error:" + th.getMessage());
        }
    }

    public static void reportInfo(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48098175", new Object[]{new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reportOccasion", str);
        }
        reportInfo(z, hashMap);
    }

    public static void reportInfo(final boolean z, final HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6f2f68", new Object[]{new Boolean(z), hashMap});
            return;
        }
        VerifyLogCat.i("ReportHelper", String.format("ReportHelper.reportInfo() | isForced: %s", Boolean.valueOf(z)));
        try {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.utils.ReportHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        synchronized ("ReportHelper") {
                            if (!ReportHelper.access$000("", z)) {
                                return;
                            }
                            Thread.sleep(5000L);
                            VerifyLogCat.i("ReportHelper", "5s等待结束，开始准备上报");
                            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
                            MICReportRequest mICReportRequest = new MICReportRequest();
                            mICReportRequest.reportData = new HashMap();
                            String envinfoForReporter = ReportHelper.getEnvinfoForReporter();
                            if (!ReportHelper.access$000(envinfoForReporter, z)) {
                                return;
                            }
                            mICReportRequest.reportData.put("envData", envinfoForReporter);
                            if (hashMap != null && !hashMap.isEmpty()) {
                                mICReportRequest.reportData.putAll(hashMap);
                            }
                            VerifyLogCat.i("ReportHelper", "[ENV_INFO_FOR_REPORTER] : " + envinfoForReporter);
                            MICReportResponse report = mICRpcServiceBiz.report(mICReportRequest);
                            VerifyLogCat.i("ReportHelper", JSON.toJSONString(report));
                            ReportHelper.updateStopReport(null, report);
                            ReportHelper.updateReporterLocalInfo(null, ReportHelper.KEY_LAST_REPORT_TIME, String.valueOf(System.currentTimeMillis()));
                            ReportHelper.updateReporterLocalInfo(null, ReportHelper.access$100(), CipherHelper.bytes2Hex(CipherHelper.encrypt_SHA(envinfoForReporter, "md5")));
                        }
                    } catch (Exception e) {
                        VerifyLogCat.e("ReportHelper", e);
                    }
                }
            }, "viReportInfo");
        } catch (Throwable th) {
            VerifyLogCat.e("ReportHelper", th);
        }
    }

    private static synchronized boolean a(String str, boolean z) {
        synchronized (ReportHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
            } else if (!z && "Y".equalsIgnoreCase(getReportFlag(null, stopReport))) {
                VerifyLogCat.i("ReportHelper", "服务端已下发关闭指令");
                return false;
            } else if (!TextUtils.isEmpty(str)) {
                if (TextUtils.equals(getReportFlag(null, f6101a), CipherHelper.bytes2Hex(CipherHelper.encrypt_SHA(str, "md5")))) {
                    VerifyLogCat.i("ReportHelper", "envData没有变化，不上报");
                    return false;
                }
                VerifyLogCat.i("ReportHelper", "envData有变化，需要上报");
                return true;
            } else {
                long j = 0;
                String reportFlag = getReportFlag(null, KEY_LAST_REPORT_TIME);
                if (!TextUtils.isEmpty(reportFlag)) {
                    j = Long.valueOf(reportFlag).longValue();
                }
                if (System.currentTimeMillis() - j >= 60000) {
                    return true;
                }
                VerifyLogCat.i("ReportHelper", "envData上报间隔小于1分钟，不上报");
                return false;
            }
        }
    }

    public static String getEnvinfoForReporter() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73420f74", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray(13);
        JSONObject fpSecdataJO = EnvInfoUtil.getFpSecdataJO(false);
        String str = "";
        if (fpSecdataJO != null) {
            jSONArray.add(0, fpSecdataJO);
        } else {
            jSONArray.add(0, str);
        }
        if ("Y".equalsIgnoreCase(getReportFlag(null, containsTokens))) {
            VerifyLogCat.i("ReportHelper", "服务端已下发[需要]上报Tokens的指令");
        } else {
            z = true;
        }
        a(jSONArray, 1, AppInfo.getInstance().getApdid());
        a(jSONArray, 2, z ? str : AppInfo.getInstance().getApdidToken());
        a(jSONArray, 3, AppInfo.getInstance().getAppName());
        a(jSONArray, 4, AppInfo.getInstance().getAppVersion());
        a(jSONArray, 5, AppInfo.getInstance().getViSdkVersion());
        a(jSONArray, 6, DeviceInfo.getOsVersion());
        a(jSONArray, 7, AppInfo.getInstance().getDeviceType());
        a(jSONArray, 8, DeviceInfo.getMobileManufacturer());
        a(jSONArray, 9, DeviceInfo.getMobileModel());
        a(jSONArray, 10, EnvInfoUtil.getBioMetaInfo());
        a(jSONArray, 11, EnvInfoUtil.getBirdNestInfo());
        a(jSONArray, 12, EnvInfoUtil.getIsSupportFP());
        if (!z) {
            str = AppInfo.getInstance().getUmidToken();
        }
        a(jSONArray, 13, str);
        return jSONArray.toJSONString();
    }

    public static String getReportFlag(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ad8c6b9", new Object[]{str}) : getReportFlag(null, str);
    }

    public static String getReportFlag(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58a1360b", new Object[]{context, str});
        }
        if (context == null && (context = MicroModuleContext.getInstance().getContext()) == null) {
            return "";
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences.getString("VI_" + str, "");
    }

    public static JSONObject getAllSwitchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("264cfcc8", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (String str : configKeyList) {
            jSONObject.put(str, (Object) getReportFlag(str));
        }
        TimeCostLog.log("ReportHelper", "getAllSwitchConfig耗时", elapsedRealtime);
        return jSONObject;
    }

    public static void updateStopReport(Context context, MICReportResponse mICReportResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63de8e19", new Object[]{context, mICReportResponse});
        } else if (mICReportResponse == null) {
            VerifyLogCat.i("ReportHelper", "response is null");
        } else {
            updateConfig(context, mICReportResponse.config, false);
        }
    }

    public static void updateConfig(Context context, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97a8468", new Object[]{context, mICRpcResponse});
        } else {
            updateConfig(context, mICRpcResponse, false);
        }
    }

    public static void updateConfig(Context context, MICRpcResponse mICRpcResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d6bb6c", new Object[]{context, mICRpcResponse, new Boolean(z)});
        } else if (mICRpcResponse == null) {
            VerifyLogCat.i("ReportHelper", "response is null");
        } else {
            updateConfig(context, mICRpcResponse.config, z);
        }
    }

    public static synchronized void updateConfig(Context context, Map<String, String> map, boolean z) {
        synchronized (ReportHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5046785", new Object[]{context, map, new Boolean(z)});
                return;
            }
            if (map != null && map.size() > 0) {
                HashMap hashMap = new HashMap();
                for (String str : configKeyList) {
                    if (configKeyCacheSupported.contains(str)) {
                        if (TaskManager.getInstance().needCleanTasks()) {
                            b.put(str, map.get(str));
                            VerifyLogCat.i("ReportHelper", str + " 在核身过程中不立即更新，已暂存，后续更新");
                        } else {
                            VerifyLogCat.i("ReportHelper", str + " 当前没有核身任务进行，立即更新");
                        }
                    }
                    if (!str.equals(sentryConfig)) {
                        hashMap.put(str, map.get(str));
                    } else {
                        map.get(str);
                    }
                }
                updateReporterLocalInfo(context, hashMap, (List<String>) null, z);
                return;
            }
            VerifyLogCat.i("ReportHelper", "返回信息不满足更新要求，本次不更新");
        }
    }

    public static synchronized void updateConfigByCacheIfNeeded() {
        synchronized (ReportHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8db2c459", new Object[0]);
                return;
            }
            HashMap hashMap = new HashMap();
            Context context = MicroModuleContext.getInstance().getContext();
            for (String str : configKeyCacheSupported) {
                if (b.containsKey(str)) {
                    hashMap.put(str, b.get(str));
                    VerifyLogCat.i("ReportHelper", str + "已更新到本地");
                }
            }
            updateReporterLocalInfo(context, (Map<String, String>) hashMap, (List<String>) null, true);
        }
    }

    public static void updateReporterLocalInfo(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a372a86", new Object[]{context, str, str2});
        } else {
            updateReporterLocalInfo(context, str, str2, false);
        }
    }

    public static void updateReporterLocalInfo(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caed90e", new Object[]{context, str, str2, new Boolean(z)});
        } else if (context == null && (context = MicroModuleContext.getInstance().getContext()) == null) {
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (z) {
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("VI_" + str, str2).apply();
            } else {
                SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
                edit2.putString("VI_" + str, str2).commit();
            }
            VerifyLogCat.i("ReportHelper", String.format("更新VI_%s为：%s", str, str2));
        }
    }

    public static void updateReporterLocalInfo(Context context, Map<String, String> map, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ea4190", new Object[]{context, map, list, new Boolean(z)});
        } else if (context != null || (context = MicroModuleContext.getInstance().getContext()) != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            if (map != null && !map.isEmpty()) {
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    edit.putString("VI_" + str, str2);
                    VerifyLogCat.i("ReportHelper", String.format("更新VI_%s为：%s", str, str2));
                }
            }
            if (list != null && !list.isEmpty()) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String str3 = "VI_" + it.next();
                    if (defaultSharedPreferences.contains(str3)) {
                        edit.remove(str3);
                        VerifyLogCat.i("ReportHelper", "已删除：" + str3);
                    }
                }
            }
            if (z) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
    }

    private static void a(JSONArray jSONArray, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9183d27d", new Object[]{jSONArray, new Integer(i), str});
            return;
        }
        jSONArray.add(i, !TextUtils.isEmpty(str) ? str : "");
        VerifyLogCat.i("ReportHelper", String.format("addToJsonarray | index: %s, value: %s ", Integer.valueOf(i), str));
    }
}
