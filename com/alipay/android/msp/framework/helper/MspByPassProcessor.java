package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.helper.FileHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.msoa.c;
import com.taobao.search.common.util.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import tb.alz;

/* loaded from: classes3.dex */
public class MspByPassProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_NEW_AUTH_INVOKE = "1010408";
    public static final String EVENT_NEW_AUTH_RESULT = "1010409";
    private static final MspByPassProcessor b = new MspByPassProcessor();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f4785a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private FileHelper.GetFilterInputStream d = new FileHelper.GetFilterInputStream() { // from class: com.alipay.android.msp.framework.helper.MspByPassProcessor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.framework.helper.FileHelper.GetFilterInputStream
        public InputStream getFilter(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("346a9c1", new Object[]{this, inputStream}) : new GZIPInputStream(inputStream);
        }
    };

    public static /* synthetic */ SharedPreferences a(MspByPassProcessor mspByPassProcessor, SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("4ce46435", new Object[]{mspByPassProcessor, sharedPreferences});
        }
        mspByPassProcessor.f4785a = sharedPreferences;
        return sharedPreferences;
    }

    public static /* synthetic */ AtomicBoolean a(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6a2b49e3", new Object[]{mspByPassProcessor}) : mspByPassProcessor.c;
    }

    public static /* synthetic */ SharedPreferences b(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("f9e41038", new Object[]{mspByPassProcessor}) : mspByPassProcessor.f4785a;
    }

    public static /* synthetic */ FileHelper.GetFilterInputStream c(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileHelper.GetFilterInputStream) ipChange.ipc$dispatch("7b84e6b4", new Object[]{mspByPassProcessor}) : mspByPassProcessor.d;
    }

    private MspByPassProcessor() {
    }

    public static final MspByPassProcessor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspByPassProcessor) ipChange.ipc$dispatch("cd458aff", new Object[0]) : b;
    }

    /* loaded from: classes3.dex */
    public class ByPassTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LogItem.TemplateUpdateScene c;
        private long b = -1;
        private String e = "scene";
        private String d = "none";
        private StatisticInfo f = new StatisticInfo(-1);

        public ByPassTask(LogItem.TemplateUpdateScene templateUpdateScene) {
            this.c = templateUpdateScene;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.e += this.c.logValue;
                EventLogUtil.logPayEvent("1010387", "scene", this.e);
                if (!MspByPassProcessor.a(MspByPassProcessor.this).compareAndSet(false, true)) {
                    return;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            try {
                this.b = SystemClock.elapsedRealtime();
                b();
                try {
                    if (!a()) {
                        this.f.onStatisticEnd();
                    }
                    EventLogUtil.logPayEvent("1010389", "scene", this.e, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - this.b), "phase", this.d);
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
                MspByPassProcessor.a(MspByPassProcessor.this).set(false);
            } catch (Throwable th3) {
                try {
                    LogUtil.printExceptionStackTrace(th3);
                    String message = th3.getMessage();
                    if (StringUtils.isEmpty(message)) {
                        message = th3.getClass().getName();
                    }
                    EventLogUtil.logPayEvent("1010393", "scene", this.e, "result_reason", message);
                    try {
                        if (!a()) {
                            this.f.onStatisticEnd();
                        }
                    } catch (Throwable th4) {
                        LogUtil.printExceptionStackTrace(th4);
                    }
                    MspByPassProcessor.a(MspByPassProcessor.this).set(false);
                } catch (Throwable th5) {
                    try {
                        if (!a()) {
                            this.f.onStatisticEnd();
                        }
                        if (1 == 0) {
                            EventLogUtil.logPayEvent("1010389", "scene", this.e, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - this.b), "phase", this.d);
                        }
                    } catch (Throwable th6) {
                        LogUtil.printExceptionStackTrace(th6);
                    }
                    MspByPassProcessor.a(MspByPassProcessor.this).set(false);
                    throw th5;
                }
            }
        }

        private static boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            }
            List errorList = StatisticCollector.getErrorList(StatisticCollector.GLOBAL_AGENT);
            if (errorList != null && errorList.size() > 0) {
                return false;
            }
            List windowList = StatisticCollector.getWindowList(StatisticCollector.GLOBAL_AGENT);
            return windowList == null || windowList.size() <= 0;
        }

        private static String a(Context context) {
            String sofaGroupName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
            }
            if (GlobalConstant.DEBUG) {
                try {
                    if (!StringUtils.isEmpty(PhoneCashierMspEngine.getMspWallet().getSofaGroupName(context))) {
                        return "https://gw-office.alipayobjects.com/mobiletms/" + Uri.encode(sofaGroupName) + "/digest.json";
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.CONFIG_TEMPLATE_UPDATE_BYPASS_URL_PREFIX);
            String str = k.HTTPS_PREFIX + ((drmValueFromKey == null || !drmValueFromKey.containsKey("prefix")) ? "gw.alipayobjects.com/os/mobiletms" : drmValueFromKey.getString("prefix")) + "/QUICKPAY/" + PluginManager.getRender().getEngineVersion() + "/digest.json";
            StringBuilder sb = new StringBuilder("CONFIG_TEMPLATE_UPDATE_BYPASS_URL_PREFIX: ");
            sb.append(drmValueFromKey == null ? "null" : drmValueFromKey.toJSONString());
            sb.append(", targetUrl: ");
            sb.append(str);
            LogUtil.d("MspByPassProcessor", "getTemplateDigestUrl", sb.toString());
            return str;
        }

        private void b() throws Throwable {
            String str;
            JSONObject jSONObject;
            String str2;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Context context = MspContextUtil.getContext();
            if (context == null) {
                throw new RuntimeException("ContextNull");
            }
            if (MspByPassProcessor.b(MspByPassProcessor.this) == null) {
                MspByPassProcessor.a(MspByPassProcessor.this, context.getSharedPreferences("alipay_msp_bypass_tpl_update", 0));
            }
            String str3 = null;
            FileResponse httpGet = FileHelper.httpGet(new URL(a(context)), null, MspByPassProcessor.c(MspByPassProcessor.this));
            if (!httpGet.isSuccess()) {
                LogUtil.d("MspByPassProcessor", "process", "httpNotSucc: " + httpGet.getRespCode());
                throw new RuntimeException("httpCode:" + httpGet.getRespCode());
            }
            EventLogUtil.logPayEvent("1010388", "scene", this.e);
            JSONObject parseObject = JSONObject.parseObject(new String(httpGet.getRespBody(), "UTF-8"));
            String string = parseObject.getString(c.TAG);
            String string2 = parseObject.getString("s");
            if (!EncryptUtil.rsaVerify("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmGXVAHIyf0O+kvhDKUSM4uWNP3/Gig7DVD1dwbTFWwZz7HpYcMulZRxY3iYgPrMeZ/B2AfTeq21H7MqZ/PwjZbGhq1/noRSXfG+KPo4vlnkTAwBQ+mr3PpuPqqZz9D6SRhq5lzoSynLoUUfQVvYDgnUVTnnq3EyqC/B1DpwQMuesemtvS2HYqJfmPRskyt8y/LbHhXLyX4NrdhB33SAdLSLafTSGpATfbV+v/i6HT9P9HLsGLT2ydxItjxEFu6DJfoe+U8vguBJpp/ftjxBuOzW2sWBVycfrybba1PWtd9U0ZHhMauJJ+1mp69wFr6c/DNegLdcDqa3Af9tGFN146wIDAQAB", string.getBytes("UTF-8"), string2, "SHA256withRSA")) {
                EventLogUtil.logPayEvent("1010390", "scene", this.e);
                LogUtil.record(8, "MspByPassProcessor", "content: " + string + ", sign: " + string2);
                throw new RuntimeException("SignVerifyFailed");
            }
            IRender render = PluginManager.getRender();
            if (render instanceof MspRenderImpl) {
                JSONObject parseObject2 = JSONObject.parseObject(string);
                String str4 = "null";
                if (parseObject2.containsKey(alz.BizKeyOrderList)) {
                    JSONArray jSONArray = parseObject2.getJSONArray(alz.BizKeyOrderList);
                    try {
                        String string3 = MspByPassProcessor.b(MspByPassProcessor.this).getString("app_version_name", "0.0.0.0");
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        if (!string3.equals(packageInfo.versionName)) {
                            MspByPassProcessor.b(MspByPassProcessor.this).edit().clear().putString("app_version_name", packageInfo.versionName).commit();
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        LogUtil.printExceptionStackTrace("MspByPassProcessor", "checkBypassRecordExpired", e);
                    }
                    while (true) {
                        if (i >= jSONArray.size()) {
                            str = null;
                            jSONObject = null;
                            str2 = null;
                            break;
                        }
                        str = jSONArray.getString(i);
                        jSONObject = parseObject2.getJSONObject(str);
                        if (jSONObject != null && jSONObject.size() > 0) {
                            str2 = a(jSONObject);
                            String string4 = MspByPassProcessor.b(MspByPassProcessor.this).getString(str, str3);
                            LogUtil.d("MspByPassProcessor", "process", "group hash check, currentHash=" + str2 + ", groupHash=" + string4 + ", groupName=" + str);
                            if (!StringUtils.equals(str2, string4)) {
                                break;
                            }
                        }
                        i++;
                        str3 = null;
                    }
                    StringBuilder sb = new StringBuilder("tplInfo: ");
                    if (jSONObject != null) {
                        str4 = jSONObject.toJSONString();
                    }
                    sb.append(str4);
                    sb.append(", resInfo: null");
                    LogUtil.d("MspByPassProcessor", "process", sb.toString());
                    if (jSONObject == null || jSONObject.size() <= 0) {
                        return;
                    }
                    if (a((MspRenderImpl) render, jSONObject)) {
                        MspByPassProcessor.b(MspByPassProcessor.this).edit().putString(str, str2).commit();
                    }
                    this.d = str;
                    return;
                }
                JSONObject jSONObject2 = parseObject2.getJSONObject("tplInfos");
                StringBuilder sb2 = new StringBuilder("tplInfo: ");
                if (jSONObject2 != null) {
                    str4 = jSONObject2.toJSONString();
                }
                sb2.append(str4);
                sb2.append(", resInfo: null");
                LogUtil.d("MspByPassProcessor", "process", sb2.toString());
                a((MspRenderImpl) render, jSONObject2);
                return;
            }
            LogUtil.e("MspByPassProcessor", "process", "render is ".concat(String.valueOf(render)));
        }

        private String a(JSONObject jSONObject) throws NoSuchAlgorithmException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
            }
            ArrayList<String> arrayList = new ArrayList(jSONObject.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.alipay.android.msp.framework.helper.MspByPassProcessor.ByPassTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
                }
            });
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            for (String str : arrayList) {
                messageDigest.update(JSON.parseObject(jSONObject.getString(str)).getString("tplHash").getBytes(Charset.defaultCharset()));
            }
            return "sha1_" + Base64.encodeToString(messageDigest.digest(), 2);
        }

        private boolean a(MspRenderImpl mspRenderImpl, JSONObject jSONObject) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a42defcc", new Object[]{this, mspRenderImpl, jSONObject})).booleanValue();
            }
            if (jSONObject == null || jSONObject.size() <= 0) {
                return true;
            }
            boolean z = true;
            for (String str : jSONObject.keySet()) {
                String string = jSONObject.getString(str);
                Template notifyTplUpdate = mspRenderImpl.notifyTplUpdate(str, string, true, this.c);
                try {
                    JSONObject parseObject = JSON.parseObject(string);
                    String string2 = parseObject.getString("time");
                    String string3 = parseObject.getString("tplVersion");
                    if (z && (string3.compareTo(notifyTplUpdate.tplVersion) > 0 || (StringUtils.equals(string3, notifyTplUpdate.tplVersion) && string2.compareTo(notifyTplUpdate.time) > 0))) {
                        z = false;
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace("MspByPassProcessor", "processTplUpdate", e);
                }
            }
            return z;
        }
    }

    public void triggerByPassProcess(LogItem.TemplateUpdateScene templateUpdateScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd12a485", new Object[]{this, templateUpdateScene});
        } else {
            TaskHelper.execute(new ByPassTask(templateUpdateScene));
        }
    }

    public boolean isProcessing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b24779e8", new Object[]{this})).booleanValue() : this.c.get();
    }

    public static boolean isUpdateSceneEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3de3dd", new Object[]{str})).booleanValue();
        }
        JSONObject jsonConfig = FastStartActivityHelper.getJsonConfig(PhoneCashierMspEngine.getMspBase().getContext(), DrmKey.CONFIG_TEMPLATE_UPDATE_BYPASS_SCENE);
        if (jsonConfig == null) {
            return false;
        }
        try {
            return Boolean.TRUE.equals(jsonConfig.getBoolean(str));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("MspByPassProcessor", "isUpdateSceneEnabled", e);
            return false;
        }
    }
}
