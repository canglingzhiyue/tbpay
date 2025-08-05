package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.e;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;

/* loaded from: classes9.dex */
public class NativeLibrary {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static final Object lock;

    static {
        kge.a(683689677);
        lock = new Object();
        libraryLoaded = false;
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31482dd0", new Object[]{nativeLibraryLoader, str});
            return;
        }
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.d(TAG, "Native library has already been loaded.");
                return;
            }
            libraryLoaded = nativeLibraryLoader.load(str);
            TrtcLog.d(TAG, "Loading native library: " + str + ", elapsed: " + e.f23056a);
        }
    }

    public static boolean isLoaded() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("924426da", new Object[0])).booleanValue();
        }
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }

    public static void onLoadResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dc88b", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (lock) {
            libraryLoaded = z;
        }
    }
}
