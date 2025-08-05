package com.alipay.mobile.verifyidentity.engine;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.DebugViewer;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.utils.LogReportHelper;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleMetaInfo;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class VerifyIdentityEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5869a = "VerifyIdentityEngine";
    private static VerifyIdentityEngine b;

    private VerifyIdentityEngine(Context context) {
        Context applicationContext = context.getApplicationContext();
        MicroModuleContext.getInstance().attachContext(applicationContext);
        List<ModuleDescription> modules = new ModuleMetaInfo().getModules();
        if (modules != null && !modules.isEmpty()) {
            Iterator<ModuleDescription> it = modules.iterator();
            while (it.hasNext()) {
                MicroModuleContext.getInstance().addDescription(it.next());
            }
        }
        if (VIUtils.isInExport()) {
            VIUtils.initLogger(context);
            VerifyLogCat.i(f5869a, "初始化日志");
        } else {
            VerifyLogCat.i(f5869a, "不初始化日志");
        }
        VerifyLogCat.init(context.getPackageName());
        if (PlatformUtils.isDebug(context)) {
            DebugViewer.getInstance().init(applicationContext);
            DebugViewer.getInstance().start();
        }
    }

    public static synchronized VerifyIdentityEngine getInstance(Context context) {
        synchronized (VerifyIdentityEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerifyIdentityEngine) ipChange.ipc$dispatch("cf2fd80b", new Object[]{context});
            }
            if (b == null) {
                b = new VerifyIdentityEngine(context);
            }
            return b;
        }
    }

    public void setAppDataProvider(AppDataProvider appDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da112b6", new Object[]{this, appDataProvider});
        } else {
            AppInfo.getInstance().setDataProvider(appDataProvider);
        }
    }

    public synchronized void startVerifyByToken(String str, String str2, Bundle bundle, VerifyIdentityListener verifyIdentityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f3c7ce", new Object[]{this, str, str2, bundle, verifyIdentityListener});
            return;
        }
        String str3 = f5869a;
        VerifyLogCat.d(str3, str2 + " add token: " + str);
        if (TextUtils.isEmpty(str)) {
            if (verifyIdentityListener != null) {
                verifyIdentityListener.onVerifyResult(str, str2, new VerifyIdentityResult("2000"));
            }
        } else if (TaskManager.getInstance().preCheckTaskQueue(str, VerifyType.TOKEN)) {
            TaskManager.getInstance().addTaskInstace(a(VerifyType.TOKEN, "", str, str2, bundle, verifyIdentityListener, null));
        } else {
            if (verifyIdentityListener != null) {
                verifyIdentityListener.onVerifyResult(str, str2, new VerifyIdentityResult("2004"));
            }
        }
    }

    public synchronized void startVerifyByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5956121e", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId});
            return;
        }
        VerifyIdentityTask a2 = a(str, str2, str3, bundle, vIListenerByVerifyId, null);
        if (a2 == null) {
            String str4 = f5869a;
            VerifyLogCat.w(str4, "[startVerifyByVerifyId] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(a2);
    }

    public synchronized void startVerifyByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdbd6a7", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
            return;
        }
        VerifyIdentityTask a2 = a(str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel);
        if (a2 == null) {
            String str4 = f5869a;
            VerifyLogCat.w(str4, "Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(a2);
    }

    private synchronized VerifyIdentityTask a(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("6972ce84", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
        }
        String str4 = f5869a;
        VerifyLogCat.d(str4, str3 + " add verifyId: " + str + " token: " + str2);
        if (TextUtils.isEmpty(str)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str3, new VerifyIdentityResult("2000"));
            }
            return null;
        } else if (!TaskManager.getInstance().preCheckTaskQueue(str, VerifyType.VERIFYID)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str3, new VerifyIdentityResult("2004"));
            }
            return null;
        } else {
            VerifyIdentityTask a2 = a(VerifyType.VERIFYID, str, str2, str3, bundle, null, vIListenerByVerifyId);
            a2.setVIMessageChannel(vIMessageChannel);
            return a2;
        }
    }

    public synchronized void fastVerifyWithInitRequest(String str, String str2, String str3, String str4, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9165220", new Object[]{this, str, str2, str3, str4, bundle, vIListenerByVerifyId, str5});
            return;
        }
        bundle.putString("logonId", str);
        String str6 = f5869a;
        VerifyLogCat.d(str6, "sceneId: " + str2 + ", bizId: " + str3 + ", bizRequestData: " + str4);
        if (TextUtils.isEmpty(str2)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult("", "", str5, new VerifyIdentityResult("2000"));
            }
            return;
        }
        VerifyType verifyType = VerifyType.FAST_INIT;
        VerifyIdentityTask verifyIdentityTask = new VerifyIdentityTask();
        verifyIdentityTask.setVerifyType(verifyType);
        verifyIdentityTask.sceneId = str2;
        verifyIdentityTask.bizId = str3;
        verifyIdentityTask.bizRequestData = str4;
        verifyIdentityTask.setExtParams(bundle);
        verifyIdentityTask.setVidListener(vIListenerByVerifyId);
        TaskManager.getInstance().addTaskInstace(verifyIdentityTask);
    }

    public synchronized void fastVerifyWithModuleRequest(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6918f2", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6});
            return;
        }
        VerifyIdentityTask a2 = a(str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, null);
        if (a2 == null) {
            String str7 = f5869a;
            VerifyLogCat.w(str7, "[fastVerifyWithModuleRequest] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(a2);
    }

    public synchronized void fastVerifyWithModuleRequest(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfb0053", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel});
            return;
        }
        VerifyIdentityTask a2 = a(str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel);
        if (a2 == null) {
            String str7 = f5869a;
            VerifyLogCat.w(str7, "[fastVerifyWithModuleRequest] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(a2);
    }

    private synchronized VerifyIdentityTask a(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("9722b37a", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel});
        }
        String str7 = f5869a;
        VerifyLogCat.d(str7, " add verifyId: " + str + " token: " + str2);
        if (TextUtils.isEmpty(str)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str6, new VerifyIdentityResult("2000"));
            }
            return null;
        }
        VerifyIdentityTask a2 = a(VerifyType.FAST_DIRECT, str, str2, "", bundle, null, vIListenerByVerifyId);
        a2.setEntryModuleName(str3);
        a2.setEntryModuleData(str4);
        a2.bizRequestData = str5;
        a2.setVIMessageChannel(vIMessageChannel);
        if (vIMessageChannel != null) {
            VerifyLogCat.i(f5869a, "直接起模块时若有rpc代理，则不再上报环境参数");
            a2.needReportEnvInfo = false;
        }
        if (str.endsWith("_site")) {
            a2.isIPay = true;
        } else {
            a2.isIPay = false;
        }
        return a2;
    }

    public synchronized void unifiedStartByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48db9809", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId});
        } else {
            unifiedStartByVerifyId(str, str2, str3, bundle, vIListenerByVerifyId, null);
        }
    }

    public synchronized void unifiedStartByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c4e89c", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
            return;
        }
        String str4 = f5869a;
        VerifyLogCat.i(str4, "unifiedStartByVerifyId | verifyId: " + str + ", verifyData:" + str2);
        if (TextUtils.isEmpty(str2)) {
            VerifyLogCat.i(f5869a, "verifyData，切到标准VerifyId模式");
            startVerifyByVerifyId(str, null, "", bundle, vIListenerByVerifyId, vIMessageChannel);
            return;
        }
        VerifyLogCat.i(f5869a, "开始解析verifyData");
        ModuleDataModel parse = ModuleDataModel.parse(str2);
        if (parse == null) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, "", "", new VerifyIdentityResult("2002"));
            }
            return;
        }
        VerifyLogCat.i(f5869a, "解析verifyData成功");
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putString("VIE_envType", parse.envType);
        bundle2.putString("VIE_useBird", parse.useBird);
        if (vIMessageChannel == null && VIUtils.isGoingToFace(parse.nextStep)) {
            VerifyLogCat.i(f5869a, "欲用unifiedStartByVerifyId直接起人脸，切到标准VerifyId模式");
            startVerifyByVerifyId(str, null, "", bundle2, vIListenerByVerifyId, vIMessageChannel);
            return;
        }
        String str5 = f5869a;
        VerifyLogCat.i(str5, "开始直接启动模块：" + parse.nextStep);
        fastVerifyWithModuleRequest(str, parse.token, parse.nextStep, parse.data, str3, bundle2, vIListenerByVerifyId, "", vIMessageChannel);
    }

    public Map<String, Object> preInit(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cc1361ef", new Object[]{this, bundle});
        }
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        boolean booleanValue = bundle.containsKey(Constants.VI_ENGINE_IS_NEED_FP) ? Boolean.valueOf(String.valueOf(bundle.get(Constants.VI_ENGINE_IS_NEED_FP))).booleanValue() : true;
        String str = f5869a;
        VerifyLogCat.i(str, "[isNeedFP]:" + booleanValue);
        Object obj = bundle.get(Constants.VI_ENGINE_IS_NEED_BIO);
        if (obj != null) {
            z = Boolean.valueOf(String.valueOf(obj)).booleanValue();
        }
        String str2 = f5869a;
        VerifyLogCat.i(str2, "[isNeedBio]:" + z);
        if (booleanValue) {
            hashMap.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, EnvInfoUtil.getIsSupportFP());
            hashMap.put(ModuleConstants.VI_MODULE_FP_SECDATA, EnvInfoUtil.getFpSecdata());
        }
        if (z) {
            hashMap.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
        }
        hashMap.put("envData", EnvInfoUtil.getEnvInfo());
        return hashMap;
    }

    private static VerifyIdentityTask a(VerifyType verifyType, String str, String str2, String str3, Bundle bundle, VerifyIdentityListener verifyIdentityListener, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("2263c781", new Object[]{verifyType, str, str2, str3, bundle, verifyIdentityListener, vIListenerByVerifyId});
        }
        VerifyIdentityTask verifyIdentityTask = new VerifyIdentityTask();
        verifyIdentityTask.setVerifyType(verifyType);
        verifyIdentityTask.setVerifyId(str);
        verifyIdentityTask.setToken(str2);
        verifyIdentityTask.setBizName(str3);
        verifyIdentityTask.setListener(verifyIdentityListener);
        verifyIdentityTask.setVidListener(vIListenerByVerifyId);
        verifyIdentityTask.setExtParams(bundle);
        if (str.endsWith("_site")) {
            verifyIdentityTask.isIPay = true;
        } else {
            verifyIdentityTask.isIPay = false;
        }
        return verifyIdentityTask;
    }

    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f5869a, "EXIT VerifyIdentityEngine!");
        MicroModuleContext.getInstance().exit();
    }

    public String getCertSN(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ee4a61a", new Object[]{this, str}) : EnvInfoUtil.getInstalledCert(str);
    }

    public String getEnvInfoForMsp(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1eb6b403", new Object[]{this, str, new Boolean(z)}) : EnvInfoUtil.getEnvInfoForMsp(str, z);
    }

    public String getSecDataForMsp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("51deccf3", new Object[]{this}) : EnvInfoUtil.getSecDataForMsp();
    }

    public String getBioInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60d62559", new Object[]{this}) : EnvInfoUtil.getBioInfo();
    }

    public String getEnvData(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bda37454", new Object[]{this, bundle}) : EnvInfoUtil.getEnvData(bundle);
    }

    public WeakReference<Activity> getTopActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("c699f323", new Object[]{this}) : MicroModuleContext.getInstance().getTopActivity();
    }

    public void setStartActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb58ec1", new Object[]{this, context});
        } else {
            MicroModuleContext.getInstance().setStartActivityContext(context);
        }
    }

    public void reportInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1712789", new Object[]{this});
            return;
        }
        ReportHelper.reportInfo(g.KEY_APP_START);
        LogReportHelper.getInstance().getAndReportData();
    }
}
