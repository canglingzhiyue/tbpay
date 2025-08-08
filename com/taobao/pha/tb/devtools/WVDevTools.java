package com.taobao.pha.tb.devtools;

import android.os.Build;
import android.taobao.windvane.file.c;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.p;
import com.taobao.pha.tb.devtools.WVDevTools;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.Sdk2CoreHost;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.Future;
import tb.Cnew;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.kxd;
import tb.nex;
import tb.ney;
import tb.ngr;
import tb.sgj;

/* loaded from: classes7.dex */
public class WVDevTools extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVDevTools";
    private static boolean isRemoteDebugOpen;
    private static int sUcDebugDownloadTaskId;
    private nex mDevToolsHandler = null;

    public static /* synthetic */ Object ipc$super(WVDevTools wVDevTools, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WVDevTools wVDevTools, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e89c6b", new Object[]{wVDevTools, wVCallBackContext, str});
        } else {
            wVDevTools.onCallbackSuccess(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ void access$100(WVDevTools wVDevTools, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19febeca", new Object[]{wVDevTools, wVCallBackContext, str});
        } else {
            wVDevTools.onCallbackFail(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ void access$200(WVDevTools wVDevTools, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9014e129", new Object[]{wVDevTools, wVCallBackContext, str});
        } else {
            wVDevTools.onCallbackKeepAliveSuccess(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ int access$302(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f8923a", new Object[]{new Integer(i)})).intValue();
        }
        sUcDebugDownloadTaskId = i;
        return i;
    }

    public static /* synthetic */ void access$400(WVDevTools wVDevTools, WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e25b37b", new Object[]{wVDevTools, wVCallBackContext, str, str2, str3});
        } else {
            wVDevTools.onDownloadSuccess(wVCallBackContext, str, str2, str3);
        }
    }

    public static /* synthetic */ boolean access$502(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        isRemoteDebugOpen = z;
        return z;
    }

    public static /* synthetic */ IWVWebView access$600(WVDevTools wVDevTools) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("b294271c", new Object[]{wVDevTools}) : wVDevTools.mWebView;
    }

    public static /* synthetic */ void access$700(WVDevTools wVDevTools, WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27839018", new Object[]{wVDevTools, wVCallBackContext, str, str2, str3});
        } else {
            wVDevTools.doSetRemoteDebug(wVCallBackContext, str, str2, str3);
        }
    }

    static {
        kge.a(741658694);
        sUcDebugDownloadTaskId = -1;
        isRemoteDebugOpen = false;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mDevToolsHandler = p.b().x();
        if (this.mDevToolsHandler == null) {
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str2);
            if (StringUtils.equals(str, "open")) {
                return open(parseObject, wVCallBackContext);
            }
            if (StringUtils.equals(str, "close")) {
                return close(wVCallBackContext);
            }
            if (StringUtils.equals(str, kxd.GET_CONFIG_PREFIX)) {
                return getConfig(wVCallBackContext);
            }
            if (StringUtils.equals(str, "setConfig")) {
                return setConfig(parseObject, wVCallBackContext);
            }
            if (StringUtils.equals(str, "setInjectJs")) {
                return setInjectJs(parseObject, wVCallBackContext);
            }
            if (StringUtils.equals(str, "remoteDebug")) {
                return remoteDebug(str2, wVCallBackContext);
            }
            if (!StringUtils.equals(str, "clearRemoteDebug")) {
                return false;
            }
            return clearRemoteDebug(wVCallBackContext);
        } catch (JSONException unused) {
            wVCallBackContext.error(r.RET_PARAM_ERR);
            return false;
        }
    }

    private boolean setInjectJs(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3393724e", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        if (!isRemoteDebugOpen) {
            onCallbackFail(wVCallBackContext, "INVALID::DEBUG_NOT_OPEN");
            return true;
        }
        nex nexVar = this.mDevToolsHandler;
        if (nexVar != null) {
            nexVar.a(jSONObject, new sgj() { // from class: com.taobao.pha.tb.devtools.WVDevTools.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    WVDevTools.this = this;
                }

                @Override // tb.sgj
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WVDevTools.access$000(WVDevTools.this, wVCallBackContext, "success");
                    }
                }

                @Override // tb.sgj
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        WVDevTools.access$100(WVDevTools.this, wVCallBackContext, str);
                    }
                }
            });
        } else {
            onCallbackFail(wVCallBackContext, "no devtool handler found");
        }
        return true;
    }

    private void onCallbackSuccess(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef85746d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.b();
        rVar.a("msg", str);
        wVCallBackContext.onSuccess(rVar);
    }

    private void onCallbackFail(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0af2910", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("msg", str);
        wVCallBackContext.error(rVar);
    }

    private boolean open(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabc1900", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        this.mDevToolsHandler.a(jSONObject);
        if (this.mDevToolsHandler.c() != null) {
            wVCallBackContext.success();
            return true;
        }
        r rVar = new r();
        rVar.a("msg", "Unable to get backend.js.");
        wVCallBackContext.error(rVar);
        return false;
    }

    private boolean close(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92d21c40", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        Future<Boolean> a2 = this.mDevToolsHandler.a();
        JSONObject jSONObject = new JSONObject();
        try {
            if (a2.get().booleanValue()) {
                jSONObject.put("message", (Object) "close success");
                wVCallBackContext.success(jSONObject.toString());
                return true;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) PHAErrorType.FILE_ERROR);
            jSONObject2.put("message", (Object) "Fail to close due to unexpected file operation.");
            wVCallBackContext.error(jSONObject2.toJSONString());
            return false;
        } catch (Exception e) {
            rVar.a("msg", "Close Failed due to Exception " + e.getMessage());
            wVCallBackContext.error(rVar);
            return false;
        }
    }

    private boolean getConfig(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8d2480", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        JSONObject b = this.mDevToolsHandler.b();
        if (b == null) {
            b = new JSONObject();
        }
        b.put("pageId", (Object) wVCallBackContext.getPid());
        wVCallBackContext.success(b.toString());
        return true;
    }

    private boolean setConfig(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25b1c246", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        if (this.mDevToolsHandler.b(jSONObject)) {
            wVCallBackContext.success();
            return true;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", (Object) PHAErrorType.CLIENT_ERROR);
        jSONObject2.put("message", (Object) "Failed because of empty params or invalid request url.");
        wVCallBackContext.error(jSONObject2.toJSONString());
        return false;
    }

    private boolean clearRemoteDebug(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf67f68", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        isRemoteDebugOpen = false;
        WVDevelopTool.setUCRemoteDebug(false);
        WVDevelopTool.setUCRemoteDebugStrategy("");
        WVDevelopTool.setUCRemoteDebugFilePath("");
        onCallbackSuccess(wVCallBackContext, "");
        return true;
    }

    public boolean remoteDebug(String str, final WVCallBackContext wVCallBackContext) {
        org.json.JSONObject jSONObject;
        final String optString;
        final String optString2;
        final String optString3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("728cb8bf", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            jSONObject = new org.json.JSONObject(str);
            optString = jSONObject.optString("wsUrl");
            optString2 = jSONObject.optString("appWsUrl");
            optString3 = jSONObject.optString("debugId");
        } catch (Throwable th) {
            onCallbackFail(wVCallBackContext, "EXCEPTION::" + th.getMessage());
            m.b(TAG, "remote debug fail", th, new Object[0]);
        }
        if (StringUtils.isEmpty(optString2)) {
            onCallbackFail(wVCallBackContext, "INVALID::WS_URL_IS_NULL");
            return false;
        } else if (StringUtils.isEmpty(optString3)) {
            onCallbackFail(wVCallBackContext, "INVALID::DEBUG_ID_IS_NULL");
            return false;
        } else {
            final String optString4 = jSONObject.optString("uc_version");
            final String optString5 = jSONObject.optString("strategy", "");
            Cnew.a(new Runnable() { // from class: com.taobao.pha.tb.devtools.-$$Lambda$WVDevTools$yTB_F2qk2OI4BMuZ9EswVcTqfHw
                @Override // java.lang.Runnable
                public final void run() {
                    WVDevTools.this.lambda$remoteDebug$2$WVDevTools(optString2, optString3, optString, wVCallBackContext, optString4, optString5);
                }
            });
            return true;
        }
    }

    public /* synthetic */ void lambda$remoteDebug$2$WVDevTools(String str, String str2, String str3, WVCallBackContext wVCallBackContext, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10825754", new Object[]{this, str, str2, str3, wVCallBackContext, str4, str5});
            return;
        }
        ney e = p.b().e();
        if (e != null) {
            e.a(str, str2, new AnonymousClass2(str2, str3, wVCallBackContext, str4, str5));
        } else {
            onCallbackFail(wVCallBackContext, "INVALID::NO_DEVTOOL_HANDLER");
        }
    }

    /* renamed from: com.taobao.pha.tb.devtools.WVDevTools$2 */
    /* loaded from: classes7.dex */
    public class AnonymousClass2 implements a.InterfaceC0751a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f18811a;
        public final /* synthetic */ String b;
        public final /* synthetic */ WVCallBackContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* renamed from: lambda$m-dPWQbV_VZziH8TGYswXMxvC5s */
        public static /* synthetic */ void m1203lambda$mdPWQbV_VZziH8TGYswXMxvC5s(AnonymousClass2 anonymousClass2, WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
            anonymousClass2.a(wVCallBackContext, str, str2, str3);
        }

        public AnonymousClass2(String str, String str2, WVCallBackContext wVCallBackContext, String str3, String str4) {
            WVDevTools.this = r1;
            this.f18811a = str;
            this.b = str2;
            this.c = wVCallBackContext;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            ngr.b(WVDevTools.TAG, "AppDevTools Logger connection Success ");
            if (!StringUtils.isEmpty(this.f18811a)) {
                WVDevTools.access$502(true);
            }
            if (StringUtils.isEmpty(this.b)) {
                WVDevTools.access$000(WVDevTools.this, this.c, "SUCCESS");
            } else if (Build.VERSION.SDK_INT < 19) {
            } else {
                IWVWebView access$600 = WVDevTools.access$600(WVDevTools.this);
                final WVCallBackContext wVCallBackContext = this.c;
                final String str = this.b;
                final String str2 = this.d;
                final String str3 = this.e;
                access$600._post(new Runnable() { // from class: com.taobao.pha.tb.devtools.-$$Lambda$WVDevTools$2$m-dPWQbV_VZziH8TGYswXMxvC5s
                    @Override // java.lang.Runnable
                    public final void run() {
                        WVDevTools.AnonymousClass2.m1203lambda$mdPWQbV_VZziH8TGYswXMxvC5s(WVDevTools.AnonymousClass2.this, wVCallBackContext, str, str2, str3);
                    }
                });
            }
        }

        public /* synthetic */ void a(WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f3c63c3", new Object[]{this, wVCallBackContext, str, str2, str3});
            } else {
                WVDevTools.access$700(WVDevTools.this, wVCallBackContext, str, str2, str3);
            }
        }

        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
        public void a(PHAErrorType pHAErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str});
                return;
            }
            WVDevTools.access$502(false);
            ngr.b(WVDevTools.TAG, "AppDevTools Logger connection failed: " + str);
            WVDevTools.access$100(WVDevTools.this, this.c, "INVALID::NOT_ALI_NETWORK");
        }
    }

    private void onCallbackKeepAliveSuccess(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d74d8a4d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.b();
        rVar.a(true);
        rVar.a("msg", str);
        wVCallBackContext.onSuccess(rVar);
    }

    private void doSetRemoteDebug(WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2b03f8", new Object[]{this, wVCallBackContext, str, str2, str3});
            return;
        }
        try {
            if (isInspectEnable()) {
                Sdk2CoreHost.impl().startRemoteDebugging(str);
                WVDevelopTool.setUCRemoteDebugStrategy(str3);
                onCallbackKeepAliveSuccess(wVCallBackContext, "SUCCESS");
                return;
            }
            switchOrDownloadDebugUC(wVCallBackContext, str2, str3);
        } catch (Exception e) {
            onCallbackFail(wVCallBackContext, "EXCEPTION::" + e.getMessage());
            m.b(TAG, "remote debug fail", e, new Object[0]);
        }
    }

    private File getUCRemoteDebugSoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fe1fd32", new Object[]{this, str});
        }
        if (EnvInfo.is64Bit()) {
            return new File(getUCRemoteDebugUnZipDir(str), "jni/arm64-v8a/libkernelu4_7z_uc.so");
        }
        return new File(getUCRemoteDebugUnZipDir(str), "jni/armeabi-v7a/libkernelu4_7z_uc.so");
    }

    private static File getUCRemoteDebugUnZipDir(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5f8863ee", new Object[]{str});
        }
        File uCDebugDir = WVDevelopTool.getUCDebugDir();
        return new File(uCDebugDir, "uc_aar." + str);
    }

    private static File getUCRemoteDebugExtractDir(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2c574627", new Object[]{str});
        }
        File uCDebugDir = WVDevelopTool.getUCDebugDir();
        return new File(uCDebugDir, "uc_extract." + str);
    }

    private boolean isUCRemoteDebugFileReady(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ca74f4", new Object[]{this, file})).booleanValue();
        }
        if (file.exists()) {
            return U4Engine.isExtractDirReady(file);
        }
        return false;
    }

    private void switchOrDownloadDebugUC(final WVCallBackContext wVCallBackContext, String str, final String str2) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e25f9a", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        final String str3 = StringUtils.isEmpty(str) ? "5.6.0.7.230905204018" : str;
        if (StringUtils.isEmpty(str3)) {
            onCallbackFail(wVCallBackContext, "DOWNLOAD::INVALID_UC_VERSION");
            return;
        }
        File uCRemoteDebugExtractDir = getUCRemoteDebugExtractDir(str3);
        if (isUCRemoteDebugFileReady(uCRemoteDebugExtractDir)) {
            WVDevelopTool.setUCRemoteDebug(true);
            WVDevelopTool.setUCRemoteDebugFilePath(uCRemoteDebugExtractDir.getAbsolutePath());
            WVDevelopTool.setUCRemoteDebugStrategy(str2);
            onCallbackFail(wVCallBackContext, "RESTART::RESTART");
        } else if (sUcDebugDownloadTaskId != -1) {
            onCallbackFail(wVCallBackContext, "DOWNLOAD::IS_DOWNLOADING");
        } else {
            File uCDebugDir = WVDevelopTool.getUCDebugDir();
            if (uCDebugDir.exists() && (listFiles = uCDebugDir.listFiles(new FilenameFilter() { // from class: com.taobao.pha.tb.devtools.WVDevTools.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    WVDevTools.this = this;
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str4) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file, str4})).booleanValue() : !str4.contains(str3);
                }
            })) != null) {
                for (File file : listFiles) {
                    c.a(file);
                }
            }
            onCallbackKeepAliveSuccess(wVCallBackContext, "DOWNLOAD::START");
            kmm kmmVar = new kmm();
            kmmVar.b.f30169a = TAG;
            kmmVar.b.h = WVDevelopTool.getUCDebugDir().getAbsolutePath();
            kmmVar.b.j = false;
            kmo kmoVar = new kmo();
            kmoVar.f30167a = String.format("https://artlab.alibaba-inc.com/api/protocol/1/maven/releases/com/uc/webview/u4core-7z-debug-arm64-v8a/%s/u4core-7z-debug-arm64-v8a-%s.aar", str3, str3);
            kmoVar.d = "uc_aar." + str + ".zip";
            kmmVar.f30166a.add(kmoVar);
            sUcDebugDownloadTaskId = b.a().a(kmmVar, new kml() { // from class: com.taobao.pha.tb.devtools.WVDevTools.4
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int e = -1;

                {
                    WVDevTools.this = this;
                }

                @Override // tb.kml
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                        return;
                    }
                    m.d(WVDevTools.TAG, "old onDownloadProgress", null, "process", Integer.valueOf(i));
                    if (this.e == i) {
                        return;
                    }
                    WVDevTools wVDevTools = WVDevTools.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    WVDevTools.access$200(wVDevTools, wVCallBackContext2, "DOWNLOADING::" + i);
                    this.e = i;
                }

                @Override // tb.kml
                public void onDownloadError(String str4, int i, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str4, new Integer(i), str5});
                        return;
                    }
                    m.b(WVDevTools.TAG, "old onDownloadError", null, "url", str4, "errorCode", Integer.valueOf(i), "msg", str5);
                    WVDevTools.access$302(-1);
                    WVDevTools wVDevTools = WVDevTools.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    WVDevTools.access$100(wVDevTools, wVCallBackContext2, "DOWNLOAD::" + str5);
                }

                @Override // tb.kml
                public void onDownloadFinish(String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str4, str5});
                        return;
                    }
                    m.c(WVDevTools.TAG, "old onDownloadFinish", null, "url", str4, "filePath", str5);
                    WVDevTools.access$302(-1);
                    WVDevTools.access$200(WVDevTools.this, wVCallBackContext, "DOWNLOAD::SUCCESS");
                    WVDevTools.access$400(WVDevTools.this, wVCallBackContext, str5, str3, str2);
                }

                @Override // tb.kml
                public void onDownloadStateChange(String str4, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str4, new Boolean(z)});
                    } else {
                        m.a(WVDevTools.TAG, "old onDownloadStateChange", null, "url", str4, "isDownloading", Boolean.valueOf(z));
                    }
                }

                @Override // tb.kml
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    } else {
                        m.c(WVDevTools.TAG, "old onFinish", null, "allSuccess", Boolean.valueOf(z));
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                    } else {
                        m.c(WVDevTools.TAG, "old onNetworkLimit", null, "netType", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    private void onDownloadSuccess(final WVCallBackContext wVCallBackContext, String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b874ca9e", new Object[]{this, wVCallBackContext, str, str2, str3});
            return;
        }
        File uCRemoteDebugUnZipDir = getUCRemoteDebugUnZipDir(str2);
        if (uCRemoteDebugUnZipDir.exists() && !c.a(uCRemoteDebugUnZipDir)) {
            onCallbackFail(wVCallBackContext, "UNZIP::DELETE_OLD_DIR_FAIL::" + uCRemoteDebugUnZipDir.getAbsolutePath());
        } else if (!uCRemoteDebugUnZipDir.mkdirs()) {
            onCallbackFail(wVCallBackContext, "UNZIP::MK_DIR_FAIL");
        } else {
            onCallbackKeepAliveSuccess(wVCallBackContext, "UNZIP::START");
            File uCRemoteDebugSoPath = getUCRemoteDebugSoPath(str2);
            if (!android.taobao.windvane.file.b.a(str, uCRemoteDebugUnZipDir.getAbsolutePath()) || !uCRemoteDebugSoPath.exists()) {
                onCallbackFail(wVCallBackContext, "UNZIP::UNZIP_FAIL");
                return;
            }
            final File uCRemoteDebugExtractDir = getUCRemoteDebugExtractDir(str2);
            if (uCRemoteDebugExtractDir.exists() && !c.a(uCRemoteDebugExtractDir)) {
                onCallbackFail(wVCallBackContext, "UNZIP::DELETE_OLD_DIR_FAIL::" + uCRemoteDebugExtractDir.getAbsolutePath());
            } else if (!uCRemoteDebugExtractDir.mkdirs()) {
                onCallbackFail(wVCallBackContext, "UNZIP::MK_DIR_FAIL::" + uCRemoteDebugExtractDir.getAbsolutePath());
            } else {
                try {
                    U4Engine.createExtractor().setCompressedFile(uCRemoteDebugSoPath).setContext(getContext()).setASync(false).setSpecifiedDir(uCRemoteDebugExtractDir).setClient(new U4Engine.Extractor.Client() { // from class: com.taobao.pha.tb.devtools.WVDevTools.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str4, Object... objArr) {
                            int hashCode = str4.hashCode();
                            if (hashCode == -868516125) {
                                super.onFailed((UCKnownException) objArr[0]);
                                return null;
                            } else if (hashCode != 1802196450) {
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                            } else {
                                super.onSuccess((File) objArr[0]);
                                return null;
                            }
                        }

                        {
                            WVDevTools.this = this;
                        }

                        @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
                        public void onSuccess(File file) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6b6b55e2", new Object[]{this, file});
                                return;
                            }
                            super.onSuccess(file);
                            WVDevelopTool.setUCRemoteDebug(true);
                            WVDevelopTool.setUCRemoteDebugFilePath(uCRemoteDebugExtractDir.getAbsolutePath());
                            WVDevelopTool.setUCRemoteDebugStrategy(str3);
                            WVDevTools.access$200(WVDevTools.this, wVCallBackContext, "READY");
                        }

                        @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
                        public void onFailed(UCKnownException uCKnownException) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("cc3b7ee3", new Object[]{this, uCKnownException});
                                return;
                            }
                            super.onFailed(uCKnownException);
                            WVDevTools wVDevTools = WVDevTools.this;
                            WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                            WVDevTools.access$100(wVDevTools, wVCallBackContext2, "UNZIP::UC_EXTRACT_FAIL::" + uCKnownException.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    m.b(TAG, "extract fail", e, new Object[0]);
                    onCallbackFail(wVCallBackContext, "UNZIP::UC_EXTRACT_FAIL::" + e.getMessage());
                }
            }
        }
    }

    private boolean isInspectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36bed1b8", new Object[]{this})).booleanValue();
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        return iCoreVersion != null && iCoreVersion.supportInspector();
    }
}
