package com.uc.webview.export.multiprocess;

import android.os.Build;
import com.uc.webview.export.multiprocess.helper.c;

/* loaded from: classes9.dex */
class DexLoader {
    private static final String TAG = "DexLoader";
    private static final int sLibLoadResult;

    static {
        NullPointerException nullPointerException;
        int i;
        try {
            System.loadLibrary("dexloaderuc");
            i = 0;
            nullPointerException = null;
        } catch (NullPointerException e) {
            nullPointerException = e;
            i = -1004;
        } catch (SecurityException e2) {
            nullPointerException = e2;
            i = -1002;
        } catch (UnsatisfiedLinkError e3) {
            nullPointerException = e3;
            i = -1003;
        } catch (Throwable th) {
            nullPointerException = th;
            i = -1001;
        }
        if (nullPointerException != null) {
            c.c(TAG, "load libdexloaderuc.so exception: ".concat(String.valueOf(nullPointerException)));
        }
        sLibLoadResult = i;
    }

    DexLoader() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object loadDexByFd(int i) {
        if (sLibLoadResult == 0) {
            return Build.VERSION.SDK_INT < 23 ? Long.valueOf(loadDexByFdOnL(i)) : loadDexByFdOnLAbove(i);
        }
        throw new RuntimeException("load library libdexloaderuc.so failed!");
    }

    private static long loadDexByFdOnL(int i) {
        return nativeLoadDexByFdOnL(i);
    }

    private static Object loadDexByFdOnLAbove(int i) {
        return nativeLoadDexByFdOnLAbove(i);
    }

    private static native long nativeLoadDexByFdOnL(int i);

    private static native Object nativeLoadDexByFdOnLAbove(int i);
}
