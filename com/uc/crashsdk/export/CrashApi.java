package com.uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class CrashApi {

    /* renamed from: a  reason: collision with root package name */
    private static CrashApi f23758a = null;
    private static boolean c = true;
    private static boolean d = false;
    private boolean b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
        this.b = false;
        Context a2 = a(context);
        b(a2);
        b.g = z2;
        b.h = z3;
        if (b.M()) {
            b(a2);
            a(a2, customInfo, versionInfo, iCrashClient);
            if (z) {
                a();
            }
            if (!b.g || !e.e("libcrashsdk.so")) {
                return;
            }
            b.f = true;
            b();
        } else if (customInfo == null || versionInfo == null) {
            a.d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw new NullPointerException();
        } else {
            g.a(customInfo);
            try {
                a(a2, customInfo, versionInfo, iCrashClient);
            } catch (Throwable th) {
                a(th);
            }
            if (z) {
                try {
                    a();
                } catch (Throwable th2) {
                    a(th2);
                }
            }
            try {
                b.N();
                h.a();
                d.a();
                com.uc.crashsdk.a.g.j();
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            try {
                if (!b.a(a2)) {
                    a.d("crashsdk", "registerLifecycleCallbacks failed!");
                }
            } catch (Throwable th4) {
                com.uc.crashsdk.a.g.a(th4);
            }
            try {
                com.uc.crashsdk.a.n();
                e.A();
                e.B();
                b.r();
            } catch (Throwable th5) {
                com.uc.crashsdk.a.g.a(th5);
            }
            try {
                if (!g.r() || !b.G() || this.b) {
                    return;
                }
                e.G();
                this.b = true;
            } catch (Throwable th6) {
                com.uc.crashsdk.a.g.b(th6);
            }
        }
    }

    private static Context a(Context context) {
        if (context == null) {
            a.d("crashsdk", "context can not be null!");
            throw new NullPointerException();
        } else if (!c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
            return context;
        } else {
            a.d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
    }

    private static void a() {
        if (b.f23752a) {
            a.b("Has enabled java log!");
            return;
        }
        e.s();
        e.o();
        b.f23752a = true;
    }

    private static void a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        com.uc.crashsdk.d.a(iCrashClient);
        g.a(customInfo, versionInfo);
        if (!b.M()) {
            e.p();
            e.a(context);
            e.b(context);
        }
    }

    private static void a(Throwable th) {
        new e().a(Thread.currentThread(), th, true);
    }

    private static boolean a(String str) {
        if (b.M()) {
            a.d("crashsdk", "Can not call '" + str + "' in isolated process!");
            return true;
        }
        return false;
    }

    private static void b() {
        synchronized (b.e) {
            if (b.g && b.f) {
                if (b.b) {
                    a.b("Has enabled native log!");
                    return;
                }
                c();
                e.D();
                b.b = true;
                JNIBridge.cmd(6);
                g.d();
            }
        }
    }

    private static void b(Context context) {
        try {
            if (d) {
                return;
            }
            com.uc.crashsdk.a.g.a(context);
            com.uc.crashsdk.a.f23743a = context.getPackageName();
            d = true;
            a.b("crashsdk", "start init crashsdk. version: 3.5.2.1, javaseq: 230821205034, target: release");
        } catch (Throwable th) {
            a(th);
        }
    }

    private static void c() {
        if (b.d) {
            return;
        }
        g.b();
        JNIBridge.cmd(5);
        g.c();
        b.d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
        CrashApi crashApi;
        synchronized (CrashApi.class) {
            if (f23758a == null) {
                f23758a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z, z2, z3);
            }
            crashApi = f23758a;
        }
        return crashApi;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z) {
        return createInstanceEx(context, str, z, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle) {
        return createInstanceEx(context, str, z, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f23758a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        c = bundle.getBoolean("useApplicationContext", true);
        Context a2 = a(context);
        b(a2);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = true;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z;
        CustomInfo a3 = g.a(customInfo, bundle);
        VersionInfo a4 = g.a(bundle);
        boolean z2 = bundle.getBoolean("enableJavaLog", true);
        boolean z3 = bundle.getBoolean("enableNativeLog", true);
        boolean z4 = bundle.getBoolean("enableUnexpLog", b.G());
        boolean z5 = bundle.getBoolean("enableANRLog", true);
        CrashApi createInstance = createInstance(a2, a3, a4, iCrashClient, z2, z3, z4);
        b.a(z5);
        if (z3 || z4) {
            if (e.e("libcrashsdk.so")) {
                createInstance.crashSoLoaded();
            } else {
                a.d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i >= 0 && b.G()) {
            e.b(i);
        }
        return createInstance;
    }

    public static CrashApi getInstance() {
        return f23758a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException();
        }
        return com.uc.crashsdk.a.b(str, str2);
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        if (dumpFileInfo != null) {
            if (dumpFileInfo.mCategory == null || dumpFileInfo.mFileTobeDump == null) {
                throw new NullPointerException();
            }
            if ((dumpFileInfo.mLogType & 1048849) != 0) {
                return com.uc.crashsdk.a.a(dumpFileInfo.mCategory, dumpFileInfo.mFileTobeDump, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, dumpFileInfo.mLogType, dumpFileInfo.mDeleteAfterDump);
            }
            return 0;
        }
        throw new NullPointerException();
    }

    public int addDumpFile(String str, String str2, int i, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    public void addHeaderInfo(String str, String str2) {
        if (str != null) {
            com.uc.crashsdk.a.a(str, str2);
            return;
        }
        throw new NullPointerException();
    }

    public boolean addStatInfo(String str, String str2) {
        if (a("addStatInfo")) {
            return false;
        }
        if (com.uc.crashsdk.a.g.a(str)) {
            throw new NullPointerException();
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("key is too long!");
        }
        if (str2 != null && str2.length() > 512) {
            str2 = str2.substring(0, 512);
        }
        return h.a(str, str2);
    }

    public void crashSoLoaded() {
        if (!a("crashSoLoaded") && !b.f) {
            b.f = true;
            b();
            synchronized (b.e) {
                if (b.h && b.f && !b.c) {
                    if (!b.d) {
                        c();
                        g.d();
                    }
                    e.x();
                    b.c = true;
                }
            }
            com.uc.crashsdk.a.n();
            e.m();
        }
    }

    public int createCachedInfo(String str, int i, int i2) {
        if (str != null) {
            if (i <= 0) {
                throw new IllegalArgumentException("capacity must > 0!");
            }
            if ((1048849 & i2) != 0) {
                return com.uc.crashsdk.a.a(str, i, i2);
            }
            return 0;
        }
        throw new NullPointerException();
    }

    public void disableLog(int i) {
        synchronized (b.e) {
            b.b(i);
            if (LogType.isForJava(i) && b.f23752a) {
                e.t();
                b.f23752a = false;
            }
            if (LogType.isForNative(i)) {
                if (b.b) {
                    JNIBridge.cmd(9);
                    b.b = false;
                } else {
                    b.g = false;
                }
            }
            if (LogType.isForANR(i)) {
                b.a(false);
            }
            if (LogType.isForUnexp(i)) {
                if (!b.c) {
                    b.h = false;
                } else if (e.z()) {
                    b.c = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        StringBuilder sb;
        if (customLogInfo != null) {
            if (customLogInfo.mData == null || customLogInfo.mLogType == null) {
                throw new NullPointerException("mData or mLogType is null!");
            }
            if (customLogInfo.mLogType.contains("_") || customLogInfo.mLogType.contains(" ")) {
                throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
            }
            String str = null;
            if (customLogInfo.mDumpTids == null || customLogInfo.mDumpTids.size() <= 0) {
                sb = null;
            } else {
                sb = new StringBuilder();
                Iterator<Integer> it = customLogInfo.mDumpTids.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().intValue());
                    sb.append(" ");
                }
            }
            long j = 0;
            if (customLogInfo.mAddHeader) {
                j = 1;
            }
            if (customLogInfo.mAddFooter) {
                j |= 2;
            }
            if (customLogInfo.mAddLogcat) {
                j |= 4;
            }
            if (customLogInfo.mAddThreadsDump) {
                j |= 8;
            }
            if (customLogInfo.mAddBuildId) {
                j |= 16;
            }
            if (customLogInfo.mUploadNow) {
                j |= 32;
            }
            long j2 = j;
            StringBuffer stringBuffer = customLogInfo.mData;
            String str2 = customLogInfo.mLogType;
            ArrayList<String> arrayList = customLogInfo.mDumpFiles;
            ArrayList<String> arrayList2 = customLogInfo.mCallbacks;
            ArrayList<String> arrayList3 = customLogInfo.mCachedInfos;
            if (sb != null) {
                str = sb.toString();
            }
            return e.a(stringBuffer, str2, j2, arrayList, arrayList2, arrayList3, str);
        }
        throw new NullPointerException();
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    public boolean generateTraces(String str, long j) {
        if (a("generateTraces")) {
            return false;
        }
        if (b.d) {
            return JNIBridge.nativeCmd(12, j, str, null) == 1;
        }
        a.d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (a("getCrashLogUploadUrl")) {
            return null;
        }
        return e.k();
    }

    public ParcelFileDescriptor getHostFd() {
        return e.E();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return e.E();
    }

    public String getLastExitExtraInfo(String str) {
        if (a("getLastExitExtraInfo")) {
            return null;
        }
        return b.b(str);
    }

    public int getLastExitType() {
        if (a("getLastExitType")) {
            return 1;
        }
        return b.J();
    }

    public int getLastExitTypeEx() {
        if (a("getLastExitTypeEx")) {
            return 1;
        }
        return b.K();
    }

    public String getNativeStackTrace(int i, int i2) {
        if (!b.d) {
            a.d("crashsdk", "Crash so is not loaded!");
            return "";
        }
        return JNIBridge.nativeGetStackTrace(i, i2);
    }

    public Throwable getUncaughtException() {
        return e.v();
    }

    public int getUnexpReason() {
        if (a("getUnexpReason")) {
            return 100;
        }
        return e.w();
    }

    public void onExit() {
        b.x();
    }

    public boolean registerCallback(int i, ValueCallback<Bundle> valueCallback) {
        if (valueCallback != null) {
            if (i == 1) {
                return com.uc.crashsdk.d.a(valueCallback);
            }
            if (i == 2) {
                return com.uc.crashsdk.d.c(valueCallback);
            }
            if (i == 3) {
                return com.uc.crashsdk.d.d(valueCallback);
            }
            if (i == 4) {
                return com.uc.crashsdk.d.b(valueCallback);
            }
            throw new IllegalArgumentException("Unknown event type: " + i);
        }
        throw new NullPointerException();
    }

    public int registerInfoCallback(String str, int i) {
        if (str != null) {
            if ((1048849 & i) != 0) {
                return com.uc.crashsdk.a.a(str, i, null, 0L, 0);
            }
            return 0;
        }
        throw new NullPointerException();
    }

    public int registerInfoCallback(String str, int i, Callable<String> callable) {
        if (str == null || callable == null) {
            throw new NullPointerException();
        }
        if ((1048849 & i) != 0) {
            return com.uc.crashsdk.a.a(str, i, callable, 0L, 0);
        }
        return 0;
    }

    public int registerThread(int i, String str) {
        return com.uc.crashsdk.a.a(i, str);
    }

    public int reportCrashStats(boolean z) {
        if (a("reportCrashStats")) {
            return 0;
        }
        if (g.M()) {
            a.a("CrashApi::reportCrashStats. currentProcessOnly: " + z);
        }
        e.d(z);
        return e.e(z);
    }

    public int resetCrashStats(boolean z) {
        if (a("resetCrashStats")) {
            return 0;
        }
        if (g.M()) {
            a.a("CrashApi::resetCrashStats. currentProcessOnly: " + z);
        }
        return e.f(z);
    }

    public void setForeground(boolean z) {
        b.b(z);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (a("setNewInstall")) {
            return;
        }
        b.w();
    }

    public int updateCustomInfo(Bundle bundle) {
        if (bundle != null) {
            return updateCustomInfo(g.a((CustomInfo) null, bundle));
        }
        throw new NullPointerException();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        if (customInfo != null) {
            return g.b(customInfo);
        }
        throw new NullPointerException();
    }

    public boolean updateUnexpInfo() {
        if (a("updateUnexpInfo")) {
            return false;
        }
        return com.uc.crashsdk.a.a(true);
    }

    public void updateVersionInfo(Bundle bundle) {
        if (bundle != null) {
            updateVersionInfo(g.a(bundle));
            return;
        }
        throw new NullPointerException();
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        if (versionInfo != null) {
            g.a(versionInfo);
            return;
        }
        throw new NullPointerException();
    }

    public void uploadCrashLogs() {
        if (a("uploadCrashLogs")) {
            return;
        }
        e.a(false, true);
    }
}
