package com.taobao.android.behavix.bhxbridge;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.i;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.b;
import com.taobao.android.ucp.track.c;
import java.io.File;
import java.util.Map;
import tb.aqf;
import tb.drn;
import tb.dro;
import tb.ihq;
import tb.kge;
import tb.rkv;

/* loaded from: classes.dex */
public class BHXCXXBaseBridge extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String CHANGED_TO_BX_DB_STATUS;
    private static String WALLE_FIRST_INIT_TABLE_STATUS;
    private static String WALLE_INITED_TABLE_STATUS;
    public static rkv _db;
    public static volatile boolean isNativeLibraryLoaded;
    public static boolean isSOInited;
    public static String mDBPath;

    private static native void nativeSetupBHXCXX(String str, boolean z, String str2, String str3, boolean z2, boolean z3);

    private static native void nativeSetupEnv(String str, boolean z, boolean z2, boolean z3, int i, boolean z4);

    private static native void nativeSetupUCP();

    static {
        kge.a(-858404008);
        isNativeLibraryLoaded = false;
        isSOInited = false;
        mDBPath = "";
        _db = null;
        WALLE_FIRST_INIT_TABLE_STATUS = "walle_first_init_table_status";
        CHANGED_TO_BX_DB_STATUS = "1";
        WALLE_INITED_TABLE_STATUS = "1";
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static boolean f9179a;

        public static /* synthetic */ boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
        }

        static {
            kge.a(240278070);
            f9179a = false;
            try {
                c.a("LoadCXXLibCls-1");
                if (dro.c()) {
                    if (!dro.e()) {
                        ihq.a().c("MNN");
                        c.a("LoadCXXLibCls-mnn");
                    }
                    if (ihq.a().c("bhx_cxx").g()) {
                        BHXCXXBaseBridge.isNativeLibraryLoaded = true;
                        f9179a = true;
                    } else {
                        UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "JNI", null, "System.loadLibrary error", "RemoteSo load error");
                    }
                } else {
                    System.loadLibrary("bhx_cxx");
                    BHXCXXBaseBridge.isNativeLibraryLoaded = true;
                    f9179a = true;
                }
                c.a("LoadCXXLibCls-2");
            } catch (Throwable th) {
                BHXCXXBaseBridge.isNativeLibraryLoaded = false;
                UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "JNI", null, "System.loadLibrary error", th.getMessage());
                f9179a = false;
                if (Debuggable.isDebug()) {
                    throw th;
                }
            }
        }

        private static boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f9179a;
        }
    }

    public static void setupBHXCpp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e4e5b5", new Object[0]);
        } else if (!LoadCXXLib() || isSOInited) {
        } else {
            isSOInited = true;
            c.a("setupBHXCpp-1");
            String file = drn.a().b().getFilesDir().toString();
            mDBPath = file + (File.separator + "DAI" + File.separator + "Database/edge_compute.db");
            Map<String, String> b = aqf.b(d.b());
            String str = b != null ? b.get("UTDID") : "";
            nativeSetupEnv(file, true, b.a().b(), dro.c(), dro.d(), Debuggable.isDebug());
            c.a("setupBHXCpp-2");
            nativeSetupUCP();
            c.a("setupBHXCpp-3");
            c.a("setupBHXCpp-4");
            BHXCXXInnerBridge.initOrangeByCacheValue();
            c.a("setupBHXCpp-5");
            nativeSetupBHXCXX(mDBPath, Debuggable.isDebug(), str, file, true, b.a().b());
        }
    }

    public static boolean LoadCXXLib() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95744e13", new Object[0])).booleanValue();
        }
        if (!d.e()) {
            return false;
        }
        return a.a();
    }

    public static boolean checkCXXLib() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da165f95", new Object[0])).booleanValue() : isNativeLibraryLoaded;
    }
}
