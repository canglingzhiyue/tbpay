package com.uc.webview.export.extension;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.klog.KLogHandler;
import com.uc.webview.internal.setup.a;
import com.uc.webview.internal.setup.d;
import com.uc.webview.internal.setup.e;
import com.uc.webview.internal.setup.j;
import com.uc.webview.internal.setup.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public final class U4Engine {
    @Deprecated
    public static final int CORE_READY_READY_REASON_DOWNLOAD_FALLCK = 3;
    @Deprecated
    public static final int CORE_READY_READY_REASON_INIT_FAILED = 2;
    @Deprecated
    public static final int CORE_READY_READY_REASON_INIT_SUCCESS = 1;
    public static final int CORE_TYPE_READY_REASON_DOWNLOAD_FALLCK = 3;
    @Deprecated
    public static final int CORE_TYPE_READY_REASON_INIT_FAILED = 2;
    public static final int CORE_TYPE_READY_REASON_INIT_SUCCESS = 1;
    private static final String TAG = "U4Engine";

    /* loaded from: classes9.dex */
    public interface Extractor {

        /* loaded from: classes9.dex */
        public static class Client {
            public void onExists(File file, File file2) {
            }

            public void onFailed(UCKnownException uCKnownException) {
            }

            public boolean onStart(File file, File file2) {
                return true;
            }

            public void onSuccess(File file) {
            }

            public boolean onVerification(File file, File file2) {
                return false;
            }
        }

        Extractor setASync(boolean z);

        Extractor setClient(Client client);

        Extractor setCompressedFile(File file);

        Extractor setContext(Context context);

        Extractor setForceVerification(boolean z);

        Extractor setSpecifiedDir(File file);

        void start() throws UCKnownException;
    }

    /* loaded from: classes9.dex */
    public interface IDownloadHandle {
        void cancel();

        void restart();
    }

    /* loaded from: classes9.dex */
    public interface Initializer {
        Initializer setAuthKey(String str);

        Initializer setAuthKey(String[] strArr);

        Initializer setClient(InitializerClient initializerClient);

        Initializer setCompressedFile(File file);

        Initializer setContext(Context context);

        Initializer setDecompressedDir(File file);

        Initializer setDownloader(IUrlDownloader iUrlDownloader);

        Initializer setSpecifiedDir(File file);

        Initializer setUrl(String str);

        void start() throws UCKnownException;
    }

    /* loaded from: classes9.dex */
    public static class InitializerClient {
        public void onCoreTypeReady(int i, int i2) {
        }

        public void onDexReady(ClassLoader classLoader) {
        }

        public void onDownloadFinish(String str, File file) {
        }

        public void onDownloadProgress(int i) {
        }

        public boolean onDownloadStart(String str, IDownloadHandle iDownloadHandle) {
            return true;
        }

        public void onExtractFinish(File file) {
        }

        public boolean onExtractStart(File file, File file2) {
            return true;
        }

        public void onFailed(IRunningCoreInfo iRunningCoreInfo) {
        }

        public void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
        }

        public void onNativeReady(File file) {
        }

        public void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
        }
    }

    public static void addInitProcessCallback(ValueCallback<Integer> valueCallback) {
        l.b bVar = l.b().f23974a;
        if (valueCallback != null) {
            synchronized (bVar) {
                if (bVar.b == null) {
                    bVar.b = new ArrayList<>();
                }
                bVar.b.add(valueCallback);
            }
            if (bVar.f23977a.get() <= 0) {
                return;
            }
            bVar.a(valueCallback);
        }
    }

    public static void cleanUnUsedFiles(Context context) {
        try {
            new a(context, null).a(3000L);
        } catch (Throwable th) {
            Log.w(TAG, "cleanUnUsedFiles failed", th);
        }
    }

    public static Extractor createExtractor() {
        return new d();
    }

    public static Initializer createInitializer() {
        return e.a();
    }

    public static void enableLog(boolean z) {
        KLogHandler.a(z);
    }

    public static void enableLog(boolean z, boolean z2) {
        GlobalSettings.set(68, z2);
        KLogHandler.a(z);
    }

    public static void extractFile(Context context, File file, File file2, boolean z) {
        createExtractor().setContext(context).setASync(false).setCompressedFile(file).setSpecifiedDir(file2).start();
        if (z) {
            com.uc.webview.base.io.d.c("ext", file);
        }
    }

    public static File getExtractDir(Context context, File file) {
        return PathUtils.a(context, file);
    }

    public static File getExtractDirByUrl(Context context, String str) {
        l b = l.b();
        File e = PathUtils.e(context);
        if (StringUtils.isEmpty(str)) {
            return e;
        }
        j e2 = b.e();
        if (e2 == null || !e2.b() || !str.equals(e2.t()) || e2.q() == null) {
            File[] listFiles = e.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                String b2 = PathUtils.b(str);
                File file = null;
                long j = 0;
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        File file3 = new File(file2, b2);
                        if (file3.exists() && file3.lastModified() > j) {
                            j = file3.lastModified();
                            file = file2;
                        }
                    }
                }
                if (file != null) {
                    e = file;
                }
            }
        } else {
            e = e2.q();
        }
        Log.d("Setup.ctrl", "searchCoreDirByUpdateUrl url:" + str + ", coreDir:" + e.getAbsoluteFile());
        return e;
    }

    public static File getExtractDirByUrl(Context context, String str, long j, long j2) {
        return PathUtils.a(context, str, j, j2);
    }

    public static File getInnerCompressedFilePath(Context context) {
        return PathUtils.c(context);
    }

    public static File getInnerCompressedFilePath(String str) {
        return PathUtils.a(str);
    }

    public static File getRunningDir(Context context, boolean z) {
        return l.b().a(context, z);
    }

    public static boolean isExtractDirReady(File file) {
        if (file != null) {
            return PathUtils.a(file).c();
        }
        return false;
    }

    public static boolean isInited() {
        return com.uc.webview.internal.e.e();
    }

    public static boolean loadCoreDex(Context context, File file) throws UCKnownException {
        return l.b().b(context, file);
    }

    public static boolean loadCoreSo(Context context, File file) throws UCKnownException {
        return l.b().a(context, file);
    }

    @Deprecated
    public static boolean loadJsiSo(Context context, ClassLoader classLoader, File file) throws UCKnownException {
        return loadJsiSo(context, classLoader, null, file, false, null);
    }

    @Deprecated
    public static boolean loadJsiSo(Context context, ClassLoader classLoader, File file, File file2, boolean z, Map<String, Object> map) throws UCKnownException {
        return JSILoader.load(context, classLoader, file, file2, z, map);
    }

    @Deprecated
    public static void registerFirstCreateU4WebViewCallback(final ValueCallback<Object> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        addInitProcessCallback(new ValueCallback<Integer>() { // from class: com.uc.webview.export.extension.U4Engine.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Integer num) {
                if (num.intValue() == 128) {
                    valueCallback.onReceiveValue(null);
                }
            }
        });
    }

    public static boolean verifyCoreFile(File file) throws UCKnownException {
        return verifyCoreFile(file, null);
    }

    public static boolean verifyCoreFile(File file, Object[] objArr) throws UCKnownException {
        return l.b().a((File) null, file, true, objArr);
    }

    public static boolean verifyCoreFiles(File file, boolean z, Object[] objArr) throws UCKnownException {
        return l.b().a(file, (File) null, z, objArr);
    }
}
