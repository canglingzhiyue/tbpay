package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class UCCoreStartup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean ENABLE_ANDROID_LOG = false;
    private static final boolean ENABLE_PREPROCESS = true;
    private static final String TAG = "UCCoreStartup";
    private static final AtomicBoolean sPreprocessAtomic;
    private static UCCoreStartup sUCCoreStartup;

    public void preloadClass(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441d8bb4", new Object[]{this, classLoader});
        }
    }

    public void preloadIcu(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd2c299", new Object[]{this, context, str});
        }
    }

    public void preloadIo(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dc23bc", new Object[]{this, context, str});
        }
    }

    public void preloadPak(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4678c6ba", new Object[]{this, context, str});
        }
    }

    public void preloadSo(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143c27c6", new Object[]{this, context, str});
        }
    }

    static {
        kge.a(-975285870);
        sPreprocessAtomic = new AtomicBoolean(false);
    }

    public static UCCoreStartup getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCCoreStartup) ipChange.ipc$dispatch("349f76e1", new Object[0]);
        }
        if (sUCCoreStartup == null) {
            synchronized (WVThreadPool.class) {
                if (sUCCoreStartup == null) {
                    printAndroidLogE("UCCoreStartup instance enable preprocess true");
                    sUCCoreStartup = new UCCoreStartup();
                }
            }
        }
        return sUCCoreStartup;
    }

    public void initPreprocess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d14223", new Object[]{this});
        } else if (!sPreprocessAtomic.compareAndSet(false, true)) {
        } else {
            try {
                printAndroidLogE("initPreprocess");
                U4Engine.createInitializer();
            } catch (Throwable th) {
                m.e(TAG, "initPreprocess fail " + th.getMessage());
            }
        }
    }

    private static void printAndroidLogE(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a5f4", new Object[]{str});
        } else {
            m.e(TAG, str);
        }
    }

    public static String ucCore7ZFilePath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("951686d0", new Object[]{context});
        }
        if (WVCore.getInstance().isUCInner()) {
            return U4Engine.getInnerCompressedFilePath(context.getApplicationInfo().nativeLibraryDir).getAbsolutePath();
        }
        return WVUCRemoteFetcher.fetchUCRemoteLocal();
    }

    @Deprecated
    public static String ucCore7ZFilePath(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61ce6a1e", new Object[]{str}) : U4Engine.getInnerCompressedFilePath(str).getAbsolutePath();
    }

    public static String ucCoreSoDirPath(Context context) {
        File extractDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3b11968", new Object[]{context});
        }
        if (WVCore.getInstance().isUCInner()) {
            return PathUtils.getDirCoreLib(U4Engine.getExtractDir(context, new File(ucCore7ZFilePath(context)))).getAbsolutePath();
        }
        File runningDir = U4Engine.getRunningDir(context, false);
        if (runningDir != null) {
            return PathUtils.getDirCoreLib(runningDir).getAbsolutePath();
        }
        String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
        return (TextUtils.isEmpty(fetchUCRemoteLocal) || (extractDir = U4Engine.getExtractDir(context, new File(fetchUCRemoteLocal))) == null) ? "" : PathUtils.getDirCoreLib(extractDir).getAbsolutePath();
    }

    @Deprecated
    public static String ucCoreSoDirPath(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9efadade", new Object[]{context, str}) : PathUtils.getDirCoreLib(U4Engine.getExtractDir(context, new File(ucCore7ZFilePath(str)))).getAbsolutePath();
    }

    public static String ucCoreRootDirPath(Context context) {
        File extractDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47207de2", new Object[]{context});
        }
        if (WVCore.getInstance().isUCInner()) {
            return U4Engine.getExtractDir(context, new File(ucCore7ZFilePath(context))).getAbsolutePath();
        }
        File runningDir = U4Engine.getRunningDir(context, false);
        if (runningDir != null) {
            return runningDir.getAbsolutePath();
        }
        String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
        return (TextUtils.isEmpty(fetchUCRemoteLocal) || (extractDir = U4Engine.getExtractDir(context, new File(fetchUCRemoteLocal))) == null) ? "" : extractDir.getAbsolutePath();
    }

    @Deprecated
    public static String ucCoreRootDirPath(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("460bd4d8", new Object[]{context, str}) : U4Engine.getExtractDir(context, new File(ucCore7ZFilePath(str))).getAbsolutePath();
    }

    public void preDecompress(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48daea05", new Object[]{this, context, str});
            return;
        }
        printAndroidLogE("preDecompress " + context + ", " + str);
        try {
            U4Engine.createExtractor().setContext(context.getApplicationContext()).setCompressedFile(new File(str)).start();
        } catch (Throwable th) {
            m.e(TAG, "preDecompress fail " + th.getMessage());
        }
    }

    public void preInitUCCore(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0f454b", new Object[]{this, context, str});
            return;
        }
        printAndroidLogE("preInitUCCore " + context + ", " + str);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            m.c(TAG, "trying to init uc core");
            if (a.f == null && (context instanceof Application)) {
                a.f = (Application) context;
            }
            j.a().b();
            Class.forName("android.taobao.windvane.extra.uc.WVUCWebView");
        } catch (Throwable th) {
            m.e(TAG, "failed to load WVUCWebView " + th.getMessage());
        }
        printAndroidLogE("initU4Core elapse: " + Long.toString(System.currentTimeMillis() - currentTimeMillis));
    }
}
