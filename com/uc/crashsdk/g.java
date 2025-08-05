package com.uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import java.io.File;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23760a = !g.class.desiredAssertionStatus();
    private static CustomInfo b = null;
    private static VersionInfo c = null;
    private static final Object d = new Object();
    private static String e = null;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static final Object i = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A() {
        return b.mMaxUploadBytesPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B() {
        return b.mMaxUploadBuiltinLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C() {
        return b.mMaxUploadCustomLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D() {
        return b.mMaxCustomLogCountPerTypePerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E() {
        return b.mInfoUpdateInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F() {
        return b.mInfoSaveFrequency;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G() {
        return b.mReservedJavaFileHandleCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H() {
        return b.mFdDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I() {
        return b.mThreadsDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J() {
        return b.mAutoDetectLifeCycle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K() {
        return b.mMonitorBattery;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L() {
        return b.mAnrTraceStrategy;
    }

    public static boolean M() {
        CustomInfo customInfo = b;
        return customInfo == null || customInfo.mDebug;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean N() {
        CustomInfo customInfo = b;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    public static boolean O() {
        return b.mEnableStatReport;
    }

    public static boolean P() {
        return b.mIsInternational;
    }

    public static int Q() {
        return b.mProductHardcode;
    }

    public static boolean R() {
        return b.mAddPvForNewDay;
    }

    public static String S() {
        return com.uc.crashsdk.a.g.a(c.mVersion) ? a.a() : a(c.mVersion);
    }

    public static String T() {
        return com.uc.crashsdk.a.g.a(c.mSubVersion) ? "release" : c.mSubVersion;
    }

    public static String U() {
        return com.uc.crashsdk.a.g.a(c.mBuildId) ? Y() : a(c.mBuildId);
    }

    public static String V() {
        if (f == null) {
            f = com.uc.crashsdk.a.g.b() + File.separatorChar + b.mTagFilesFolderName + File.separatorChar;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String W() {
        if (g == null) {
            g = com.uc.crashsdk.a.g.b() + File.separatorChar + b.mCrashLogsFolderName + File.separatorChar;
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String X() {
        String path;
        StringBuilder sb;
        String str;
        if (h == null) {
            if (!com.uc.crashsdk.a.g.a(b.mLogsBackupPathName)) {
                str = b.mLogsBackupPathName.trim();
                if (!str.endsWith(File.separator)) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(File.separator);
                }
                h = str;
            } else {
                if (!b.M()) {
                    try {
                        path = Environment.getExternalStorageDirectory().getPath();
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                    sb = new StringBuilder();
                    sb.append(path);
                    sb.append(File.separatorChar);
                    sb.append(b.mCrashLogsFolderName);
                    sb.append(File.separatorChar);
                }
                path = "/sdcard";
                sb = new StringBuilder();
                sb.append(path);
                sb.append(File.separatorChar);
                sb.append(b.mCrashLogsFolderName);
                sb.append(File.separatorChar);
            }
            str = sb.toString();
            h = str;
        }
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String Y() {
        /*
            java.lang.String r0 = com.uc.crashsdk.g.e
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = com.uc.crashsdk.a.g.c()     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r1.getEntry(r0)     // Catch: java.lang.Throwable -> L39
            long r2 = r0.getCrc()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = java.lang.Long.toHexString(r2)     // Catch: java.lang.Throwable -> L39
            com.uc.crashsdk.g.e = r0     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "version unique build id: "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = com.uc.crashsdk.g.e     // Catch: java.lang.Throwable -> L39
            r0.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "crashsdk"
            com.uc.crashsdk.a.a.a(r2, r0)     // Catch: java.lang.Throwable -> L39
        L35:
            r1.close()     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L39:
            r0 = move-exception
            goto L44
        L3b:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L52
        L40:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L44:
            java.lang.String r2 = ""
            com.uc.crashsdk.g.e = r2     // Catch: java.lang.Throwable -> L51
            com.uc.crashsdk.a.g.a(r0)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4e
            goto L35
        L4e:
            java.lang.String r0 = com.uc.crashsdk.g.e
            return r0
        L51:
            r0 = move-exception
        L52:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L57
        L57:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.g.Y():java.lang.String");
    }

    private static void Z() {
        if (b.d) {
            JNIBridge.nativeSet(24, 1L, a.b, null);
        }
    }

    public static CustomInfo a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = b;
            customInfo = customInfo2 == null ? new CustomInfo() : new CustomInfo(customInfo2);
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e2) {
                        com.uc.crashsdk.a.g.a(e2);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    public static VersionInfo a(Bundle bundle) {
        VersionInfo versionInfo = c;
        VersionInfo versionInfo2 = versionInfo == null ? new VersionInfo() : new VersionInfo(versionInfo);
        String string = bundle.getString("mVersion");
        if (!com.uc.crashsdk.a.g.a(string)) {
            versionInfo2.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!com.uc.crashsdk.a.g.a(string2)) {
            versionInfo2.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!com.uc.crashsdk.a.g.a(string3)) {
            versionInfo2.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!com.uc.crashsdk.a.g.a(string4)) {
            a.b = string4;
            Z();
        }
        return versionInfo2;
    }

    private static String a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        b.z();
        b.y();
        if (b.mBackupLogs) {
            File file = new File(X());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static void a(CustomInfo customInfo) {
        if (f23760a || customInfo.mTagFilesFolderName != null) {
            if (!f23760a && customInfo.mCrashLogsFolderName == null) {
                throw new AssertionError();
            }
            if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
                throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
            }
            return;
        }
        throw new AssertionError();
    }

    public static void a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        b = customInfo2;
        c(customInfo2);
        c = new VersionInfo(versionInfo);
        if (!b.M()) {
            try {
                a();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
    }

    public static void a(VersionInfo versionInfo) {
        synchronized (d) {
            c = new VersionInfo(versionInfo);
            e.c();
            if (b.d) {
                JNIBridge.set(109, S());
                JNIBridge.set(110, T());
                JNIBridge.set(111, U());
                JNIBridge.set(112, "230821205034");
                JNIBridge.cmd(2);
            }
        }
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static int b(CustomInfo customInfo) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        synchronized (i) {
            i2 = 0;
            if (customInfo != null) {
                c(customInfo);
                if (b == null) {
                    b = new CustomInfo();
                }
                CustomInfo customInfo2 = b;
                boolean z3 = true;
                if (!a(customInfo.mAppId, customInfo2.mAppId)) {
                    customInfo2.mAppId = customInfo.mAppId;
                    if (b.d) {
                        JNIBridge.set(102, customInfo2.mAppId);
                    }
                    i3 = 1;
                    z = true;
                } else {
                    i3 = 0;
                    z = false;
                }
                if (!a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i3++;
                }
                if (!a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    customInfo2.mNativeCrashLogFileName = customInfo.mNativeCrashLogFileName;
                    if (b.d) {
                        JNIBridge.set(100, customInfo2.mNativeCrashLogFileName);
                    }
                    i3++;
                    z = true;
                }
                if (!a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    customInfo2.mUnexpCrashLogFileName = customInfo.mUnexpCrashLogFileName;
                    if (b.d) {
                        JNIBridge.set(101, customInfo2.mUnexpCrashLogFileName);
                    }
                    i3++;
                    z = true;
                }
                if (z) {
                    e.c();
                    if (b.d) {
                        JNIBridge.cmd(2);
                    }
                }
                if (customInfo2.mPrintStackInfos != customInfo.mPrintStackInfos) {
                    customInfo2.mPrintStackInfos = customInfo.mPrintStackInfos;
                    if (b.d) {
                        JNIBridge.set(11, customInfo2.mPrintStackInfos);
                    }
                    i3++;
                }
                if (customInfo2.mDebug != customInfo.mDebug) {
                    customInfo2.mDebug = customInfo.mDebug;
                    if (b.d) {
                        JNIBridge.set(18, customInfo2.mDebug);
                    }
                    i3++;
                }
                if (customInfo2.mBackupLogs != customInfo.mBackupLogs) {
                    customInfo2.mBackupLogs = customInfo.mBackupLogs;
                    if (b.d) {
                        JNIBridge.set(12, customInfo2.mBackupLogs);
                    }
                    i3++;
                }
                if (customInfo2.mOmitNativeCrash != customInfo.mOmitNativeCrash) {
                    customInfo2.mOmitNativeCrash = customInfo.mOmitNativeCrash;
                    if (b.d) {
                        JNIBridge.set(21, customInfo2.mOmitNativeCrash);
                    }
                    i3++;
                }
                if (customInfo2.mCrashRestartInterval != customInfo.mCrashRestartInterval) {
                    customInfo2.mCrashRestartInterval = customInfo.mCrashRestartInterval;
                    if (b.d) {
                        JNIBridge.set(13, customInfo2.mCrashRestartInterval);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        b.N();
                    }
                    i3++;
                }
                if (customInfo2.mMaxBuiltinLogFilesCount != customInfo.mMaxBuiltinLogFilesCount) {
                    customInfo2.mMaxBuiltinLogFilesCount = customInfo.mMaxBuiltinLogFilesCount;
                    if (b.d) {
                        JNIBridge.set(14, customInfo2.mMaxBuiltinLogFilesCount);
                    }
                    i3++;
                }
                if (customInfo2.mMaxNativeLogcatLineCount != customInfo.mMaxNativeLogcatLineCount) {
                    customInfo2.mMaxNativeLogcatLineCount = customInfo.mMaxNativeLogcatLineCount;
                    if (b.d) {
                        JNIBridge.set(15, customInfo2.mMaxNativeLogcatLineCount);
                    }
                    i3++;
                }
                if (customInfo2.mMaxJavaLogcatLineCount != customInfo.mMaxJavaLogcatLineCount) {
                    customInfo2.mMaxJavaLogcatLineCount = customInfo.mMaxJavaLogcatLineCount;
                    i3++;
                }
                if (customInfo2.mMaxUnexpLogcatLineCount != customInfo.mMaxUnexpLogcatLineCount) {
                    customInfo2.mMaxUnexpLogcatLineCount = customInfo.mMaxUnexpLogcatLineCount;
                    if (b.d) {
                        JNIBridge.set(16, customInfo2.mMaxUnexpLogcatLineCount);
                    }
                    i3++;
                }
                if (customInfo2.mMaxAnrLogcatLineCount != customInfo.mMaxAnrLogcatLineCount) {
                    customInfo2.mMaxAnrLogcatLineCount = customInfo.mMaxAnrLogcatLineCount;
                    if (b.d) {
                        JNIBridge.set(31, customInfo2.mMaxAnrLogcatLineCount);
                    }
                    i3++;
                }
                if (customInfo2.mZipLog != customInfo.mZipLog) {
                    customInfo2.mZipLog = customInfo.mZipLog;
                    i3++;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i3++;
                } else {
                    z3 = z2;
                }
                if (z3 && b.d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                if (customInfo2.mLogMaxBytesLimit != customInfo.mLogMaxBytesLimit) {
                    customInfo2.mLogMaxBytesLimit = customInfo.mLogMaxBytesLimit;
                    if (b.d) {
                        JNIBridge.set(4, customInfo2.mLogMaxBytesLimit);
                    }
                    i3++;
                }
                if (customInfo2.mEncryptLog != customInfo.mEncryptLog) {
                    customInfo2.mEncryptLog = customInfo.mEncryptLog;
                    i3++;
                }
                if (customInfo2.mSyncUploadSetupCrashLogs != customInfo.mSyncUploadSetupCrashLogs) {
                    customInfo2.mSyncUploadSetupCrashLogs = customInfo.mSyncUploadSetupCrashLogs;
                    i3++;
                }
                if (customInfo2.mSyncUploadLogs != customInfo.mSyncUploadLogs) {
                    customInfo2.mSyncUploadLogs = customInfo.mSyncUploadLogs;
                    i3++;
                }
                if (customInfo2.mMaxCustomLogFilesCount != customInfo.mMaxCustomLogFilesCount) {
                    customInfo2.mMaxCustomLogFilesCount = customInfo.mMaxCustomLogFilesCount;
                    i3++;
                }
                if (customInfo2.mOmitJavaCrash != customInfo.mOmitJavaCrash) {
                    customInfo2.mOmitJavaCrash = customInfo.mOmitJavaCrash;
                    i3++;
                }
                if (customInfo2.mLogMaxUploadBytesLimit != customInfo.mLogMaxUploadBytesLimit) {
                    customInfo2.mLogMaxUploadBytesLimit = customInfo.mLogMaxUploadBytesLimit;
                    i3++;
                }
                if (customInfo2.mMaxUploadBytesPerDay != customInfo.mMaxUploadBytesPerDay) {
                    customInfo2.mMaxUploadBytesPerDay = customInfo.mMaxUploadBytesPerDay;
                    i3++;
                }
                if (customInfo2.mMaxUploadBuiltinLogCountPerDay != customInfo.mMaxUploadBuiltinLogCountPerDay) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = customInfo.mMaxUploadBuiltinLogCountPerDay;
                    i3++;
                }
                if (customInfo2.mMaxUploadCustomLogCountPerDay != customInfo.mMaxUploadCustomLogCountPerDay) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = customInfo.mMaxUploadCustomLogCountPerDay;
                    i3++;
                }
                if (customInfo2.mMaxCustomLogCountPerTypePerDay != customInfo.mMaxCustomLogCountPerTypePerDay) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = customInfo.mMaxCustomLogCountPerTypePerDay;
                    i3++;
                }
                if (customInfo2.mMaxAnrLogCountPerProcess != customInfo.mMaxAnrLogCountPerProcess) {
                    customInfo2.mMaxAnrLogCountPerProcess = customInfo.mMaxAnrLogCountPerProcess;
                    if (b.d) {
                        JNIBridge.set(32, b.mMaxAnrLogCountPerProcess);
                    }
                    i3++;
                }
                if (customInfo2.mCallJavaDefaultHandler != customInfo.mCallJavaDefaultHandler) {
                    customInfo2.mCallJavaDefaultHandler = customInfo.mCallJavaDefaultHandler;
                    i3++;
                }
                if (customInfo2.mCallNativeDefaultHandler != customInfo.mCallNativeDefaultHandler) {
                    customInfo2.mCallNativeDefaultHandler = customInfo.mCallNativeDefaultHandler;
                    i3++;
                    if (b.d) {
                        JNIBridge.set(5, b.mCallNativeDefaultHandler);
                    }
                }
                if (customInfo2.mDumpUserSolibBuildId != customInfo.mDumpUserSolibBuildId) {
                    customInfo2.mDumpUserSolibBuildId = customInfo.mDumpUserSolibBuildId;
                    i3++;
                    if (b.d) {
                        JNIBridge.set(6, b.mDumpUserSolibBuildId);
                    }
                }
                if (customInfo2.mDumpHprofDataForJavaOOM != customInfo.mDumpHprofDataForJavaOOM) {
                    customInfo2.mDumpHprofDataForJavaOOM = customInfo.mDumpHprofDataForJavaOOM;
                    i3++;
                }
                if (customInfo2.mRenameFileToDefaultName != customInfo.mRenameFileToDefaultName) {
                    customInfo2.mRenameFileToDefaultName = customInfo.mRenameFileToDefaultName;
                    i3++;
                }
                if (customInfo2.mAutoDeleteOldVersionStats != customInfo.mAutoDeleteOldVersionStats) {
                    customInfo2.mAutoDeleteOldVersionStats = customInfo.mAutoDeleteOldVersionStats;
                    i3++;
                }
                if (customInfo2.mFdDumpMinLimit != customInfo.mFdDumpMinLimit) {
                    customInfo2.mFdDumpMinLimit = customInfo.mFdDumpMinLimit;
                    if (b.d) {
                        JNIBridge.set(10, customInfo2.mFdDumpMinLimit);
                    }
                    i3++;
                }
                if (customInfo2.mThreadsDumpMinLimit != customInfo.mThreadsDumpMinLimit) {
                    customInfo2.mThreadsDumpMinLimit = customInfo.mThreadsDumpMinLimit;
                    if (b.d) {
                        JNIBridge.set(22, customInfo2.mThreadsDumpMinLimit);
                    }
                    i3++;
                }
                if (customInfo2.mInfoUpdateInterval != customInfo.mInfoUpdateInterval) {
                    if (customInfo2.mInfoUpdateInterval <= 0 && customInfo.mInfoUpdateInterval > 0) {
                        a.a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i3++;
                }
                if (customInfo2.mInfoSaveFrequency != customInfo.mInfoSaveFrequency) {
                    customInfo2.mInfoSaveFrequency = customInfo.mInfoSaveFrequency;
                    i3++;
                }
                if (customInfo2.mDisableBackgroundSignals != customInfo.mDisableBackgroundSignals) {
                    customInfo2.mDisableBackgroundSignals = customInfo.mDisableBackgroundSignals;
                    if (b.d) {
                        JNIBridge.set(9, customInfo2.mDisableBackgroundSignals);
                    }
                    i3++;
                }
                if (customInfo2.mEnableStatReport != customInfo.mEnableStatReport) {
                    customInfo2.mEnableStatReport = customInfo.mEnableStatReport;
                    if (customInfo2.mEnableStatReport) {
                        e.B();
                    }
                    i3++;
                }
                if (customInfo2.mIsInternational != customInfo.mIsInternational) {
                    customInfo2.mIsInternational = customInfo.mIsInternational;
                    if (b.d) {
                        JNIBridge.set(23, customInfo2.mIsInternational);
                    }
                    e.l();
                    com.uc.crashsdk.a.d.c();
                    h.k();
                    i3++;
                }
                if (customInfo2.mProductHardcode != customInfo.mProductHardcode) {
                    customInfo2.mProductHardcode = customInfo.mProductHardcode;
                    if (b.d) {
                        JNIBridge.set(37, customInfo2.mProductHardcode);
                    }
                    e.l();
                    com.uc.crashsdk.a.d.c();
                    h.k();
                    i3++;
                }
                if (customInfo2.mAutoDetectLifeCycle != customInfo.mAutoDetectLifeCycle) {
                    customInfo2.mAutoDetectLifeCycle = customInfo.mAutoDetectLifeCycle;
                    if (customInfo2.mAutoDetectLifeCycle) {
                        b.D();
                    }
                    i3++;
                }
                if (customInfo2.mMonitorBattery != customInfo.mMonitorBattery) {
                    customInfo2.mMonitorBattery = customInfo.mMonitorBattery;
                    e.c(b.C());
                    i3++;
                }
                if (customInfo2.mUnexpSubTypes != customInfo.mUnexpSubTypes) {
                    customInfo2.mUnexpSubTypes = customInfo.mUnexpSubTypes;
                    i3++;
                }
                if (customInfo2.mEnableMemoryGroup != customInfo.mEnableMemoryGroup) {
                    customInfo2.mEnableMemoryGroup = customInfo.mEnableMemoryGroup;
                    if (b.d) {
                        JNIBridge.set(35, customInfo2.mEnableMemoryGroup);
                    }
                    i3++;
                }
                if (customInfo2.mEnableLibcMallocDetail != customInfo.mEnableLibcMallocDetail) {
                    customInfo2.mEnableLibcMallocDetail = customInfo.mEnableLibcMallocDetail;
                    if (b.d) {
                        JNIBridge.set(36, customInfo2.mEnableLibcMallocDetail);
                    }
                    i3++;
                }
                if (customInfo2.mLibcMallocDetailConfig != customInfo.mLibcMallocDetailConfig) {
                    customInfo2.mLibcMallocDetailConfig = customInfo.mLibcMallocDetailConfig;
                    if (b.d) {
                        JNIBridge.set(131, customInfo2.mLibcMallocDetailConfig);
                    }
                    i3++;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public static void b() {
        JNIBridge.set(103, com.uc.crashsdk.a.g.b());
        JNIBridge.set(104, b.mTagFilesFolderName);
        JNIBridge.set(105, b.mCrashLogsFolderName);
        JNIBridge.set(106, X());
        JNIBridge.set(107, e.h());
        JNIBridge.set(108, b.a());
        JNIBridge.set(109, S());
        JNIBridge.set(110, T());
        JNIBridge.set(111, U());
        JNIBridge.set(112, "230821205034");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, e.q());
        JNIBridge.set(5, b.mCallNativeDefaultHandler);
        JNIBridge.set(6, b.mDumpUserSolibBuildId);
        JNIBridge.set(7, b.mReservedNativeMemoryBytes);
        JNIBridge.set(100, b.mNativeCrashLogFileName);
        JNIBridge.set(101, b.mUnexpCrashLogFileName);
        JNIBridge.set(35, b.mEnableMemoryGroup);
        JNIBridge.set(36, b.mEnableLibcMallocDetail);
        JNIBridge.set(131, b.mLibcMallocDetailConfig);
        JNIBridge.set(102, b.mAppId);
    }

    public static void c() {
        JNIBridge.set(11, N());
        JNIBridge.set(12, b.mBackupLogs);
        JNIBridge.set(13, b.mCrashRestartInterval);
        JNIBridge.set(14, b.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, b.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, b.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, b.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, M());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, b.mOmitNativeCrash);
        JNIBridge.set(32, b.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, b.mDisableSignals);
        JNIBridge.set(9, b.mDisableBackgroundSignals);
        JNIBridge.nativeSet(3, b.mZipLog ? 1L : 0L, b.mZippedLogExtension, null);
        JNIBridge.set(4, b.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    private static void c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long b2 = e.b();
            if (b2 < 1) {
                return;
            }
            customInfo.mMaxBuiltinLogFilesCount = 200;
            customInfo.mMaxCustomLogFilesCount = 100;
            customInfo.mMaxUploadBytesPerDay = 268435456L;
            customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
            customInfo.mMaxUploadCustomLogCountPerDay = 2000;
            customInfo.mMaxCustomLogCountPerTypePerDay = 100;
            customInfo.mMaxAnrLogCountPerProcess = 100;
            customInfo.mAnrTraceStrategy = 2;
            if (b2 < 2) {
                return;
            }
            customInfo.mSyncUploadSetupCrashLogs = true;
            customInfo.mSyncUploadLogs = true;
            if (b2 < 3) {
                return;
            }
            customInfo.mBackupLogs = true;
            customInfo.mPrintStackInfos = true;
            customInfo.mDebug = true;
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    public static void d() {
        JNIBridge.set(23, b.mIsInternational);
        JNIBridge.set(37, b.mProductHardcode);
        if (b.I()) {
            JNIBridge.set(34, true);
        }
        if (e.i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, b.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, b.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(b.C());
        JNIBridge.set(2, b.G());
        a.e();
        a.g();
        a.i();
        a.k();
        JNIBridge.set(113, a.f23743a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, b.mThreadsDumpMinLimit);
        JNIBridge.set(122, a.a());
        JNIBridge.set(33, a.c());
        Z();
        b.L();
        b.E();
        com.uc.crashsdk.a.g.k();
    }

    public static String e() {
        return b.mAppId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (!com.uc.crashsdk.a.g.b(b.mJavaCrashLogFileName) && !com.uc.crashsdk.a.g.b(b.mNativeCrashLogFileName)) {
            return com.uc.crashsdk.a.g.b(b.mUnexpCrashLogFileName);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        return b.mJavaCrashLogFileName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h() {
        return b.mCrashRestartInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return b.mCallJavaDefaultHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j() {
        return b.mDumpHprofDataForJavaOOM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k() {
        return b.mRenameFileToDefaultName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l() {
        return b.mMaxBuiltinLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m() {
        return b.mMaxCustomLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n() {
        return b.mMaxJavaLogcatLineCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o() {
        return b.mUnexpDelayMillSeconds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p() {
        return b.mUnexpSubTypes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return b.mBackupLogs;
    }

    public static boolean r() {
        return b.mSyncUploadSetupCrashLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s() {
        return b.mSyncUploadLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        return b.mOmitJavaCrash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return b.mAutoDeleteOldVersionStats;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v() {
        return b.mZipLog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w() {
        return b.mZippedLogExtension;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x() {
        return b.mEncryptLog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y() {
        return b.mLogMaxBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z() {
        return b.mLogMaxUploadBytesLimit;
    }
}
