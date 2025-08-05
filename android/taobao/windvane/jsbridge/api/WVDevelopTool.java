package android.taobao.windvane.jsbridge.api;

import android.os.Build;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.p;
import android.taobao.windvane.config.t;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.monitor.WVLocPerformanceMonitor;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.WVWebView;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.adf;
import tb.kge;
import tb.oan;
import tb.riy;

/* loaded from: classes2.dex */
public class WVDevelopTool extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVDevelopTool";
    private static int mLastMode;
    private static int sUcDebugDownloadTaskId;
    private static AtomicBoolean sUcRemoteDebugEnable;
    private boolean mIsDebugOpen = false;

    public static /* synthetic */ Object ipc$super(WVDevelopTool wVDevelopTool, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void timeoutTest(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be5e0e1", new Object[]{this, wVCallBackContext, str});
        }
    }

    static {
        kge.a(2072907272);
        sUcDebugDownloadTaskId = -1;
        sUcRemoteDebugEnable = null;
        mLastMode = 0;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isDebugEnabled".equals(str)) {
            r rVar = new r();
            rVar.a("global", String.valueOf(android.taobao.windvane.util.e.a()));
            wVCallBackContext.success(rVar);
        } else if ("clearWindVaneCache".equals(str)) {
            clearWindVaneCache(str2, wVCallBackContext);
        } else if ("setWebViewDebugEnabled".equals(str)) {
            setWebViewDebugEnabled(str2, wVCallBackContext);
        } else if ("setWebViewFinishJs".equals(str)) {
            setWebViewFinishJs(str2, wVCallBackContext);
        } else if ("clearWebViewFinishJs".equals(str)) {
            clearWebViewFinishJs(str2, wVCallBackContext);
        } else if ("setUCEnabled".equals(str)) {
            setUCEnabled(str2, wVCallBackContext);
        } else if ("isUCEnabled".equals(str)) {
            isUCEnabled(str2, wVCallBackContext);
        } else if ("getLocPerformanceData".equals(str)) {
            getLocPerformanceData(str2, wVCallBackContext);
        } else if ("openSpdyforDebug".equals(str)) {
            openSpdyforDebug(str2, wVCallBackContext);
        } else if ("closeSpdyforDebug".equals(str)) {
            closeSpdyforDebug(str2, wVCallBackContext);
        } else if ("openLocPerformanceMonitor".equals(str)) {
            openLocPerformanceMonitor(str2, wVCallBackContext);
        } else if ("closeLocPerformanceMonitor".equals(str)) {
            closeLocPerformanceMonitor(str2, wVCallBackContext);
        } else if ("resetConfig".equals(str)) {
            resetConfig(wVCallBackContext, str2);
        } else if ("reInitConfig".equals(str)) {
            reInitConfig(wVCallBackContext, str2);
        } else if ("updateConfig".equals(str)) {
            updateConfig(wVCallBackContext, str2);
        } else if ("setDebugEnabled".equals(str)) {
            setDebugEnabled(wVCallBackContext, str2);
        } else if ("readMemoryStatisitcs".equals(str)) {
            readMemoryStatisitcs(wVCallBackContext, str2);
        } else if ("getURLContentType".equals(str)) {
            getURLContentType(wVCallBackContext, str2);
        } else if (!"timeoutTest".equals(str)) {
            return false;
        } else {
            timeoutTest(wVCallBackContext, str2);
        }
        return true;
    }

    public static File getUCDebugDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("418839e8", new Object[0]);
        }
        File file = new File(android.taobao.windvane.config.a.f.getCacheDir(), "uc_debug");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void setUCRemoteDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29387430", new Object[]{new Boolean(z)});
            return;
        }
        File file = new File(getUCDebugDir(), "uc_debug_enable");
        if (z) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                m.b(TAG, "set uc remote debug fail", e, new Object[0]);
            }
        } else if (!file.exists()) {
        } else {
            file.delete();
        }
    }

    public static boolean isEnableUCRemoteDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db061b9d", new Object[0])).booleanValue();
        }
        if (sUcRemoteDebugEnable == null) {
            if (android.taobao.windvane.config.a.f == null) {
                sUcRemoteDebugEnable = new AtomicBoolean(false);
            } else {
                sUcRemoteDebugEnable = new AtomicBoolean(new File(getUCDebugDir(), "uc_debug_enable").exists());
            }
            if (sUcRemoteDebugEnable.get() && !RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(getUCRemoteDebugStrategy())) {
                setUCRemoteDebug(false);
            }
        }
        return sUcRemoteDebugEnable.get();
    }

    public static void setUCRemoteDebugStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da5e641", new Object[]{str});
        } else {
            writeFileContent("uc_debug_strategy", str);
        }
    }

    private static String getUCRemoteDebugStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc1b2f3d", new Object[0]) : readFileContent("uc_debug_strategy");
    }

    private static void writeFileContent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ade19", new Object[]{str, str2});
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(getUCDebugDir(), str)));
            if (str2 == null) {
                str2 = "";
            }
            bufferedWriter.write(str2);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    private static String readFileContent(String str) {
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca780068", new Object[]{str});
        }
        File file = new File(getUCDebugDir(), str);
        ?? exists = file.exists();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                if (exists == 0) {
                    return null;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (FileNotFoundException e) {
                    e = e;
                    bufferedReader = null;
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return readLine;
                } catch (FileNotFoundException e5) {
                    e = e5;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return null;
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = exists;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public static String getUCRemoteDebugFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48627faf", new Object[0]) : readFileContent("uc_debug_path");
    }

    public static void setUCRemoteDebugFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a48a40f", new Object[]{str});
        } else {
            writeFileContent("uc_debug_path", str);
        }
    }

    public void openLocPerformanceMonitor(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b2f58e", new Object[]{this, str, wVCallBackContext});
        } else {
            WVLocPerformanceMonitor.setOpenLocPerformanceMonitor(true);
        }
    }

    public void closeLocPerformanceMonitor(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea383820", new Object[]{this, str, wVCallBackContext});
        } else {
            WVLocPerformanceMonitor.setOpenLocPerformanceMonitor(false);
        }
    }

    public void openSpdyforDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75ab3f4", new Object[]{this, str, wVCallBackContext});
        } else {
            android.taobao.windvane.util.e.a(true);
        }
    }

    public void closeSpdyforDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772ee522", new Object[]{this, str, wVCallBackContext});
        } else {
            android.taobao.windvane.util.e.a(false);
        }
    }

    public void getLocPerformanceData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f621de", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            rVar.a(new JSONObject(WVLocPerformanceMonitor.getInstance().getMonitorData().toString()));
            wVCallBackContext.success(rVar);
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
        }
    }

    public final void clearWindVaneCache(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b49019", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.clearCache();
        wVCallBackContext.success();
    }

    public final void setUCEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485108bf", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (!new JSONObject(str).optBoolean("enable", false)) {
                j.a();
                j.commonConfig.o = true;
            } else {
                j.a();
                j.commonConfig.o = false;
            }
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    public final void isUCEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989272f7", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        j.a();
        if (j.commonConfig.o) {
            rVar.a("enabled", "false");
        } else {
            rVar.a("enabled", "true");
        }
        wVCallBackContext.success(rVar);
    }

    public final void setWebViewDebugEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d8a573", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            boolean optBoolean = new JSONObject(str).optBoolean("enabled", false);
            if (Build.VERSION.SDK_INT < 19) {
                rVar.a("error", "api level < 19");
                wVCallBackContext.error(rVar);
                return;
            }
            if (this.mWebView instanceof WVWebView) {
                WVWebView.setWebContentsDebuggingEnabled(optBoolean);
            }
            this.mIsDebugOpen = optBoolean;
            wVCallBackContext.success();
        } catch (Throwable unused) {
            rVar.a("error", "failed to enable debugging");
            wVCallBackContext.error(rVar);
        }
    }

    public final void setWebViewFinishJs(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcb6341", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            adf.a(new JSONObject(str).optString("js"));
            wVCallBackContext.success();
        } catch (JSONException unused) {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        } catch (Throwable unused2) {
            rVar.a("error", "failed to enable setWebViewFinishJs");
            wVCallBackContext.error(rVar);
        }
    }

    public final void clearWebViewFinishJs(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac2afb6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            adf.a();
            wVCallBackContext.success();
        } catch (Throwable unused) {
            rVar.a("error", "failed to enable clearWebViewFinishJs");
            wVCallBackContext.error(rVar);
        }
    }

    private void resetConfig(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42fdb3f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        WVConfigManager.a().b();
        wVCallBackContext.success();
    }

    private void reInitConfig(WVCallBackContext wVCallBackContext, String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46a0bd3", new Object[]{this, wVCallBackContext, str});
            return;
        }
        for (String str2 : new String[]{"windvane_common", "windvane_domain", "WindVane_URL_config", WVConfigManager.CONFIGNAME_COOKIE, "windvane_uc_core"}) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str2);
            if (configs == null || configs.size() == 0) {
                WVConfigManager.a().a(str2, "");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("appVersion", android.taobao.windvane.config.a.a().i());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                WVConfigManager.a().a(str2, jSONObject.toString());
            } catch (Throwable th) {
                m.e(TAG, "reInitConfig failed " + th);
                th.printStackTrace();
            }
        }
        wVCallBackContext.success();
    }

    private void updateConfig(WVCallBackContext wVCallBackContext, String str) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ef2b9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            configs = OrangeConfig.getInstance().getConfigs("windvane_domain");
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
        if (configs != null && configs.size() != 0) {
            for (Map.Entry<String, String> entry : configs.entrySet()) {
                String value = entry.getValue();
                if (TextUtils.equals("aliDomain", entry.getKey()) || TextUtils.equals("thirdPartyDomain", entry.getKey())) {
                    value = oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
                }
                jSONObject.put(entry.getKey(), value);
            }
            jSONObject.put("appVersion", android.taobao.windvane.config.a.a().i());
            WVConfigManager.a().a("windvane_domain", jSONObject.toString());
            m.c("WVConfig", "receive name=[windvane_domain]; config=[" + jSONObject.toString() + riy.ARRAY_END_STR);
            t.a().a("AllowAllUrl", "{\"1\":{\"open\":\"allow\",\"api\":\"Group_All\",\"allowaccess\":\"false\"}}", "{\"Group_All\":[\"*\"]}", true);
            wVCallBackContext.success();
            return;
        }
        WVConfigManager.a().a("windvane_domain", "");
    }

    private void readMemoryStatisitcs(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2812fe", new Object[]{this, wVCallBackContext, str});
        } else {
            wVCallBackContext.success();
        }
    }

    private void setDebugEnabled(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c0a1fe", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        try {
            wVCallBackContext.success();
        } catch (Throwable unused) {
            rVar.a("error", "failed to setDebugEnabled");
            wVCallBackContext.error(rVar);
        }
    }

    private void getURLContentType(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cf89e8", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        try {
            String optString = new JSONObject(str).optString("url", "");
            if (p.e(optString)) {
                rVar.a("type", (Object) (-1));
            } else if (p.a(optString)) {
                rVar.a("type", (Object) 8);
            } else if (p.c(optString)) {
                rVar.a("type", (Object) 2);
            } else {
                rVar.a("type", (Object) 1);
            }
            wVCallBackContext.success(rVar);
        } catch (JSONException unused) {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        } catch (Throwable unused2) {
            rVar.a("error", "failed to getURLContentType");
            wVCallBackContext.error(rVar);
        }
    }
}
