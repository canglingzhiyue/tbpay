package com.uc.webview.export.extension;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.c;
import com.uc.webview.base.g;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.util.Map;

/* loaded from: classes9.dex */
public final class JSILoader {
    public static final String EXTRA_PARAM_SPECIFIED_DIR = "specifiedDir";
    private static final String TAG = "jsi";
    private static boolean sLoaded = false;
    private static File sUsingDir;

    private static File extractCore(Context context, File file) {
        c cVar = new c();
        if (file == null) {
            file = PathUtils.c(context);
        }
        if (file == null || !file.exists()) {
            ErrorCode.JSI_JSENGINE_INVALID_COMPRESSED_FILE.report();
        }
        final File[] fileArr = {null};
        U4Engine.createExtractor().setContext(context).setCompressedFile(file).setForceVerification(true).setASync(false).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.export.extension.JSILoader.1
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file2, File file3) {
                Log.i(JSILoader.TAG, "extract.exists: " + file2.getPath() + ", " + file3.getPath());
                fileArr[0] = file3;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                Log.e(JSILoader.TAG, "extract.failed:", uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file2, File file3) {
                Log.i(JSILoader.TAG, "extract.start: " + file2.getPath() + ", " + file3.getPath());
                return true;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file2) {
                Log.i(JSILoader.TAG, "extract.success: " + file2.getPath());
                fileArr[0] = file2;
            }
        }).start();
        Log.i(TAG, "extract.finish, " + cVar.toString());
        return fileArr[0];
    }

    private static ClassLoader getClassLoader() {
        return JSILoader.class.getClassLoader();
    }

    private static Class<?> getJSEngineClass(ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = JSILoader.class.getClassLoader();
            } catch (Throwable th) {
                Log.e(TAG, "reflect JSEngine failed", th);
                return null;
            }
        }
        return Class.forName("com.alibaba.jsi.standard.JSEngine", false, classLoader);
    }

    public static synchronized File getUsingDir() {
        File file;
        synchronized (JSILoader.class) {
            file = sUsingDir;
        }
        return file;
    }

    public static boolean load(Context context, File file) throws UCKnownException {
        return load(context, file, (File) null);
    }

    public static boolean load(Context context, File file, File file2) throws UCKnownException {
        return loadImpl(context, getClassLoader(), file2, null, file, true, null);
    }

    public static boolean load(Context context, File file, File file2, boolean z) throws UCKnownException {
        return loadImpl(context, getClassLoader(), file2, file, null, z, null);
    }

    public static boolean load(Context context, File file, boolean z) throws UCKnownException {
        return load(context, file, null, z);
    }

    public static boolean load(Context context, ClassLoader classLoader, File file, File file2, boolean z, Map<String, Object> map) throws UCKnownException {
        File file3 = null;
        String str = map != null ? (String) map.get(EXTRA_PARAM_SPECIFIED_DIR) : null;
        if (!TextUtils.isEmpty(str)) {
            file3 = new File(str);
        }
        return loadImpl(context, classLoader, file, file2, file3, z, map);
    }

    private static synchronized boolean loadImpl(Context context, ClassLoader classLoader, File file, File file2, File file3, boolean z, Map<String, Object> map) throws UCKnownException {
        File runningDir;
        synchronized (JSILoader.class) {
            if (sLoaded) {
                return sLoaded;
            }
            Class<?> jSEngineClass = getJSEngineClass(classLoader);
            if (jSEngineClass == null) {
                ErrorCode.JSI_JSENGINE_NOT_FOUND.report();
            }
            if (file3 != null) {
                Log.i(TAG, "loadJsiBySpecifiedDir:" + file3.getPath());
                sLoaded = loadJsi(context, jSEngineClass, file, file3);
                sUsingDir = file3;
                return sLoaded;
            }
            if (!z && (runningDir = U4Engine.getRunningDir(context, false)) != null) {
                try {
                    Log.i(TAG, "loadJsiByRunningDir:" + runningDir.getPath());
                    sLoaded = loadJsi(context, jSEngineClass, file, runningDir);
                    sUsingDir = runningDir;
                    return sLoaded;
                } catch (UCKnownException e) {
                    if (!ErrorCode.JSI_JSENGINE_INCOMPATIBLE_CORE.equals(e)) {
                        sLoaded = false;
                        throw e;
                    }
                }
            }
            File extractCore = extractCore(context, file2);
            if (extractCore == null) {
                ErrorCode.JSI_U4ENGINE_EXTRACT_FAILED.report();
            }
            Log.i(TAG, "loadJsiByCompressedFile:" + extractCore.getPath());
            sLoaded = loadJsi(context, jSEngineClass, file, extractCore);
            sUsingDir = extractCore;
            return sLoaded;
        }
    }

    private static boolean loadJsi(Context context, Class cls, File file, File file2) {
        try {
            c cVar = new c();
            File dirCoreLib = PathUtils.getDirCoreLib(file2);
            if (file == null) {
                file = PathUtils.getFileJsiLib(dirCoreLib);
            }
            if (file == null || !file.exists()) {
                file = PathUtils.getFileJsiLib(new File(context.getApplicationInfo().nativeLibraryDir));
            }
            String str = "null";
            if (file == null || !file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSEngine.loadSo ");
                sb.append("invalid jsi so:");
                sb.append(file != null ? file.getPath() : str);
                Log.i(TAG, sb.toString());
                ErrorCode.JSI_JSENGINE_INVALID_JSI_SO_FILE.report();
            }
            File fileCoreLib = PathUtils.getFileCoreLib(dirCoreLib);
            if (fileCoreLib == null || !fileCoreLib.exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("JSEngine.loadSo ");
                sb2.append("invalid jsi so:");
                if (fileCoreLib != null) {
                    str = fileCoreLib.getPath();
                }
                sb2.append(str);
                Log.i(TAG, sb2.toString());
                ErrorCode.JSI_JSENGINE_INVALID_CORE_SO_FILE.report();
            }
            Bundle bundle = new Bundle();
            bundle.putString("jsiSoPath", file.getPath());
            bundle.putString("jsEngineSoPath", fileCoreLib.getPath());
            Log.i(TAG, "JSEngine.loadSo args: " + bundle);
            boolean booleanValue = ((Boolean) g.a((Class<?>) cls, "loadSo", new Class[]{Context.class, Bundle.class}, new Object[]{context, bundle})).booleanValue();
            Log.i(TAG, "JSEngine.loadSo " + booleanValue + ", " + cVar.toString());
            return booleanValue;
        } catch (UCKnownException e) {
            Log.e(TAG, "JSEngine.loadSo failed:", e);
            throw e;
        } catch (Throwable th) {
            Log.e(TAG, "JSEngine.loadSo failed:", th);
            ErrorCode.JSI_JSENGINE_INCOMPATIBLE_CORE.report(th);
            ErrorCode.JSI_JSENGINE_LOADSO_FAILED.report(th);
            return false;
        }
    }
}
