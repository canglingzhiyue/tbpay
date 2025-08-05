package com.taobao.android.tcon;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public class TconMallocBase extends TconBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final short ESTIMATED_PAGE_VISIT_COUNT = 5;
    private static boolean sCheckedNativeCrashResult = false;
    private static volatile boolean sHasCheckedNativeCrash = false;
    private static volatile boolean sMallocIntercepted = false;
    private static boolean sMallocInterceptionResult = false;

    public static native boolean nativeReplaceSystemMalloc();

    public static boolean checkAndInstallNativeCrashCallback(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40a90933", new Object[]{application})).booleanValue();
        }
        if (!sHasCheckedNativeCrash) {
            synchronized (TconMallocBase.class) {
                if (!sHasCheckedNativeCrash) {
                    sHasCheckedNativeCrash = true;
                    final File file = new File(application.getFilesDir().getAbsolutePath() + "/tcon_nativecrash_0.sig");
                    if (file.exists()) {
                        file.delete();
                        sCheckedNativeCrashResult = true;
                    } else {
                        sCheckedNativeCrashResult = false;
                    }
                    TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new OnFileCreatedListener() { // from class: com.taobao.android.tcon.TconMallocBase.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.tcrash.OnFileCreatedListener
                        public void onFileCreated(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b8cac13e", new Object[]{this, str});
                                return;
                            }
                            try {
                                file.createNewFile();
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
        }
        return sCheckedNativeCrashResult;
    }

    public static boolean replaceSystemMalloc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f975dd6", new Object[0])).booleanValue();
        }
        if (!sMallocIntercepted) {
            synchronized (TconMallocBase.class) {
                if (!sMallocIntercepted) {
                    sMallocInterceptionResult = nativeReplaceSystemMalloc();
                    sMallocIntercepted = true;
                }
            }
        }
        return sMallocInterceptionResult;
    }
}
