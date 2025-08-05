package android.taobao.windvane.extra.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.UCCoreStartup;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.file.NotEnoughSpace;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.b;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WVCore";
    private static WVCore instance;
    private int usedWebMulti = 0;
    private int usedGpuMulti = 0;
    private final AtomicBoolean isUcStartInit = new AtomicBoolean(false);
    private boolean isUCSDKSupport = false;

    static {
        kge.a(265455819);
    }

    public static WVCore getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("66f31fd8", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVCore.class) {
                if (instance == null) {
                    instance = new WVCore();
                }
            }
        }
        return instance;
    }

    public void setUCStartInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e32c6b", new Object[]{this, new Boolean(z)});
        } else {
            this.isUcStartInit.set(z);
        }
    }

    public boolean isUCStartInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4397dc5", new Object[]{this})).booleanValue() : this.isUcStartInit.get();
    }

    public boolean isUCSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b9ec482", new Object[]{this})).booleanValue() : this.isUCSDKSupport && WebView.getCoreType() == 3;
    }

    public void setUCSupport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d2b4e", new Object[]{this, new Boolean(z)});
        } else {
            this.isUCSDKSupport = z;
        }
    }

    public String getV8SoPath() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1259f560", new Object[]{this});
        }
        Application application = a.f;
        File runningDir = U4Engine.getRunningDir(application, false);
        if (runningDir != null) {
            str = MiscUtils.KEY_RUNNING;
        } else if (innerSo(application)) {
            String ucCore7ZFilePath = UCCoreStartup.ucCore7ZFilePath(application);
            if (!TextUtils.isEmpty(ucCore7ZFilePath)) {
                runningDir = U4Engine.getExtractDir(application, new File(ucCore7ZFilePath));
            }
            str = "inner";
        } else if (!TextUtils.isEmpty(WVUCRemoteFetcher.fetchUCRemoteLocal())) {
            String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
            if (!TextUtils.isEmpty(fetchUCRemoteLocal)) {
                runningDir = U4Engine.getExtractDir(application, new File(fetchUCRemoteLocal));
            }
            str = "remoteso";
        } else {
            runningDir = U4Engine.getExtractDirByUrl(application, WVUCWebView.UC_CORE_URL);
            str = "download";
        }
        String ucSoPath = runningDir != null ? getUcSoPath(runningDir.getAbsolutePath()) : "";
        m.c(TAG, "get v8 path by " + str + ", path=[" + ucSoPath + riy.ARRAY_END_STR);
        return ucSoPath;
    }

    public boolean innerSo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd581b13", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return j.commonConfig.R == 0 && new File(UCCoreStartup.ucCore7ZFilePath(context)).exists();
    }

    public boolean isUCInner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff9ac189", new Object[]{this})).booleanValue() : j.commonConfig.R == 0;
    }

    public void initUCCore2(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2634ead", new Object[]{this, context, bVar});
            return;
        }
        if (context instanceof Application) {
            a.f = (Application) context;
        } else {
            a.f = (Application) context.getApplicationContext();
        }
        if (!getInstance().isUCSupport()) {
            WVCoreSettings.getInstance().setCoreEventCallback2(bVar);
            WVUCWebView.initUCCore(bVar);
        } else if (bVar == null) {
        } else {
            bVar.onUCCorePrepared();
        }
    }

    public void initUCCore(Context context, android.taobao.windvane.webview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5338af36", new Object[]{this, context, aVar});
        } else {
            initUCCore(context, null, null, aVar);
        }
    }

    public void initUCCore(Context context, String[] strArr, String str, android.taobao.windvane.webview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601283b5", new Object[]{this, context, strArr, str, aVar});
            return;
        }
        if (context instanceof Application) {
            a.f = (Application) context;
        } else {
            a.f = (Application) context.getApplicationContext();
        }
        if (aVar != null) {
            WVCoreSettings.getInstance().setCoreEventCallback(aVar);
        }
        if (strArr != null) {
            a.a().a(strArr);
        }
        WVUCWebView.initUCCore();
    }

    public boolean extractWebCoreLibrary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("761e46bc", new Object[]{this, context})).booleanValue();
        }
        try {
            if (!android.taobao.windvane.util.a.b(context)) {
                return false;
            }
            U4Engine.createExtractor().setContext(context.getApplicationContext()).setCompressedFile(new File(UCCoreStartup.ucCore7ZFilePath(context))).setASync(false).start();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private String getUcSoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33ec4c4a", new Object[]{this, str});
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return "";
        }
        for (File file : listFiles) {
            if (file.isDirectory()) {
                String ucSoPath = getUcSoPath(file.getPath());
                if (ucSoPath.endsWith("libwebviewuc.so")) {
                    return ucSoPath;
                }
            } else if (file.getName().endsWith("libwebviewuc.so")) {
                return file.getPath();
            }
        }
        return "";
    }

    public void updateIsolatePolicy(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8d4247", new Object[]{this, context, new Boolean(z)});
            return;
        }
        File a2 = android.taobao.windvane.file.b.a(context, "UCPolicy");
        try {
            String str2 = a2.getPath() + File.separator + "isolate";
            if (z) {
                str = "";
            } else {
                str = "false," + System.currentTimeMillis();
            }
            android.taobao.windvane.file.a.a(str2, ByteBuffer.wrap(str.getBytes()));
        } catch (NotEnoughSpace e) {
            e.printStackTrace();
        }
    }

    public boolean checkIsolateIfOpen(Context context) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b5da3fb", new Object[]{this, context})).booleanValue();
        }
        boolean checkRemoteIsolateOpen = checkRemoteIsolateOpen();
        File a2 = android.taobao.windvane.file.b.a(context, "UCPolicy");
        byte[] b = android.taobao.windvane.file.a.b(a2.getPath() + File.separator + "isolate");
        if (b != null) {
            try {
                str = new String(b, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    if (System.currentTimeMillis() - Long.valueOf(split[1]).longValue() > j.commonConfig.Y) {
                        updateIsolatePolicy(context, true);
                    }
                    z = false;
                    m.e(TAG, "isolate policy: remote=[" + checkRemoteIsolateOpen + "], local=[" + z + riy.ARRAY_END_STR);
                    return !checkRemoteIsolateOpen && z;
                }
            }
        }
        z = true;
        m.e(TAG, "isolate policy: remote=[" + checkRemoteIsolateOpen + "], local=[" + z + riy.ARRAY_END_STR);
        if (!checkRemoteIsolateOpen) {
        }
    }

    private boolean checkRemoteIsolateOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71c2a52", new Object[]{this})).booleanValue();
        }
        return !Arrays.asList(j.commonConfig.W).contains(Build.BRAND) && !Arrays.asList(j.commonConfig.X).contains(Build.MODEL) && !Arrays.asList(j.commonConfig.V).contains(Build.VERSION.RELEASE);
    }

    public WVCore setUsedWebMulti(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("eda8de7e", new Object[]{this, new Integer(i)});
        }
        this.usedWebMulti = i;
        return this;
    }

    public int getUsedWebMulti() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73e8dc12", new Object[]{this})).intValue() : this.usedWebMulti;
    }

    public WVCore setUsedGpuMulti(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("f2ed27d6", new Object[]{this, new Integer(i)});
        }
        this.usedGpuMulti = i;
        return this;
    }

    public int getUsedGpuMulti() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("801599ba", new Object[]{this})).intValue() : this.usedGpuMulti;
    }
}
